use crate::types::constraints::{self, Constraint};

use super::node::Node;

pub struct Edge<LangTyp> {
    pub id: EdgeId,
    pub u: Node<LangTyp>,
    pub v: Node<LangTyp>,
    pub constraints: Option<Constraint<LangTyp>>,
}

impl<LangTyp> Edge<LangTyp> {
    pub fn new(
        id: EdgeId,
        u: Node<LangTyp>,
        v: Node<LangTyp>,
        constraints: Option<Constraint<LangTyp>>,
    ) -> Self {
        Edge {
            id,
            u,
            v,
            constraints,
        }
    }
}
#[derive(PartialEq, Eq, PartialOrd, Ord, Hash, Clone, Copy)]
pub struct EdgeId(pub u32);
