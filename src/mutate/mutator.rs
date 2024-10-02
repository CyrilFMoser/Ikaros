use rand::Rng;
use rand_chacha::ChaCha8Rng;
use z3::SatResult;

use crate::{
    generators::programgen::ProgramGenerator,
    matches::{
        expression::{Expression, MatchExp},
        pattern::{Constant, Pattern, Variant, WildCard},
        statements::{Declaration, Statement, VarDecl},
    },
    types::{type_graph::graph::Graph, type_trait::Type},
    Oracle,
};
use std::{
    fmt::{Debug, Display},
    hash::Hash,
};

pub fn mutate_match<
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Sync + Debug + 'static,
>(
    mut old_match: MatchExp<LangTyp>,
    result: &SatResult,
    graph: &mut Graph<LangTyp>,
    mut rng: ChaCha8Rng,
) -> (MatchExp<LangTyp>, String) {
    let ind = rng.gen_range(0..(old_match.cases.len()));
    let pattern_to_change = old_match.cases.get(ind).unwrap();

    let allow_delete = old_match.cases.len() > 1;

    let (new_pattern_opt, info) = match result {
        SatResult::Sat => weaken_match(pattern_to_change, ind, allow_delete, graph, &mut rng), // Pattern match is inexhaustive, weaken pattern even further
        SatResult::Unsat => {
            let f = |(p, i)| (Some(p), i);
            f(strengthen_match(pattern_to_change, ind, graph, &mut rng))
        } // Pattern match is exhaustive, make it even more exhaustive
        SatResult::Unknown => panic!("Unknowns should not be mutated"),
    };
    old_match.cases.remove(ind);
    old_match.arms.remove(ind);

    if let Some(new_pattern) = new_pattern_opt {
        for _ in 0..new_pattern.len() {
            old_match.arms.insert(ind, Expression::Int(ind as u32));
        }
        new_pattern
            .into_iter()
            .for_each(|p| old_match.cases.insert(ind, p));
    }

    (old_match, info)
}

fn get_num_positions<
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Sync + Debug + 'static,
>(
    pattern: &Pattern<LangTyp>,
    mut count: usize,
) -> usize {
    match pattern {
        Pattern::Constant(_) => count + 1,
        Pattern::Tuple(p1, p2) => {
            count = get_num_positions(p1, count);
            get_num_positions(p2, count)
        }
        Pattern::Variant(v) => {
            count += 1;
            for p in &v.parameters {
                count = get_num_positions(p, count);
            }
            count
        }
        Pattern::WildCard(_) => count + 1,
    }
}

fn get_position<
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Sync + Debug + 'static,
>(
    pattern: &Pattern<LangTyp>,
    count: &mut i32,
) -> Option<Pattern<LangTyp>> {
    if *count == 0 {
        *count -= 1;
        return Some(pattern.clone());
    }
    if *count < 0 {
        return None;
    }
    match pattern {
        Pattern::Constant(_) => *count -= 1,
        Pattern::Tuple(p1, p2) => {
            *count -= 1;
            let p = get_position(p1, count);
            if p.is_some() {
                return p;
            }
            return get_position(p2, count);
        }
        Pattern::Variant(v) => {
            *count -= 1;
            for p in &v.parameters {
                let p = get_position(p, count);
                if p.is_some() {
                    return p;
                }
            }
        }
        Pattern::WildCard(_) => *count -= 1,
    }
    None
}

pub fn mutate_match_exhaustive<
    LangTyp: Type
        + Clone
        + PartialEq
        + Eq
        + Ord
        + PartialOrd
        + Hash
        + Display
        + Sync
        + Debug
        + 'static
        + Send,
