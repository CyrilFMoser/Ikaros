use std::fmt::Display;

use crate::types::type_trait::Type;

use super::{scala_type::ScalaType, variance::Variance};

#[derive(Clone, Hash, Default, PartialEq, Eq, PartialOrd, Ord)]
pub struct CaseClass {
    pub name: String,
    pub typargs: Vec<ScalaType>,
    pub variances: Vec<Variance>,
    pub parameters: Vec<ScalaType>,
    pub extends: Vec<ScalaType>,
}

impl CaseClass {
    pub fn subtype_caseclass(&self, t: &ScalaType) -> bool {
        match t {
            ScalaType::CaseClass(cc) => {
                if cc.name != self.name || cc.typargs.len() != self.typargs.len() {
                    return false;
                }
                for i in 0..self.typargs.len() {
                    let s_i = self.typargs.get(i).unwrap();
                    let t_i = cc.typargs.get(i).unwrap();
                    let is_subtype = match cc.variances.get(i).unwrap() {
                        Variance::Covariant => s_i.is_subtype(t_i),
                        Variance::Contravariant => t_i.is_subtype(s_i),
                        Variance::Invariant => t_i == s_i,
                    };
                    if !is_subtype {
                        return false;
                    }
                }
                true
            }
            ScalaType::Trait(tr) => {
                let t_opt = self.extends.iter().find(|t| t.get_name() == tr.name);
                if t_opt.is_none() {
                    return false;
                }
                if let ScalaType::Trait(t) = t_opt.unwrap() {
                    if t.typargs.len() != tr.typargs.len() {
                        return false;
                    }
                    // t <: tr
                    for i in 0..t.typargs.len() {
                        let s_i = t.typargs.get(i).unwrap();
                        let t_i = tr.typargs.get(i).unwrap();
                        let is_subtype = match t.variances.get(i).unwrap() {
                            Variance::Covariant => s_i.is_subtype(t_i),
                            Variance::Contravariant => t_i.is_subtype(s_i),
                            Variance::Invariant => t_i == s_i,
                        };
                        if !is_subtype {
                            return false;
                        }
                    }
                    return true;
                }
                false
            }
            _ => false,
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
