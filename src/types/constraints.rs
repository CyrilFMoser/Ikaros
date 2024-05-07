use crate::generators::typegen::TypeGenerator;

use super::languages::scala::variance::Variance;
use super::type_graph::graph::Graph;
use super::type_trait::Type;
use std::collections::{HashMap, HashSet, VecDeque};
use std::fmt::Display;
use std::hash::Hash;
/// We need subtypes and supertypes, because we want to keep track to which original type the unwrapped constraints
/// belong to.
#[derive(Clone, PartialEq)]
pub struct Constraint<LangTyp: PartialEq + Eq + Hash> {
    pub subtypes: HashSet<(LangTyp, LangTyp)>, // (t1,t2) => t1 <: t2
    pub equality: HashSet<(LangTyp, LangTyp)>, // (t1,t2) => t1 == t2
}

impl<LangTyp: Type + Clone + PartialEq + Eq + Hash + Display> Constraint<LangTyp> {
    pub fn new_empty() -> Constraint<LangTyp> {
        Constraint {
            subtypes: HashSet::new(),
            equality: HashSet::new(),
        }
    }

    pub fn is_empty(&self) -> bool {
        self.subtypes.is_empty() && self.equality.is_empty()
    }

    pub fn add_subtype(&mut self, t1: &LangTyp, t2: &LangTyp) {
        self.subtypes.insert((t1.clone(), t2.clone()));
    }

    pub fn add_equality(&mut self, t1: &LangTyp, t2: &LangTyp) {
        self.equality.insert((t1.clone(), t2.clone()));
    }

    pub fn add_supertype(&mut self, t1: &LangTyp, t2: &LangTyp) {
        self.subtypes.insert((t2.clone(), t1.clone()));
    }
    pub fn is_alpha_equiv(t1: &LangTyp, t2: &LangTyp) -> bool {
        if t1 == t2 {
            return true;
        }
        if t1.get_name() != t2.get_name() {
            return false;
        }
        let mut remappings: HashSet<(&LangTyp, &LangTyp)> = HashSet::new();
        let mut work_queue: VecDeque<(&LangTyp, &LangTyp)> = VecDeque::new();
        work_queue.push_front((t1, t2));
        while let Some((l, r)) = work_queue.pop_front() {
            if l.is_generic() && r.is_generic() {
                remappings.insert((l, r));
            } else if (Self::is_concrete(l) || Self::is_concrete(r)) && l != r
                || l.get_typargs().is_none() != r.get_typargs().is_none()
            {
                return false;
            } else if let (Some(l_typargs), Some(r_typargs)) = (l.get_typargs(), r.get_typargs()) {
                if l_typargs.len() != r_typargs.len() {
                    return false;
                }
                for (l_t, r_t) in l_typargs.iter().zip(r_typargs) {
                    work_queue.push_back((l_t, r_t));
                }
            } else if l != r {
                // don't think such types exist
                panic!("THEY DO {l} and {r}");
            }
        }
        // Only generics can be remapped for alpha equivalence
        if remappings
            .iter()
            .any(|(typ, sub)| !(typ.is_generic() && sub.is_generic()))
        {
            return false;
        }
        // Every substitution appears exactly once
        let sub_count_1: &mut HashMap<&LangTyp, u32> = &mut HashMap::new();
        let sub_count_2: &mut HashMap<&LangTyp, u32> = &mut HashMap::new();

        let mapping_length = remappings.len();
        for (sub_1, sub_2) in remappings.iter() {
            *sub_count_1.entry(sub_1).or_insert(0) += 1;
            *sub_count_2.entry(sub_2).or_insert(0) += 1;
        }

        sub_count_1.values().all(|count| *count == 1)
            && sub_count_1.len() == mapping_length
            && sub_count_2.values().all(|count| *count == 1)
            && sub_count_2.len() == mapping_length
    }