>(
    prog_gen: &mut ProgramGenerator<LangTyp>,
    result: &SatResult,
    batchsize: usize,
) -> u32 {
    let match_statement = prog_gen.match_statements.get(1).unwrap();
    let Statement::Decl(Declaration::Var(VarDecl {
        name,
        typ_annotation,
        typ,
        exp,
    })) = match_statement;

    //let old_match_statment = match_statement.clone();
    let matchexp = exp.clone();
    let name = name.clone();
    let typ_annotation = *typ_annotation;
    let typ = typ.clone();

    let mut num_progs = 1;

    if let Expression::Match(matchexp) = matchexp {
        for pattern_num in 0..matchexp.cases.len() {
            let mut allow_delete = matchexp.cases.len() > 1;
            let cur_pattern_to_change = matchexp.cases.get(pattern_num).unwrap();
            println!(
                "                           Pattern percentage: {}",
                (pattern_num as f64 / matchexp.cases.len() as f64)
            );
            for pos in 0..(get_num_positions(cur_pattern_to_change, 0) as i32) {
                let mut cur_pos = pos;
                let pattern_to_change = &get_position(cur_pattern_to_change, &mut cur_pos).unwrap();
                let mvec = match result {
                    SatResult::Sat => weaken_match_exhaustive(
                        pattern_to_change,
                        pattern_num,
                        allow_delete,
                        prog_gen.graph.as_mut().unwrap(),
                    ), // Pattern match is inexhaustive, weaken pattern even further
                    SatResult::Unsat => strengthen_match_exhaustive(
                        pattern_to_change,
                        prog_gen.graph.as_mut().unwrap(),
                        pattern_num,
                    ), // Pattern match is exhaustive, make it even more exhaustive
                    SatResult::Unknown => panic!("Unknowns should not be mutated"),
                };

                let mut cur_match_template = matchexp.clone();
                cur_match_template.cases.remove(pattern_num);
                cur_match_template.arms.remove(pattern_num);
                for (new_pattern, info) in mvec {
                    let mut cur_match = cur_match_template.clone();
                    for _ in 0..new_pattern.len() {
                        cur_match
                            .arms
                            .insert(pattern_num, Expression::Int(pattern_num as u32));
                    }
                    for p in new_pattern {
                        let mut cur_pat = cur_pattern_to_change.clone();
                        replace_at(&mut cur_pat, &p, pos);
                        if !cur_match.cases.contains(&cur_pat) {
                            cur_match.cases.insert(pattern_num, cur_pat)
                        }
                    }
                    num_progs += 1;
                    *prog_gen.match_statements.get_mut(1).unwrap() =
                        Statement::Decl(Declaration::Var(VarDecl {
                            name: name.clone(),
                            typ_annotation,
                            typ: typ.clone(),
                            exp: Expression::Match(cur_match),
                        }));
                    prog_gen.mutate_info = Some(info);
                    let exhaustive = matches!(result, SatResult::Unsat);
                    prog_gen.process_batch(exhaustive, Oracle::Mutation, batchsize);
                    prog_gen.mutate_info = None;
                }

                allow_delete = false;
            }
        }
    }
    num_progs
}

fn replace_at<
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Sync + 'static,
>(
    pattern: &mut Pattern<LangTyp>,
    new_pattern: &Pattern<LangTyp>,
    mut pos: i32,
) -> i32 {
    if pos == 0 {
        *pattern = new_pattern.clone();
        return -1;
    }
    if pos < 0 {
        return -1;
    }
    match pattern {
        Pattern::Constant(_) => pos - 1,
        Pattern::Tuple(p1, p2) => {
            pos = replace_at(p1, new_pattern, pos - 1);
            replace_at(p2, new_pattern, pos)
        }
        Pattern::Variant(v) => {
            pos -= 1;
            for p in v.parameters.iter_mut() {
                pos = replace_at(p, new_pattern, pos)
            }
            pos
        }
        Pattern::WildCard(_) => pos - 1,
    }
}

