use graphviz_rust::printer::{DotPrinter, PrinterContext};

use crate::{
    generators::typegen::TypeGenerator,
    matches::{
        expression::Expression,
        pattern::Pattern,
        statements::{Declaration, Statement, VarDecl},
    },
    types::type_trait::Type,
};
use core::fmt::Debug;
use std::{
    cmp::max,
    collections::{HashMap, VecDeque},
    fmt::Display,
    fs::{remove_file, File},
    hash::Hash,
    io::Write,
    path::Path,
    process::Command,
};

use super::change::Change;
pub struct Hierarchy<
    LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
> {
    changes: Vec<Change<LangTyp>>,
    num_type_changes: usize,
    type_levels: Vec<Vec<usize>>,
    pattern_levels: Vec<Vec<usize>>,
    edges: HashMap<usize, Vec<usize>>,
}
// Hierarchy type building
impl<
        LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
    > Hierarchy<LangTyp>
{
    fn process_root_type(&mut self, typ: &LangTyp) {
        let root: Change<LangTyp> = if typ.is_base() {
            Change::AddBase(typ.get_name().to_string())
        } else if typ.is_variant() {
            Change::AddVariant(typ.get_name().to_string())
        } else {
            panic!("Tried processing a root type that is neither a base nor a variant")
        };

        let id = self.changes.len();

        self.changes.push(root);

        if let Some(typargs) = typ.get_typargs() {
            for (pos, typarg) in typargs.iter().enumerate() {
                self.process_typarg(typarg, pos, id);
            }
        }

        if let Some(params) = typ.get_params() {
            for (pos, param) in params.iter().enumerate() {
                let name = format!("x{pos}");
                self.process_type_param(param, name, pos, id);
            }
        }

        if typ.is_variant() {
            self.process_extends(typ, id);
        }
    }

    fn process_typarg(&mut self, typ: &LangTyp, pos: usize, prev_id: usize) {
        if !typ.is_generic() {
            panic!("Tried to process a non generic typarg");
        }
        let change = Change::AddGeneric(pos, typ.clone());
        let cur_id = self.changes.len();
        self.changes.push(change);

        self.add_edge(prev_id, cur_id);
    }

    fn process_type_param(&mut self, typ: &LangTyp, name: String, pos: usize, prev_id: usize) {
        let change = Change::AddParameter(pos, name, typ.clone());
        let cur_id = self.changes.len();

        self.changes.push(change);
        self.add_edge(prev_id, cur_id);
    }

    fn process_extends(&mut self, typ: &LangTyp, prev_id: usize) {
        if let Some(bases) = typ.get_bases() {
            for base in bases {
                let change = Change::AddExtends(base.clone());
                let cur_id = self.changes.len();

                self.changes.push(change);
                self.add_edge(prev_id, cur_id);
            }
        }
    }
}

// Hierarchy pattern building
impl<
        LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
    > Hierarchy<LangTyp>
{
    fn process_root_pattern(&mut self, pattern: &Pattern<LangTyp>, pos: usize) {
        let new_pattern = pattern.get_place_holder();

        let change = Change::AddPattern(pos, new_pattern.clone());

        let cur_id = self.changes.len();
        self.changes.push(change);

        if let Pattern::Tuple(p1, p2) = pattern {
            self.process_pattern_expansion(&**p1, 0, cur_id);
            self.process_pattern_expansion(&**p2, 1, cur_id);
        } else if let Pattern::Variant(v) = pattern {
            for (i, p) in v.parameters.iter().enumerate() {
                self.process_pattern_expansion(p, i, cur_id);
            }
        }
    }

    fn process_pattern_expansion(
        &mut self,
        pattern: &Pattern<LangTyp>,
        pos: usize,
        prev_id: usize,
    ) {
        if matches!(pattern, Pattern::WildCard(_)) {
            return;
        }
        let change = Change::ExpandParam(pos, pattern.get_place_holder());

        let cur_id = self.changes.len();
        self.changes.push(change);

        self.add_edge(prev_id, cur_id);

        let mut param_vec = Vec::new();

        if let Pattern::Tuple(p1, p2) = pattern {
            param_vec = vec![(0, *p1.clone()), (1, *p2.clone())];
        } else if let Pattern::Variant(v) = pattern {
            for (i, p) in v.parameters.iter().enumerate() {
                param_vec.push((i, p.clone()));
            }
        }

        for (i, p) in param_vec {
            self.process_pattern_expansion(&p, i, cur_id);
        }
    }
}

