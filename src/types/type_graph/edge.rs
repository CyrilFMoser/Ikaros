use crate::types::{constraints::Constraint, type_trait::Type};
use std::fmt::Display;
use std::hash::Hash;

use super::node::NodeId;
#[derive(Clone, PartialEq, Eq)]
pub struct Edge<LangTyp: Type + Clone + PartialEq + Eq + Hash + Display> {
    pub id: EdgeId,
    pub u: NodeId,
    pub v: NodeId,
    pub substitutions: Option<Constraint<LangTyp>>,
}

impl<LangTyp: Type + Clone + PartialEq + Eq + Hash + Display> Edge<LangTyp> {
    pub fn new(
        id: EdgeId,
        u: NodeId,
        v: NodeId,
        substitutions: Option<Constraint<LangTyp>>,
    ) -> Self {
        Edge {
            id,
            u,
            v,
            substitutions,
        }
    }
}
#[derive(PartialEq, Eq, PartialOrd, Ord, Hash, Clone, Copy)]
pub struct EdgeId(pub u32);
