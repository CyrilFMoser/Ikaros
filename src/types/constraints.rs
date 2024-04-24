use super::type_trait::Type;
use std::collections::HashSet;
use std::fmt::Display;
use std::hash::Hash;

pub struct Constraint<LangTyp> {
    pub subtype: HashSet<(LangTyp, LangTyp)>, //(t1,t2) => t1 <: t2
}

impl<LangTyp: Type + Clone + PartialEq + Eq + Hash + Display> Constraint<LangTyp> {
    pub fn new() -> Self {
        Constraint {
            subtype: HashSet::new(),
        }
    }

    pub fn new_equality_constraint(t1: &LangTyp, t2: &LangTyp) -> Result<Self, ()> {
        let constraint1 = t1.is_subtype(t2)?;
        let constraint2 = t2.is_subtype(t1)?;
        let mut result = Constraint::new();
        result.combine(&constraint1);
        result.combine(&constraint2);
        Ok(result)
    }

    pub fn combine(&mut self, other: &Self) {
        for sub in other.subtype {
            self.subtype.insert(sub);
        }
    }
}
