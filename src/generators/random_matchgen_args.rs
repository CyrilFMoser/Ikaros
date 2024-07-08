#[derive(Clone)]
/// # Fields
/// * `level_prob` - Probability to go up another step after each step up the graph hierarchy starting from a leaf node
/// * `max_refine_depth` - Maximal depth of refinement of patterns

pub struct RandomMatchArgs {
    pub level_prob: f64,
    pub max_refine_depth: u32,
}
