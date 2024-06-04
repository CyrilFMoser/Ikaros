use std::fmt::Display;

use crate::types::type_trait::Type;
#[derive(Clone)]
pub struct Node<T> {
    pub id: NodeId,
    pub node_typ: NodeType,
    pub generics: Option<Vec<T>>,
    pub parents: Vec<NodeId>,
    pub typ: T,
}

impl<T: Type + Clone> Node<T> {
    pub fn new(id: NodeId, node_typ: NodeType, typ: T) -> Self {
        let generics = if let Some(typargs) = typ.get_typargs() {
            let gens: Vec<T> = typargs.iter().filter(|t| t.is_generic()).cloned().collect();
            if gens.is_empty() {
                None
            } else {
                Some(gens)
            }
        } else {
            None
        };
        Node {
            id,
            node_typ,
            typ,
            parents: Vec::new(),
            generics,
        }
    }
    pub fn get_type_ref(&self) -> &T {
        &self.typ
    }
}
#[derive(Clone, Copy)]
pub enum NodeType {
    Declaration,
    Parameter,
}

#[derive(PartialEq, Eq, PartialOrd, Ord, Hash, Clone, Copy)]
pub struct NodeId(pub u32);

impl Display for NodeId {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        write!(f, "{}", self.0)
    }
}
