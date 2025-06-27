
pub trait MatchStatistics {
    fn set_num_types(&mut self, x: u32);
    fn set_num_constructors(&mut self, x: u32);
    fn set_num_bases(&mut self, x: u32);
    fn set_num_gadts(&mut self, x: u32);
    fn set_num_constructor_params(&mut self, x: f32);
    fn set_num_generics(&mut self, x: u32);
    fn set_num_patterns(&mut self, x: u32);
    fn set_average_pattern_depth(&mut self, x: f32);
    fn set_variance_pattern_depth(&mut self, x: f32);
    fn set_max_pattern_depth(&mut self, x: u32);
    fn set_min_pattern_depth(&mut self, x: u32);
}