fn get_possible_const<
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Sync + 'static,
>(
    pattern: &mut Pattern<LangTyp>,
) -> Vec<Pattern<LangTyp>> {
    match pattern {
        Pattern::Constant(_) => vec![],
        Pattern::Tuple(a, b) => {
            let mut v = get_possible_const(a);
            v.append(&mut get_possible_const(b));
            v
        }
        Pattern::Variant(v) => {
            let mut patterns = Vec::new();
            for p in v.parameters.iter_mut() {
                patterns.append(&mut get_possible_const(p));
            }
            patterns
        }
        Pattern::WildCard(w) => {
            if w.typ.is_primitive() && !w.typ.is_bool() {
                vec![pattern.clone()]
            } else {
                vec![]
            }
        }
    }
}

fn replace_const<
    'a,
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Debug + Sync + 'static,
>(
    pattern: &'a mut Pattern<LangTyp>,
    const_pattern: &'a Pattern<LangTyp>,
    mut position: i32,
) -> i32 {
    if position < 0 {
        return position;
    }
    match pattern {
        Pattern::Constant(_) => position,
        Pattern::Tuple(a, b) => {
            position = replace_const(a, const_pattern, position);
            replace_const(b, const_pattern, position)
        }
        Pattern::Variant(v) => {
            for p in v.parameters.iter_mut() {
                position = replace_const(p, const_pattern, position);
            }
            position
        }
        Pattern::WildCard(w) => {
            if w.typ.is_primitive() && !w.typ.is_bool() {
                if position == 0 {
                    *pattern = const_pattern.clone();
                    -1
                } else {
                    position - 1
                }
            } else {
                position
            }
        }
    }
}

fn get_possible_traits<
    'a,
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Debug + Sync + 'static,
>(
    pattern: &'a mut Pattern<LangTyp>,
    graph: &'a Graph<LangTyp>,
) -> Vec<Vec<LangTyp>> {
    match pattern {
        Pattern::Constant(_) => vec![],
        Pattern::Tuple(a, b) => {
            let mut v = get_possible_traits(a, graph);
            v.append(&mut get_possible_traits(b, graph));
            v
        }
        Pattern::Variant(v) => {
            let mut patterns = Vec::new();
            for p in v.parameters.iter_mut() {
                patterns.append(&mut get_possible_traits(p, graph));
            }
            patterns
        }
        Pattern::WildCard(w) => {
            if w.typ.is_base() {
                let reachable: Vec<LangTyp> = graph
                    .get_reachable(&w.typ, true, None)
                    .into_iter()
                    .filter(|t| t.is_variant())
                    .collect();
                if reachable.is_empty() {
                    vec![]
                } else {
                    vec![reachable]
                }
            } else {
                vec![]
            }
        }
    }
}

fn replace_subcase<
    'a,
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Debug + Sync + 'static,
>(
    pattern: &'a mut Pattern<LangTyp>,
    subcase_pattern: &'a Pattern<LangTyp>,
    mut position: i32,
    graph: &'a Graph<LangTyp>,
) -> i32 {
    if position < 0 {
        return position;
    }
    match pattern {
        Pattern::Constant(_) => position,
        Pattern::Tuple(a, b) => {
            position = replace_subcase(a, subcase_pattern, position, graph);
            replace_subcase(b, subcase_pattern, position, graph)
        }
        Pattern::Variant(v) => {
            for p in v.parameters.iter_mut() {
                position = replace_subcase(p, subcase_pattern, position, graph);
            }
            position
        }
        Pattern::WildCard(w) => {
            if w.typ.is_base() {
                let reachable: Vec<LangTyp> = graph
                    .get_reachable(&w.typ, true, None)
                    .into_iter()
                    .filter(|t| t.is_variant())
                    .collect();
                if reachable.is_empty() {
                    position
                } else if position == 0 {
                    *pattern = subcase_pattern.clone();
                    -1
                } else {
                    position - 1
                }
            } else {
                position
            }
        }
    }
}

