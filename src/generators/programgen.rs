use crate::types::{type_graph::graph::Graph, type_trait::Type};
use rand_chacha::ChaCha8Rng;
use std::{fmt::Display, hash::Hash};

use super::{typegen::TypeGenerator, typegen_args::TypeContextArgs};

pub struct ProgramGenerator<LangTyp: Type> {
    pub typ_gen: TypeGenerator<LangTyp>,
}

impl<LangTyp: Type + Clone + PartialEq + Eq + Hash + Display> ProgramGenerator<LangTyp> {
    pub fn new(typctxt_args: &TypeContextArgs, rng: ChaCha8Rng) -> Self {
        ProgramGenerator {
            typ_gen: TypeGenerator::new(typctxt_args.clone(), rng),
        }
    }

    pub fn generate(&mut self) {
        self.typ_gen.generate();
        let graph = Graph::new(&self.typ_gen.all_types, &self.typ_gen.declarations);
    }
}