// Hierarchy utilities
impl<
        LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
    > Hierarchy<LangTyp>
{
    pub fn new(
        type_gen: &TypeGenerator<LangTyp>,
        match_statements: &[Statement<LangTyp>],
    ) -> Hierarchy<LangTyp> {
        let match_statement = match_statements.get(1).unwrap();
        let Statement::Decl(Declaration::Var(VarDecl {
            name: _,
            typ_annotation: _,
            typ: _,
            exp,
        })) = match_statement;
        let matchexp = match exp {
            Expression::Match(m) => m,
            _ => panic!("Not a match expression"),
        };
        let patterns = &matchexp.cases;

        let mut hierarchy = Hierarchy {
            changes: Vec::new(),
            type_levels: Vec::new(),
            pattern_levels: Vec::new(),
            edges: HashMap::new(),
            num_type_changes: 0,
        };
        // first process all the bases
        for id in &type_gen.declarations {
            let typ = type_gen.all_types.get(*id).unwrap();
            if typ.is_base() {
                hierarchy.process_root_type(typ);
            }
        }
        // then the variants
        for id in &type_gen.declarations {
            let typ = type_gen.all_types.get(*id).unwrap();
            if typ.is_variant() {
                hierarchy.process_root_type(typ);
            }
        }
        hierarchy.num_type_changes = hierarchy.changes.len();

        for (pos, pattern) in patterns.iter().enumerate() {
            hierarchy.process_root_pattern(pattern, pos);
        }

        hierarchy.build_levels();
        hierarchy
    }

    fn build_levels(&mut self) {
        let mut root_types = Vec::new();
        let mut root_patterns = Vec::new();

        for (i, change) in self.changes.iter().enumerate() {
            if i < self.num_type_changes {
                if matches!(change, Change::AddBase(_) | Change::AddVariant(_)) {
                    root_types.push(i);
                }
            } else if matches!(change, Change::AddPattern(_, _)) {
                root_patterns.push(i);
            }
        }
        let mut level_map: HashMap<&usize, usize> = HashMap::new();

        let mut max_level_types = 0;
        let mut max_level_patterns = 0;

        let num_type_changes = self.num_type_changes;

        for cur_root_id in root_types.iter().chain(root_patterns.iter()) {
            let mut queue = VecDeque::new();
            queue.push_front(cur_root_id);

            level_map.insert(cur_root_id, 0);

            while let Some(cur_id) = queue.pop_front() {
                let cur_level = *level_map.get(&cur_id).unwrap();

                if let Some(edges) = self.edges.get(cur_id) {
                    for next_id in edges {
                        let next_level = cur_level + 1;
                        if next_id < &num_type_changes {
                            max_level_types = max(max_level_types, next_level);
                        } else {
                            max_level_patterns = max(max_level_patterns, next_level);
                        }

                        level_map.insert(next_id, next_level);
                        queue.push_back(next_id);
                    }
                }
            }
        }
        for _ in 0..=max_level_types {
            self.type_levels.push(Vec::new());
        }
        for _ in 0..=max_level_patterns {
            self.pattern_levels.push(Vec::new());
        }

        for (id, level) in level_map {
            if id < &num_type_changes {
                self.type_levels.get_mut(level).unwrap().push(*id);
            } else {
                self.pattern_levels.get_mut(level).unwrap().push(*id);
            }
        }
    }

    fn add_edge(&mut self, from: usize, to: usize) {
        self.edges.entry(from).or_default().push(to);
    }

    #[allow(dead_code)]
    pub fn get_graph_viz(&mut self) -> dot_structures::Graph {
        use dot_generator::*;
        use dot_structures::*;
        let mut g = graph!(strict di id!("Hierarchy"));
        for (id, change) in self.changes.iter().enumerate() {
            let mut name = String::from("\"");
            name.push_str(&change.to_string());
            name.push('\"');
            let color = if id >= self.num_type_changes {
                "blue"
            } else {
                "tomato"
            };
            let color = format!(r#" "{}""#, color);
            g.add_stmt(Stmt::Node(node!(id;attr!("label",name))));
            g.add_stmt(Stmt::Node(node!(id;attr!("color",color))));
        }
        for (from, to_vec) in self.edges.iter() {
            for to in to_vec {
                g.add_stmt(Stmt::Edge(edge!(node_id!(from) => node_id!(to))))
            }
        }

        g
    }
    #[allow(dead_code)]
    pub fn output_graph_viz(&mut self) {
        let graphviz = self.get_graph_viz();
        if Path::new("out/Hierarchy/out.dot").exists() {
            remove_file("out/Hierarchy/out.dot").unwrap();
        }
        let mut out_file = File::create("out/Hierarchy/out.dot").unwrap();
        out_file
            .write_all(graphviz.print(&mut PrinterContext::default()).as_bytes())
            .unwrap();
        if Path::new("out/Hierarchy/out.svg").exists() {
            remove_file("out/Hierarchy/out.svg").unwrap();
        }
        let svg = Command::new("dot")
            .args(["-Tsvg", "out/Hierarchy/out.dot"])
            .output()
            .unwrap();
        let mut svg_file = File::create("out/Hierarchy/out.svg").unwrap();
        svg_file.write_all(&svg.stdout).unwrap();
    }
}