fn weaken_match<
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Debug + Sync + 'static,
>(
    pattern_to_change: &Pattern<LangTyp>,
    index: usize,
    allow_delete: bool,
    graph: &mut Graph<LangTyp>,
    rng: &mut ChaCha8Rng,
) -> (Option<Vec<Pattern<LangTyp>>>, String) {
    let mut new_pattern = pattern_to_change.clone();

    let mut possible_consts = Vec::new();

    let const_possible = if LangTyp::get_compiler_name() == "javac" {
        false
    } else {
        possible_consts = get_possible_const(&mut new_pattern);
        !possible_consts.is_empty()
    };

    let mut possible_subcases = get_possible_traits(&mut new_pattern, graph);
    let subcases_possible = !possible_subcases.is_empty();

    let delete_weight = if allow_delete { 1. } else { 0. };
    let subcase_weight = if subcases_possible { 3. } else { 0. };
    let const_weight = if const_possible { 2. } else { 0. };

    let weights = [delete_weight, subcase_weight, const_weight]; // delete, subcases of trait wildcard, replace wildcard with const

    let action = select_action(rng, &weights);
    if action == -1 {
        // No action can be chosen
        let info = String::from("Could not weaken the pattern match");
        return (Some(vec![new_pattern]), info);
    } else if action == 0 {
        let info = format!(
            "Deleted Pattern {} at position {index}",
            LangTyp::pattern_to_string(pattern_to_change)
        );
        return (None, info);
    } else if action == 1 {
        // replace with (possibly multiple) subcases of trait
        let ind = rng.gen_range(0..possible_subcases.len());

        let subcases = possible_subcases.get_mut(ind).unwrap();

        let num_subcases = rng.gen_range(1..=subcases.len());

        let mut new_patterns = Vec::new();

        let mut possible_indices: Vec<usize> = (0..subcases.len()).collect();

        let mut info = format!(
            "Expanded {} at position {index} into: \n {{\n",
            LangTyp::pattern_to_string(pattern_to_change)
        );
        for _ in 0..num_subcases {
            let pos = rng.gen_range(0..possible_indices.len());
            let index = possible_indices.remove(pos);
            let subcase_typ = subcases.get(index).unwrap();

            let new_sub_pattern = typ_to_basic_pattern(subcase_typ);

            let mut cur_new_pattern = new_pattern.clone();

            replace_subcase(&mut cur_new_pattern, &new_sub_pattern, ind as i32, graph);
            info.push_str(format!("  {}\n", LangTyp::pattern_to_string(&cur_new_pattern)).as_str());
            new_patterns.push(cur_new_pattern);
        }
        info.push_str(" }\n");
        return (Some(new_patterns), info);
    } else if action == 2 {
        // replace wildcard with constant expression
        let ind = rng.gen_range(0..possible_consts.len());

        let chosen_const = possible_consts.get(ind).unwrap();

        let const_exp = chosen_const.get_actual_type().get_const_exp();

        let const_pattern = Pattern::Constant(Constant {
            typ: chosen_const.get_actual_type(),
            exp: Box::new(const_exp),
        });

        let mut final_new_pattern = new_pattern.clone();

        replace_const(&mut final_new_pattern, &const_pattern, ind as i32);

        let info = format!(
            "Changing a Wildcard in {} at pattern position {index} to a constant expression:\n {{\n  {}\n }}\n",
            LangTyp::pattern_to_string(pattern_to_change),
            LangTyp::pattern_to_string(&final_new_pattern)
        );
        return (Some(vec![final_new_pattern]), info);
    }
    panic!("No valid action has been selected");
}

