use crate::types::type_trait::Type;
use crate::{
    generators::{matchgen_args::MatchArgs, programgen::ProgramGenerator},
    types::languages::haskell::haskell_type::HaskellType,
};
use generators::random_matchgen_args::RandomMatchArgs;
use generators::typegen_args::TypeContextArgs;
use matches::expression::{Expression, MatchExp};
use matches::statements::{Declaration, Statement, VarDecl};
use rand::{thread_rng, Rng, SeedableRng};
use rand_chacha::ChaCha8Rng;
use serde::Serialize;
use statistics::constructionstats::ConstructionStatistics;
use statistics::z3stats::Z3Statistics;
use std::env;
use std::fmt::{Debug, Display};
use std::fs::{create_dir, read_dir, remove_file, File, OpenOptions};
use std::hash::Hash;
use std::io::{Read, Write};
use std::path::Path;
use std::time::Instant;
use types::languages::java::java_type::JavaType;
use types::languages::scala::scala_type::ScalaType;
use z3::SatResult;
mod generators;
mod matches;
mod mutate;
mod statistics;
mod types;
fn main() {
    let args: Vec<String> = env::args().collect();

    let mut language = Language::Scala;
    let mut oracle = Oracle::Z3;

    let mut args_iter = args.into_iter();
    while let Some(arg) = args_iter.next() {
        if arg == "language" {
            let next_arg = args_iter.next().unwrap();
            language = match next_arg.as_str() {
                "scala" => Language::Scala,
                "haskell" => Language::Haskell,
                "java" => Language::Java,
                _ => panic!("Invalid language"),
            }
        } else if arg == "oracle" {
            let next_arg = args_iter.next().unwrap();
            oracle = match next_arg.as_str() {
                "z3" => Oracle::Z3,
                "construction" => Oracle::Construction,
                "mutation" => Oracle::Mutation,
                _ => panic!("Invalid oracle"),
            }
        }
    }

    let scala_args = TypeContextArgs {
        max_num_bases: 2,
        max_num_base_cases: 4,
        max_num_base_typargs: 2,
        max_type_depth: 3,
        max_num_params: 4,
        contravariance_prob: 0., // 1
        covariance_prob: 0.,     // 0.2
        base_instantiation_prob: 0.3,
        typarg_parameter_prob: 0.2,
        use_same_instantiation_prob: 0.7,
        use_prelude_type_prob: 0.2,
        instantiate_existing_complex_type_prob: 0.1,
        add_additional_typarg_case_prob: 0.05,
        tuple_prob: 0.1,
    };
    let scala_match_args = MatchArgs {
        level_prob: 0.7,
        refine_prob: 0.7,
        primitive_prob: 0.1,
        max_refine_depth: 3,
        max_to_match_depth: 0,
        const_refine_prob: 0.2,
    };
    let scala_args_z3 = TypeContextArgs {
        max_num_bases: 2,
        max_num_base_cases: 4,
        max_num_base_typargs: 2,
        max_type_depth: 2,
        max_num_params: 3,
        contravariance_prob: 0., // 1
        covariance_prob: 0.,     // 0.2
        base_instantiation_prob: 0.3,
        typarg_parameter_prob: 0.2,
        use_same_instantiation_prob: 0.7,
        use_prelude_type_prob: 0.2,
        instantiate_existing_complex_type_prob: 0.1,
        add_additional_typarg_case_prob: 0.,
        tuple_prob: 0.1,
    };
    let random_match_args = RandomMatchArgs {
        level_prob: 1.,
        max_refine_depth: 5, //5
    };
    let haskell_args = TypeContextArgs {
        max_num_bases: 4,
        max_num_base_cases: 6,
        max_num_base_typargs: 2,
        max_type_depth: 2,
        max_num_params: 3,
        contravariance_prob: 0., // 1
        covariance_prob: 0.,     // 0.2
        base_instantiation_prob: 0.3,
        typarg_parameter_prob: 0.2,
        use_same_instantiation_prob: 0.7,
        use_prelude_type_prob: 0.2,
        instantiate_existing_complex_type_prob: 0.1,
        add_additional_typarg_case_prob: 0.,
        tuple_prob: 0.2,
    };
    let haskell_match_args = MatchArgs {
        level_prob: 1.,
        refine_prob: 0.55,
        primitive_prob: 0.1,
        max_refine_depth: 5,
        max_to_match_depth: 0,
        const_refine_prob: 0.1,
    };
    let haskell_args_z3 = TypeContextArgs {
        max_num_bases: 2,
        max_num_base_cases: 4,
        max_num_base_typargs: 2,
        max_type_depth: 2,
        max_num_params: 3,
        contravariance_prob: 0., // 1
        covariance_prob: 0.,     // 0.2
        base_instantiation_prob: 0.3,
        typarg_parameter_prob: 0.2,
        use_same_instantiation_prob: 0.7,
        use_prelude_type_prob: 0.2,
        instantiate_existing_complex_type_prob: 0.1,
        add_additional_typarg_case_prob: 0.,
        tuple_prob: 0.2,
    };
    let java_args_z3 = TypeContextArgs {
        max_num_bases: 2,
        max_num_base_cases: 4,
        max_num_base_typargs: 2,
        max_type_depth: 2,
        max_num_params: 3,
        contravariance_prob: 0., // 1
        covariance_prob: 0.,     // 0.2
        base_instantiation_prob: 0.3,
        typarg_parameter_prob: 0.2,
        use_same_instantiation_prob: 0.7,
        use_prelude_type_prob: 0.2,
        instantiate_existing_complex_type_prob: 0.1,
        add_additional_typarg_case_prob: 0.,
        tuple_prob: 0.,
    };
    let java_args = TypeContextArgs {
        max_num_bases: 2,
        max_num_base_cases: 4,
        max_num_base_typargs: 2,
        max_type_depth: 2,
        max_num_params: 4,
        contravariance_prob: 0., // 1
        covariance_prob: 0.,     // 0.2
        base_instantiation_prob: 0.3,
        typarg_parameter_prob: 0.2,
        use_same_instantiation_prob: 0.7,
        use_prelude_type_prob: 0.2,
        instantiate_existing_complex_type_prob: 0.1,
        add_additional_typarg_case_prob: 0.,
        tuple_prob: 0.,
    };
    let java_match_args = MatchArgs {
        level_prob: 0.7,
        refine_prob: 0.5,
        primitive_prob: 0.1,
        max_refine_depth: 4,
        max_to_match_depth: 0,
        const_refine_prob: 0.,
    };

    let mut unknown_count = 0;
    let mut unsat_count = 0;
    let mut sat_count = 0;
    let mut prog_count = 0;

    let mut z3_stats = Vec::new();
    let mut construction_stats = Vec::new();
    while prog_count <= 100000 {
        println!("ROUND {prog_count}");
        let cur_count = match language {
            Language::Haskell => {
                if matches!(oracle, Oracle::Construction) {
                    run_prog::<HaskellType>(
                        &haskell_args,
                        &haskell_match_args,
                        &mut construction_stats,
                    );
                    prog_count += 1;
                    1
                } else if matches!(oracle, Oracle::Mutation) {
                    run_prog_mutate::<HaskellType>(
                        &haskell_args_z3,
                        &random_match_args,
                        &mut prog_count,
                    )
                } else {
                    run_prog_z3::<HaskellType>(
                        &haskell_args_z3,
                        &random_match_args,
                        &mut unknown_count,
                        &mut prog_count,
                        &mut unsat_count,
                        &mut sat_count,
                        &mut z3_stats,
                    )
                }
            }
            Language::Scala => {
                if matches!(oracle, Oracle::Construction) {
                    run_prog::<ScalaType>(&scala_args, &scala_match_args, &mut construction_stats);
                    prog_count += 1;
                    1
                } else if matches!(oracle, Oracle::Mutation) {
                    run_prog_mutate::<ScalaType>(
                        &scala_args_z3,
                        &random_match_args,
                        &mut prog_count,
                    )
                } else {
                    run_prog_z3::<ScalaType>(
                        &scala_args_z3,
                        &random_match_args,
                        &mut unknown_count,
                        &mut prog_count,
                        &mut unsat_count,
                        &mut sat_count,
                        &mut z3_stats,
                    )
                }
            }
            Language::Java => {
                if matches!(oracle, Oracle::Construction) {
                    run_prog::<JavaType>(&java_args, &java_match_args, &mut construction_stats);
                    prog_count += 1;
                    1
                } else if matches!(oracle, Oracle::Mutation) {
                    run_prog_mutate::<JavaType>(&java_args_z3, &random_match_args, &mut prog_count)
                } else {
                    run_prog_z3::<JavaType>(
                        &java_args_z3,
                        &random_match_args,
                        &mut unknown_count,
                        &mut prog_count,
                        &mut unsat_count,
                        &mut sat_count,
                        &mut z3_stats,
                    )
                }
            }
        };
        stats(&oracle, &language, &cur_count);

        if matches!(oracle, Oracle::Z3) {
            println!(
                "Unknown_percentage: {}",
                (unknown_count as f32) / (prog_count as f32)
            );
            println!(
                "Exhaustive_percentage: {}",
                (unsat_count as f32) / (prog_count as f32)
            );
            println!(
                "Inexhaustive_percentage: {}",
                (sat_count as f32) / (prog_count as f32)
            );
        }
    }
    return;
    let oracle_string = match oracle {
        Oracle::Construction => "Construction",
        Oracle::Z3 => "Z3",
        Oracle::Mutation => "Mutation",
    };
    let compiler_string = match language {
        Language::Haskell => "ghc",
        Language::Java => "javac",
        Language::Scala => "scalac",
    };
    let stats_file = format!("out/Programs/{oracle_string}/{compiler_string}/more_stats.csv");
    if !Path::new(&stats_file).exists() {
        File::create(&stats_file).unwrap();
    }
    let mut writer = csv::Writer::from_path(stats_file).unwrap();
    if matches!(oracle, Oracle::Z3) {
        for stat in z3_stats {
            writer.serialize(stat).unwrap();
        }
    } else {
        for stat in construction_stats {
            writer.serialize(stat).unwrap();
        }
    }
    writer.flush().unwrap();
}