    pub fn refine(&mut self) -> Result<bool, ()> {
        println!("Refining {}", self);

        let original = self.clone();

        // now unpack subtype constraints
        let mut new_sub = HashSet::new();
        let mut worker_queue: VecDeque<(LangTyp, LangTyp)> = self.subtypes.drain().collect();
        while let Some((t1, t2)) = worker_queue.pop_front() {
            if t1.get_name() == t2.get_name() {
                if let (Some(typargs_1), Some(typargs_2)) = (t1.get_typargs(), t2.get_typargs()) {
                    if let Some(variances) = t1.get_variances() {
                        println!("Unpacking {t1} and {t2}");
                        for i in 0..(variances.len()) {
                            let variance = variances.get(i).unwrap();
                            let typarg_1 = typargs_1.get(i).unwrap().clone();
                            let typarg_2 = typargs_2.get(i).unwrap().clone();
                            match variance {
                                Variance::Covariant => new_sub.insert((typarg_1, typarg_2)),
                                Variance::Contravariant => new_sub.insert((typarg_2, typarg_1)),
                                Variance::Invariant => self.equality.insert((typarg_1, typarg_2)),
                            };
                        }
                        continue;
                    }
                }
            }
            new_sub.insert((t1, t2));
        }
        self.subtypes = new_sub;

        for (t1, t2) in self
            .equality
            .iter()
            .filter(|(t1, t2)| Self::is_concrete(t1) && Self::is_concrete(t2))
        {
            if t1 != t2 {
                return Err(());
            }
        }
        for (t1, t2) in self
            .subtypes
            .iter()
            .filter(|(t1, t2)| Self::is_concrete(t1) && Self::is_concrete(t2))
        {
            if !t1.is_subtype(t2) {
                return Err(());
            }
        }

        let mut no_concrete = |pair: &(LangTyp, LangTyp)| {
            if !Self::is_concrete(&pair.0) || !Self::is_concrete(&pair.1) {
                true
            } else {
                false
            }
        };
        self.equality.retain(&mut no_concrete);
        self.subtypes.retain(&mut no_concrete);

        // use transitivity of subtyping
        let mut subtypes_to_add = HashSet::new();
        for (t1, t2) in &self.subtypes {
            for (t3, t4) in &self.subtypes {
                if t2 == t3 {
                    subtypes_to_add.insert((t1.clone(), t4.clone()));
                }
            }
        }
        for pair in subtypes_to_add {
            self.subtypes.insert(pair);
        }
        let mut actual_equality = Vec::new();
        for (t1, t2) in &self.subtypes {
            let flipped = (t2.clone(), t1.clone());
            if self.subtypes.contains(&flipped) {
                // uses asymmetry of subtyping relation
                actual_equality.push(flipped);
            }
        }
        println!("current constraints: {}", self);
        let mut remove_subtyp = Vec::new();
        for pair in &self.equality {
            if self.subtypes.contains(pair) {
                // remove subtype constraints if there are equality constraints for the same pair
                // t1 <: t2 AND t1 == t2 => t1 == t2
                remove_subtyp.push(pair.clone());
            }
        }
        for pair in actual_equality.into_iter() {
            self.subtypes.remove(&pair);
            self.equality.insert(pair.clone());
            let flipped = (pair.1, pair.0);
            self.subtypes.remove(&flipped);
        }
        for pair in remove_subtyp.into_iter() {
            self.subtypes.remove(&pair);
        }
        let mut dedup_eq = Vec::new();
        for pair @ (t1, t2) in &self.equality {
            if self.equality.contains(&(t2.clone(), t1.clone())) && !dedup_eq.contains(pair) {
                dedup_eq.push((t2.clone(), t1.clone()));
            }
        }
        for pair in dedup_eq {
            self.equality.remove(&pair);
        }

        // A == B && B == INT && A == INT should be removed here, and if A == CHAR in this example this throws an error
        let mut remove_eq = Vec::new();
        for pair @ (t1, t2) in &self.equality {
            if !t1.is_generic() || !t2.is_generic() {
                continue;
            }
            let t1_2_opt = self.equality.iter().find_map(|(a, b)| {
                if a == t1 && Self::is_concrete(b) {
                    Some(b)
                } else if b == t1 && Self::is_concrete(a) {
                    Some(a)
                } else {
                    None
                }
            });
            let t2_1_opt = self.equality.iter().find_map(|(a, b)| {
                if a == t2 && Self::is_concrete(b) {
                    Some(b)
                } else if b == t2 && Self::is_concrete(a) {
                    Some(a)
                } else {
                    None
                }
            });
            if let (Some(t1_2), Some(t2_1)) = (t1_2_opt, t2_1_opt) {
                if t1_2 != t2_1 {
                    //println!("Pairs didn't match, {t1_2} != {t2_1}");
                    return Err(());
                }
                remove_eq.push(pair.clone());
            }
        }
        for pair in remove_eq {
            println!("Removing {},{}", pair.0, pair.1);
            self.equality.remove(&pair);
        }

        // recursive constraints
        for (t1, t2) in self.subtypes.iter().chain(self.equality.iter()) {
            if t1.is_generic() && !t2.is_generic() {
                let generics = TypeGenerator::get_generics(t2);
                if generics.contains(t1) {
                    return Err(());
                }
            } else if !t1.is_generic() && t2.is_generic() {
                let generics = TypeGenerator::get_generics(t1);
                if generics.contains(t2) {
                    return Err(());
                }
            }
        }

        //println!("Made it to here with constraints {}", self);
        let mut new_eq = HashSet::new();
        let mut final_mappings = HashSet::new();
        for (t1, t2) in &self.equality {
            if t1.get_typargs().is_none() != t2.get_typargs().is_none()
                && !t1.is_generic()
                && !t2.is_generic()
            {
                return Err(());
            }
            if t1.is_generic() && Self::is_concrete(t2) {
                // if we're remapping a generic to a concrete value, all other constraints have to match it or be a *different* generic
                if self.equality.iter().any(|(other_t1, other_t2)| {
                    other_t1 == t1 && other_t2 != t2 && Self::is_concrete(other_t2)
                        || other_t2 == t1 && other_t1 != t2 && Self::is_concrete(other_t1)
                }) {
                    return Err(());
                }
                // otherwise this is a final mapping
                new_eq.insert((t1.clone(), t2.clone()));
                final_mappings.insert((t1.clone(), t2.clone()));
                continue;
            }
            if t2.is_generic() && Self::is_concrete(t1) {
                // if we're remapping a generic to a concrete value, all other constraints have to match it or be a *different* generic
                if self.equality.iter().any(|(other_t1, other_t2)| {
                    other_t1 == t2 && other_t2 != t1 && Self::is_concrete(other_t2)
                        || other_t2 == t2 && other_t1 != t1 && Self::is_concrete(other_t1)
                }) {
                    return Err(());
                }
                // otherwise this is a final mapping
                new_eq.insert((t2.clone(), t1.clone()));
                final_mappings.insert((t2.clone(), t1.clone()));
                continue;
            }
            if let (Some(t1_typargs), Some(t2_typargs)) = (t1.get_typargs(), t2.get_typargs()) {
                if t1_typargs.len() != t2_typargs.len() {
                    return Err(());
                }
                if !t1_typargs.is_empty() {
                    for (typ_1, typ_2) in t1_typargs.iter().zip(t2_typargs) {
                        let prev_len = new_eq.len();
                        new_eq.insert((typ_1.clone(), typ_2.clone()));
                        if prev_len < new_eq.len() {
                            println!("Added {typ_1} == {typ_2}");
                        }
                    }
                }
            } else {
                // no typargs, can't be further unpacked
                new_eq.insert((t1.clone(), t2.clone()));
            }
        }
        self.equality = new_eq;
        for (t1, t2) in final_mappings {
            // substitute t1 for t2 in the subtype relation
            self.substitute_non_eq(&t1, &t2);

            let mut new_eq = HashSet::new();
            for (mut t1_cur, mut t2_cur) in self.equality.drain() {
                if let Some(typargs) = t1_cur.get_typargs_mut() {
                    for typarg in typargs {
                        Graph::substitute(typarg, &t1, &t2);
                    }
                }
                if let Some(typargs) = t2_cur.get_typargs_mut() {
                    for typarg in typargs {
                        Graph::substitute(typarg, &t1, &t2);
                    }
                }
                new_eq.insert((t1_cur, t2_cur));
            }
            self.equality = new_eq;
        }
        let changed = *self != original;
        if changed {
            println!("Changed {} to \n{}", original, self);
        }
        Ok(changed)
    }