fn weaken_match_exhaustive<
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Debug + Sync + 'static,
>(
    pattern_to_change: &Pattern<LangTyp>,
    index: usize,
    allow_delete: bool,
    graph: &mut Graph<LangTyp>,
) -> Vec<(Vec<Pattern<LangTyp>>, String)> {
    let mut mvec = Vec::new();

    let typ = pattern_to_change.get_actual_type();

    let const_possible = LangTyp::get_compiler_name() != "javac"
        && !matches!(pattern_to_change, Pattern::WildCard(_))
        && typ.is_primitive()
        && !typ.is_bool();

    let mut possible_subcases = Vec::new();
    if typ.is_base() {
        possible_subcases = graph
            .get_reachable(&typ, true, None)
            .into_iter()
            .filter(|t| !t.is_base())
            .collect();
    }

    let subcases_possible = !possible_subcases.is_empty();

    if allow_delete {
        let info = format!(
            "Deleted Pattern {} at position {index}",
            LangTyp::pattern_to_string(pattern_to_change)
        );
        mvec.push((vec![], info));
    }
    if subcases_possible {
        // replace with (possibly multiple) subcases of trait
        for num_subcases in 1..=possible_subcases.len() {
            let mut new_patterns = Vec::new();

            let mut info = format!(
                "Expanded {} at position {index} into: \n {{\n",
                LangTyp::pattern_to_string(pattern_to_change)
            );
            for subcase_typ in possible_subcases.iter().take(num_subcases) {
                let new_sub_pattern = typ_to_basic_pattern(subcase_typ);

                info.push_str(
                    format!("  {}\n", LangTyp::pattern_to_string(&new_sub_pattern)).as_str(),
                );
                new_patterns.push(new_sub_pattern);
            }
            info.push_str(" }\n");
            mvec.push((new_patterns, info));
        }
    }
    if const_possible {
        // replace wildcard with constant expression

        let const_exp = typ.get_const_exp();

        let const_pattern = Pattern::Constant(Constant {
            typ,
            exp: Box::new(const_exp),
        });

        let info = format!(
            "Changing a Wildcard in {} at pattern position {index} to a constant expression:\n {{\n  {}\n }}\n",
            LangTyp::pattern_to_string(pattern_to_change),
            LangTyp::pattern_to_string(&const_pattern)
        );
        mvec.push(((vec![const_pattern]), info));
    }
    mvec
}

fn typ_to_basic_pattern<
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Debug + Sync + 'static,
>(
    typ: &LangTyp,
) -> Pattern<LangTyp> {
    if typ.is_variant() {
        let parameters: Vec<Pattern<LangTyp>> = typ
            .get_params()
            .unwrap()
            .clone()
            .into_iter()
            .map(|t| {
                Pattern::WildCard(WildCard {
                    typ: t,
                    annotate: false,
                })
            })
            .collect();
        Pattern::Variant(Variant {
            typ: typ.clone(),
            parameters,
        })
    } else if typ.is_tuple() {
        let parameters: Vec<Pattern<LangTyp>> = typ
            .get_params()
            .unwrap()
            .clone()
            .into_iter()
            .map(|t| {
                Pattern::WildCard(WildCard {
                    typ: t,
                    annotate: false,
                })
            })
            .collect();
        Pattern::Tuple(
            Box::new(parameters.first().unwrap().clone()),
            Box::new(parameters.get(1).unwrap().clone()),
        )
    } else {
        Pattern::WildCard(WildCard {
            typ: typ.clone(),
            annotate: false,
        })
    }
}

fn select_action(rng: &mut ChaCha8Rng, weights: &[f64]) -> i32 {
    let mut prev;
    let mut cur = 0.;
    let num: f64 = rng.gen_range(0. ..=1.);

    let weight_sum: f64 = weights.iter().sum::<f64>();

    if weight_sum == 0. {
        return -1;
    }

    let mut action = 0;

    for &weight in weights {
        prev = cur;
        cur += weight / weight_sum;
        if num >= prev && num <= cur {
            break;
        }
        action += 1;
    }
    action
}

fn get_num_possible_leafs<
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Debug + Sync + 'static,
>(
    pattern: &Pattern<LangTyp>,
) -> usize {
    let mut x = if pattern.is_leaf() { 1 } else { 0 };
    x += match pattern {
        Pattern::Constant(_) | Pattern::WildCard(_) => 0,
        Pattern::Tuple(p1, p2) => get_num_possible_leafs(p1) + get_num_possible_leafs(p2),
        Pattern::Variant(v) => v.parameters.iter().map(get_num_possible_leafs).sum(),
    };
    x
}

