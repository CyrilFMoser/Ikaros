use super::{
    matchgen::MatchGenerator, matchgen_args::MatchArgs, random_matchgen::RandomMatchGenerator,
    random_matchgen_args::RandomMatchArgs, typegen::TypeGenerator, typegen_args::TypeContextArgs,
    z3checker::Z3Checker,
};
use crate::{
    matches::{
        expression::{Expression, Var},
        pattern::Pattern,
        statements::{Declaration, Statement, VarDecl},
    },
    types::{type_graph::graph::Graph, type_trait::Type},
    Oracle,
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
use z3::SatResult;

pub struct ProgramGenerator<
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Sync + 'static,
> {
    pub typ_gen: TypeGenerator<LangTyp>,
    rng: ChaCha8Rng,
    graph: Option<Graph<LangTyp>>,
    match_gen_args: Option<MatchArgs>,
    random_match_gen_args: Option<RandomMatchArgs>,
    match_statements: Vec<Statement<LangTyp>>,
    removed_pattern: Option<Pattern<LangTyp>>,
    random_match_gen: Option<RandomMatchGenerator<LangTyp>>,
    pub correct: bool, // If the generated program is correct
}

impl<
        LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
    > ProgramGenerator<LangTyp>
{
    pub fn new(
        typctxt_args: &TypeContextArgs,
        rng: ChaCha8Rng,
        match_gen_args: Option<MatchArgs>,
        random_match_gen_args: Option<RandomMatchArgs>,
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
            random_match_gen_args,
            match_statements: Vec::new(),
            removed_pattern: None,
            random_match_gen: None,
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
            self.match_gen_args.clone().unwrap(),
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

    pub fn generate_cases(&mut self) {
        self.random_match_gen = Some(RandomMatchGenerator::new(
            self.rng.clone(),
            self.graph.clone().unwrap(),
            self.random_match_gen_args.clone().unwrap(),
        ));
    }

    pub fn generate_z3(&mut self) -> bool {
        if let Some(statements) = self.random_match_gen.as_mut().unwrap().generate() {
            self.match_statements = statements;
            true
        } else {
            false
        }
    }

    pub fn check_z3(&mut self) -> SatResult {
        let match_statement = self.match_statements.get(1).unwrap();
        let Statement::Decl(Declaration::Var(VarDecl {
            name: _,
            typ_annotation: _,
            typ: _,
            exp,
        })) = match_statement;

        let matchexp = exp.clone();
        if let Expression::Match(matchexp) = matchexp {
            let mut checker = Z3Checker::new(matchexp);
            checker.check(&self.typ_gen.declarations, &self.typ_gen.all_types)
        } else {
            SatResult::Unknown
        }
    }

    pub fn process_batch(&mut self, exhaustive: bool, oracle: Oracle, batchsize: usize) {
        let cur_batch_name = if exhaustive {
            "exhaustive_batch"
        } else {
            "inexhaustive_batch"
        };

        let oracle_string = match oracle {
            Oracle::Z3 => "Z3",
            Oracle::Construction => "Construction",
        };

        let cur_folder = format!(
            "out/Programs/{oracle_string}/{}",
            LangTyp::get_compiler_name()
        );
        let cur_batch_folder = format!("{cur_folder}/batches/{cur_batch_name}");
        //println!("{cur_batch_folder}");

        self.save_for_batch(cur_batch_folder.clone());
        let num_progs = read_dir(&cur_batch_folder).unwrap().count();

        if num_progs < batchsize {
            return;
        }

        let mut cmd = Command::new("sh");
        cmd.arg("-c");
        cmd.current_dir(&cur_batch_folder);

        let mut actual_command = LangTyp::get_compiler_path();
        if let Some(args) = LangTyp::get_compiler_args() {
            for arg in args.iter() {
                actual_command.push_str(&format!(" {arg}"));
            }
        }
        actual_command.push_str(&format!(" *.{}", LangTyp::get_suffix()));
        cmd.arg(actual_command);

        let output = cmd.output().unwrap();
        let error_message = std::str::from_utf8(&output.stderr).unwrap();
        //println!("{error_message}");
        let compiler_not_exhaustive = error_message.contains(&LangTyp::get_not_exhaustive());
        let compiler_not_reachable = error_message.contains(&LangTyp::get_unreachable());
        let look_for_unreachable = matches!(oracle, Oracle::Construction) && compiler_not_reachable;

        if compiler_not_exhaustive || !exhaustive || look_for_unreachable {
            self.process_batch_error(
                error_message,
                &cur_batch_folder,
                exhaustive,
                look_for_unreachable,
                oracle,
            )
        }
        remove_dir_all(&cur_batch_folder).unwrap();
        create_dir(&cur_batch_folder).unwrap();
    }

    fn process_batch_error(
        &self,
        error_message: &str,
        cur_batch_folder: &str,
        exhaustive: bool,
        look_for_unreachable: bool,
        oracle: Oracle,
    ) {
        if look_for_unreachable {
            let unreachable_regex = LangTyp::get_unreachable_regex();
            let captures = unreachable_regex.captures_iter(error_message);
            let file_names: Vec<&str> = captures
                .filter_map(|c| c.name("unreachable").map(|m| m.as_str()))
                .collect();
            for file in file_names {
                let old_path = format!("{cur_batch_folder}/{file}");
                let new_folder = format!(
                    "out/Programs/Construction/{}/unreduced/unreachable",
                    LangTyp::get_compiler_name()
                );
                let num_progs = read_dir(&new_folder).unwrap().count();
                let new_path =
                    format!("{new_folder}/program_{num_progs}.{}", LangTyp::get_suffix());
                rename(old_path, new_path).unwrap();
            }
            return;
        }
        if !exhaustive {
            // compiler has to complain about every program
            let inexhaustive_regex = LangTyp::get_not_exhaustive_regex();
            let captures = inexhaustive_regex.captures_iter(error_message);
            let problematic_programs: Vec<&str> = captures
                .filter_map(|c| c.name("inexhaustive").map(|m| m.as_str()))
                .collect();
            let false_positives: Vec<String> = read_dir(cur_batch_folder)
                .unwrap()
                .filter(|f| f.as_ref().unwrap().file_type().unwrap().is_file())
                .map(|f| f.unwrap().file_name().into_string().unwrap())
                .filter(|name| !problematic_programs.contains(&name.as_str()))
                .collect();
            for file in false_positives {
                let old_path = format!("{cur_batch_folder}/{file}");
                //println!("Old path: {old_path}");
                let oracle_string = match oracle {
                    Oracle::Construction => "Construction",
                    Oracle::Z3 => "Z3",
                };
                let new_folder = format!(
                    "out/Programs/{oracle_string}/{}/inexhaustive/false_positive",
                    LangTyp::get_compiler_name()
                );
                let num_progs = read_dir(&new_folder).unwrap().count();
                let new_path =
                    format!("{new_folder}/program_{num_progs}.{}", LangTyp::get_suffix());
                rename(old_path, new_path).unwrap();
            }
            return;
        }
        // compiler should not complain about any program
        let inexhaustive_regex = LangTyp::get_not_exhaustive_regex();
        let captures = inexhaustive_regex.captures_iter(error_message);
        let false_negatives: Vec<&str> = captures
            .filter_map(|c| c.name("inexhaustive").map(|m| m.as_str()))
            .collect();

        for file in false_negatives {
            let old_path = format!("{cur_batch_folder}/{file}");
            let oracle_string = match oracle {
                Oracle::Construction => "Construction",
                Oracle::Z3 => "Z3",
            };
            let new_folder = format!(
                "out/Programs/{oracle_string}/{}/inexhaustive/false_negative",
                LangTyp::get_compiler_name()
            );
            let num_progs = read_dir(&new_folder).unwrap().count();
            let new_path = format!("{new_folder}/program_{num_progs}.{}", LangTyp::get_suffix());
            rename(old_path, new_path).unwrap();
        }
    }

    fn save_for_batch(&mut self, cur_batch_folder: String) {
        let num_progs = read_dir(&cur_batch_folder).unwrap().count();
        //println!("{num_progs}");
        let semicolon = if LangTyp::get_compiler_name() == "javac" {
            ";"
        } else {
            ""
        };

        let program = self.output_prog();

        let package_name = format!("Program_{num_progs}");
        let package_string = if LangTyp::get_compiler_name() == "ghc" {
            format!("module {package_name} () where")
        } else {
            format!("package {package_name}{semicolon}")
        };
        let cur_program = format!("{package_string} \n\n {program}");

        let file_name = format!("batch_prog_{num_progs}.{}", LangTyp::get_suffix());
        let cur_file_path = format!("{cur_batch_folder}/{file_name}");
        let mut source_file = File::create(&cur_file_path).unwrap();

        source_file.write_all(cur_program.as_bytes()).unwrap();
        if LangTyp::get_compiler_name() == "javac" && source_file.metadata().unwrap().len() >= 8000
            || source_file.metadata().unwrap().len() >= 64000
        {
            remove_file(cur_file_path).unwrap();
        }
    }

    pub fn process(&mut self) {
        if LangTyp::get_compiler_name() == "javac" {
            if let Some(Statement::Decl(Declaration::Var(VarDecl {
                name: _,
                typ_annotation: _,
                typ: _,
                exp: Expression::Match(e),
            }))) = self.match_statements.get(1)
            {
                if e.arms.len() >= 4000 {
                    return;
                }
            }
        }

        let cur_folder = format!("out/Programs/{}", LangTyp::get_compiler_name());
        let mut num_progs = read_dir(format!("{}/{}", cur_folder, "inexhaustive"))
            .unwrap()
            .count();
        num_progs += read_dir(format!("{}/{}", cur_folder, "unreachable"))
            .unwrap()
            .count();
        let name = format!("Program_{}", num_progs + 1);
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

        if LangTyp::get_compiler_name() == "javac" && error_message.contains("code too large") {
            remove_dir_all("out/Programs/temp").unwrap();
            return;
        }

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
