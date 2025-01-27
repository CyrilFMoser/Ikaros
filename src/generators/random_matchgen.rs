use rand::Rng;
use rand_chacha::ChaCha8Rng;

use super::{random_matchgen_args::RandomMatchArgs, typegen::TypeGenerator};
use crate::{
    matches::{
        expression::{Expression, MatchExp},
        pattern::{Constant, Pattern, Variant, WildCard},
        statements::{Declaration, Statement, VarDecl},
    },
    types::{type_graph::graph::Graph, type_trait::Type},
};
use std::{
    borrow::Borrow,
    cell::RefCell,
    collections::HashSet,
    fmt::Debug,
    rc::Rc,
    sync::{Arc, Mutex, RwLock},
    thread,
};
use std::{fmt::Display, hash::Hash};
#[derive(Clone)]
pub struct RandomMatchGenerator<
    LangTyp: Type + PartialOrd + Clone + PartialEq + Eq + Hash + Display + Sync + 'static,
> {
    pub rng: ChaCha8Rng,
    pub graph: Graph<LangTyp>,
    pub args: RandomMatchArgs,
    to_match_type: LangTyp,
    max_num_cases: Vec<u32>,
    cases: Vec<Vec<Pattern<LangTyp>>>,
}
impl<
        LangTyp: Type + Clone + PartialEq + Ord + PartialOrd + Eq + Hash + Display + Debug + Sync + Send,
    > RandomMatchGenerator<LangTyp>
{
    pub fn new(mut rng: ChaCha8Rng, mut graph: Graph<LangTyp>, args: RandomMatchArgs) -> Self {
        let (node, orig_constraints) = graph.get_base(args.level_prob);
        let mut constraints = orig_constraints.clone();
        for (t1, t2) in &orig_constraints.equality {
            constraints.substitute_non_eq(t1, t2);
        }
        // This should not happen, as otherwise we generate unsatisfiable constraints while selecting a base
        if !constraints.is_satisfiable() {
            panic!(
                "Generated unsatisfiable constraints in match generator. \n 
                Original constraints: 
                \n
                {} 
                \n 
                After substituting and considering sub/supertypes: 
                \n
                {}",
                orig_constraints, constraints
            )
        }
        let mut to_match_type = node.typ.clone();
        for (t1, t2) in &constraints.equality {
            if t1.is_generic() && !t2.is_generic() {
                Graph::substitute(&mut to_match_type, t1, t2)
            } else if !t1.is_generic() && t2.is_generic() {
                Graph::substitute(&mut to_match_type, t2, t1)
            }
        }
        let remaining_generics = TypeGenerator::get_generics(&to_match_type);
        for generic in remaining_generics {
            let num = rng.gen_range(0..(graph.concrete_types.len()));
            let new_typ = graph.concrete_types.get(num).unwrap();
            Graph::substitute(&mut to_match_type, &generic, new_typ);
        }
        let mut rmg = RandomMatchGenerator {
            rng,
            graph,
            args,
            to_match_type,
            max_num_cases: Vec::new(),
            cases: Vec::new(),
        };
        rmg.generate_cases();
        rmg
    }

    fn refine(&self, p: &Pattern<LangTyp>, depth: u32) -> Vec<Pattern<LangTyp>> {
        if depth > self.args.max_refine_depth {
            return vec![Pattern::WildCard(WildCard {
                typ: p.get_actual_type().clone(),
                annotate: false,
            })];
        }
        match p {
            Pattern::WildCard(w) => self.refine_wild(w, depth),
            Pattern::Variant(v) => self.refine_variant(v, depth),
            Pattern::Constant(_) => vec![p.clone()],
            Pattern::Tuple(p1, p2) => self.refine_tuple(p1, p2, depth),
        }
    }

    fn refine_wild(&self, w: &WildCard<LangTyp>, depth: u32) -> Vec<Pattern<LangTyp>> {
        let reachable_patterns = self.get_reachable_patterns(&w.typ);
        let mut cases = HashSet::new();
        for pattern in reachable_patterns {
            if !matches!(pattern, Pattern::WildCard(_)) {
                cases.extend(self.refine(&pattern, depth + 1));
            } else {
                cases.insert(pattern);
            }
        }
        cases.into_iter().collect()
    }

    fn refine_tuple(
        &self,
        p1: &Pattern<LangTyp>,
        p2: &Pattern<LangTyp>,
        depth: u32,
    ) -> Vec<Pattern<LangTyp>> {
        /*println!(
            "refining tuple {} and {}",
            LangTyp::pattern_to_string(p1),
            LangTyp::pattern_to_string(p2)
        );*/

        let refined_p1 = self.refine(p1, depth + 1);
        let refined_p2 = self.refine(p2, depth + 1);
        let mut out = HashSet::new();
        for pt_1 in refined_p1 {
            for pt_2 in &refined_p2 {
                out.insert(Pattern::Tuple(
                    Box::new(pt_1.clone()),
                    Box::new(pt_2.clone()),
                ));
            }
        }
        let mut out_vec = Vec::new();
        for cur_p in out.drain() {
            if out_vec.iter().any(|p| cur_p.match_same(p)) {
                continue;
            } else {
                out_vec.push(cur_p);
            }
        }
        out_vec
    }

    fn refine_variant(&self, var: &Variant<LangTyp>, depth: u32) -> Vec<Pattern<LangTyp>> {
        if depth > self.args.max_refine_depth {
            return vec![Pattern::WildCard(WildCard {
                typ: var.typ.clone(),
                annotate: false,
            })];
        }
        let mut cases = vec![var.clone()];

        let n = var.parameters.len();

        for p_ind in 0..n {
            let cases_len = cases.len();
            let cur_wild = var.parameters.get(p_ind).unwrap().clone();
            //println!("Refining {}", LangTyp::pattern_to_string(&cur_wild));
            let refined_patterns_dup = self.refine(&cur_wild, depth + 1);
            let mut refined_patterns = Vec::new();
            for pattern_dup in refined_patterns_dup {
                if refined_patterns.iter().all(|p| !pattern_dup.match_same(p)) {
                    refined_patterns.push(pattern_dup);
                }
            }
            for c_ind in 0..cases_len {
                //println!("{}", c_ind);
                for cur_refined_pattern in refined_patterns.clone() {
                    if matches!(cur_refined_pattern, Pattern::WildCard(_)) {
                        continue;
                    }
                    let mut cur_case = cases.get(c_ind).unwrap().clone();
                    let cur_param = cur_case.parameters.get_mut(p_ind).unwrap();
                    if *cur_param != cur_refined_pattern {
                        *cur_param = cur_refined_pattern;
                        cases.push(cur_case);
                    }
                }
            }
        }
        //println!("Refined variant");
        cases.into_iter().map(|p| Pattern::Variant(p)).collect()
    }

    fn get_reachable_patterns(&self, typ: &LangTyp) -> Vec<Pattern<LangTyp>> {
        //println!("Getting reachable of {typ}");
        if typ.is_tuple() {
            let tuple = typ.get_params().unwrap();

            let first = tuple.first().unwrap();
            let second = tuple.get(1).unwrap();

            let reachable_first = self.get_reachable_patterns(first);

            let reachable_second = self.get_reachable_patterns(second);

            let mut cases = vec![];

            for first_pattern in reachable_first {
                for second_pattern in &reachable_second {
                    let cur_tuple = Pattern::Tuple(
                        Box::new(first_pattern.clone()),
                        Box::new(second_pattern.clone()),
                    );
                    cases.push(cur_tuple);
                }
            }

            return cases;
        }
        if typ.is_base() || typ.is_variant() {
            let variants = self.get_reachable_variants(typ);
            variants.into_iter().map(|p| Pattern::Variant(p)).collect()
        } else if typ.is_primitive() && !typ.is_bool() && LangTyp::get_compiler_name() != "javac" {
            vec![
                Pattern::Constant(Constant {
                    typ: typ.clone(),
                    exp: Box::new(typ.get_const_exp()),
                }),
                Pattern::WildCard(WildCard {
                    typ: typ.clone(),
                    annotate: false,
                }),
            ]
        } else {
            vec![Pattern::WildCard(WildCard {
                typ: typ.clone(),
                annotate: false,
            })]
        }
    }

    fn get_reachable_variants(&self, typ: &LangTyp) -> Vec<Variant<LangTyp>> {
        let reachable = self.graph.get_reachable(typ, true, None);

        let reachable_variants: Vec<Variant<LangTyp>> = reachable
            .into_iter()
            .filter_map(|t| {
                if !t.is_base() {
                    let parameters = if let Some(v) = t.get_params() {
                        v.clone()
                    } else {
                        Vec::new()
                    };
                    let parameter_patterns = parameters
                        .into_iter()
                        .map(|t| {
                            Pattern::WildCard(WildCard {
                                typ: t,
                                annotate: false,
                            })
                        })
                        .collect();
                    Some(Variant {
                        typ: t,
                        parameters: parameter_patterns,
                    })
                } else {
                    None
                }
            })
            .collect();
        reachable_variants
    }

    pub fn generate_cases(&mut self) {
        let reachable_variants = self.get_reachable_variants(&self.to_match_type);
        let cases = Arc::new(RwLock::new(Vec::new()));

        let this = Arc::new(RwLock::new(self.clone()));
        let mut threads = Vec::new();
        for variant in reachable_variants {
            let cur_this = this.clone();
            let cur_cases = cases.clone();
            let cur_thread = thread::spawn(move || {
                let result_cases: Vec<Pattern<LangTyp>> = cur_this
                    .read()
                    .unwrap()
                    .refine_variant(&variant, 1)
                    .into_iter()
                    .collect();
                //println!("FINISHED");
                cur_cases.write().unwrap().push(result_cases);
            });
            threads.push(cur_thread);
        }
        for thread in threads {
            thread.join().unwrap();
        }
        //println!("JOINED EVERYTHING");
        self.cases = Arc::try_unwrap(cases).unwrap().into_inner().unwrap();
        for v in &self.cases {
            let mut depths = vec![0; (self.args.max_refine_depth + 1) as usize];
            for case in v {
                let cur_depth = case.depth() as usize;
                *depths.get_mut(cur_depth).unwrap() += 1;
            }

            self.max_num_cases.push(*depths.iter().max().unwrap());
        }
    }

    fn select_cases(&mut self) -> Option<Vec<Pattern<LangTyp>>> {
        let mut cases = Vec::new();
        for (i, case_vec) in self.cases.iter_mut().enumerate() {
            if case_vec.is_empty() {
                continue;
            }
            let n = case_vec.len();

            let cur_max_cases = self.max_num_cases.get(i).unwrap();
            let max_num_cases = n.min(*cur_max_cases as usize);
            let cur_num_cases = self.rng.gen_range(0..=max_num_cases);
            for _ in 0..cur_num_cases {
                let cur_index = self.rng.gen_range(0..case_vec.len());
                let cur_pattern = if case_vec.len() > 1 {
                    case_vec.swap_remove(cur_index)
                } else {
                    case_vec.pop().unwrap()
                };
                cases.push(cur_pattern);
            }
        }
        if cases.is_empty() {
            if self.cases.iter().all(|v| v.is_empty()) {
                None
            } else {
                self.select_cases()
            }
        } else {
            Some(cases)
        }
    }

    pub fn generate(&mut self) -> Option<Vec<Statement<LangTyp>>> {
        let mut statements = Vec::new();
        let var_decl = VarDecl::new(
            "v_a".to_string(),
            self.to_match_type.clone(),
            Expression::BottomType,
        );
        let var = Expression::Var(var_decl.get_var());
        statements.push(Statement::Decl(Declaration::Var(var_decl)));

        let to_match = Box::new(var);

        let cases = self.select_cases()?;

        let mut arms = Vec::new();
        for i in 0..cases.len() {
            arms.push(Expression::Int(i as u32));
        }
        let match_exp = MatchExp {
            to_match,
            cases,
            arms,
            removed_pattern: None,
        };

        let match_var_decl = VarDecl::new(
            "v_b".to_string(),
            LangTyp::get_number_type(),
            Expression::Match(match_exp),
        );
        statements.push(Statement::Decl(Declaration::Var(match_var_decl)));
        Some(statements)
    }
}