fn replace_leaf<
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Debug + Sync + 'static,
>(
    pattern: &mut Pattern<LangTyp>,
    mut position: i32,
) -> i32 {
    if position < 0 {
        return position;
    }
    if pattern.is_leaf() {
        position -= 1;

        if position == 0 {
            *pattern = Pattern::WildCard(WildCard {
                typ: pattern.get_actual_type(),
                annotate: false,
            });
            return position;
        }
    }
    match pattern {
        Pattern::Constant(_) => position,
        Pattern::Tuple(a, b) => {
            position = replace_leaf(a, position);
            replace_leaf(b, position)
        }
        Pattern::Variant(v) => {
            for p in v.parameters.iter_mut() {
                position = replace_leaf(p, position);
            }
            position
        }
        Pattern::WildCard(_) => position,
    }
}

fn strengthen_match<
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Debug + Sync + 'static,
>(
    pattern_to_change: &Pattern<LangTyp>,
    index: usize,
    graph: &mut Graph<LangTyp>,
    rng: &mut ChaCha8Rng,
) -> (Vec<Pattern<LangTyp>>, String) {
    let mut new_pattern = pattern_to_change.clone();

    let mut possible_consts = Vec::new();

    let const_possible = if LangTyp::get_compiler_name() == "javac" {
        false
    } else {
        possible_consts = get_possible_const(&mut new_pattern);
        !possible_consts.is_empty()
    };

    let typ = new_pattern.get_actual_type();

    let mut possible_subcases = Vec::new();
    if typ.is_base() {
        possible_subcases = graph
            .get_reachable(&typ, true, None)
            .into_iter()
            .filter(|t| !t.is_base())
            .collect();
    }

    let subcases_possible = !possible_subcases.is_empty();

    let num_leafs = get_num_possible_leafs(pattern_to_change);
    let concrete_to_wild_possible = num_leafs > 0;

    let additional_constant_weight = if const_possible { 1. } else { 0. };
    let concrete_to_wild_weight = if concrete_to_wild_possible { 2. } else { 0. };
    let subcases_weight = if subcases_possible { 3. } else { 0. };

    let weights = [
        additional_constant_weight,
        concrete_to_wild_weight,
        subcases_weight,
    ];

    let action = select_action(rng, &weights);
    if action == 0 {
        // Add an additional constant pattern to a pattern containing a wildcard
        let ind = rng.gen_range(0..possible_consts.len());

        let chosen_const = possible_consts.get(ind).unwrap();

        let const_exp = chosen_const.get_actual_type().get_const_exp();

        let const_pattern = Pattern::Constant(Constant {
            typ: chosen_const.get_actual_type(),
            exp: Box::new(const_exp),
        });

        let mut final_new_pattern = new_pattern.clone();

        replace_const(&mut final_new_pattern, &const_pattern, ind as i32);

        let info = format!(
            "Adding an additional constant to a Wildcard in {} at pattern position {index} with constant expression:\n {{\n  {}\n }}\n",
            LangTyp::pattern_to_string(pattern_to_change),
            LangTyp::pattern_to_string(&final_new_pattern)
        );
        return (vec![new_pattern, final_new_pattern], info);
    } else if action == 1 {
        // Change a concrete leaf pattern to a wildcard
        let ind = rng.gen_range(1..=num_leafs);

        let mut final_new_pattern = new_pattern.clone();

        replace_leaf(&mut final_new_pattern, ind as i32);

        let info = format!(
            "Generalizing a concrete pattern in {} at pattern position {index} to a wildcard pattern :\n {{\n  {}\n }}\n",
            LangTyp::pattern_to_string(pattern_to_change),
            LangTyp::pattern_to_string(&final_new_pattern)
        );
        return (vec![final_new_pattern], info);
    } else if action == 2 {
        // replace with (possibly multiple) subcases of trait
        let ind = rng.gen_range(0..possible_subcases.len());

        let num_subcases = rng.gen_range(1..=possible_subcases.len());

        let mut new_patterns = vec![new_pattern.clone()];

        let mut possible_indices: Vec<usize> = (0..possible_subcases.len()).collect();

        let mut info = format!(
            "Expanded {} at position {index} into: \n {{\n",
            LangTyp::pattern_to_string(pattern_to_change)
        );
        for _ in 0..num_subcases {
            let pos = rng.gen_range(0..possible_indices.len());
            let index = possible_indices.remove(pos);
            let subcase_typ = possible_subcases.get(index).unwrap();

            let new_sub_pattern = typ_to_basic_pattern(subcase_typ);

            let mut cur_new_pattern = new_pattern.clone();

            replace_subcase(&mut cur_new_pattern, &new_sub_pattern, ind as i32, graph);
            info.push_str(format!("  {}\n", LangTyp::pattern_to_string(&cur_new_pattern)).as_str());
            new_patterns.push(cur_new_pattern);
        }
        info.push_str(" }\n");
        return (new_patterns, info);
    }
    (
        vec![pattern_to_change.clone()],
        String::from("Didn't change anything"),
    )
}