fn stats(oracle: &Oracle, language: &Language, prog_count: &u32) {
    let oracle_string = match oracle {
        Oracle::Construction => "Construction",
        Oracle::Z3 => "Z3",
        Oracle::Mutation => "Mutation",
    };
    let compiler_string = match language {
        Language::Haskell => "ghc",
        Language::Java => "javac",
        Language::Scala => "scalac",
    };
    let stats_file = format!("out/Programs/{oracle_string}/{compiler_string}/stats.txt");
    if !Path::new(&stats_file).exists() {
        File::create(&stats_file).unwrap();
    }

    let mut count = String::new();
    OpenOptions::new()
        .read(true)
        .open(&stats_file)
        .unwrap()
        .read_to_string(&mut count)
        .unwrap();
    let prev_value = if let Ok(num) = count.parse::<u32>() {
        num
    } else {
        0
    };
    let mut f = OpenOptions::new()
        .write(true)
        .truncate(true)
        .open(&stats_file)
        .unwrap();
    let new_count = prev_value + *prog_count;
    f.write_all(new_count.to_string().as_bytes()).unwrap();
    /*remove_file(&stats_file).unwrap();
    let mut new_f = File::create(&stats_file).unwrap();

    new_f.write_all(new_count.to_string().as_bytes()).unwrap();*/
}

