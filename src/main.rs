use crate::types::type_trait::Type;
use crate::{
    generators::{matchgen_args::MatchArgs, programgen::ProgramGenerator},
    types::languages::haskell::haskell_type::HaskellType,
};
use generators::random_matchgen_args::RandomMatchArgs;
use generators::typegen::TypeGenerator;
use generators::typegen_args::TypeContextArgs;
use matches::expression::Expression;
use matches::statements::{Declaration, Statement, VarDecl};
use rand::{thread_rng, Rng, SeedableRng};
use rand_chacha::ChaCha8Rng;
use statistics::constructionstats::ConstructionStatistics;
use statistics::z3stats::Z3Statistics;
use std::collections::HashMap;
use std::fmt::{Debug, Display};
use std::fs::File;
use std::hash::Hash;
use std::path::Path;
use std::time::Instant;
use types::languages::java::java_type::JavaType;
use types::languages::scala::scala_type::ScalaType;
use paths::{
    get_more_stats_file,
    prepare_paths,
};
use clap::{Parser, ValueEnum};
use z3::SatResult;
mod generators;
mod matches;
mod mutate;
mod reduction;
mod statistics;
mod types;
mod paths;


#[derive(Parser, Debug, Clone)]
#[command(author, version, about)]
struct Args {
    /// trategy used to generate pattern-matching expressions and
    /// establish the test oracle.
    ///
    /// * construction: Refers to refinement-based pattern generation.
    ///
    /// * z3: Refers to random pattern generation using Z3 as the test oracle.
    ///
    /// * mutation: Uses semantic mutations to derive new programs from
    /// existing ones.
    #[arg(short, long)]
    pattern_gen: Oracle,

    /// Target programming language for the generated programs.
    #[arg(short, long)]
    language: Language,

    /// Total number of programs to generate.
    ///
    /// If not specified, Ikaros will continue generating programs indefinitely.
    #[arg(short, long)]
    iterations: Option<usize>,

    /// Number of programs per batch sent to the compiler under test.
    #[arg(short, long, default_value_t = 10)]
    batch_size: usize,

    /// If provided, Ikaros also checks for false positives in redundancy
    /// diagnostics.
    #[arg(short, long, default_value_t = false)]
    redundancy: bool,

    /// If provided, Ikaros attempts to minimize bug-triggering programs via
    /// reduction.
    #[arg(long, default_value_t = false)]
    reduce: bool,
}

#[derive(ValueEnum, Debug, Clone)]
pub enum Language {
    Haskell,
    Scala,
    Java,
}

#[derive(ValueEnum, Debug, Clone)]
pub enum Oracle {
    Z3,
    Construction,
    Mutation,
}

fn main() {
    let args = Args::parse();

    let cli_args = args.clone();
    let oracle = args.pattern_gen;
    let language = args.language;

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
        max_refine_depth: 4,
        max_to_match_depth: 0,
        const_refine_prob: 0.2,
    };
    let scala_args_z3 = TypeContextArgs {
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
        add_additional_typarg_case_prob: 0.05,
        tuple_prob: 0.1,
    };
    let random_match_args = RandomMatchArgs {
        level_prob: 0.7,
        max_refine_depth: 4, //5
    };
    let haskell_args = TypeContextArgs {
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
        add_additional_typarg_case_prob: 0.,
        tuple_prob: 0.1,
    };
    let haskell_match_args = MatchArgs {
        level_prob: 0.7,
        refine_prob: 0.7,
        primitive_prob: 0.1,
        max_refine_depth: 4,
        max_to_match_depth: 0,
        const_refine_prob: 0.2,
    };
    let haskell_args_z3 = TypeContextArgs {
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
        tuple_prob: 0.1,
    };
    let java_args_z3 = TypeContextArgs {
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
        refine_prob: 0.7,
        primitive_prob: 0.1,
        max_refine_depth: 4,
        max_to_match_depth: 0,
        const_refine_prob: 0.,
    };

    let mut unknown_count = 0;
    let mut unsat_count = 0;
    let mut sat_count = 0;

    prepare_paths(&language, &oracle);

    let mut file_map_scala = HashMap::new();
    let mut file_map_haskell = HashMap::new();
    let mut file_map_java = HashMap::new();

    let mut z3_stats = Vec::new();
    let mut construction_stats = Vec::new();

    let mut prog_count = 0;

    loop {
        let _ = match language {
            Language::Haskell => {
                if matches!(oracle, Oracle::Construction) {
                    run_prog::<HaskellType>(
                        &haskell_args,
                        &haskell_match_args,
                        &mut construction_stats,
                        &mut file_map_haskell,
                        &cli_args,
                    );
                    prog_count += 1;
                    1
                } else if matches!(oracle, Oracle::Mutation) {
                    run_prog_mutate::<HaskellType>(
                        &haskell_args_z3,
                        &random_match_args,
                        &mut prog_count,
                        &mut file_map_haskell,
                        &cli_args,
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
                        &mut file_map_haskell,
                        &cli_args,
                    )
                }
            }
            Language::Scala => {
                if matches!(oracle, Oracle::Construction) {
                    run_prog::<ScalaType>(
                        &scala_args,
                        &scala_match_args,
                        &mut construction_stats,
                        &mut file_map_scala,
                        &cli_args,
                    );
                    prog_count += 1;
                    1
                } else if matches!(oracle, Oracle::Mutation) {
                    run_prog_mutate::<ScalaType>(
                        &scala_args_z3,
                        &random_match_args,
                        &mut prog_count,
                        &mut file_map_scala,
                        &cli_args,
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
                        &mut file_map_scala,
                        &cli_args,
                    )
                }
            }
            Language::Java => {
                if matches!(oracle, Oracle::Construction) {
                    run_prog::<JavaType>(
                        &java_args,
                        &java_match_args,
                        &mut construction_stats,
                        &mut file_map_java,
                        &cli_args,
                    );
                    prog_count += 1;
                    1
                } else if matches!(oracle, Oracle::Mutation) {
                    run_prog_mutate::<JavaType>(
                        &java_args_z3,
                        &random_match_args,
                        &mut prog_count,
                        &mut file_map_java,
                        &cli_args,
                    )
                } else {
                    run_prog_z3::<JavaType>(
                        &java_args_z3,
                        &random_match_args,
                        &mut unknown_count,
                        &mut prog_count,
                        &mut unsat_count,
                        &mut sat_count,
                        &mut z3_stats,
                        &mut file_map_java,
                        &cli_args,
                    )
                }
            }
        };
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
        let stats_file = get_more_stats_file(&language, &oracle);
        if !Path::new(&stats_file).exists() {
            File::create(&stats_file).unwrap();
        }
        let mut writer = csv::Writer::from_path(stats_file).unwrap();
        if matches!(oracle, Oracle::Z3) {
            for stat in &z3_stats {
                writer.serialize(stat).unwrap();
            }
        } else {
            for stat in &construction_stats {
                writer.serialize(stat).unwrap();
            }
        }
        writer.flush().unwrap();
        if let Some(n) = args.iterations {
            if prog_count as usize >= n {
                break;
            }
        }
    }
}


