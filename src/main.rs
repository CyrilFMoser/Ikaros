use generators::typegen::TypeGenerator;
use generators::typegen_args::TypeContextArgs;
use rand::{thread_rng, Rng, SeedableRng};
use rand_chacha::ChaCha8Rng;
use types::languages::scala::scala_type::ScalaType;
mod generators;
mod types;
fn main() {
    let args = TypeContextArgs {
        max_num_bases: 2,
        max_num_base_cases: 5,
        max_num_base_typargs: 2,
        max_type_depth: 2,
        max_num_params: 4,
        contravariance_prob: 0.1,
        covariance_prob: 0.1,
        base_instantiation_prob: 0.3,
        use_same_instantiation_prob: 0.7,
        use_prelude_type_prob: 0.2,
        instantiate_existing_complex_type_prob: 0.1,
        add_additional_typarg_case_prob: 0.05,
    };

    let mut seed = thread_rng().gen();
    println!("using seed: {}", seed);
    let rng = ChaCha8Rng::seed_from_u64(seed);
    let mut generator: TypeGenerator<ScalaType> = TypeGenerator::new(args.clone(), rng);
    generator.generate_bases();
    println!("{}", generator.declarations_to_string());
}
