use std::time::Duration;

use z3::SatResult;

use super::matchstats::MatchStatistics;
use serde::Serialize;

#[derive(Default, Serialize)]
pub struct Z3Statistics {
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
