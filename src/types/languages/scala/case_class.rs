use std::{collections::HashSet, fmt::Display};

use crate::types::{
    type_graph::graph::Substitutions,
    type_trait::{setify, Type},
};

use super::{scala_type::ScalaType, variance::Variance};

#[derive(Clone, Hash, Default, PartialEq, Eq, PartialOrd, Ord)]
pub struct CaseClass {
    pub name: String,
    pub typargs: Vec<ScalaType>,
    pub variances: Vec<Variance>,
    pub parameters: Vec<ScalaType>,
    pub extends: Vec<ScalaType>,
}

type Constraints = Result<Substitutions<ScalaType>, ()>;

impl CaseClass {
    pub fn subtype_caseclass(&self, t: &ScalaType) -> Constraints {
        match t {
            ScalaType::CaseClass(cc) => {
                if cc.name != self.name || cc.typargs.len() != self.typargs.len() {
                    return Err(());
                }
                let mut subs = HashSet::new();
                for i in 0..self.typargs.len() {
                    let s_i = self.typargs.get(i).unwrap();
                    let t_i = cc.typargs.get(i).unwrap();
                    let result = match cc.variances.get(i).unwrap() {
                        Variance::Covariant => s_i.is_subtype(t_i),
                        Variance::Contravariant => t_i.is_subtype(s_i),
                        Variance::Invariant => setify(s_i, t_i),
                    };
                    if let Ok(constraints) = result {
                        for constraint in constraints {
                            subs.insert(constraint);
                        }
                    } else {
                        return Err(());
                    }
                }
                Ok(subs)
            }
            ScalaType::Trait(tr) => {
                let t_opt = self.extends.iter().find(|t| t.get_name() == tr.name);
                if t_opt.is_none() {
                    return Err(());
                }
                if let ScalaType::Trait(t) = t_opt.unwrap() {
                    if t.typargs.len() != tr.typargs.len() {
                        return Err(());
                    }
                    // t <: tr
                    let mut subs = HashSet::new();
                    for i in 0..t.typargs.len() {
                        let s_i = t.typargs.get(i).unwrap();
                        let t_i = tr.typargs.get(i).unwrap();
                        let result = match t.variances.get(i).unwrap() {
                            Variance::Covariant => s_i.is_subtype(t_i),
                            Variance::Contravariant => t_i.is_subtype(s_i),
                            Variance::Invariant => setify(s_i, t_i),
                        };
                        if let Ok(constraints) = result {
                            for constraint in constraints {
                                subs.insert(constraint);
                            }
                        } else {
                            return Err(());
                        }
                    }
                    return Ok(subs);
                }
                Err(())
            }
            _ => Err(()),
        }
    }
}

impl Display for CaseClass {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let mut name = self.name.clone();
        if !self.typargs.is_empty() {
            name.push('[');
            for typarg in self.typargs.iter() {
                name.push_str(typarg.to_string().as_str());
                name.push_str(", ");
            }
            name.pop();
            name.pop();
            name.push(']');
        }
        write!(f, "{}", name)
    }
}
