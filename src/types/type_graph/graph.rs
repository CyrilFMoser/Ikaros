use crate::generators::typegen::TypeGenerator;
use crate::types::constraints::Constraint;
use crate::types::type_trait::Type;
use crate::types::variance::Variance;
use core::fmt::Debug;
use dot_generator::{graph, id};
use graphviz_rust::printer::{DotPrinter, PrinterContext};
use rand::Rng;
use rand_chacha::ChaCha8Rng;
use std::cell::RefCell;
use std::collections::HashSet;
use std::fs::{remove_file, File};
use std::hash::Hash;
use std::io::Write;
use std::mem::take;
use std::path::Path;
use std::process::Command;
use std::{collections::HashMap, fmt::Display};

use super::node::NodeType;
use super::{
    edge::{Edge, EdgeId},
    node::{Node, NodeId},
};
#[derive(Clone)]
pub struct Graph<LangTyp: Type + Clone + PartialEq + Eq + Hash + Display> {
    nodes: HashMap<NodeId, Node<LangTyp>>,
    node_count: u32,
    edges: HashMap<EdgeId, Edge<LangTyp>>,
    edge_count: u32,
    node_edges: HashMap<NodeId, Vec<EdgeId>>,
    rng: ChaCha8Rng,
    typgen: RefCell<TypeGenerator<LangTyp>>,
    pub concrete_types: Vec<LangTyp>,
}

impl<LangTyp: Type + Clone + PartialEq + Eq + Debug + Hash + Display> Graph<LangTyp> {
    pub fn new(
        all_types: &[LangTyp],
        declarations: &[usize],
        rng: ChaCha8Rng,
        typgen: TypeGenerator<LangTyp>,
    ) -> Self {
        let mut graph = Graph {
            nodes: HashMap::new(),
            node_count: 0,
            edges: HashMap::new(),
            edge_count: 0,
            node_edges: HashMap::new(),
            rng,
            concrete_types: Vec::new(),
            typgen: RefCell::new(typgen),
        };
        for (i, typ) in all_types.iter().enumerate() {
            let node_type = if declarations.contains(&i) {
                NodeType::Declaration
            } else if typ.is_sealed() {
                NodeType::Parameter
            } else {
                continue;
            };
            graph.add_node(typ.clone(), node_type);
            if Constraint::is_concrete(typ) {
                graph.concrete_types.push(typ.clone());
            }
        }
        loop {
            let mut new_edges = graph.edges.clone();
            let mut to_remove = Vec::new();
            for edge in new_edges.values_mut() {
                if let Some(constraints) = edge.substitutions.as_mut() {
                    /*let old_constraints = constraints.clone();
                    if !constraints.is_satisfiable() {
                        println!("Before: {old_constraints}");

                        let u = graph.nodes.get(&edge.u).unwrap().typ.clone();
                        let v = graph.nodes.get(&edge.v).unwrap().typ.clone();
                        println!("After: {constraints}, not satisfiable for {u} to {v}",);
                        to_remove.push(edge.id);
                        continue;
                    }*/
                    let u = graph.nodes.get(&edge.u).unwrap().typ.clone();
                    let v = graph.nodes.get(&edge.v).unwrap().typ.clone();
                    if u.is_base() && !v.is_base() {
                        // base to non base doesn't have this
                        continue;
                    }
                    let generics = TypeGenerator::get_generics(&u);
                    if constraints.subtypes.is_empty()
                        && constraints.equality.iter().any(|(typ1, typ2)| {
                            typ1.is_generic() && !typ2.is_generic() && !generics.contains(typ1)
                                || typ2.is_generic()
                                    && !typ1.is_generic()
                                    && !generics.contains(typ2)
                        })
                    {
                        // We only add this constraint if it actually constrains the generics of this type unless there are subtypes
                        to_remove.push(edge.id);
                    }
                }
            }
            if to_remove.is_empty() && graph.edges == new_edges {
                break;
            }
            graph.edges = new_edges;
            for edge in &to_remove {
                let cur_edge = graph.edges.get(edge).unwrap();
                let u = graph.nodes.get(&cur_edge.u).unwrap().typ.clone();
                let v = graph.nodes.get(&cur_edge.v).unwrap().typ.clone();
                graph.remove_edge(edge);
                //println!("REMOVING EDGE FROM {} to {}", u, v);
            }
        }
        graph.concrete_types.append(
            &mut LangTyp::get_prelude_types()
                .into_iter()
                .map(|t| t.0)
                .collect(),
        );
        graph
    }

