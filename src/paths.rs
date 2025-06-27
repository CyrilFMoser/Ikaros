use std::fs::{create_dir_all, remove_dir_all};

use crate::Oracle;
use crate::Language;


pub const PATH_PREFIX: &str = "out/Programs";
pub const EX_SUFFIX: &str = "exhaustiveness";
pub const RED_SUFFIX: &str = "redundancy";


fn language2str(language: &Language) -> String {
    let lang_string = match language {
        Language::Haskell => "ghc",
        Language::Java => "javac",
        Language::Scala => "scalac",
    };
    lang_string.to_string()
}

fn oracle2str(oracle: &Oracle) -> String {
    oracle.to_string()
}

pub fn get_more_stats_file(language: &Language, oracle: &Oracle) -> String {
    let compiler_string = language2str(language);
    let oracle_string = oracle2str(oracle);
    format!("{PATH_PREFIX}/{oracle_string}/{compiler_string}/more_stats.csv")
}

pub fn get_exhaustive_batch(language: &Language, oracle: &Oracle) -> String {
    let compiler_string = language2str(language);
    let oracle_string = oracle2str(oracle);
    format!("{PATH_PREFIX}/{oracle_string}/{compiler_string}/batches/exhaustive_batch")
}

pub fn get_inexhaustive_batch(language: &Language, oracle: &Oracle) -> String {
    let compiler_string = language2str(language);
    let oracle_string = oracle2str(oracle);
    format!("{PATH_PREFIX}/{oracle_string}/{compiler_string}/batches/inexhaustive_batch")
}

pub fn get_exhaustiveness_fp_bugs(language: &Language, oracle: &Oracle) -> String {
    let compiler_string = language2str(language);
    let oracle_string = oracle2str(oracle);
    format!("{PATH_PREFIX}/{oracle_string}/{compiler_string}/{EX_SUFFIX}/false_positive")
}

pub fn get_exhaustiveness_fn_bugs(language: &Language, oracle: &Oracle) -> String {
    let compiler_string = language2str(language);
    let oracle_string = oracle2str(oracle);
    format!("{PATH_PREFIX}/{oracle_string}/{compiler_string}/{EX_SUFFIX}/false_negative")
}


pub fn get_redundancy_fp_bugs(language: &Language, oracle: &Oracle) -> String {
    let compiler_string = language2str(language);
    let oracle_string = oracle2str(oracle);
    format!("{PATH_PREFIX}/{oracle_string}/{compiler_string}/{RED_SUFFIX}/false_positive")
}


pub fn prepare_paths(language: &Language, oracle: &Oracle) {
    for p in [
        get_exhaustive_batch(language, oracle),
        get_inexhaustive_batch(language, oracle),
        get_exhaustiveness_fn_bugs(language, oracle),
        get_exhaustiveness_fp_bugs(language, oracle),
        get_redundancy_fp_bugs(language, oracle),
    ] {
        match remove_dir_all(&p) {
            _ => ()
        };
        create_dir_all(p).unwrap();
    }
}
