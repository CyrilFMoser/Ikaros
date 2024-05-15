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
        for param in &self.parameters {
            if param.is_complex() {
                out.push_str(format!(" ({})", param).as_str());
            } else {
                out.push_str(format!(" {}", param).as_str());
            }
        }
        write!(f, "{}", out)
    }
}
