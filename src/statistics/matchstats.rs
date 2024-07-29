use std::time::Duration;

pub trait MatchStatistics {
    fn set_num_patterns(&mut self, x: u32);
    fn set_average_pattern_depth(&mut self, x: f32);
    fn set_variance_pattern_depth(&mut self, x: f32);
    fn set_max_pattern_depth(&mut self, x: u32);
    fn set_min_pattern_depth(&mut self, x: u32);
    fn set_processing_time(&mut self, x: Duration);
}
