use std::{collections::HashSet, fmt::Display};

use super::java_type::JavaType;
use crate::types::{type_trait::Type, variance::Variance};
use core::fmt::Debug;

#[derive(Clone, Hash, Debug, Default, PartialEq, Eq, PartialOrd, Ord)]
pub struct Record {
    pub name: String,
    pub typargs: Vec<JavaType>,
    pub variances: Vec<Variance>,
    pub parameters: Vec<JavaType>,
    pub extends: Vec<JavaType>,
}

impl Record {
    pub fn subtype_record(&self, t: &JavaType) -> bool {
        match t {
            JavaType::Record(cc) => {
                if cc.name != self.name || cc.typargs.len() != self.typargs.len() {
                    return false;
                }
                for i in 0..self.typargs.len() {
                    let s_i = self.typargs.get(i).unwrap();
                    let t_i = cc.typargs.get(i).unwrap();
                    let is_subtype = s_i == t_i && !s_i.is_generic();
                    if !is_subtype {
                        return false;
                    }
                }
                true
            }
            JavaType::Interface(tr) => {
                let t_opt = self.extends.iter().find(|t| t.get_name() == tr.name);
                if t_opt.is_none() {
                    return false;
                }
                if let JavaType::Interface(t) = t_opt.unwrap() {
                    if t.typargs.len() != tr.typargs.len() {
                        return false;
                    }
                    // t <: tr
                    for i in 0..t.typargs.len() {
                        let s_i = t.typargs.get(i).unwrap();
                        let t_i = tr.typargs.get(i).unwrap();
                        let is_subtype = s_i == t_i && !s_i.is_generic();

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

impl Display for Record {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let mut name = self.name.clone();
        if !self.typargs.is_empty() {
            name.push('<');
            for typarg in self.typargs.iter() {
                name.push_str(typarg.to_string().as_str());
                name.push_str(", ");
            }
            name.pop();
            name.pop();
            name.push('>');
        }
        write!(f, "{}", name)
    }
}
