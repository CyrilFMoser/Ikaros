use super::{
    matchgen::MatchGenerator, matchgen_args::MatchArgs, typegen::TypeGenerator,
    typegen_args::TypeContextArgs,
};
use crate::{
    matches::statements::Statement,
    types::{type_graph::graph::Graph, type_trait::Type},
};
use core::fmt::Debug;
use rand::SeedableRng;
use rand_chacha::ChaCha8Rng;
use std::{
    fmt::{format, Display},
    hash::Hash,
};

pub struct ProgramGenerator<LangTyp: Type + Clone + PartialEq + Eq + Hash + Display> {
    pub typ_gen: TypeGenerator<LangTyp>,
    rng: ChaCha8Rng,
    graph: Option<Graph<LangTyp>>,
    match_gen_args: MatchArgs,
    match_statements: Vec<Statement<LangTyp>>,
}

impl<LangTyp: Type + Clone + PartialEq + Debug + Eq + Hash + Display> ProgramGenerator<LangTyp> {
    pub fn new(typctxt_args: &TypeContextArgs, rng: ChaCha8Rng, match_gen_args: MatchArgs) -> Self {
        ProgramGenerator {
            typ_gen: TypeGenerator::new(
                typctxt_args.clone(),
                ChaCha8Rng::from_seed(rng.get_seed()),
            ),
            rng: ChaCha8Rng::from_seed(rng.get_seed()),
            graph: None,
            match_gen_args,
            match_statements: Vec::new(),
        }
    }

    pub fn generate_types(&mut self) {
        self.typ_gen.generate();
        let mut graph = Graph::new(
            &self.typ_gen.all_types,
            &self.typ_gen.declarations,
            ChaCha8Rng::from_seed(self.typ_gen.rng.get_seed()),
            self.typ_gen.clone(),
        );
        graph.output_graph_viz();
        self.graph = Some(graph)
    }

    pub fn generate_match(&mut self) {
        let mut gen = MatchGenerator::new(
            ChaCha8Rng::from_seed(self.rng.get_seed()),
            self.graph
                .clone()
                .expect("Need to generate types before generating a match statement"),
            self.match_gen_args.clone(),
        );
        self.match_statements = gen.generate();
    }

    pub fn output_prog(&self) -> String {
        let ms = self
            .match_statements
            .iter()
            .fold(String::new(), |current, s| {
                format!("{}\n{}", current, LangTyp::statement_to_string(s))
            });
        format!("{}{}", self.typ_gen.declarations_to_string(), ms)
    }
}
