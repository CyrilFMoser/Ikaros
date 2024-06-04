use crate::types::type_trait::Type;
use crate::{
    generators::{matchgen_args::MatchArgs, programgen::ProgramGenerator},
    types::languages::haskell::haskell_type::HaskellType,
};
use generators::typegen_args::TypeContextArgs;
use rand::{thread_rng, Rng, SeedableRng};
use rand_chacha::ChaCha8Rng;
use std::fmt::{Debug, Display};
use std::hash::Hash;
use types::languages::java::java_type::JavaType;
use types::languages::scala::scala_type::ScalaType;
mod generators;
mod matches;
mod types;
fn main() {
    let scala_args = TypeContextArgs {
        max_num_bases: 2,
        max_num_base_cases: 10,
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
        tuple_prob: 0.2,
    };
    let scala_match_args = MatchArgs {
        level_prob: 1.,
        refine_prob: 1.,
        primitive_prob: 0.1,
        max_refine_depth: 4,
        max_to_match_depth: 0,
        const_refine_prob: 0.3,
    };
    let haskell_args = TypeContextArgs {
        max_num_bases: 4,
        max_num_base_cases: 10,
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
        tuple_prob: 0.2,
    };
    let haskell_match_args = MatchArgs {
        level_prob: 1.,
        refine_prob: 1.,
        primitive_prob: 0.1,
        max_refine_depth: 4,
        max_to_match_depth: 0,
        const_refine_prob: 1.,
    };
    let java_args = TypeContextArgs {
        max_num_bases: 2,
        max_num_base_cases: 10,
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
        refine_prob: 1.,
        primitive_prob: 0.1,
        max_refine_depth: 3,
        max_to_match_depth: 0,
        const_refine_prob: 0.,
    };
    let language = Language::Scala;
    let language = Language::Scala;
    match language {
        Language::Haskell => loop {
            run_prog::<HaskellType>(&haskell_args, &haskell_match_args);
        },
        Language::Scala => loop {
            run_prog::<ScalaType>(&scala_args, &scala_match_args);
        },
        Language::Java => loop {
            run_prog::<JavaType>(&java_args, &java_match_args);
        },
    }
}

pub enum Language {
    Haskell,
    Scala,
    Java,
}

fn run_prog<T: Type + Clone + PartialEq + Eq + Debug + Hash + Display>(
    args: &TypeContextArgs,
    match_args: &MatchArgs,
) {
    //seed = 2599488012242521526;
    //seed = 12107106770540003153;
    //seed = 3605882667415640841;
    let mut seed = thread_rng().gen();
    //seed = 5566234122338145180;
    println!("using seed: {}", seed);
    let rng = ChaCha8Rng::seed_from_u64(seed);
    let mut program_generator: ProgramGenerator<T> =
        ProgramGenerator::new(args, rng, match_args.clone(), true);
    program_generator.generate_types();
    program_generator.generate_match();
    println!("{}", program_generator.output_prog());
    //program_generator.process();
    program_generator.check_z3();
}