    pub fn is_satisfiable(&mut self) -> bool {
        while let Ok(b) = self.refine() {
            if !b {
                return true;
            }
            println!("{self}");
        }
        false
    }

    pub fn substitute_non_eq(&mut self, t1: &LangTyp, t2: &LangTyp) {
        let mut new_sub = HashSet::new();
        for (t1_cur, t2_cur) in self.subtypes.drain() {
            let mut t1_cur = t1_cur.clone();
            Graph::substitute(&mut t1_cur, t1, t2);
            let mut t2_cur = t2_cur.clone();
            Graph::substitute(&mut t2_cur, t1, t2);
            new_sub.insert((t1_cur, t2_cur));
        }
        self.subtypes = new_sub;
    }

    pub fn is_concrete(typ: &LangTyp) -> bool {
        if typ.is_generic() {
            return false;
        }
        let mut concrete = true;
        if let Some(params) = typ.get_params() {
            concrete &= params.iter().all(Self::is_concrete);
        }
        if !concrete {
            return false;
        }
        if let Some(typargs) = typ.get_typargs() {
            concrete &= typargs.iter().all(Self::is_concrete);
        }
        if !concrete {
            return false;
        }
        if let Some(bases) = typ.get_bases() {
            concrete &= bases.iter().all(Self::is_concrete);
        }
        concrete
    }

