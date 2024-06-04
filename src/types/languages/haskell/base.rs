use std::{collections::HashSet, fmt::Display};

use crate::types::{type_trait::Type, variance::Variance};
use core::fmt::Debug;

use super::haskell_type::HaskellType;

#[derive(Clone, Hash, Debug, Default, PartialEq, Eq, PartialOrd, Ord)]
pub struct Base {
    pub name: String,
    pub typargs: Vec<HaskellType>,
    pub variances: Vec<Variance>,
}

impl Display for Base {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let mut out = self.name.clone();
        for typarg in &self.typargs {
            if typarg.get_params().is_some_and(|t| !t.is_empty())
                || typarg.get_typargs().is_some_and(|t| !t.is_empty())
            {
                out.push_str(format!(" ({})", typarg).as_str());
            } else {
                out.push_str(format!(" {}", typarg).as_str());
            }
        }
        write!(f, "{}", out)
    }
}
