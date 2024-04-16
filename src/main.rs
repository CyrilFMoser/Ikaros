use contextgen::contextgenerator::{ContextArgs, ContextGenerator};
use rand::SeedableRng;
use rand_chacha::ChaCha8Rng;

mod contextgen;
mod ir;
fn main() {
    let rng = ChaCha8Rng::from_entropy();
    let args = ContextArgs {
        max_num_bases: 2,
        max_num_variants: 5,
        max_base_typargs: 2,
        max_variant_params: 4,
        max_param_depth: 2,
        primitive_prob: 0.4,
        typarg_prob: 0.2,
        recursive_prob: 0.3,
        recursive_instantiation_prob: 1.,
        base_instantiation_prob: 1.,
        instantiate_primitive_prob: 0.5,
    };
    let mut context_gen = ContextGenerator::new(args, rng);
    context_gen.generate();
    context_gen.print_ctxt();
}