fn strengthen_match_exhaustive<
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Debug + Sync + 'static,
>(
    pattern_to_change: &Pattern<LangTyp>,
    graph: &Graph<LangTyp>,
    index: usize,
) -> Vec<(Vec<Pattern<LangTyp>>, String)> {
    let new_pattern = pattern_to_change.clone();

    let typ = pattern_to_change.get_actual_type();
    let const_possible =
        LangTyp::get_compiler_name() != "javac" && typ.is_primitive() && !typ.is_bool();

    let concrete_to_wild_possible = !matches!(pattern_to_change, Pattern::WildCard(_));
    let mut possible_subcases = Vec::new();
    if typ.is_base() {
        possible_subcases = graph
            .get_reachable(&typ, true, None)
            .into_iter()
            .filter(|t| !t.is_base())
            .collect();
    }

    let subcases_possible = !possible_subcases.is_empty();

    let mut mvec = Vec::new();

    if const_possible {
        // Add an additional constant pattern to a pattern containing a wildcard

        let const_exp = typ.get_const_exp();

        let const_pattern = Pattern::Constant(Constant {
            typ: typ.clone(),
            exp: Box::new(const_exp),
        });

        let info = format!(
            "Adding an additional constant to a Wildcard in {} at pattern position {index} with constant expression:\n {{\n  {}\n }}\n",
            LangTyp::pattern_to_string(pattern_to_change),
            LangTyp::pattern_to_string(&const_pattern)
        );
        mvec.push((vec![new_pattern.clone(), const_pattern], info));
    }
    if concrete_to_wild_possible {
        // Change a concrete leaf pattern to a wildcard

        let final_new_pattern = Pattern::WildCard(WildCard {
            typ,
            annotate: false,
        });

        let info = format!(
            "Generalizing a concrete pattern in {} at pattern position {index} to a wildcard pattern :\n {{\n  {}\n }}\n",
            LangTyp::pattern_to_string(pattern_to_change),
            LangTyp::pattern_to_string(&final_new_pattern)
        );
        mvec.push((vec![final_new_pattern], info));
    }
    if subcases_possible {
        // replace with (possibly multiple) subcases of trait
        for num_subcases in 1..=possible_subcases.len() {
            let mut new_patterns = vec![new_pattern.clone()];

            let mut info = format!(
                "Expanded {} at position {index} into: \n {{\n",
                LangTyp::pattern_to_string(pattern_to_change)
            );
            for subcase_typ in possible_subcases.iter().take(num_subcases) {
                let new_sub_pattern = typ_to_basic_pattern(subcase_typ);

                info.push_str(
                    format!("  {}\n", LangTyp::pattern_to_string(&new_sub_pattern)).as_str(),
                );
                new_patterns.push(new_sub_pattern);
            }
            info.push_str(" }\n");
            mvec.push((new_patterns, info));
        }
    }
    mvec
}
