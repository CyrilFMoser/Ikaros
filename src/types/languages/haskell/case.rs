use crate::types::type_trait::Type;

use super::haskell_type::HaskellType;
use core::fmt::Debug;
use std::fmt::Display;

#[derive(Clone, Hash, Debug, Default, PartialEq, Eq, PartialOrd, Ord)]
pub struct Case {
    pub name: String,
    pub parameters: Vec<HaskellType>,
    pub typargs: Vec<HaskellType>,
    pub extends: Vec<HaskellType>,
}
impl Display for Case {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        let mut out = self.name.clone();
        out.push_str(" :: ");
        let mut has_params = false;
        for param in &self.parameters {
            if has_params {
                out.push_str(" -> ");
            }
            if param.get_params().is_some_and(|t| !t.is_empty())
                || param.get_typargs().is_some_and(|t| !t.is_empty())
            {
                out.push_str(format!("({})", param).as_str());
            } else {
                out.push_str(format!("{}", param).as_str());
            }
            has_params = true;
        }
        if has_params {
            out.push_str(" -> ");
        }
        for base in &self.extends {
            out.push_str(format!("{}", base).as_str());
        }
        write!(f, "{}", out)
    }
}
