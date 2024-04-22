/// Arguments to be passed to a ```TypeGenerator``` to configure  it
/// # Fields
/// * `max_num_bases` : maximal number of bases generated
/// * `max_num_base_typargs` : maximal number of type arguments to be generated for a base
/// * `max_num_base_cases` : maximal number of cases for a base
/// * `max_type_depth` : maximal depth of a type
/// * `contravariance_prob` : probability to use a contravariant type argument in languages that support them
/// * `covariance_prob` : probability to use a covariant type argument in languages that support them if we don't use a contravariant type argument
/// * `base_instantiation_prob` : probability to instantiate a typarg of a base upon declaration
/// * `use_same_instantiation_prob` : probability to use the same instantiation of a base as an already existing one
/// * `use_prelude_type` : probability to use a "prelude type"
/// * `instantiate_existing_complex_type_prob` : probability to instantiate a type argument of an existing complex type when generating a new type
pub struct TypeContextArgs {
    pub max_num_bases: u32,
    pub max_num_base_typargs: u32,
    pub max_num_base_cases: u32,
    pub max_type_depth: u32,
    pub contravariance_prob: f64,
    pub covariance_prob: f64,
    pub base_instantiation_prob: f64,
    pub use_same_instantiation_prob: f64,
    pub use_prelude_type_prob: f64,
    pub instantiate_existing_complex_type_prob: f64,
}
