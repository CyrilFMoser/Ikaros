use generators::typegen::TypeGenerator;
use generators::typegen_args::TypeContextArgs;
use rand::{thread_rng, Rng, SeedableRng};
use rand_chacha::ChaCha8Rng;
use types::languages::scala::scala_type::ScalaType;

use crate::generators::{matchgen_args::MatchArgs, programgen::ProgramGenerator};
mod generators;
mod matches;
mod types;
fn main() {
    let args = TypeContextArgs {
        max_num_bases: 2,
        max_num_base_cases: 8,
        max_num_base_typargs: 2,
        max_type_depth: 1,
        max_num_params: 4,
        contravariance_prob: 1.,
        covariance_prob: 0.2,
        base_instantiation_prob: 0.3,
        use_same_instantiation_prob: 0.7,
        use_prelude_type_prob: 0.2,
        instantiate_existing_complex_type_prob: 0.1,
        add_additional_typarg_case_prob: 0.05,
    };
    let match_args = MatchArgs {
        level_prob: 1.,
        refine_prob: 1.,
        primitive_prob: 0.1,
        max_refine_depth: 3,
        max_to_match_depth: 0,
    };
    loop {
        let mut seed = thread_rng().gen();
        seed = 12107106770540003153;
        println!("using seed: {}", seed);
        let rng = ChaCha8Rng::seed_from_u64(seed);
        let mut program_generator: ProgramGenerator<ScalaType> =
            ProgramGenerator::new(&args, rng, match_args.clone());
        program_generator.generate_types();
        program_generator.generate_match();
        println!("{}", program_generator.output_prog());
        break;
    }
}