type FileMap<LangTyp> = HashMap<String, (TypeGenerator<LangTyp>, Vec<Statement<LangTyp>>)>;


impl Oracle {
    fn to_string(&self) -> String {
        match self {
            Oracle::Construction => "Construction".to_string(),
            Oracle::Mutation => "Mutation".to_string(),
            Oracle::Z3 => "Z3".to_string(),
        }
    }
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
    file_map: &mut FileMap<T>,
    cli_args: &Args,
) -> u32 {
    let seed = thread_rng().gen();
    //seed = 6295501894041247234;
    //seed = 7409235621545235445; scala performance bug
    //seed = 1436571824521298399; // java seed 2
    //seed = 10149628916913093765; // java seed
    //seed = 5640078996971350470;
    //seed = 7029476259678759020; // type construction seed (reduction)
    //seed = 7885844270095127252; // pattern construction seed (reduction)
    println!("using seed: {}", seed);
    let rng = ChaCha8Rng::seed_from_u64(seed);
    let mut program_generator: ProgramGenerator<T> =
        ProgramGenerator::new(args, rng, None, Some(match_args.clone()), false, file_map, cli_args.redundancy, cli_args.reduce);

    let type_gen_start = Instant::now();
    program_generator.generate_types();
    let type_gen_time = type_gen_start.elapsed();

    let enumeration_start = Instant::now();
    program_generator.generate_cases();
    let enumeration_time = enumeration_start.elapsed();
    let batchsize = if T::get_compiler_name() == "javac" {
        1
    } else {
        cli_args.batch_size
    };
    let mut cur_count = 0;
    while let Some(gen_duration) = program_generator.generate_z3() {
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
    file_map: &mut FileMap<T>,
    cli_args: &Args,
) {
    let total_time = Instant::now();
    let seed = thread_rng().gen();
    //println!("using seed: {}", seed);
    let rng = ChaCha8Rng::seed_from_u64(seed);
    let mut correct_rng = ChaCha8Rng::seed_from_u64(seed);
    let correct = correct_rng.gen_bool(0.5);
    let mut program_generator: ProgramGenerator<T> =
        ProgramGenerator::new(args, rng, Some(match_args.clone()), None, correct, file_map, cli_args.redundancy, cli_args.reduce);
    let batchsize = if T::get_compiler_name() == "javac" {
        1
    } else {
        cli_args.batch_size
    };

    let mut cur_stats = ConstructionStatistics::new();

    let type_gen_start = Instant::now();
    program_generator.generate_types();
    let type_gen_time = type_gen_start.elapsed();

    let match_start = Instant::now();
    program_generator.generate_match();
    let match_time = match_start.elapsed();
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
    file_map: &mut FileMap<T>,
    cli_args: &Args,
) -> u32 {
    let seed = thread_rng().gen();
    //seed = 10394945786380950586;
    println!("using seed: {}", seed);
    let rng = ChaCha8Rng::seed_from_u64(seed);
    let mut program_generator: ProgramGenerator<T> =
        ProgramGenerator::new(args, rng, None, Some(match_args.clone()), false, file_map, cli_args.redundancy, cli_args.reduce);

    program_generator.generate_types();

    program_generator.generate_cases();
    println!("Generated Cases");
    let batchsize = if T::get_compiler_name() == "javac" {
        1
    } else {
        cli_args.batch_size
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
