use crate::types::type_trait::Type;
use std::collections::HashSet;
use std::hash::Hash;
use std::{collections::HashMap, fmt::Display};

use super::node::NodeType;
use super::{
    edge::{Edge, EdgeId},
    node::{Node, NodeId},
};

pub type Substitutions<T> = HashSet<(T, T)>;
pub struct Graph<LangTyp: Type> {
    nodes: HashMap<NodeId, Node<LangTyp>>,
    node_count: u32,
    edges: HashMap<EdgeId, Edge<LangTyp>>,
    edge_count: u32,
    node_edges: HashMap<NodeId, Vec<EdgeId>>,
}

impl<LangTyp: Type + Clone + PartialEq + Eq + Hash + Display> Graph<LangTyp> {
    pub fn new(all_types: &[LangTyp], declarations: &[usize]) -> Self {
        let mut graph = Graph {
            nodes: HashMap::new(),
            node_count: 0,
            edges: HashMap::new(),
            edge_count: 0,
            node_edges: HashMap::new(),
        };
        for (i, typ) in all_types.iter().enumerate() {
            let node_type = if declarations.contains(&i) {
                NodeType::Declaration
            } else {
                NodeType::Parameter
            };
            graph.add_node(typ.clone(), node_type);
        }
        graph
    }

    fn add_node(&mut self, typ: LangTyp, node_type: NodeType) -> NodeId {
        let node = Node::new(self.get_new_nodeid(), node_type, typ);
        for existing_node in self.nodes.values() {
            // TODO: Check if the nodes are subtypes in either direction
            /*
              - Only accumulate and solve constraints here, but store the solved constraints.
                Don't add anything yet, because we might still run into an alpha equivalent node:

              - If there exists: node <: existing_node, with the returned constraints
                only remapping generics in an alpha equivalent way, stop and return
                the existing_node's id.
            */
        }
        todo!()
    }
    /// directly adds an edge, without checking if there even should be an edge
    fn add_edge(
        &mut self,
        u: Node<LangTyp>,
        v: Node<LangTyp>,
        substitutions: Option<Substitutions<LangTyp>>,
    ) -> EdgeId {
        let id = self.get_new_edgeid();
        let edge = Edge::new(id, u, v, substitutions);
        self.edges.insert(id, edge);
        id
    }

    fn get_new_nodeid(&mut self) -> NodeId {
        let id = NodeId(self.node_count);
        self.node_count += 1;
        id
    }

    fn get_new_edgeid(&mut self) -> EdgeId {
        let id = EdgeId(self.edge_count);
        self.edge_count += 1;
        id
    }
}
