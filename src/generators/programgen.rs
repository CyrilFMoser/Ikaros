use super::{
    matchgen::MatchGenerator, matchgen_args::MatchArgs, typegen::TypeGenerator,
    typegen_args::TypeContextArgs,
};
use crate::{
    matches::{
        expression::Var,
        pattern::Pattern,
        statements::{Declaration, Statement, VarDecl},
    },
    types::{type_graph::graph::Graph, type_trait::Type},
};
use core::fmt::Debug;
use rand::SeedableRng;
use rand_chacha::ChaCha8Rng;
use std::{
    fmt::{format, Display},
    fs::{copy, create_dir, read_dir, remove_dir_all, remove_file, rename, File, OpenOptions},
    hash::Hash,
    io::Write,
    path::Path,
    process::Command,
};

pub struct ProgramGenerator<LangTyp: Type + Clone + PartialEq + Eq + Hash + Display> {
    pub typ_gen: TypeGenerator<LangTyp>,
    rng: ChaCha8Rng,
    graph: Option<Graph<LangTyp>>,
    match_gen_args: MatchArgs,
    match_statements: Vec<Statement<LangTyp>>,
    removed_pattern: Option<Pattern<LangTyp>>,
    pub correct: bool, // If the generated program is correct
}

impl<LangTyp: Type + Clone + PartialEq + Debug + Eq + Hash + Display> ProgramGenerator<LangTyp> {
    pub fn new(
        typctxt_args: &TypeContextArgs,
        rng: ChaCha8Rng,
        match_gen_args: MatchArgs,
        correct: bool,
    ) -> Self {
        ProgramGenerator {
            typ_gen: TypeGenerator::new(
                typctxt_args.clone(),
                ChaCha8Rng::from_seed(rng.get_seed()),
            ),
            rng: ChaCha8Rng::from_seed(rng.get_seed()),
            graph: None,
            match_gen_args,
            match_statements: Vec::new(),
            removed_pattern: None,
            correct,
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
        //graph.output_graph_viz();
        self.graph = Some(graph)
    }

    pub fn generate_match(&mut self) {
        let mut gen = MatchGenerator::new(
            ChaCha8Rng::from_seed(self.rng.get_seed()),
            self.graph
                .clone()
                .expect("Need to generate types before generating a match statement"),
            self.match_gen_args.clone(),
            self.correct,
        );
        let (statements, removed) = gen.generate();
        self.match_statements = statements;
        self.removed_pattern = removed;
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

    pub fn process(&mut self) {
        let cur_folder = format!("out/Programs/{}", LangTyp::get_compiler_name());
        let mut num_progs = read_dir(format!("{}/{}", cur_folder, "inexhaustive"))
            .unwrap()
            .count();
        num_progs += read_dir(format!("{}/{}", cur_folder, "unreachable"))
            .unwrap()
            .count();
        let name = format!("Program_{}", num_progs);
        if Path::new("out/Programs/temp").exists() {
            remove_dir_all("out/Programs/temp").unwrap();
        }
        create_dir("out/Programs/temp").unwrap();
        let file_name = format!("tempprog.{}", LangTyp::get_suffix());
        let mut source_file =
            File::create(format!("out/Programs/temp/{}", file_name.clone())).unwrap();
        source_file
            .write_all(self.output_prog().as_bytes())
            .unwrap();
        let mut cmd = Command::new(LangTyp::get_compiler_path());
        cmd.arg(file_name).current_dir("out/Programs/temp");
        if let Some(args) = LangTyp::get_compiler_args() {
            cmd.args(args.iter());
        }

        let output = cmd.output().unwrap();
        let error_message = std::str::from_utf8(&output.stderr).unwrap();
        /*if !error_message.is_empty() && self.removed_pattern.is_some() {
            println!("Detected missing pattern: {error_message}");
        } */
        if !error_message.is_empty() && self.removed_pattern.is_none() {
            self.handle_error(name, error_message);
            return;
        } else if error_message.is_empty() && self.removed_pattern.is_some() {
            self.handle_no_error(name);
            return;
        }
        remove_dir_all("out/Programs/temp").unwrap();
    }
    // Compiler gave an error eventhough it should not have
    fn handle_error(&mut self, name: String, error_message: &str) {
        let file_name = format!("tempprog.{}", LangTyp::get_suffix());
        let _ = copy(
            format!("out/Programs/temp/{}", file_name),
            format!("out/Programs/reduction/{}", file_name),
        );
        let mut error_file = File::create("out/Programs/reduction/temp.txt").unwrap();
        error_file.write_all(error_message.as_bytes()).unwrap();
        self.reduce_prog(name.clone());
        remove_file("out/Programs/reduction/temp.txt").unwrap();
        remove_dir_all("out/Programs/temp").unwrap();
    }

    fn handle_no_error(&mut self, name: String) {
        let file_name = format!("tempprog.{}", LangTyp::get_suffix());
        let old_path = format!("out/Programs/temp/{file_name}");
        let mut source_file = OpenOptions::new()
            .write(true)
            .append(true)
            .open(old_path.clone())
            .unwrap();
        let pattern_string = LangTyp::pattern_to_string(&self.removed_pattern.clone().unwrap());
        let comment = format!(
            "{} Removed this case: {}",
            LangTyp::get_comment(),
            pattern_string
        );
        writeln!(source_file, "{}", comment).unwrap();
        let new_path = format!(
            "out/Programs/{}/inexhaustive/{name}",
            LangTyp::get_compiler_name()
        );
        rename(old_path, new_path).unwrap();
        remove_dir_all("out/Programs/temp").unwrap();
    }

    fn reduce_prog(&mut self, name: String) {
        let temp_file_name = format!("tempprog.{}", LangTyp::get_suffix());
        let mut reducer = Command::new("java")
            .arg("-jar")
            .arg("perses_deploy.jar")
            .arg("--test-script")
            .arg(LangTyp::get_test_script())
            .arg("--input-file")
            .arg(temp_file_name.clone())
            .current_dir("out/Programs/reduction")
            .spawn()
            .unwrap();
        reducer.wait().unwrap();
        let new_path = format!("out/Programs/{}/unreachable", LangTyp::get_compiler_name());
        rename(
            format!("out/Programs/reduction/perses_result/{}", temp_file_name),
            format!("{}/{}_reduced.{}", new_path, name, LangTyp::get_suffix()),
        )
        .unwrap();
        let files = read_dir("out/Programs/reduction").unwrap();
        for file in files {
            let f = file.unwrap();
            if f.file_name().into_string().unwrap().starts_with("tempprog") {
                remove_file(f.path()).unwrap();
            }
        }
        remove_dir_all("out/Programs/reduction/perses_result").unwrap();
    }
}