pub enum Language {
    Haskell,
    Scala,
    Java,
}

pub enum Oracle {
    Z3,
    Construction,
    Mutation,
}
// used for coverage
fn save_file(prog: String, oracle: Oracle) {
    let oracle_string = match oracle {
        Oracle::Z3 => "z3",
        Oracle::Construction => "construction",
        Oracle::Mutation => "mutation",
    };
    let folder = format!("programs/{oracle_string}");
    let num_files = read_dir(&folder).unwrap().count();
    let cur_file_path = format!("{folder}/prog_{num_files}.hs");
    let mut source_file = File::create(cur_file_path).unwrap();
    source_file.write_all(prog.as_bytes()).unwrap();
}

fn run_prog_z3<
    T: Type
        + Clone
        + PartialEq
        + Ord
        + PartialOrd
        + Eq
        + Debug
        + Hash
        + Display
        + Sync
        + 'static
        + Send,
>(
    args: &TypeContextArgs,
    match_args: &RandomMatchArgs,
    unknown_count: &mut u32,
    prog_count: &mut u32,
    unsat_count: &mut u32,
    sat_count: &mut u32,
    z3stats: &mut Vec<Z3Statistics>,
) -> u32 {
    let seed = thread_rng().gen();
    //println!("using seed: {}", seed);
    let rng = ChaCha8Rng::seed_from_u64(seed);
    let mut program_generator: ProgramGenerator<T> =
        ProgramGenerator::new(args, rng, None, Some(match_args.clone()), false);

    let type_gen_start = Instant::now();
    program_generator.generate_types();
    let type_gen_time = type_gen_start.elapsed();

    let enumeration_start = Instant::now();
    program_generator.generate_cases();
    let enumeration_time = enumeration_start.elapsed();

    let batchsize = if T::get_compiler_name() == "javac" {
        1
    } else {
        32
    };
    let mut cur_count = 0;
    while let Some(gen_duration) = program_generator.generate_z3() {
        //save_file(program_generator.output_prog(), Oracle::Z3);
        *prog_count += 1;
        cur_count += 1;
        let total = Instant::now();
        let (result, duration) = program_generator.check_z3();
        match result {
            SatResult::Sat => *sat_count += 1,
            SatResult::Unknown => *unknown_count += 1,
            SatResult::Unsat => *unsat_count += 1,
        }

        let mut cur_stats = Z3Statistics::new();
        cur_stats.enumeration_time = Some(enumeration_time.as_micros());
        cur_stats.solver_time = Some(duration.as_micros());
        cur_stats.typegen_time = Some(type_gen_time.as_micros());
        cur_stats.result = Some(format!("{:?}", result));
        cur_stats.program_gen_time = Some(type_gen_time.as_micros() + gen_duration.as_micros());

        let processing_start = Instant::now();
        if !matches!(result, SatResult::Unknown) {
            program_generator.process_batch(
                matches!(result, SatResult::Unsat),
                Oracle::Z3,
                batchsize,
            );
        }
        let processing_time = processing_start.elapsed();
        cur_stats.processing_time = Some(processing_time.as_micros());

        let total_time = total.elapsed() + gen_duration;
        cur_stats.total_time = Some(total_time.as_micros());
        program_generator.get_match_statistics(&mut cur_stats);

        z3stats.push(cur_stats);
    }
    cur_count
}

