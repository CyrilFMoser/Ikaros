use std::fmt::Display;

use crate::types::{type_trait::Type, variance::Variance};

use super::java_type::JavaType;
use core::fmt::Debug;
#[derive(Clone, Hash, Debug, Default, PartialEq, Eq, PartialOrd, Ord)]
pub struct Interface {
    pub name: String,
    pub variances: Vec<Variance>,
    pub typargs: Vec<JavaType>,
    pub extends: Vec<JavaType>,
}

impl Interface {
    pub fn subtype_interface(&self, other: &JavaType) -> bool {
        if let JavaType::Interface(tr) = other {
            let t = if self.name != tr.name {
                let t_opt = self.extends.iter().find(|t| t.get_name() == tr.name);
                if let Some(JavaType::Interface(t)) = t_opt {
                    t
                } else {
                    return false;
                }
            } else {
                self
            };
            if t.typargs.len() != tr.typargs.len() {
                return false;
            }
            // t <: tr
            for i in 0..t.typargs.len() {
                let s_i = t.typargs.get(i).unwrap();
                let t_i = tr.typargs.get(i).unwrap();
                if t_i != s_i || t_i.is_generic() {
                    return false;
                }
            }
            return true;
        }
        false
    }
}

impl Display for Interface {
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
