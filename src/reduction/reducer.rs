use crate::{
    generators::typegen::TypeGenerator, matches::statements::Statement, types::type_trait::Type,
};
use core::fmt::Debug;
use std::{fmt::Display, hash::Hash};

use super::hierarchy::{self, Hierarchy};
pub struct Reducer<
    LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
> {
    file_name: String,
    folder_path: String,
    exhaustive: bool,
    type_gen: TypeGenerator<LangTyp>,
    match_statements: Vec<Statement<LangTyp>>,
    hierarchy: Hierarchy<LangTyp>,
}

impl<
        LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
    > Reducer<LangTyp>
{
    pub fn new(
        file_name: String,
        folder_path: String,
        exhaustive: bool,
        type_gen: TypeGenerator<LangTyp>,
        match_statements: Vec<Statement<LangTyp>>,
    ) -> Reducer<LangTyp> {
        let hierarchy = Hierarchy::new(&type_gen, &match_statements);
        Reducer {
            file_name,
            folder_path,
            exhaustive,
            type_gen,
            match_statements,
            hierarchy,
        }
    }

    pub fn reduce(&mut self) {
        self.hierarchy.output_graph_viz();
        panic!("")
    }
}
