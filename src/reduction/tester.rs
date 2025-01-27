use z3::SatResult;

use super::reducer::Reducer;
use super::restructer::Restructer;
use crate::generators::programgen::ProgramGenerator;
use crate::generators::z3checker::Z3Checker;
use crate::matches::expression::Expression;
use crate::matches::expression::MatchExp;

use crate::matches::statements::VarDecl;
use crate::types::type_trait::Type;
use std::collections::HashSet;
use std::fmt::write;
use std::fmt::Debug;
use std::fmt::Display;
use std::fs::create_dir;
use std::fs::read_dir;
use std::fs::remove_dir_all;
use std::fs::File;
use std::hash::Hash;
use std::io::Write;
use std::process::Command;
use std::time::Instant;

pub enum TestResult {
    Bug,
    NoBug,
    Unknown,
}
impl Display for TestResult {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        match self {
            TestResult::Bug => write!(f, "Bug"),
            TestResult::NoBug => write!(f, "NoBug"),
            TestResult::Unknown => write!(f, "Unknown"),
        }
    }
}

impl<
        LangTyp: Type
            + Clone
            + PartialEq
            + Debug
            + Ord
            + PartialOrd
            + Eq
            + Hash
            + Display
            + Sync
            + Send
            + 'static,
    > Reducer<LangTyp>
{
    pub fn test(&self, used_changes: &HashSet<usize>, final_set: &HashSet<usize>) -> TestResult {
        //println!("Testing");
        if used_changes.is_empty() && final_set.is_empty() {
            //println!("Unknown because changes are empty");
            return TestResult::Unknown;
        }
        let highest_change_id = used_changes.iter().chain(final_set).max().unwrap();

        let mut cur_changes = used_changes.clone();
        self.hierarchy.add_children(&mut cur_changes);

        for change in final_set {
            cur_changes.insert(*change);
        }

        if *highest_change_id < self.hierarchy.num_type_changes {
            // final_set and used_changes could both not contain any patterns
            return TestResult::Unknown;
        }

        let restructer = Restructer::new(&self.hierarchy, &cur_changes);
        let prog = if let Ok(prog) = restructer.restruct() {
            prog
        } else {
            //println!("Could not restruct");
            return TestResult::Unknown;
        };

        //println!("{}", prog.output_prog());

        if prog.patterns.is_empty() {
            // We don't care about empty pattern matches
            return TestResult::Unknown;
        }

        let var_decl = VarDecl::new(
            "v_a".to_string(),
            prog.to_match_type.clone(),
            Expression::BottomType,
        );
        let var = Expression::Var(var_decl.get_var());

        let to_match = Box::new(var);

        let mut arms = Vec::new();
        for i in 0..prog.patterns.len() {
            arms.push(Expression::Int(i as u32));
        }

        let prog_string = prog.output_prog();

        let matchexp = MatchExp {
            to_match,
            arms,
            cases: prog.patterns,
            removed_pattern: None,
        };
        let mut z3_checker = Z3Checker::new(matchexp);

        let declarations: Vec<usize> = prog
            .types
            .iter()
            .enumerate()
            .filter_map(|(i, t)| if t.needs_declaration() { Some(i) } else { None })
            .collect();

        let (result, s, _) = z3_checker.check(&declarations, &prog.types);
        if matches!(result, SatResult::Unknown) {
            //println!("Solver result was unknown");
            return TestResult::Unknown;
        }

        if self.exhaustive && matches!(result, SatResult::Sat) {
            // patternmatch is no longer exhaustive
            //println!("No longer exhaustive");
            return TestResult::Unknown;
        }

        if !self.exhaustive && matches!(result, SatResult::Unsat) {
            // patternmatch is no longer inexhaustive
            //println!("No longer inexhaustive");
            return TestResult::Unknown;
        }

        /*if let Some(x) = s {
            println!("String from checker: {x}");
        }

        let result_string = match result {
            SatResult::Sat => "Inexhaustive",
            SatResult::Unsat => "Exhaustive",
            SatResult::Unknown => "Unknown",
        };

        println!("Checker says this program is {result_string}");*/
        /*
        println!("Final set:");
        self.print_changes(&final_set);
        println!("Used set:");
        self.print_changes(&used_changes);*/

        // do actual compiler testing
        let result = self.compiler_test(prog_string.clone());
        if matches!(result, TestResult::Bug) {
            println!("{}", prog_string);
        }
        result
    }

    fn time_test(&self, prog: String) -> TestResult {
        let temp_folder = format!("{}/temp", self.folder_path);

        create_dir(&temp_folder).unwrap();

        let file_path = format!("{temp_folder}/{}", self.file_name);

        let mut source_file = File::create(&file_path).unwrap();

        source_file.write_all(prog.as_bytes()).unwrap();

        let mut cmd = Command::new("sh");
        cmd.arg("-c");

        let mut old_command = String::from("scalac");
        if let Some(args) = LangTyp::get_compiler_args() {
            for arg in args.iter() {
                old_command.push_str(&format!(" {arg}"));
            }
        }
        old_command.push_str(&format!(" *.{}", LangTyp::get_suffix()));
        cmd.arg(old_command);
        cmd.current_dir(&temp_folder);
        println!("Compiling for Reduction... Old");
        let start_old = Instant::now();
        cmd.output().unwrap();
        let old_time = start_old.elapsed().as_secs();
        println!("Finished Compiling for Reduction Old");

        remove_dir_all(&temp_folder).unwrap();

        create_dir(&temp_folder).unwrap();

        let mut source_file = File::create(file_path).unwrap();

        source_file.write_all(prog.as_bytes()).unwrap();

        let mut cmd = Command::new("sh");
        cmd.arg("-c");

        let mut new_command = format!("timeout 10's' {}", LangTyp::get_compiler_path());
        if let Some(args) = LangTyp::get_compiler_args() {
            for arg in args.iter() {
                new_command.push_str(&format!(" {arg}"));
            }
        }
        new_command.push_str(&format!(" *.{}", LangTyp::get_suffix()));
        cmd.arg(new_command);
        cmd.current_dir(&temp_folder);
        println!("Compiling for Reduction... New");
        let start_new = Instant::now();
        cmd.output().unwrap();
        let new_time = start_new.elapsed().as_secs();
        println!("Finished Compiling for Reduction New");

        remove_dir_all(&temp_folder).unwrap();

        if new_time >= 4 * old_time || new_time >= 10 {
            println!("{new_time}");
            TestResult::Bug
        } else {
            TestResult::NoBug
        }
    }

    fn compiler_test(&self, prog: String) -> TestResult {
        let temp_folder = format!("{}/temp", self.folder_path);

        create_dir(&temp_folder).unwrap();

        let file_path = format!("{temp_folder}/{}", self.file_name);

        let mut source_file = File::create(file_path).unwrap();

        source_file.write_all(prog.as_bytes()).unwrap();

        if (temp_folder.contains("Z3") || temp_folder.contains("Mutation"))
            && LangTyp::get_compiler_name() == "javac"
        {
            ProgramGenerator::<LangTyp>::remove_unreachable(&temp_folder);
        }

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
        cmd.current_dir(&temp_folder);
        //println!("Compiling for Reduction...");
        let output = cmd.output().unwrap();
        //println!("Finished Compiling for Reduction");
        let error_message = std::str::from_utf8(&output.stderr).unwrap();
        println!("{error_message}");
        let crash_regex = LangTyp::get_crash_regex();
        if crash_regex.is_match(error_message) {
            // Suddenly crashes
            return TestResult::Unknown;
        }

        let compiler_not_exhaustive = error_message.contains(&LangTyp::get_not_exhaustive());

        let bug_present = if compiler_not_exhaustive || !self.exhaustive {
            self.process_error(error_message, &temp_folder, self.exhaustive)
        } else {
            false
        };
        std::fs::remove_dir_all(&temp_folder).unwrap();
        if bug_present {
            //println!("BUG IS STILL PRESENT");
            TestResult::Bug
        } else {
            TestResult::NoBug
        }
    }

    fn process_error(&self, error_message: &str, cur_batch_folder: &str, exhaustive: bool) -> bool {
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
            return !false_positives.is_empty();
        }
        // compiler should not complain about any program
        let inexhaustive_regex = LangTyp::get_not_exhaustive_regex();
        let captures = inexhaustive_regex.captures_iter(error_message);
        let false_negatives: Vec<&str> = captures
            .filter_map(|c| c.name("inexhaustive").map(|m| m.as_str()))
            .collect();
        !false_negatives.is_empty()
    }
}
