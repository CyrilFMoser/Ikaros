use serde::Serialize;

use crate::{
    generators::typegen::TypeGenerator,
    matches::statements::Statement,
    reduction::{restructer::Restructer, tester::TestResult},
    types::type_trait::Type,
};
use core::fmt::Debug;
use std::{
    cmp::{max, min},
    collections::{HashSet, VecDeque},
    fmt::Display,
    fs::OpenOptions,
    hash::Hash,
    io::Seek,
    time::{Duration, Instant},
};

use super::{change::Change, hierarchy::Hierarchy};
#[derive(Serialize, Debug)]
struct ReductionStats {
    pub original_total_changes: usize,
    pub original_num_types: usize,
    pub original_num_params: usize,
    pub original_num_generics: usize,
    pub original_num_patterns: usize,
    pub original_num_nested_patterns: usize,
    pub reduced_total_changes: usize,
    pub reduced_num_types: usize,
    pub reduced_num_params: usize,
    pub reduced_num_generics: usize,
    pub reduced_num_patterns: usize,
    pub reduced_num_nested_patterns: usize,
    pub time: usize,
}
pub struct Reducer<
    LangTyp: Type
        + Clone
        + PartialEq
        + Debug
        + Ord
        + PartialOrd
        + Eq
        + Hash
        + Display
        + Sync
        + Send
        + 'static,
> {
    pub file_name: String,
    pub folder_path: String,
    pub exhaustive: bool,
    #[allow(dead_code)]
    pub type_gen: TypeGenerator<LangTyp>,
    #[allow(dead_code)]
    pub match_statements: Vec<Statement<LangTyp>>,
    pub hierarchy: Hierarchy<LangTyp>,
}

