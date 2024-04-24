use std::collections::HashSet;

use super::node::Node;

pub struct Edge<LangTyp> {
    pub id: EdgeId,
    pub u: Node<LangTyp>,
    pub v: Node<LangTyp>,
    pub substitutions: Option<HashSet<(LangTyp, LangTyp)>>,
}

impl<LangTyp> Edge<LangTyp> {
    pub fn new(
        id: EdgeId,
        u: Node<LangTyp>,
        v: Node<LangTyp>,
        substitutions: Option<HashSet<(LangTyp, LangTyp)>>,
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
