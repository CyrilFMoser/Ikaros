pub struct Node<T> {
    pub id: NodeId,
    pub node_typ: NodeType,
    pub typ: T,
}

impl<T> Node<T> {
    pub fn new(id: NodeId, node_typ: NodeType, typ: T) -> Self {
        Node { id, node_typ, typ }
    }
}

pub enum NodeType {
    Declaration,
    Parameter,
}

#[derive(PartialEq, Eq, PartialOrd, Ord, Hash, Clone, Copy)]
pub struct NodeId(pub u32);
