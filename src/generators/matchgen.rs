use core::panic;
use rand::Rng;
use rand_chacha::ChaCha8Rng;
use std::collections::{HashSet, VecDeque};
use std::fmt::Display;
use std::hash::Hash;

use super::matchgen_args::MatchArgs;
use crate::generators::typegen::TypeGenerator;
use crate::matches::expression::{Expression, MatchExp};
use crate::matches::pattern::{Constant, Pattern, Variant, WildCard};
use crate::matches::statements::{Declaration, Statement, VarDecl};
use crate::types::constraints::Constraint;
use crate::types::type_graph::graph::Graph;
use crate::types::type_trait::Type;
use core::fmt::Debug;

pub struct MatchGenerator<LangTyp: Type + Clone + PartialEq + Eq + Hash + Display> {
    pub rng: ChaCha8Rng,
    pub graph: Graph<LangTyp>,
    pub args: MatchArgs,
    pub correct: bool,
}

impl<LangTyp: Type + Clone + PartialEq + Debug + Eq + Hash + Display + Ord + PartialOrd>
    MatchGenerator<LangTyp>
{
    pub fn new(rng: ChaCha8Rng, graph: Graph<LangTyp>, args: MatchArgs, correct: bool) -> Self {
        MatchGenerator {
            rng,
            graph,
            args,
            correct,
        }
    }

    pub fn generate(&mut self) -> (Vec<Statement<LangTyp>>, Option<Pattern<LangTyp>>) {
        let (node, orig_constraints) = self.graph.get_base(self.args.level_prob);
        let mut constraints = orig_constraints.clone();
        for (t1, t2) in &orig_constraints.equality {
            constraints.substitute_non_eq(t1, t2);
        }
        /*println!(
            "Got type {} with constraints {}",
            node.typ, orig_constraints
        );*/
        // because we already substitued_non_eq, it might be the case that t1 is concrete
        for (t1, t2) in constraints.subtypes.clone() {
            // we currently simply promote subtypes/supertypes to equality constraints.
            // this might render a valid constraint invalid?
            // TODO: Change this to find better instantiations of generics that respect these constraints
            if t1.is_generic() || t2.is_generic() {
                constraints.add_equality(&t1, &t2);
            }
        }
        //println!("Simplified constraints {}", constraints);
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
        //println!("refined constraints: {}", constraints);
        //println!("Now instantiating type: {}", node.typ);
        let mut to_match_type = node.typ.clone();
        for (t1, t2) in &constraints.equality {
            if t1.is_generic() && !t2.is_generic() {
                Graph::substitute(&mut to_match_type, t1, t2)
            } else if !t1.is_generic() && t2.is_generic() {
                Graph::substitute(&mut to_match_type, t2, t1)
            }
        }
        //println!("Finished instantiating");
        let remaining_generics = TypeGenerator::get_generics(&to_match_type);
        for generic in remaining_generics {
            let num = self.rng.gen_range(0..(self.graph.concrete_types.len()));
            let new_typ = self.graph.concrete_types.get(num).unwrap();
            Graph::substitute(&mut to_match_type, &generic, new_typ);
        }
        let mut statements = Vec::new();
        let var_decl = VarDecl::new(
            "v_a".to_string(),
            to_match_type.clone(),
            Expression::BottomType,
        );
        let var = Expression::Var(var_decl.get_var());
        statements.push(Statement::Decl(Declaration::Var(var_decl)));

        let to_match = Box::new(var);

        let w = Pattern::WildCard(WildCard {
            typ: to_match_type,
            annotate: false,
        });
        let mut cases = self.refine(w, 0);
        let non_const: Vec<usize> = cases
            .iter()
            .enumerate()
            .filter_map(|(i, p)| if !p.is_const() { Some(i) } else { None })
            .collect();
        let removed_pattern = if !self.correct && non_const.len() > 1 {
            let ind = self.rng.gen_range(0..non_const.len());
            Some(cases.remove(*non_const.get(ind).unwrap()))
        } else {
            None
        };
        /*if let Some(rp) = &removed_pattern {
            println!("Removed: {}", LangTyp::pattern_to_string(rp));
        }*/

        let mut arms = Vec::new();
        for i in 0..cases.len() {
            arms.push(Expression::Int(i as u32));
        }
        let match_exp = MatchExp {
            to_match,
            cases,
            arms,
            removed_pattern: removed_pattern.clone(),
        };

        let match_var_decl = VarDecl::new(
            "v_b".to_string(),
            LangTyp::get_number_type(),
            Expression::Match(match_exp),
        );
        statements.push(Statement::Decl(Declaration::Var(match_var_decl)));
        (statements, removed_pattern)
    }

    fn refine(&mut self, p: Pattern<LangTyp>, depth: u32) -> Vec<Pattern<LangTyp>> {
        if depth > self.args.max_refine_depth {
            return vec![p];
        }
        match p {
            Pattern::WildCard(w) => self.refine_wild(w, depth),
            Pattern::Variant(v) => self.refine_variant(v, depth),
            Pattern::Constant(_) => vec![p],
            Pattern::Tuple(p1, p2) => self.refine_tuple(*p1, *p2, depth),
        }
    }

    fn refine_tuple(
        &mut self,
        p1: Pattern<LangTyp>,
        p2: Pattern<LangTyp>,
        depth: u32,
    ) -> Vec<Pattern<LangTyp>> {
        let refined_p1 = self.refine(p1, depth + 1);
        let refined_p2 = self.refine(p2, depth + 1);
        let mut out = Vec::new();
        for pt_1 in refined_p1 {
            for pt_2 in &refined_p2 {
                out.push(Pattern::Tuple(
                    Box::new(pt_1.clone()),
                    Box::new(pt_2.clone()),
                ));
            }
        }
        out
    }

    fn refine_variant(&mut self, var: Variant<LangTyp>, depth: u32) -> Vec<Pattern<LangTyp>> {
        if var.parameters.is_empty() {
            return vec![Pattern::Variant(var)];
        }
        let n = var.parameters.len();
        let base_var = var.clone();
        let mut queue = VecDeque::new();
        queue.push_front(var);

        let num_refin = self.rng.gen_range(1..=n);
        let mut indices: VecDeque<usize> = (0..n).collect();
        let mut pattern_indices = Vec::new();
        for i in 0..num_refin {
            let cur_ind = self.rng.gen_range(0..(n - i));
            pattern_indices.push(indices.remove(cur_ind).unwrap());
        }
        for p_ind in pattern_indices {
            let param_pattern = base_var.parameters.get(p_ind).unwrap();
            let refined_patterns: Vec<Pattern<LangTyp>> =
                self.refine(param_pattern.clone(), depth + 1);
            /* .into_iter()
            .filter(|p| !matches!(p, Pattern::WildCard(_)))
            .collect();*/
            if refined_patterns.is_empty()
                || matches!(refined_patterns.first().unwrap(), Pattern::WildCard(_))
            {
                continue;
            }
            while let Some(queue_var) = queue.pop_front() {
                if !matches!(
                    queue_var.parameters.get(p_ind).unwrap(),
                    Pattern::WildCard(_)
                ) {
                    // We went around the entire queue once
                    queue.push_front(queue_var);
                    break;
                }
                for refined_pattern in refined_patterns.iter() {
                    let mut new_pcc = queue_var.clone();
                    *new_pcc.parameters.get_mut(p_ind).unwrap() = refined_pattern.clone();
                    queue.push_back(new_pcc);
                }
            }
        }
        queue.into_iter().map(Pattern::Variant).collect()
    }

    fn refine_wild(&mut self, wild: WildCard<LangTyp>, depth: u32) -> Vec<Pattern<LangTyp>> {
        let typ = &wild.typ;
        if !Constraint::is_concrete(typ) {
            return vec![Pattern::WildCard(wild)];
        }
        if typ.is_tuple() {
            let params = typ.get_params().unwrap();
            let p1 = params.first().unwrap().clone();
            let p1_pattern = Pattern::WildCard(WildCard {
                typ: p1,
                annotate: false,
            });
            let p2 = params.get(1).unwrap().clone();
            let p2_pattern = Pattern::WildCard(WildCard {
                typ: p2,
                annotate: false,
            });
            return self.refine_tuple(p1_pattern, p2_pattern, depth + 1);
        }
        if wild.typ.is_primitive() && self.rng.gen_bool(self.args.const_refine_prob) {
            if wild.typ.is_bool() {
                let t = Box::new(Expression::Bool(true));
                let f = Box::new(Expression::Bool(false));
                let t = Constant {
                    typ: wild.typ.clone(),
                    exp: t,
                };
                let f = Constant {
                    typ: wild.typ,
                    exp: f,
                };
                return vec![Pattern::Constant(t), Pattern::Constant(f)];
            } else {
                let e = Box::new(wild.typ.get_const_exp());
                let p = Constant {
                    typ: wild.typ.clone(),
                    exp: e,
                };
                return vec![Pattern::Constant(p), Pattern::WildCard(wild)];
            }
        }

        let reachable = self.graph.get_reachable(typ, true, None);
        /*println!("From {typ} can reach: ");
        for r in &reachable {
            print!("{r}, ");
        }
        println!("----------------------------------");*/
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
        if reachable_variants.is_empty() {
            return vec![Pattern::WildCard(wild)];
        }
        let mut names: HashSet<String> = HashSet::new();
        let mut pattern_vec = Vec::new();
        for variant in reachable_variants {
            if !names.contains(variant.typ.get_name()) {
                names.insert(variant.typ.get_name().to_string());
                let pattern = Variant::get_variant_pattern(&variant.typ);
                if self.should_refine(depth + 1) {
                    pattern_vec.extend(self.refine(pattern, depth + 1));
                } else {
                    pattern_vec.push(pattern);
                }
            }
        }
        pattern_vec
    }

    fn should_refine(&mut self, depth: u32) -> bool {
        if depth == 0 {
            return true;
        }
        if depth >= self.args.max_refine_depth {
            return false;
        }
        self.rng.gen_bool(self.args.refine_prob)
    }
}
