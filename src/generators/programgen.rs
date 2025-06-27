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
    mutate::mutator,
    reduction::reducer::Reducer,
    statistics::matchstats::MatchStatistics,
    types::{type_graph::graph::Graph, type_trait::Type},
    Oracle,
};
use core::fmt::Debug;
use rand::SeedableRng;
use rand_chacha::ChaCha8Rng;
use regex::Regex;
use std::{
    collections::{HashMap, HashSet},
    io::Read,
    time::Instant,
};
use std::{
    error,
    fmt::{format, Display},
    fs::{copy, create_dir, read_dir, remove_dir_all, remove_file, rename, File, OpenOptions},
    hash::Hash,
    io::{BufRead, BufReader, BufWriter, Write},
    path::Path,
    process::Command,
    thread::sleep,
    time::Duration,
};
use z3::SatResult;
use crate::paths::{PATH_PREFIX, EX_SUFFIX, RED_SUFFIX};


pub struct ProgramGenerator<
    'a,
    LangTyp: Type + Clone + PartialEq + Eq + Ord + PartialOrd + Hash + Display + Sync + 'static,
> {
    pub typ_gen: TypeGenerator<LangTyp>,
    rng: ChaCha8Rng,
    pub graph: Option<Graph<LangTyp>>,
    match_gen_args: Option<MatchArgs>,
    random_match_gen_args: Option<RandomMatchArgs>,
    pub match_statements: Vec<Statement<LangTyp>>,
    pub removed_pattern: Option<String>,
    pub file_map: &'a mut HashMap<String, (TypeGenerator<LangTyp>, Vec<Statement<LangTyp>>)>,
    pub mutate_info: Option<String>,
    random_match_gen: Option<RandomMatchGenerator<LangTyp>>,
    pub correct: bool, // If the generated program is correct
    redundancy: bool,
    reduce_enabled: bool,
}

