use crate::types::type_trait::Type;
use crate::{
    generators::{matchgen_args::MatchArgs, programgen::ProgramGenerator},
    types::languages::haskell::haskell_type::HaskellType,
};
use generators::random_matchgen_args::RandomMatchArgs;
use generators::typegen_args::TypeContextArgs;
use rand::{thread_rng, Rng, SeedableRng};
use rand_chacha::ChaCha8Rng;
use std::fmt::{Debug, Display};
use std::fs::{remove_file, File};
use std::hash::Hash;
use std::io::{Read, Write};
use std::path::Path;
use types::languages::java::java_type::JavaType;
use types::languages::scala::scala_type::ScalaType;
use z3::SatResult;
mod generators;
mod matches;
mod types;
fn main() {
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
        level_prob: 1.,
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
    let scala_random_match_args = RandomMatchArgs {
        level_prob: 1.,
        max_refine_depth: 5,
    };
    let scala_match_args_z3 = MatchArgs {
        level_prob: 1.,
        refine_prob: 1.,
        primitive_prob: 0.1,
        max_refine_depth: 5,
        max_to_match_depth: 0,
        const_refine_prob: 0.,
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
        level_prob: 1.,
        refine_prob: 0.5,
        primitive_prob: 0.1,
        max_refine_depth: 4,
        max_to_match_depth: 0,
        const_refine_prob: 0.,
    };
    let language = Language::Scala;
    let oracle = Oracle::Z3;
    let mut unknown_count = 0;
    let mut unsat_count = 0;
    let mut sat_count = 0;
    let mut prog_count = 0;

    let max_round_count = 10000;
    for _ in 1..=max_round_count {
        println!("ROUND {prog_count}");
        match language {
            Language::Haskell => {
                run_prog::<HaskellType>(&haskell_args, &haskell_match_args);
            }
            Language::Scala => {
                if matches!(oracle, Oracle::Construction) {
                    run_prog::<ScalaType>(&scala_args, &scala_match_args);
                } else {
                    run_prog_z3::<ScalaType>(
                        &scala_args_z3,
                        &scala_random_match_args,
                        &mut unknown_count,
                        &mut prog_count,
                        &mut unsat_count,
                        &mut sat_count,
                    );
                }
            }
            Language::Java => {
                run_prog::<JavaType>(&java_args, &java_match_args);
            }
        }
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
    stats(&oracle, &language, &prog_count);
}

fn stats(oracle: &Oracle, language: &Language, prog_count: &u32) {
    let oracle_string = match oracle {
        Oracle::Construction => "Construction",
        Oracle::Z3 => "Z3",
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
    let mut f = File::open(&stats_file).unwrap();
    let mut count = String::new();
    f.read_to_string(&mut count).unwrap();
    let prev_value = if let Ok(num) = count.parse::<u32>() {
        num
    } else {
        0
    };
    let new_count = prev_value + *prog_count;

    remove_file(&stats_file).unwrap();
    let mut new_f = File::create(&stats_file).unwrap();

    new_f.write_all(new_count.to_string().as_bytes()).unwrap();
}

pub enum Language {
    Haskell,
    Scala,
    Java,
}

pub enum Oracle {
    Z3,
    Construction,
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
) {
    //seed = 12107106770540003153;
    //seed = 3605882667415640841;
    let mut seed = thread_rng().gen();
    //seed = 17929852193958145700;
    //seed = 1;
    //seed = 4;
    //seed = 5364058930333071908;
    println!("using seed: {}", seed);
    let rng = ChaCha8Rng::seed_from_u64(seed);
    let mut program_generator: ProgramGenerator<T> =
        ProgramGenerator::new(args, rng, None, Some(match_args.clone()), false);
    program_generator.generate_types();
    program_generator.generate_cases();

    while program_generator.generate_z3() {
        //println!("{}", program_generator.output_prog());
        let result = program_generator.check_z3();
        match result {
            SatResult::Sat => *sat_count += 1,
            SatResult::Unknown => *unknown_count += 1,
            SatResult::Unsat => *unsat_count += 1,
        }

        *prog_count += 1;
        if !matches!(result, SatResult::Unknown) {
            program_generator.process_batch(matches!(result, SatResult::Unsat), Oracle::Z3, 32);
        }
    }
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
) {
    //seed = 2599488012242521526;
    //seed = 12107106770540003153;
    //seed = 3605882667415640841;
    let mut seed = thread_rng().gen();
    println!("using seed: {}", seed);
    let rng = ChaCha8Rng::seed_from_u64(seed);
    let mut correct_rng = ChaCha8Rng::seed_from_u64(seed);
    let mut program_generator: ProgramGenerator<T> = ProgramGenerator::new(
        args,
        rng,
        Some(match_args.clone()),
        None,
        correct_rng.gen_bool(0.5),
    );
    program_generator.generate_types();
    program_generator.generate_match();
    println!("{}", program_generator.output_prog());
    program_generator.process();
}
