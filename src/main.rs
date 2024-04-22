use generators::typegen::TypeGenerator;
use generators::typegen_args::TypeContextArgs;
use rand::SeedableRng;
use rand_chacha::ChaCha8Rng;
use types::languages::scala::scala_type::ScalaType;
mod generators;
mod types;
fn main() {
    let rng = ChaCha8Rng::from_entropy();
    let args = TypeContextArgs {
        max_num_bases: 2,
        max_num_base_cases: 6,
        max_num_base_typargs: 3,
        max_type_depth: 2,
        contravariance_prob: 0.1,
        covariance_prob: 0.1,
        base_instantiation_prob: 0.3,
        use_same_instantiation_prob: 0.4,
        use_prelude_type_prob: 0.2,
        instantiate_existing_complex_type_prob: 0.1,
    };
    let mut generator: TypeGenerator<ScalaType> = TypeGenerator::new(args, rng);
    generator.generate_bases();
}