impl<
        'a,
        LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
    > ProgramGenerator<'a, LangTyp>
{
    pub fn new(
        typctxt_args: &TypeContextArgs,
        rng: ChaCha8Rng,
        match_gen_args: Option<MatchArgs>,
        random_match_gen_args: Option<RandomMatchArgs>,
        correct: bool,
        file_map: &'a mut HashMap<String, (TypeGenerator<LangTyp>, Vec<Statement<LangTyp>>)>,
        redundancy: bool,
        reduce_enabled: bool,
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
            mutate_info: None,
            correct,
            file_map,
            redundancy,
            reduce_enabled,
        }
    }

    pub fn generate_types(&mut self) {
        self.typ_gen.generate();
        let graph = Graph::new(
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
        self.removed_pattern = removed.map(|t| LangTyp::pattern_to_string(&t));
    }

    pub fn get_match_statistics<T>(&self, stats: &mut T)
    where
        T: MatchStatistics,
    {
        let nodes = self.typ_gen.clone().get_declarations();
        stats.set_num_types(nodes.len() as u32);
        let mut constructors: Vec<LangTyp> = Vec::new();
        let mut generics: u32 = 0;
        let mut constructor_params: Vec<u32> = Vec::new();
        let mut bases: Vec<LangTyp> = Vec::new();
        for ttype in nodes {
            if !ttype.is_base() {
                constructors.push(ttype.clone());
                if let Some(params) = ttype.get_params() {
                    constructor_params.push(params.len() as u32);
                }
            } else {
                bases.push(ttype.clone());
            }
            if let Some(targs) = ttype.get_typargs() {
                if !targs.is_empty() {
                    generics += 1;
                }
            }

        }
        let con_num: u32 = constructors.len() as u32;
        let mut gadts = 0;
        for con in constructors {
            if let Some(con_bases) = con.get_bases() {
                if let Some(b) = con_bases.first() {
                    if !bases.contains(b) {
                        gadts += 1;
                    }
                }
            }
        }


        let avg_params = constructor_params.iter().sum::<u32>() as f32 / con_num as f32;
        stats.set_num_constructors(con_num);
        stats.set_num_generics(generics);
        stats.set_num_constructor_params(avg_params);
        stats.set_num_gadts(gadts);
        stats.set_num_bases(bases.len() as u32);

        let Statement::Decl(Declaration::Var(VarDecl {
            name: _,
            typ_annotation: _,
            typ: _,
            exp,
        })) = self.match_statements.get(1).unwrap();

        if let Expression::Match(matchexp) = exp {
            let n = matchexp.cases.len() as u32;
            stats.set_num_patterns(n);
            let mut pattern_depths = Vec::new();

            for case in &matchexp.cases {
                pattern_depths.push(case.depth());
            }

            let average_depth = pattern_depths.iter().sum::<u32>() as f32 / n as f32;
            stats.set_average_pattern_depth(average_depth);

            let variance = pattern_depths
                .iter()
                .map(|d| (*d as f32 - average_depth).powf(2.))
                .sum::<f32>()
                / n as f32;

            stats.set_variance_pattern_depth(variance);

            let max = pattern_depths.iter().max().unwrap();
            stats.set_max_pattern_depth(*max);

            let min = pattern_depths.iter().min().unwrap();
            stats.set_min_pattern_depth(*min);
        }
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

    pub fn mutate(&mut self, result: &SatResult, batchsize: usize) -> u32 {
        let match_statement = self.match_statements.get(1).unwrap();
        let Statement::Decl(Declaration::Var(VarDecl {
            name,
            typ_annotation,
            typ,
            exp,
        })) = match_statement;

        //let old_match_statment = match_statement.clone();
        let matchexp = exp.clone();
        let name = name.clone();
        let typ_annotation = *typ_annotation;
        let typ = typ.clone();

        let num_progs = 1;
        let exhaustive = true;
        if let Expression::Match(matchexp) = matchexp {
            if exhaustive {
                return mutator::mutate_match_exhaustive(self, result, batchsize);
            } else {
                let (mutated_match, info) = mutator::mutate_match(
                    matchexp,
                    result,
                    self.graph.as_mut().unwrap(),
                    self.rng.clone(),
                );

                *self.match_statements.get_mut(1).unwrap() =
                    Statement::Decl(Declaration::Var(VarDecl {
                        name: name.clone(),
                        typ_annotation,
                        typ: typ.clone(),
                        exp: Expression::Match(mutated_match),
                    }));
                self.mutate_info = Some(info);
                let exhaustive = matches!(result, SatResult::Unsat);
                self.process_batch(exhaustive, Oracle::Mutation, batchsize);
                // *self.match_statements.get_mut(1).unwrap() = old_match_statment;
                self.mutate_info = None;
            }
        }
        num_progs
    }

    pub fn generate_z3(&mut self) -> Option<Duration> {
        let time = Instant::now();
        if let Some(statements) = self.random_match_gen.as_mut().unwrap().generate() {
            self.match_statements = statements;
            Some(time.elapsed())
        } else {
            None
        }
    }

    pub fn check_z3(&mut self) -> (SatResult, Duration) {
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
            let (result, missing_opt, duration) =
                checker.check(&self.typ_gen.declarations, &self.typ_gen.all_types);
            self.removed_pattern = missing_opt;
            (result, duration)
        } else {
            (SatResult::Unknown, Duration::default())
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
            Oracle::Mutation => "Mutation",
        };

        let cur_folder = format!(
            "{PATH_PREFIX}/{oracle_string}/{}",
            LangTyp::get_compiler_name()
        );
        let cur_batch_folder = format!("{cur_folder}/batches/{cur_batch_name}");
        if !Path::new(&cur_batch_folder).exists() {
            create_dir(&cur_batch_folder).unwrap();
        }

        self.save_for_batch(
            cur_batch_folder.clone(),
            exhaustive,
            self.output_prog(),
            None,
            true
        );
        let num_progs = read_dir(&cur_batch_folder).unwrap().count();

        if num_progs > batchsize {
            remove_dir_all(&cur_batch_folder).unwrap();
            create_dir(&cur_batch_folder).unwrap();
        }

        if (matches!(oracle, Oracle::Z3) || matches!(oracle, Oracle::Mutation))
            && LangTyp::get_compiler_name() == "javac"
        {
            Self::remove_unreachable(&cur_batch_folder);
        } else if num_progs < batchsize {
            return;
        }
        self.test_compile(&cur_batch_folder, cur_folder, exhaustive, oracle);
    }

    fn test_compile(
        &mut self,
        cur_batch_folder: &str,
        cur_folder: String,
        exhaustive: bool,
        oracle: Oracle,
    ) {
        let mut cmd = Command::new("sh");
        cmd.arg("-c");

        let mut actual_command = format!("timeout 20's' {}", LangTyp::get_compiler_path());
        if let Some(args) = LangTyp::get_compiler_args() {
            for arg in args.iter() {
                actual_command.push_str(&format!(" {arg}"));
            }
        }
        actual_command.push_str(&format!(" *.{}", LangTyp::get_suffix()));
        cmd.arg(actual_command);
        cmd.current_dir(cur_batch_folder);
        println!("Compiling...");
        let output = cmd.output().unwrap();
        println!("Finished Compiling");

        let crashed = if let Some(code) = output.status.code() {
            code == 124
        } else {
            false
        };

        if !crashed {
            let error_message = std::str::from_utf8(&output.stderr).unwrap();
            //println!("{error_message}");
            let crash_regex = LangTyp::get_crash_regex();
            if crash_regex.is_match(error_message) {
                let crash_folder = format!("{cur_folder}/crash");
                let num_batches = read_dir(&crash_folder).unwrap().count();
                let cur_crash_folder = format!("{crash_folder}/batch_{num_batches}");
                create_dir(&cur_crash_folder).unwrap();
                for file in read_dir(cur_batch_folder).unwrap() {
                    let file_name = file.unwrap().file_name().into_string().unwrap();
                    if file_name.ends_with(&format!(".{}", LangTyp::get_suffix())) {
                        let old_path = format!("{cur_batch_folder}/{file_name}");
                        let new_path = format!("{cur_crash_folder}/{file_name}");
                        rename(old_path, new_path).unwrap();
                    }
                }
            }

            let compiler_not_exhaustive = error_message.contains(&LangTyp::get_not_exhaustive());
            let compiler_not_reachable = error_message.contains(&LangTyp::get_unreachable());
            let look_for_unreachable = matches!(oracle, Oracle::Construction)
                && compiler_not_reachable && self.redundancy;

            if compiler_not_exhaustive || !exhaustive || look_for_unreachable {
                self.process_batch_error(
                    error_message,
                    cur_batch_folder,
                    exhaustive,
                    look_for_unreachable,
                    oracle,
                )
            }
        }
        remove_dir_all(cur_batch_folder).unwrap();
        create_dir(cur_batch_folder).unwrap();
    }

    fn process_batch_error(
        &mut self,
        error_message: &str,
        cur_batch_folder: &str,
        exhaustive: bool,
        look_for_unreachable: bool,
        oracle: Oracle,
    ) {
        if LangTyp::get_compiler_name() == "ghc" {
            let regex =
                Regex::new(r"(?<scope>[a-z | _ | \d*]*.hs):\d*:\d*: error:\n    Not in scope:")
                    .unwrap();
            let captures = regex.captures_iter(error_message);
            let file_names: HashSet<&str> = captures
                .filter_map(|c| c.name("scope").map(|m| m.as_str()))
                .collect();
            for file in file_names {
                remove_file(format!("{cur_batch_folder}/{file}")).unwrap();
            }
        }

        if look_for_unreachable {
            let unreachable_regex = LangTyp::get_unreachable_regex();
            let captures = unreachable_regex.captures_iter(error_message);
            let file_names: HashSet<&str> = captures
                .filter_map(|c| c.name("unreachable").map(|m| m.as_str()))
                .collect();
            for file in file_names {
                let old_path = format!("{cur_batch_folder}/{file}");
                //println!("{old_path}");
                if !Path::new(&old_path).exists() {
                    continue;
                }
                let new_folder = format!(
                    "{PATH_PREFIX}/Construction/{}/{RED_SUFFIX}",
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
            let false_negatives: Vec<String> = read_dir(cur_batch_folder)
                .unwrap()
                .filter(|f| f.as_ref().unwrap().file_type().unwrap().is_file())
                .filter(|f| {
                    f.as_ref()
                        .unwrap()
                        .file_name()
                        .to_str()
                        .unwrap()
                        .ends_with(&LangTyp::get_suffix())
                })
                .map(|f| f.unwrap().file_name().into_string().unwrap())
                .filter(|name| !problematic_programs.contains(&name.as_str()))
                .collect();
            for file in false_negatives {
                let old_path = format!("{cur_batch_folder}/{file}");
                if !Path::new(&old_path).exists() {
                    continue;
                }
                self.reduce(cur_batch_folder, &file, exhaustive);

                let oracle_string = match oracle {
                    Oracle::Construction => "Construction",
                    Oracle::Z3 => "Z3",
                    Oracle::Mutation => "Mutation",
                };
                let new_folder = format!(
                    "{PATH_PREFIX}/{oracle_string}/{}/{EX_SUFFIX}/false_negative",
                    LangTyp::get_compiler_name()
                );
                let num_progs = read_dir(&new_folder).unwrap().count();
                let new_path =
                    format!("{new_folder}/program_{num_progs}.{}", LangTyp::get_suffix());
                rename(old_path, new_path).unwrap();
                //panic!("{error_message}")
            }
            return;
        }
        // compiler should not complain about any program
        let inexhaustive_regex = LangTyp::get_not_exhaustive_regex();
        let captures = inexhaustive_regex.captures_iter(error_message);
        let false_positives: Vec<&str> = captures
            .filter_map(|c| c.name("inexhaustive").map(|m| m.as_str()))
            .collect();

        for file in false_positives {
            let old_path = format!("{cur_batch_folder}/{file}");
            if !Path::new(&old_path).exists() {
                continue;
            }
            self.reduce(cur_batch_folder, file, exhaustive);
            let oracle_string = match oracle {
                Oracle::Construction => "Construction",
                Oracle::Z3 => "Z3",
                Oracle::Mutation => "Mutation",
            };
            let new_folder = format!(
                "{PATH_PREFIX}/{oracle_string}/{}/{EX_SUFFIX}/false_positive",
                LangTyp::get_compiler_name()
            );
            let num_progs = read_dir(&new_folder).unwrap().count();
            let new_path = format!("{new_folder}/program_{num_progs}.{}", LangTyp::get_suffix());
            rename(old_path, new_path).unwrap();
        }
    }
    /// exhaustive here means the compiler claims the match is inexhaustive even though it is exhaustive
    fn reduce(&mut self, cur_batch_folder: &str, file: &str, exhaustive: bool) {
        let old_file_path = format!("{cur_batch_folder}/{file}");

        let temp_folder = format!("{cur_batch_folder}/temp");
        let new_file_path = format!("{temp_folder}/{file}");

        create_dir(&temp_folder).unwrap();

        let mut old_prog = String::new();
        OpenOptions::new()
            .read(true)
            .open(&old_file_path)
            .unwrap()
            .read_to_string(&mut old_prog)
            .unwrap();

        //println!("{old_file_path} to {new_file_path}");
        rename(old_file_path, new_file_path).unwrap();

        let file_map_name = if exhaustive {
            format!("{file}_exhaustive")
        } else {
            format!("{file}_inexhaustive")
        };
        //println!("Checking {file_map_name}");
        let (type_gen, match_statements) = self.file_map.get(&file_map_name).unwrap();
        let mut reducer = Reducer::new(
            file.to_string(),
            temp_folder.clone(),
            exhaustive,
            type_gen.clone(),
            match_statements.clone(),
        );
        let program = if self.reduce_enabled {
            reducer.reduce().unwrap_or(old_prog)
        } else {
            old_prog
        }; 
        remove_dir_all(temp_folder).unwrap();
        self.save_for_batch(
            cur_batch_folder.to_string(),
            exhaustive,
            program,
            Some(file.to_string()),
            false
        );
        if LangTyp::get_compiler_name() == "javac" {
            Self::remove_unreachable(cur_batch_folder);
        }
    }

    fn save_for_batch(
        &mut self,
        cur_batch_folder: String,
        exhaustive: bool,
        program: String,
        file_name: Option<String>,
        package: bool
    ) {
        let num_progs = read_dir(&cur_batch_folder).unwrap().count();
        //println!("{num_progs}");
        let semicolon = if LangTyp::get_compiler_name() == "javac" {
            ";"
        } else {
            ""
        };

        let package_name = format!("Program_{num_progs}");
        let package_string = if package && LangTyp::get_compiler_name() == "ghc" {
            format!("module {package_name} () where")
        } else if package {
            format!("package {package_name}{semicolon}")
        } else {
            format!("")
        };
        let mut cur_program = format!("{package_string} \n\n{program}");

        if let Some(removed) = &self.removed_pattern {
            let new = removed.replace('\n', &format!("\n{}", LangTyp::get_comment()));
            cur_program.push_str(
                format!("\n{} This is not matched: {new}", LangTyp::get_comment()).as_str(),
            );
        }

        if let Some(info) = &self.mutate_info {
            let new = info.replace('\n', &format!("\n{}", LangTyp::get_comment()));
            cur_program.push_str(
                format!(
                    "\n{} Mutation information: \n{} {new}",
                    LangTyp::get_comment(),
                    LangTyp::get_comment()
                )
                .as_str(),
            );
        }

        let file_name = if let Some(file_name) = file_name {
            file_name
        } else {
            format!("batch_prog_{num_progs}.{}", LangTyp::get_suffix())
        };
        let cur_file_path = format!("{cur_batch_folder}/{file_name}");
        let mut source_file = File::create(&cur_file_path).unwrap();

        source_file.write_all(cur_program.as_bytes()).unwrap();
        if LangTyp::get_compiler_name() == "javac" && source_file.metadata().unwrap().len() >= 8000
            || source_file.metadata().unwrap().len() >= 64000
        {
            remove_file(cur_file_path).unwrap();
        }

        let file_map_name = if exhaustive {
            format!("{file_name}_exhaustive")
        } else {
            format!("{file_name}_inexhaustive")
        };
        //println!("Saving {file_map_name}");
        self.file_map.insert(
            file_map_name,
            (self.typ_gen.clone(), self.match_statements.clone()),
        );
    }

    pub fn remove_unreachable(cur_batch_folder: &str) {
        let mut cmd = Command::new("sh");
        cmd.arg("-c");

        let mut actual_command = LangTyp::get_compiler_path();
        if let Some(args) = LangTyp::get_compiler_args() {
            for arg in args.iter() {
                actual_command.push_str(&format!(" {arg}"));
            }
        }
        actual_command.push_str(&format!(" *.{}", LangTyp::get_suffix()));
        cmd.arg(actual_command);

        cmd.current_dir(cur_batch_folder);

        let output = cmd.output().unwrap().stderr;
        let error_message = std::str::from_utf8(&output).unwrap();
        //println!("{error_message}");
        for f in Path::new(cur_batch_folder).read_dir().unwrap() {
            let file_name = f.unwrap().file_name().into_string().unwrap();
            if !file_name.ends_with(".java") {
                continue;
            }
            let line_regex = Regex::new(&format!(
                r"{file_name}:(?<line_number>\d*): error: this case label is dominated"
            ))
            .unwrap();

            let captures = line_regex.captures_iter(error_message);
            let line_numbers: Vec<usize> = captures
                .filter_map(|c| {
                    c.name("line_number")
                        .map(|m| m.as_str().parse::<usize>().unwrap())
                })
                .collect();

            let cur_file_path = format!("{cur_batch_folder}/{file_name}");
            let temp_file_path = format!("{cur_file_path}.temp");
            //println!("opening {cur_file_path}");

            let orig_file = File::open(&cur_file_path).unwrap();
            let out_file = File::create(&temp_file_path).unwrap();

            let reader = BufReader::new(&orig_file);
            let mut writer = BufWriter::new(&out_file);

            for (i, line) in reader.lines().enumerate() {
                let line = line.as_ref().unwrap();
                if line_numbers.contains(&(i + 1)) {
                    //writeln!(writer, "//{}", line).unwrap();
                } else {
                    writeln!(writer, "{}", line).unwrap();
                }
            }
            rename(temp_file_path, cur_file_path).unwrap();
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

        let cur_folder = format!("{PATH_PREFIX}/{}", LangTyp::get_compiler_name());
        let mut num_progs = read_dir(format!("{}/{}", cur_folder, "{EX_SUFFIX}"))
            .unwrap()
            .count();
        num_progs += read_dir(format!("{}/{}", cur_folder, "{RED_SUFFIX}"))
            .unwrap()
            .count();
        let name = format!("Program_{}", num_progs + 1);
        if Path::new("{PATH_PREFIX}/temp").exists() {
            remove_dir_all("{PATH_PREFIX}/temp").unwrap();
        }
        create_dir("out/Programs/temp").unwrap();
        let file_name = format!("tempprog.{}", LangTyp::get_suffix());
        let mut source_file =
            File::create(format!("{PATH_PREFIX}/temp/{}", file_name.clone())).unwrap();
        source_file
            .write_all(self.output_prog().as_bytes())
            .unwrap();
        let mut cmd = Command::new(LangTyp::get_compiler_path());
        cmd.arg(file_name).current_dir("{PATH_PREFIX}/temp");
        if let Some(args) = LangTyp::get_compiler_args() {
            cmd.args(args.iter());
        }

        let output = cmd.output().unwrap();
        let error_message = std::str::from_utf8(&output.stderr).unwrap();
        /*if !error_message.is_empty() && self.removed_pattern.is_some() {
            println!("Detected missing pattern: {error_message}");
        } */

        if LangTyp::get_compiler_name() == "javac" && error_message.contains("code too large") {
            remove_dir_all("{PATH_PREFIX}/temp").unwrap();
            return;
        }

        if !error_message.is_empty() && self.removed_pattern.is_none() {
            self.handle_error(name, error_message);
            return;
        } else if error_message.is_empty() && self.removed_pattern.is_some() {
            self.handle_no_error(name);
            return;
        }
        remove_dir_all("{PATH_PREFIX}/temp").unwrap();
    }
    // Compiler gave an error eventhough it should not have
    fn handle_error(&mut self, name: String, error_message: &str) {
        let file_name = format!("tempprog.{}", LangTyp::get_suffix());
        let _ = copy(
            format!("{PATH_PREFIX}/temp/{}", file_name),
            format!("{PATH_PREFIX}/reduction/{}", file_name),
        );
        let mut error_file = File::create("{PATH_PREFIX}/reduction/temp.txt").unwrap();
        error_file.write_all(error_message.as_bytes()).unwrap();
        self.reduce_prog(name.clone());
        remove_file("{PATH_PREFIX}/reduction/temp.txt").unwrap();
        remove_dir_all("{PATH_PREFIX}/temp").unwrap();
    }

    fn handle_no_error(&mut self, name: String) {
        let file_name = format!("tempprog.{}", LangTyp::get_suffix());
        let old_path = format!("{PATH_PREFIX}/temp/{file_name}");
        let mut source_file = OpenOptions::new()
            .append(true)
            .open(old_path.clone())
            .unwrap();
        let pattern_string = &self.removed_pattern.clone().unwrap();
        let comment = format!(
            "{} Removed this case: {}",
            LangTyp::get_comment(),
            pattern_string
        );
        writeln!(source_file, "{}", comment).unwrap();
        let new_path = format!(
            "{PATH_PREFIX}/{}/{EX_SUFFIX}/{name}",
            LangTyp::get_compiler_name()
        );
        rename(old_path, new_path).unwrap();
        remove_dir_all("{PATH_PREFIX}/temp").unwrap();
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
            .current_dir("{PATH_PREFIX}/reduction")
            .spawn()
            .unwrap();
        reducer.wait().unwrap();
        let new_path = format!("{PATH_PREFIX}/{}/{RED_SUFFIX}", LangTyp::get_compiler_name());
        rename(
            format!("{PATH_PREFIX}/reduction/perses_result/{}", temp_file_name),
            format!("{}/{}_reduced.{}", new_path, name, LangTyp::get_suffix()),
        )
        .unwrap();
        let files = read_dir("{PATH_PREFIX}/reduction").unwrap();
        for file in files {
            let f = file.unwrap();
            if f.file_name().into_string().unwrap().starts_with("tempprog") {
                remove_file(f.path()).unwrap();
            }
        }
        remove_dir_all("{PATH_PREFIX}/reduction/perses_result").unwrap();
    }
}
