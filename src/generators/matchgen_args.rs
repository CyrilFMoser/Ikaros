#[derive(Clone)]
/// # Fields
/// * `level_prob` - Probability to go up another step after each step up the graph hierarchy starting from a leaf node
/// * `refine_prob` - Probability to refine at each step
/// * `primitive_prob` - Probability to use a primitive at max-depth for the variable to be matched against
/// * `const_refine_prob` - Probability to refine a pattern to a constant like Int => 1 and _
/// * `max_refine_depth` - Maximal depth of refinement
/// * `max_to_match_depth` - Maximal depth of type to be matched against
pub struct MatchArgs {
    pub level_prob: f64,
    pub refine_prob: f64,
    pub primitive_prob: f64,
    pub const_refine_prob: f64,
    pub max_refine_depth: u32,
    pub max_to_match_depth: u32,
}