    pub fn remap_1(&mut self, other: &Self) {
        let mut new_eq: Vec<(LangTyp, LangTyp)> = self.equality.clone().into_iter().collect();
        let mut new_sub: Vec<(LangTyp, LangTyp)> = self.subtypes.clone().into_iter().collect();
        for (t1_other, t2_other) in &other.equality {
            for it in [&mut new_eq, &mut new_sub] {
                it.iter_mut()
                    .for_each(|(sub_t1, _)| Graph::substitute(sub_t1, t1_other, t2_other));
            }
        }
        self.equality = new_eq.into_iter().collect();
        self.subtypes = new_sub.into_iter().collect();
    }

    pub fn remap_2(&mut self, other: &Self) {
        let mut new_eq: Vec<(LangTyp, LangTyp)> = self.equality.clone().into_iter().collect();
        let mut new_sub: Vec<(LangTyp, LangTyp)> = self.subtypes.clone().into_iter().collect();
        for (t1_other, t2_other) in &other.equality {
            for it in [&mut new_eq, &mut new_sub] {
                it.iter_mut()
                    .for_each(|(_, sub_t2)| Graph::substitute(sub_t2, t1_other, t2_other));
            }
        }
        self.equality = new_eq.into_iter().collect();
        self.subtypes = new_sub.into_iter().collect();
    }
}

impl<LangTyp: Type + Clone + PartialEq + Eq + Hash + Display> Display for Constraint<LangTyp> {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let mut out = String::new();
        if !self.subtypes.is_empty() {
            let mut sc = String::new();
            for (t1, t2) in &self.subtypes {
                sc.push_str(format!("{} <: {}, ", t1, t2).as_str());
            }
            sc.pop();
            sc.pop();
            out.push_str(format!("{{{}}}\n", sc).as_str());
        }
        if !self.equality.is_empty() {
            let mut sc = String::new();
            for (t1, t2) in &self.equality {
                sc.push_str(format!("{} == {}, ", t1, t2).as_str());
            }
            sc.pop();
            sc.pop();
            out.push_str(format!("{{{}}}\n", sc).as_str());
        }
        write!(f, "{}", out)
    }
}