    fn remove_edge(&mut self, edge_id: &EdgeId) {
        let edge = self.edges.get(edge_id).unwrap();
        if let Some(edge_list) = self.node_edges.get_mut(&edge.u) {
            edge_list.retain(|e| e != edge_id);
        }
        let v_node = self.nodes.get_mut(&edge.v).unwrap();
        v_node.parents.retain(|node| node.0 != edge.u.0);
        self.edges.remove(edge_id);
    }

    fn add_node(&mut self, typ: LangTyp, node_type: NodeType) -> NodeId {
        let mut subtypes_in: Vec<NodeId> = Vec::new();
        let mut subtypes_out: Vec<NodeId> = Vec::new();

        let mut constraints_in: HashMap<NodeId, Constraint<LangTyp>> = HashMap::new();
        let mut constraints_out: HashMap<NodeId, Constraint<LangTyp>> = HashMap::new();
        for existing_node in self.nodes.values() {
            /*
              - Only accumulate and solve constraints here, but store the solved constraints.
                Don't add anything yet, because we might still run into an alpha equivalent node:

              - If there exists: node <: existing_node, with the returned constraints
                only remapping generics in an alpha equivalent way, stop and return
                the existing_node's id.
            */
            let t2 = existing_node.get_type_ref();
            let id = existing_node.id;
            //println!("------------------------------------------------------");
            //println!("{} => {}", typ, t2);
            if *t2 == typ {
                return id;
            }
            if let Some(extends) = typ.get_bases() {
                for base in extends {
                    if base.is_subtype(t2) {
                        subtypes_in.push(id);
                    }
                }
            }
            // Assumes asymmetry of subtyping relationship
            if typ.is_subtype(t2) {
                subtypes_in.push(id);
                continue;
            }

            if t2.is_subtype(&typ) {
                subtypes_out.push(id);
                continue;
            }
            if !typ.is_generic() && Constraint::is_alpha_equiv(&typ, t2) {
                return id;
            }
            if let Ok(constraints) = self.get_constraints(&typ, t2) {
                constraints_out.insert(id, constraints);
            }
            if let Ok(constraints) = self.get_constraints(t2, &typ) {
                constraints_in.insert(id, constraints);
            }
            if let Some(extends) = typ.get_bases() {
                for base in extends {
                    if let Ok(constraints) = self.get_constraints(t2, base) {
                        constraints_in.insert(id, constraints);
                    }
                }
            }
        }
        let node = Node::new(self.get_new_nodeid(), node_type, typ.clone());
        let new_id = node.id;
        self.nodes.insert(new_id, node.clone());
        if let Some(extends) = node.typ.get_bases() {
            for base in extends {
                let extends_id = self.add_node(base.clone(), node_type);
                let constraints =
                    self.get_constraints(&self.nodes.get(&extends_id).unwrap().typ, base);
                if constraints.is_err() {
                    continue;
                }
                let constraints = constraints.unwrap();
                let constraints_opt = if !constraints.is_empty() {
                    Some(constraints)
                } else {
                    None
                };
                self.add_edge(extends_id, new_id, constraints_opt);
            }
        }
        for id in subtypes_out {
            self.add_edge(new_id, id, None);
        }
        for id in subtypes_in {
            self.add_edge(id, new_id, None);
        }
        for (id, constraints) in constraints_out {
            if constraints.is_empty() {
                self.add_edge(new_id, id, None);
            } else {
                /*println!(
                    "Adding edge from {} to {}",
                    node.typ,
                    self.nodes.get(&id).unwrap().typ
                );*/
                self.add_edge(new_id, id, Some(constraints));
            }
        }
        for (id, constraints) in constraints_in {
            if constraints.is_empty() {
                self.add_edge(id, new_id, None);
            } else {
                self.add_edge(id, new_id, Some(constraints));
            }
        }
        new_id
    }
    /// directly adds an edge, without checking if there even should be an edge
    fn add_edge(
        &mut self,
        u: NodeId,
        v: NodeId,
        constraints: Option<Constraint<LangTyp>>,
    ) -> EdgeId {
        let id = self.get_new_edgeid();
        let edge = Edge::new(id, u, v, constraints);
        self.nodes.get_mut(&v).unwrap().parents.push(u);
        if let Some(edges) = self.node_edges.get_mut(&u) {
            edges.push(id);
        } else {
            self.node_edges.insert(u, vec![id]);
        }

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

    fn get_constraints(&self, t1: &LangTyp, t2: &LangTyp) -> Result<Constraint<LangTyp>, ()> {
        if t1 == t2 {
            return Ok(Constraint::new_empty());
        }
        if let Some(bases) = t2.get_bases() {
            if bases.contains(t1) {
                return Ok(Constraint::new_empty());
            }
        }
        if t1.is_generic() || t2.is_generic() {
            let mut constraint = Constraint::new_empty();
            constraint.add_equality(t1, t2);
            return Ok(constraint);
        }
        if t1.get_name() != t2.get_name() {
            // This could be an issue for union and intersection types, which is why they need to be unpacked first
            // and then connected appropriately
            return Err(());
        }
        let t1_typargs_opt = t1.get_typargs();
        let t2_typargs_opt = t2.get_typargs();
        if t1_typargs_opt.is_none() && t2_typargs_opt.is_none() {
            return Ok(Constraint::new_empty());
        }
        if let (Some(t1_typargs), Some(t2_typargs)) = (t1_typargs_opt, t2_typargs_opt) {
            if t1_typargs.len() == t2_typargs.len() {
                let t1_variances = t1
                    .get_variances()
                    .expect("Should have variances if it has type arguments");
                let t2_variances = t2
                    .get_variances()
                    .expect("Should have variances if it has type arguments");
                let mut constraints = Constraint::new_empty();
                for i in 0..t1_typargs.len() {
                    let typ_1 = t1_typargs.get(i).unwrap();
                    let typ_2 = t2_typargs.get(i).unwrap();
                    let variance_1 = t1_variances
                        .get(i)
                        .expect("Should have same number of variances as type arguments");
                    let variance_2 = t2_variances
                        .get(i)
                        .expect("Should have same number of variances as type arguments");
                    if variance_1 != variance_2 {
                        // variances should match
                        println!("Variances didn't match");
                        return Err(());
                    }
                    // We are deciding if we want to add an edge: t1 -> t2. Therefore t2 <: t1 (with instantiations)
                    match variance_1 {
                        Variance::Covariant => constraints.add_supertype(typ_1, typ_2), // typ_2 <: typ_1
                        Variance::Contravariant => constraints.add_subtype(typ_1, typ_2), // typ_1 <: typ_2
                        Variance::Invariant => constraints.add_equality(typ_1, typ_2),
                    }
                }
                while let Ok(changed) = constraints.refine() {
                    //println!("Refined to {}", constraints);
                    if !changed {
                        return Ok(constraints);
                    }
                }
                //println!("failed to refine{constraints}");
                // refining lead to an unsatisfiable constraint
            }
        }
        Err(())
    }

    pub fn substitute(typ: &mut LangTyp, orig: &LangTyp, new_typ: &LangTyp) {
        TypeGenerator::<LangTyp>::substitute(typ, orig, new_typ);
    }
    /// Gets a base, traversing the graph from "bottom" up, doing each step with probability p
    pub fn get_base(&mut self, p: f64) -> (Node<LangTyp>, Constraint<LangTyp>) {
        let has_parents = self.nodes.values().filter(|node| !node.parents.is_empty());
        let no_children: Vec<NodeId> = has_parents
            .filter_map(|node| {
                if self.node_edges.get(&node.id).is_none() {
                    Some(node.id)
                } else {
                    None
                }
            })
            .collect();
        if no_children.is_empty() {
            // this should not happen
            panic!("There are no types with parents and without children")
        }
        let node_index = self.rng.gen_range(0..(no_children.len()));
        let node_id = no_children.get(node_index).unwrap();
        let mut cur_node = self.nodes.get(node_id).unwrap().clone();
        //println!("Starting node: {}", cur_node.typ);
        let mut cur_constraints = Constraint::<LangTyp>::new_empty();
        for generic in TypeGenerator::get_generics(&cur_node.typ) {
            let mut non_local_types: Vec<LangTyp> = self
                .concrete_types
                .clone()
                .into_iter()
                .filter(|t| !t.is_local())
                .collect();
            for typ in LangTyp::get_prelude_types() {
                if !non_local_types.contains(&typ.0) {
                    non_local_types.push(typ.0);
                }
            }
            let num = self.rng.gen_range(0..(non_local_types.len()));

            let t = non_local_types.get(num).unwrap();
            cur_constraints.add_equality(&generic, t);
        }
        let mut visited = vec![cur_node.id];
        while self.rng.gen_bool(p) {
            let cur_parents: Vec<NodeId> = cur_node
                .parents
                .iter()
                .filter(|t| !visited.contains(*t))
                .cloned()
                .collect();
            if cur_parents.is_empty() {
                break;
            }
            let mut valid_parents = cur_parents;
            while !valid_parents.is_empty() {
                //println!("Here");
                let parent_index = self.rng.gen_range(0..(valid_parents.len()));
                let parent_id = valid_parents.get(parent_index).unwrap();
                visited.push(*parent_id);
                let edge = self
                    .node_edges
                    .get(parent_id)
                    .unwrap()
                    .iter()
                    .find_map(|e_id| {
                        self.edges
                            .get(e_id)
                            .filter(|cur_edge| cur_edge.v == cur_node.id)
                    })
                    .expect("An edge from the parent to the node should exist");
                if let Some(edge_constraints) = &edge.substitutions {
                    let mut new_edge_constraints = edge_constraints.clone();
                    new_edge_constraints.remap_2(&cur_constraints);
                    for pair in &cur_constraints.subtypes {
                        new_edge_constraints.add_subtype(&pair.0, &pair.1);
                    }
                    if !new_edge_constraints.is_satisfiable() {
                        valid_parents.remove(parent_index);
                        continue;
                    }
                    cur_constraints = new_edge_constraints;
                }

                cur_node = self.nodes.get(parent_id).unwrap().clone();
                break;
            }
        }
        // There could still be generics, that are only constrained through subtypes
        /*println!(
            "Got base {} with constraints {}",
            cur_node.typ, cur_constraints
        );*/
        (cur_node.clone(), cur_constraints)
    }

    pub fn is_satisfiable(&self, constraints: &mut Constraint<LangTyp>) -> bool {
        let approx = false;
        println!("checking this");
        if !constraints.is_satisfiable() {
            return false;
        }
        println!("Creating graph of constraints: {}", constraints);
        let mut graph = self.clone();
        for (t1, t2) in &constraints.subtypes {
            if !t1.is_generic() {
                graph.add_node(t1.clone(), NodeType::Parameter);
            }
            if !t2.is_generic() {
                graph.add_node(t2.clone(), NodeType::Parameter);
            }
        }
        // first do a simple check to see if there might be parents
        for (t1, t2) in &constraints.subtypes {
            if !t1.is_generic() && !t2.is_generic() {
                let exact_match = self
                    .nodes
                    .values()
                    .find(|n| Constraint::is_alpha_equiv(&n.typ, t1));
                if let Some(exact) = exact_match {
                    if exact.parents.is_empty() && t1 != t2 {
                        return false;
                    }
                } else {
                    println!("Found no exact match for {t1}");
                }
            }
        }

        // This checks if the subtyping relationship is possible if both arguments are not a generic variable
        let mut checked = Vec::new();
        for (t1, t2) in &constraints.subtypes {
            if !t1.is_generic()
                && !t2.is_generic()
                && !checked.contains(t2)
                && (Constraint::is_concrete(t1) || Constraint::is_concrete(t2))
            {
                println!("Calling this");
                let reachable = graph.get_reachable(t2, approx, Some(&constraints.subtypes));
                /*println!("Reachable from {t2} is: ");
                for r in &reachable {
                    println!("{r}");
                }*/
                for t1 in constraints.subtypes.iter().filter_map(|(a, b)| {
                    if b == t2 && !a.is_generic() {
                        Some(a)
                    } else {
                        None
                    }
                }) {
                    if !reachable.iter().any(|r| Constraint::is_alpha_equiv(r, t1)) {
                        println!("Invalid constraints! Can't reach {t1} from {t2}");
                        return false;
                    }
                }
                checked.push(t2.clone());
            }
        }
        println!("GOT HERE {constraints}");
        // This checks that if t1,t2 aren't generics, A <: t1 AND A <: t2 such an A exists
        let mut sub_map: HashMap<LangTyp, HashSet<LangTyp>> = HashMap::new();
        for (t1, t2) in constraints.subtypes.iter().filter(|(_, b)| !b.is_generic()) {
            let reachable_vec = graph.get_reachable(t2, approx, Some(&constraints.subtypes));
            let reachable: HashSet<LangTyp> = reachable_vec.into_iter().collect();
            if !sub_map.contains_key(t1) {
                sub_map.insert(t1.clone(), reachable);
            } else {
                let new_map = sub_map.get_mut(t1).unwrap();
                *new_map = new_map.intersection(&reachable).cloned().collect();
                if !t1.is_generic() && !new_map.iter().any(|t| Constraint::is_alpha_equiv(t, t1)) {
                    // it's not possible for this t1 to be a subtype of t2
                    println!("{t1} can't be a subtype of {t2} with constraints {constraints}");
                    return false;
                }
                if new_map.is_empty() {
                    /*graph.output_graph_viz();
                    for r in reachable {
                        println!("{r}");
                    }*/
                    println!("{t1} can't be a subtype of {t2} with constraints {constraints} because new_map is empty");
                    return false;
                }
            }
        }
        // Now we check that for t_A,t_B not generic t_A <: C AND t_B <: C is satisfiable
        for (t1, t2) in constraints.subtypes.iter().filter(|(a, _)| !a.is_generic()) {
            if !sub_map.contains_key(t2) {
                if t2.is_generic() {
                    // we don't have other subtype constraints for this generic, all possible types could reach it, add them
                    sub_map.insert(
                        t2.clone(),
                        graph.nodes.values().map(|n| n.typ.clone()).collect(),
                    );
                } else {
                    sub_map.insert(
                        t2.clone(),
                        graph
                            .get_reachable(t2, true, Some(&constraints.subtypes))
                            .into_iter()
                            .collect(),
                    );
                }
            }
            let previous_set = sub_map.get(t2).unwrap().clone(); // The types that were possible before for type t2
            let cur_set = sub_map.get_mut(t2).unwrap();
            for typ in previous_set {
                let reachable = graph.get_reachable(&typ, approx, Some(&constraints.subtypes));
                /*println!("Reachable from {typ} in satisfiable is:");
                for r in &reachable {
                    print!("{r}, ");
                }
                println!(" ");*/
                if !reachable.iter().any(|t| Constraint::is_alpha_equiv(t, t1)) {
                    //println!("None of them are alpha equivalent to {t1}");
                    cur_set.remove(&typ);
                }
                if cur_set.is_empty() {
                    return false;
                }
            }
        }
        // now if certain generics can only be of one type, we remove the subtype constraints and simply add an equality constraint
        // For this we only need to consider typevariables that are constrained by a "non typevar type"
        let typevars: HashSet<LangTyp> = constraints
            .subtypes
            .iter()
            .filter_map(|(a, b)| {
                if a.is_generic() && !b.is_generic() {
                    Some(a.clone())
                } else if !a.is_generic() && b.is_generic() {
                    Some(b.clone())
                } else {
                    None
                }
            })
            .collect();
        for t1 in typevars {
            let cur_set = sub_map.get(&t1).unwrap();
            let mut concrete = false;
            if cur_set.len() != 1 {
                if cur_set
                    .iter()
                    .filter(|t| Constraint::is_concrete(*t))
                    .count()
                    != 1
                {
                    continue;
                } else {
                    concrete = true;
                }
            }
            let typ = if concrete {
                cur_set
                    .iter()
                    .find(|t| Constraint::is_concrete(*t))
                    .unwrap()
                    .clone()
            } else {
                cur_set.iter().next().unwrap().clone()
            };
            // replace the generics that come from the possible mappings with new ones, as they might only be alpha equivalent
            /*for generic in TypeGenerator::get_generics(&typ) {
                Graph::substitute(
                    &mut typ,
                    &generic,
                    &self.typgen.borrow_mut().generate_generic(),
                );
            }*/
            constraints
                .subtypes
                .retain(|(a, b)| (b != &t1 || a.is_generic()) && (a != &t1 || b.is_generic()));
            constraints.add_equality(&t1, &typ)
        }
        println!("Finished satisfiability");
        if !constraints.is_satisfiable() {
            return false;
        }
        println!("Can't prove that {constraints} is not satisfiable");
        true
    }

    pub fn get_reachable(
        &self,
        typ: &LangTyp,
        over_approx: bool,
        subtype_constraints_opt: Option<&HashSet<(LangTyp, LangTyp)>>,
    ) -> Vec<LangTyp> {
        let name = typ.get_name();
        //println!("Getting reachable of {typ}");
        /*let exact_match = self
           .nodes
           .values()
           .find(|n| Constraint::is_alpha_equiv(&n.typ, typ));
        */
        /*if let Some(exact) = exact_match {
            Some(exact)
        } else {*/
        let start_node_opt = self.nodes.values().find(|n| {
            n.typ.get_name() == name
                && (n.typ.get_typargs().is_none()
                    || n.typ
                        .get_typargs()
                        .is_some_and(|typargs| typargs.iter().all(|t| t.is_generic())))
        });

        if start_node_opt.is_none() {
            return Vec::new();
        }
        let start_node = start_node_opt.unwrap();
        let mut constraints = Constraint::new_empty();
        if let Some(typargs) = typ.get_typargs() {
            let node_typ = start_node.typ.clone();
            let node_typargs = node_typ
                .get_typargs()
                .expect("If the instantiation has type arguments so should the declaration node");
            for (expected, actual) in node_typargs.iter().zip(typargs) {
                if expected != actual {
                    constraints.add_equality(expected, actual);
                }
            }
        }
        if let Some(subtype_constraints) = subtype_constraints_opt {
            for pair in subtype_constraints {
                constraints.subtypes.insert(pair.clone());
            }
        }
        let visited = &mut vec![start_node.id];
        let reachable = &mut vec![typ.clone()];
        self.gr_rec(start_node, &constraints, visited, reachable, over_approx);
        take(reachable)
    }

    /// get reachable recursive dfs starting from a node
    fn gr_rec(
        &self,
        node: &Node<LangTyp>,
        constraints: &Constraint<LangTyp>,
        visited: &mut Vec<NodeId>,
        reachable: &mut Vec<LangTyp>,
        over_approx: bool,
    ) {
        let edge_list_opt = self.node_edges.get(&node.id);
        if edge_list_opt.is_none() {
            return;
        }
        let edge_list = edge_list_opt
            .unwrap()
            .iter()
            .map(|e| self.edges.get(e).unwrap());
        for Edge {
            id: _,
            u: _,
            v,
            substitutions,
        } in edge_list
        {
            if visited.contains(v) {
                continue;
            }
            visited.push(*v);
            let neighbour_node = self.nodes.get(v).unwrap();
            let mut neighbour_type = neighbour_node.typ.clone();

            let constraints_opt = if constraints.is_empty() {
                None
            } else {
                Some(constraints)
            };
            let mut new_constraints = constraints.clone();
            if let (Some(remapper_sub), Some(inst_sub)) = (substitutions, constraints_opt) {
                // remap the instantiations according to the edge map
                let mut new_map = remapper_sub.clone();

                for (t1, t2) in &inst_sub.subtypes {
                    new_map.add_subtype(t1, t2);
                }
                new_map.remap_1(inst_sub);
                for (t1, t2) in &inst_sub.equality {
                    new_map.add_equality(t1, t2);
                }
                //println!("Map starting from: {} to {neighbour_type}", node.typ);
                //println!("{}", new_map);

                if (!over_approx && self.is_satisfiable(&mut new_map))
                    || (over_approx && new_map.is_satisfiable())
                {
                    //println!("Valid with map {new_map}");
                    new_constraints = new_map;
                } else {
                    //println!("Failed: {new_map}");
                    continue;
                }
            }
            for (t1, t2) in &new_constraints.equality {
                if t1.is_generic() && Constraint::is_concrete(t2) {
                    Self::substitute(&mut neighbour_type, t1, t2);
                } else if t2.is_generic() && Constraint::is_concrete(t1) {
                    Self::substitute(&mut neighbour_type, t2, t1);
                }
            }
            if new_constraints.is_empty() {
                if let Some(subs) = substitutions {
                    new_constraints = subs.clone();
                }
            }
            if !reachable.contains(&neighbour_type) {
                //println!("Adding {neighbour_type} to reachable");
                reachable.push(neighbour_type.clone());
            }

            self.gr_rec(
                neighbour_node,
                &new_constraints,
                visited,
                reachable,
                over_approx,
            );
        }
    }

    #[allow(dead_code)]
    pub fn get_graph_viz(&mut self) -> dot_structures::Graph {
        use dot_generator::*;
        use dot_structures::*;
        let mut g = graph!(strict di id!("Type_Graph"));
        for node in self.nodes.values() {
            let mut name = String::from("\"");
            name.push_str(node.get_type_ref().to_string().as_str());
            /*if let Some(parameters) = node.get_type_ref().get_params() {
                name.push('(');
                for par in parameters {
                    name.push_str(par.to_string().as_str());
                    name.push_str(", ");
                }
                if !parameters.is_empty() {
                    name.pop();
                    name.pop();
                }
                name.push(')');
            }*/
            name.push('\"');
            if let Some(generics) = &node.generics {
                let mut generic_label = String::from("Generics: ");
                let mut generics_names_sorted: Vec<String> = generics
                    .clone()
                    .into_iter()
                    .map(|n| n.to_string())
                    .collect();
                generics_names_sorted.sort();
                for generic in generics_names_sorted {
                    generic_label.push_str(generic.as_str());
                    generic_label.push_str(" ,");
                }
                generic_label.pop();
                generic_label.pop();
                name.pop();
                name.push('\n');
                name.push_str(&generic_label);
                name.push('\"');
            }
            let color = match node.node_typ {
                NodeType::Declaration => "blue",
                NodeType::Parameter => "tomato",
            };
            let color = format!(r#" "{}""#, color);
            g.add_stmt(Stmt::Node(node!(node.id;attr!("label",name))));
            g.add_stmt(Stmt::Node(node!(node.id;attr!("color",color))));
        }
        for edge in self.edges.values() {
            if let Some(mapping) = &edge.substitutions {
                let map_string = format!(r#" "{}""#, mapping);
                g.add_stmt(Stmt::Edge(
                    edge!(node_id!(edge.u) => node_id!(edge.v);attr!("label",map_string)),
                ))
            } else {
                g.add_stmt(Stmt::Edge(edge!(node_id!(edge.u) => node_id!(edge.v))))
            }
        }

        g
    }
    #[allow(dead_code)]
    pub fn output_graph_viz(&mut self) {
        let graphviz = self.get_graph_viz();
        if Path::new("out/Typegraph/out.dot").exists() {
            remove_file("out/Typegraph/out.dot").unwrap();
        }
        let mut out_file = File::create("out/TypeGraph/out.dot").unwrap();
        out_file
            .write_all(graphviz.print(&mut PrinterContext::default()).as_bytes())
            .unwrap();
        if Path::new("out/Typegraph/out.svg").exists() {
            remove_file("out/Typegraph/out.svg").unwrap();
        }
        let svg = Command::new("dot")
            .args(["-Tsvg", "out/Typegraph/out.dot"])
            .output()
            .unwrap();
        let mut svg_file = File::create("out/Typegraph/out.svg").unwrap();
        svg_file.write_all(&svg.stdout).unwrap();
    }
}