fn run_prog<
    T: Type
        + Clone
        + PartialEq
        + Ord
        + PartialOrd
        + Eq
        + Debug
        + Hash
        + Display
        + Sync
        + 'static
        + Send,
>(
    args: &TypeContextArgs,
    match_args: &MatchArgs,
    stats: &mut Vec<ConstructionStatistics>,
) {
    let total_time = Instant::now();
    let seed = thread_rng().gen();
    //println!("using seed: {}", seed);
    let rng = ChaCha8Rng::seed_from_u64(seed);
    let mut correct_rng = ChaCha8Rng::seed_from_u64(seed);
    let correct = correct_rng.gen_bool(0.5);
    let mut program_generator: ProgramGenerator<T> =
        ProgramGenerator::new(args, rng, Some(match_args.clone()), None, correct);
    let batchsize = if T::get_compiler_name() == "javac" {
        1
    } else {
        32
    };

    let mut cur_stats = ConstructionStatistics::new();

    let type_gen_start = Instant::now();
    program_generator.generate_types();
    let type_gen_time = type_gen_start.elapsed();

    let match_start = Instant::now();
    program_generator.generate_match();
    let match_time = match_start.elapsed();
    //save_file(program_generator.output_prog(), Oracle::Construction);
    //return;
    cur_stats.typegen_time = Some(type_gen_time.as_micros());
    cur_stats.match_gen_time = Some(match_time.as_micros());
    cur_stats.correct = Some(correct);
    cur_stats.program_gen_time = Some(type_gen_time.as_micros() + match_time.as_micros());

    //println!("{}", program_generator.output_prog());
    let processing_start = Instant::now();
    program_generator.process_batch(
        program_generator.removed_pattern.is_none(),
        Oracle::Construction,
        batchsize,
    );
    let processing_time = processing_start.elapsed();
    cur_stats.processing_time = Some(processing_time.as_micros());

    let total = total_time.elapsed();
    cur_stats.total_time = Some(total.as_micros());
    program_generator.get_match_statistics(&mut cur_stats);
    stats.push(cur_stats);
}

fn run_prog_mutate<
    T: Type
        + Clone
        + PartialEq
        + Ord
        + PartialOrd
        + Eq
        + Debug
        + Hash
        + Display
        + Sync
        + 'static
        + Send,
>(
    args: &TypeContextArgs,
    match_args: &RandomMatchArgs,
    prog_count: &mut u32,
) -> u32 {
    let seed = thread_rng().gen();
    //println!("using seed: {}", seed);
    let rng = ChaCha8Rng::seed_from_u64(seed);
    let mut program_generator: ProgramGenerator<T> =
        ProgramGenerator::new(args, rng, None, Some(match_args.clone()), false);

    program_generator.generate_types();

    program_generator.generate_cases();
    println!("Generated Cases");
    let batchsize = if T::get_compiler_name() == "javac" {
        1
    } else {
        32
    };
    let mut cur_count = 0;
    while program_generator.generate_z3().is_some() {
        let match_statement = program_generator.match_statements.get(1).unwrap();
        let Statement::Decl(Declaration::Var(VarDecl {
            name: _,
            typ_annotation: _,
            typ: _,
            exp,
        })) = match_statement;

        if let Expression::Match(matchexp) = exp {
            if matchexp.cases.len() > 70 {
                continue;
            }
        }

        *prog_count += 1;
        cur_count += 1;
        let (result, _) = program_generator.check_z3();

        if !matches!(result, SatResult::Unknown) {
            program_generator.process_batch(
                matches!(result, SatResult::Unsat),
                Oracle::Mutation,
                batchsize,
            );
            println!("Begin mutating...");
            let num_progs = program_generator.mutate(&result, batchsize);
            println!("Finished mutating");
            *prog_count += num_progs;
            cur_count += num_progs;
        }
    }
    cur_count
}
