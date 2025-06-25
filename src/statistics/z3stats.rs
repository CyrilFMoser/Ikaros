use std::time::Duration;

use z3::SatResult;

use super::matchstats::MatchStatistics;
use serde::Serialize;

#[derive(Default, Serialize)]
pub struct Z3Statistics {
    pub num_types: Option<u32>,
    pub num_constructors: Option<u32>,
    pub num_bases: Option<u32>,
    pub num_gadts: Option<u32>,
    pub num_constructor_params: Option<f32>,
    pub num_generics: Option<u32>,
    pub num_subpatterns: Option<u32>,
    pub num_patterns: Option<u32>,
    pub average_pattern_depth: Option<f32>,
    pub variance_pattern_depth: Option<f32>,
    pub max_pattern_depth: Option<u32>,
    pub min_pattern_depth: Option<u32>,
    pub enumeration_time: Option<u128>,
    pub typegen_time: Option<u128>,
    pub solver_time: Option<u128>,
    pub processing_time: Option<u128>,
    pub total_time: Option<u128>,
    pub program_gen_time: Option<u128>,

    pub result: Option<String>,
}

impl Z3Statistics {
    pub fn new() -> Z3Statistics {
        Z3Statistics::default()
    }
}

impl MatchStatistics for Z3Statistics {
    fn set_num_types(&mut self, x: u32) {
        self.num_types = Some(x);
    }

    fn set_num_constructors(&mut self, x: u32) {
        self.num_constructors = Some(x);
    }

    fn set_num_bases(&mut self, x: u32) {
        self.num_bases = Some(x);
    }

    fn set_num_gadts(&mut self, x: u32) {
        self.num_gadts = Some(x);
    }

    fn set_num_constructor_params(&mut self, x: f32) {
        self.num_constructor_params = Some(x);
    }

    fn set_num_generics(&mut self, x: u32) {
        self.num_generics = Some(x);
    }

    fn set_num_subpatterns(&mut self, x: u32) {
        self.num_subpatterns = Some(x);
    }

    fn set_processing_time(&mut self, x: Duration) {
        self.processing_time = Some(x.as_millis());
    }
    fn set_num_patterns(&mut self, x: u32) {
        self.num_patterns = Some(x);
    }
    fn set_average_pattern_depth(&mut self, x: f32) {
        self.average_pattern_depth = Some(x);
    }

    fn set_variance_pattern_depth(&mut self, x: f32) {
        self.variance_pattern_depth = Some(x);
    }

    fn set_max_pattern_depth(&mut self, x: u32) {
        self.max_pattern_depth = Some(x);
    }

    fn set_min_pattern_depth(&mut self, x: u32) {
        self.min_pattern_depth = Some(x);
    }
}
