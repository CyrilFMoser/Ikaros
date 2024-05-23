/// Arguments to be passed to a ```TypeGenerator``` to configure  it
/// # Fields
/// * `max_num_bases` : Maximal number of bases generated
/// * `max_num_base_typargs` : Maximal number of type arguments to be generated for a base
/// * `max_num_base_cases` : Maximal number of cases for a base
/// * `max_type_depth` : Maximal depth of a type
/// * `max_num_params` : Maximal number of parameters a type can take
/// * `contravariance_prob` : Probability to use a contravariant type argument in languages that support them
/// * `covariance_prob` : Probability to use a covariant type argument in languages that support them if we don't use a contravariant type argument
/// * `typarg_parameter_prob` : Probability to use a type variable of the type arguments as parameter of a variant
/// * `base_instantiation_prob` : Probability to instantiate a typarg of a base upon declaration
/// * `use_same_instantiation_prob` : Probability to use the same instantiation of a base as an already existing one
/// * `use_prelude_type` : Probability to use a "prelude type"
/// * `instantiate_existing_complex_type_prob` : Probability to instantiate a type argument of an existing complex type when generating a new type
/// * `add_additional_typarg_case_prob` : Probability to add an additional type argument to a case
/// * `tuple_prob` : Probability to generate a tuple as a type
#[derive(Clone)]
pub struct TypeContextArgs {
    pub max_num_bases: u32,
    pub max_num_base_typargs: u32,
    pub max_num_base_cases: u32,
    pub max_type_depth: u32,
    pub max_num_params: u32,
    pub contravariance_prob: f64,
    pub covariance_prob: f64,
    pub typarg_parameter_prob: f64,
    pub base_instantiation_prob: f64,
    pub use_same_instantiation_prob: f64,
    pub use_prelude_type_prob: f64,
    pub instantiate_existing_complex_type_prob: f64,
    pub add_additional_typarg_case_prob: f64,
    pub tuple_prob: f64,
}