impl<
        LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
    > Reducer<LangTyp>
{
    pub fn new(
        file_name: String,
        folder_path: String,
        exhaustive: bool,
        type_gen: TypeGenerator<LangTyp>,
        match_statements: Vec<Statement<LangTyp>>,
    ) -> Reducer<LangTyp> {
        let hierarchy = Hierarchy::new(&type_gen, &match_statements);
        Reducer {
            file_name,
            folder_path,
            exhaustive,
            type_gen,
            match_statements,
            hierarchy,
        }
    }

    fn get_stats(
        &self,
        used_changes: &HashSet<usize>,
    ) -> (usize, usize, usize, usize, usize, usize) {
        let used_changes = self.hierarchy.remove_orphans(used_changes.clone());

        let total_changes = used_changes.len();
        let num_patterns = used_changes
            .iter()
            .filter(|u| {
                matches!(
                    *self.hierarchy.changes.get(**u).unwrap(),
                    Change::AddPattern(_, _)
                )
            })
            .count();
        let num_types = used_changes
            .iter()
            .filter(|u| self.hierarchy.changes.get(**u).unwrap().is_root_type())
            .count();
        let (num_params, num_generics) = used_changes
            .iter()
            .filter_map(|u| {
                let change = self.hierarchy.changes.get(*u).unwrap();
                match change {
                    Change::AddGeneric(_, _) => Some((0, 1)),
                    Change::AddParameter(_, _, _) => Some((1, 0)),
                    _ => None,
                }
            })
            .fold((0, 0), |mut acc, cur| {
                acc.0 += cur.0;
                acc.1 += cur.1;
                acc
            });
        let num_nested_patterns = used_changes
            .iter()
            .filter(|u| {
                matches!(
                    self.hierarchy.changes.get(**u).unwrap(),
                    Change::AddPattern(_, _) | Change::ExpandParam(_, _)
                )
            })
            .count();
        (
            total_changes,
            num_types,
            num_params,
            num_generics,
            num_patterns,
            num_nested_patterns,
        )
    }
    fn save_stats(
        &self,
        prev_stats: (usize, usize, usize, usize, usize, usize),
        new_stats: (usize, usize, usize, usize, usize, usize),
        time: Duration,
    ) {
        let stats = ReductionStats {
            original_total_changes: prev_stats.0,
            original_num_types: prev_stats.1,
            original_num_params: prev_stats.2,
            original_num_generics: prev_stats.3,
            original_num_patterns: prev_stats.4,
            original_num_nested_patterns: prev_stats.5,
            reduced_total_changes: new_stats.0,
            reduced_num_types: new_stats.1,
            reduced_num_params: new_stats.2,
            reduced_num_generics: new_stats.3,
            reduced_num_patterns: new_stats.4,
            reduced_num_nested_patterns: new_stats.5,
            time: time.as_secs() as usize,
        };

        let mut path = self.folder_path.clone();
        let mut folder_count = 0;
        while let Some(c) = path.pop() {
            if c == '/' {
                folder_count += 1;
            }
            if folder_count == 3 {
                break;
            }
        }
        path = format!("{path}/reduction_stats.csv");
        let mut file = OpenOptions::new()
            .append(true)
            .create(true)
            .open(path)
            .unwrap();

        let needs_headers = file.seek(std::io::SeekFrom::End(0)).unwrap() == 0;

        let mut wtr = csv::WriterBuilder::new()
            .has_headers(needs_headers)
            .from_writer(file);

        wtr.serialize(stats).unwrap();
        wtr.flush().unwrap();
    }

    pub fn reduce(&mut self) -> Option<String> {
        let prev_stats = self.get_stats(&(0..self.hierarchy.changes.len()).collect());
        let reduce_start = Instant::now();
        let used_changes: HashSet<usize> = self.hdd();
        let reduction_time = reduce_start.elapsed();
        let new_stats = self.get_stats(&used_changes);

        self.save_stats(prev_stats, new_stats, reduction_time);

        let restructer = Restructer::new(&self.hierarchy, &used_changes);
        if let Ok(prog) = restructer.restruct() {
            Some(prog.output_prog())
        } else {
            None
        }
    }

    fn hdd(&mut self) -> HashSet<usize> {
        let mut final_set: HashSet<usize> = (0..self.hierarchy.changes.len()).collect();

        let mut n_changes = self.hierarchy.changes.len();

        loop {
            for typ in [false, true] {
                let mut cur_changes: HashSet<usize> = (if typ {
                    &self.hierarchy.type_levels
                } else {
                    &self.hierarchy.pattern_levels
                })
                .first()
                .unwrap()
                .clone()
                .into_iter()
                .collect();

                let max_level = if typ {
                    self.hierarchy.type_levels.len()
                } else {
                    self.hierarchy.pattern_levels.len()
                };

                let is_typ = |id: usize| id < self.hierarchy.num_type_changes;

                let previous_final_set = final_set.clone();

                let final_vec: Vec<usize> = final_set.clone().into_iter().collect();
                final_set = if typ {
                    // only need patterns for the type reduction
                    final_vec.into_iter().filter(|id| !is_typ(*id)).collect()
                } else {
                    // only need types for the pattern reduction
                    final_vec.into_iter().filter(|id| is_typ(*id)).collect()
                };

                for level in 0..max_level {
                    let mut cur_level_set = HashSet::new();

                    let cur_vec = if typ {
                        self.hierarchy.type_levels.get(level).unwrap()
                    } else {
                        self.hierarchy.pattern_levels.get(level).unwrap()
                    };
                    for id in cur_vec {
                        if cur_changes.contains(id) && previous_final_set.contains(id) {
                            cur_level_set.insert(*id);
                        }
                    }

                    cur_level_set = self.dd_min(cur_level_set, &final_set, 2);

                    for change in &cur_level_set {
                        final_set.insert(*change);
                    }

                    cur_changes = self.hierarchy.get_direct_children(&cur_level_set);

                    let mut to_remove = HashSet::new();
                    for id in &cur_changes {
                        if !previous_final_set.contains(id) {
                            to_remove.insert(*id);
                        }
                    }
                    for id in to_remove {
                        cur_changes.remove(&id);
                    }

                    if cur_changes.is_empty() {
                        //println!("Quitting at level {level} \n-----------------------------------");
                        break;
                    }
                    //println!("Finished level: {level}");
                }
            }
            if final_set.len() == n_changes {
                break;
            }
            n_changes = final_set.len();
            //println!("Going again with {n_changes} #changes");
        }

        // checks each root individually
        let old_final_set = final_set.clone();
        let empty_set = HashSet::new();
        for i in old_final_set {
            let cur_change = self.hierarchy.changes.get(i).unwrap();
            if cur_change.is_root_type() || matches!(cur_change, Change::AddPattern(_, _)) {
                final_set.remove(&i);
                let result = self.test(&empty_set, &final_set);
                //println!("Tried to remove {cur_change}, test result was: {result}");
                if !matches!(result, TestResult::Bug) {
                    final_set.insert(i);
                }
            }
        }

        final_set
    }

    fn dd_min(
        &mut self,
        used_changes: HashSet<usize>,
        final_set: &HashSet<usize>,
        n: usize,
    ) -> HashSet<usize> {
        //println!("Calling dd_min");
        if used_changes.len() < n {
            if used_changes.len() > 2 {
                return used_changes;
            }

            for change in &used_changes {
                let mut delta = HashSet::new();

                delta.insert(*change);

                let test = self.test(&delta, final_set);
                if matches!(test, TestResult::Bug) {
                    return delta;
                }
            }

            return used_changes;
        }
        let delta_i_size = used_changes.len() / n;

        let mut deltas = Vec::new();
        let mut change_queue: VecDeque<usize> = used_changes.clone().into_iter().collect();
        for i in 0..n {
            let mut delta_i = HashSet::new();

            let mut front = false;
            while delta_i.len() < delta_i_size || i == n - 1 && !change_queue.is_empty() {
                let cur_change = if front {
                    change_queue.pop_front().unwrap()
                } else {
                    change_queue.pop_back().unwrap()
                };
                front = !front;
                delta_i.insert(cur_change);
            }

            let test_result = self.test(&delta_i, final_set);
            if matches!(test_result, TestResult::Bug) {
                //self.print_changes(&delta_i);
                return self.dd_min(delta_i, final_set, 2); // reduce to subset
            }
            deltas.push(delta_i);
        }

        for i in 0..n {
            let delta_i = deltas.get(i).unwrap();
            let nabla_i: HashSet<usize> = used_changes.difference(delta_i).cloned().collect();

            let test_result = self.test(&nabla_i, final_set);
            if matches!(test_result, TestResult::Bug) {
                //self.print_changes(&nabla_i);
                return self.dd_min(nabla_i, final_set, max(n - 1, 2)); // reduce to complement
            }
        }

        let used_changes_len = used_changes.len();
        if n < used_changes_len {
            return self.dd_min(used_changes, final_set, min(used_changes_len, 2 * n));
            // increase granularity
        }

        used_changes // done
    }

    #[allow(dead_code)]
    pub fn print_changes(&self, cur_changes: &HashSet<usize>) {
        let mut s = String::from("[");
        let mut count = 0;
        for change in 0..self.hierarchy.changes.len() {
            if !cur_changes.contains(&change) {
                continue;
            }
            s.push_str(format!("{}, ", self.hierarchy.changes.get(change).unwrap()).as_str());
            count += 1;
            if count == 3 {
                s.push('\n');
                count = 0;
            }
        }
        if !cur_changes.is_empty() {
            s.pop();
            s.pop();
        }
        s.push(']');
        println!("{s}\n");
    }
}
