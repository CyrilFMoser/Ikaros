use super::hierarchy::Hierarchy;
use super::restructed_prog::RestructedProgram;
use crate::generators::typegen::TypeGenerator;
use crate::matches::pattern::Pattern;
use crate::matches::pattern::Variant;
use crate::matches::pattern::WildCard;
use crate::reduction::change::Change;
use crate::types::languages::haskell::generic;
use crate::types::template::Template;
use crate::types::type_trait::Type;
use std::collections::HashMap;
use std::collections::HashSet;
use std::fmt::Debug;
use std::fmt::Display;
use std::hash::Hash;
pub struct Restructer<
    'a,
    LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
> {
    hierarchy: &'a Hierarchy<LangTyp>,
    used_changes: &'a HashSet<usize>,
}

pub struct Invalid {}

impl<
        'a,
        LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
    > Restructer<'a, LangTyp>
{
    pub fn new(
        hierarchy: &'a Hierarchy<LangTyp>,
        used_changes: &'a HashSet<usize>,
    ) -> Restructer<'a, LangTyp> {
        Restructer {
            hierarchy,
            used_changes,
        }
    }

    pub fn restruct(&self) -> Result<RestructedProgram<LangTyp>, Invalid> {
        let mut types = Vec::new();
        let mut param_positions = HashMap::new();
        let mut generic_positions = HashMap::new();
        let base_templates: Vec<Template<LangTyp>> = LangTyp::get_types()
            .iter()
            .filter(|t| t.0.is_base())
            .cloned()
            .collect();

        let base_template = base_templates.first().unwrap();

        let mut to_match_type_found = false;

        // build the type context
        for pos in 0..self.hierarchy.num_type_changes {
            if !self.used_changes.contains(&pos) {
                continue;
            }

            let cur_change = self.hierarchy.changes.get(pos).unwrap();

            let cur_typ = match cur_change {
                Change::AddBase(b) => {
                    let mut cur_base = base_template.clone().0;
                    cur_base.set_name(b.clone());
                    cur_base
                }
                Change::AddVariant(v, base) => {
                    let mut cur_variant = base_template
                        .0
                        .get_case_templates()
                        .unwrap()
                        .first()
                        .unwrap()
                        .clone()
                        .0;
                    cur_variant.get_bases_mut().unwrap().push(base.clone());
                    cur_variant.set_name(v.clone());
                    cur_variant
                }
                _ => continue,
            };
            let (mut new_typ, param_pos, generic_pos) =
                self.build_type(cur_typ, pos, &generic_positions, &param_positions)?;
            generic_positions.insert(new_typ.get_name().to_string(), generic_pos);
            param_positions.insert(new_typ.get_name().to_string(), param_pos);

            if !to_match_type_found && new_typ.get_name() == self.hierarchy.to_match_type.get_name()
            {
                to_match_type_found = true;
            }

            if new_typ.is_variant() {
                let mut used_generics = HashSet::new();

                if let Some(extends) = new_typ.get_bases_mut() {
                    for extend in extends {
                        if !generic_positions.contains_key(extend.get_name()) {
                            return Err(Invalid {});
                        }
                        Self::fix_type_generics(extend, &generic_positions);
                        for generic in TypeGenerator::get_generics(extend) {
                            used_generics.insert(generic);
                        }
                    }
                }

                let defined_generics = new_typ.get_typargs();
                if let Some(typargs) = defined_generics {
                    /*if let Some(params) = new_typ.get_params() {
                        for param in params {
                            for generic in TypeGenerator::get_generics(param) {
                                used_generics.insert(generic);
                            }
                        }
                    }*/

                    for typarg in typargs {
                        if !used_generics.contains(typarg) {
                            return Err(Invalid {}); // define an unused generic, messes everything up
                        }
                    }
                }
            }

            types.push(new_typ);
        }

        if !to_match_type_found {
            return Err(Invalid {});
        }

        // build the to_match_type

        let mut to_match_type = self.hierarchy.to_match_type.clone();

        to_match_type = Self::delete_generics(to_match_type, &generic_positions);

        if let Some(typargs) = to_match_type.get_typargs() {
            for typarg in typargs {
                if !Self::type_is_defined(typarg, &param_positions) {
                    return Err(Invalid {});
                }
            }
        }
        // build the pattern match

        println!("Building the pattern match");
        let mut patterns_and_pos = Vec::new();

        for pos in self.hierarchy.num_type_changes..self.hierarchy.changes.len() {
            if !self.used_changes.contains(&pos) {
                continue;
            }
            let cur_change = self.hierarchy.changes.get(pos).unwrap();

            if let Change::AddPattern(match_pos, pattern) = cur_change {
                let new_pattern_opt = self.build_pattern(pattern.clone(), pos, &param_positions);
                if let Some(new_pattern) = new_pattern_opt {
                    patterns_and_pos.push((new_pattern, *match_pos));
                }
            }
        }
        if patterns_and_pos.is_empty() {
            return Err(Invalid {});
        }

        patterns_and_pos.sort_by(|(_, pos1), (_, pos2)| pos1.cmp(pos2));

        let mut patterns = patterns_and_pos.into_iter().map(|(t, _)| t).collect();

        self.correct_patterns(&mut patterns, &generic_positions, &param_positions);

        Ok(RestructedProgram {
            to_match_type,
            types,
            patterns,
        })
    }

    fn correct_patterns(
        &self,
        patterns: &mut Vec<Pattern<LangTyp>>,
        generic_positions: &HashMap<String, HashSet<usize>>,
        parameter_positions: &HashMap<String, HashSet<usize>>,
    ) {
        for pattern in patterns {
            Self::correct_pattern(pattern, generic_positions, parameter_positions);
        }
    }

    fn correct_pattern(
        pattern: &mut Pattern<LangTyp>,
        generic_positions: &HashMap<String, HashSet<usize>>,
        param_positions: &HashMap<String, HashSet<usize>>,
    ) {
        let mut previous_type = pattern.get_actual_type();

        let typ_name = previous_type.get_name().to_string();

        Self::fix_type_generics(&mut previous_type, generic_positions);

        let param_pos = param_positions.get(&typ_name);
        if !previous_type.is_tuple() {
            if let Some(params) = previous_type.get_params_mut() {
                let n = params.len();
                for i in 0..n {
                    let par_pos = n - i - 1;
                    if param_pos.is_none() || !param_pos.unwrap().contains(&par_pos) {
                        params.remove(par_pos);
                    }
                }
            }
        }

        pattern.replace_type(previous_type);

        if let Pattern::Variant(v) = pattern {
            for pat in v.parameters.iter_mut() {
                Self::correct_pattern(pat, generic_positions, param_positions);
            }
        }
    }

    fn build_pattern(
        &self,
        mut cur_pattern: Pattern<LangTyp>,
        pos: usize,
        param_position: &HashMap<String, HashSet<usize>>,
    ) -> Option<Pattern<LangTyp>> {
        if let Pattern::Variant(v) = &cur_pattern {
            let name = v.typ.get_name();
            if !param_position.contains_key(name) {
                // a variant pattern of a type that is no longer defined
                // try deleting the pattern
                return None;
            }
        }

        if let Some(edges) = self.hierarchy.edges.get(&pos) {
            //println!("Entering here");
            let name = cur_pattern.get_actual_type().get_name().to_string();

            let mut set = HashSet::new();

            let valid_positions = if cur_pattern.get_actual_type().is_tuple() {
                set.insert(0);
                set.insert(1);
                &set
            } else {
                param_position.get(&name).unwrap_or(&set)
            };

            let mut patterns_and_pos = Vec::new();
            for child_id in edges {
                if !self.used_changes.contains(child_id) {
                    continue;
                }

                let cur_change = self.hierarchy.changes.get(*child_id).unwrap();

                let (expand_pos, param_pattern) = match cur_change {
                    Change::ExpandParam(p, pp) => (p, pp),
                    _ => panic!("Change pattern had something else than ExpandParam as a child"),
                };

                if !valid_positions.contains(expand_pos) {
                    continue;
                }

                let defined =
                    param_position.contains_key(param_pattern.get_actual_type().get_name());

                if matches!(param_pattern, Pattern::Variant(_)) && !defined {
                    continue;
                }

                let new_param_pattern_opt =
                    self.build_pattern(param_pattern.clone(), *child_id, param_position);
                if let Some(new_param_pattern) = new_param_pattern_opt {
                    patterns_and_pos.push((new_param_pattern, *expand_pos));
                }
            }
            patterns_and_pos.sort_by(|(_, p1), (_, p2)| p1.cmp(p2));

            let mut parameters = Vec::new();

            let cur_pattern_params_length =
                cur_pattern.get_actual_type().get_params().unwrap().len();
            for cur_pos in 0..cur_pattern_params_length {
                if !valid_positions.contains(&cur_pos) {
                    continue;
                }
                let new_pattern = if let Some((pattern, _)) =
                    patterns_and_pos.iter().find(|(_, pos)| *pos == cur_pos)
                {
                    pattern.clone()
                } else {
                    let typ = cur_pattern
                        .get_actual_type()
                        .get_params()
                        .unwrap()
                        .get(cur_pos)
                        .unwrap()
                        .clone();
                    Pattern::WildCard(WildCard {
                        typ,
                        annotate: false,
                    })
                };

                parameters.push(new_pattern);
            }

            let mut new_typ = cur_pattern.get_actual_type();
            if let Some(parameters_typ) = new_typ.get_params_mut() {
                let n = parameters_typ.len();
                for p in 0..n {
                    if !valid_positions.contains(&p) {
                        parameters_typ.remove(n - 1 - p);
                    }
                }
            }

            cur_pattern = match cur_pattern {
                Pattern::Tuple(_, _) => Pattern::Tuple(
                    Box::new(parameters.first().unwrap().clone()),
                    Box::new(parameters.get(1).unwrap().clone()),
                ),
                Pattern::Variant(v) => {
                    let mut new_v = v.clone();
                    new_v.parameters = parameters;
                    new_v.typ = new_typ;
                    Pattern::Variant(new_v)
                }
                _ => panic!("This type of pattern should not have any children"),
            }
        } else if let Pattern::Variant(v) = &cur_pattern {
            let name = v.typ.get_name();
            let n = v.typ.get_params().unwrap().len();
            let mut v = v.clone();
            for i in 0..n {
                if let Some(valid_pos) = param_position.get(name) {
                    if !valid_pos.contains(&(n - 1 - i)) {
                        v.parameters.remove(n - 1 - i);
                        v.typ.get_params_mut().unwrap().remove(n - 1 - i);
                        /*println!(
                            "REMOVING type: {typ} and pattern: {} from {}",
                            LangTyp::pattern_to_string(&pattern),
                            LangTyp::pattern_to_string(&cur_pattern)
                        );*/
                    }
                }
            }
            cur_pattern = Pattern::Variant(v);
            /*println!(
                "Ended up with pattern: {}",
                LangTyp::pattern_to_string(&cur_pattern)
            )*/
        }
        /*if !Self::type_is_defined(&cur_pattern.get_actual_type(), param_position) {
            return Err(Invalid {});
        }*/
        Some(cur_pattern)
    }

    fn build_type(
        &self,
        mut cur_typ: LangTyp,
        pos: usize,
        generic_positions: &HashMap<String, HashSet<usize>>,
        parameter_positions: &HashMap<String, HashSet<usize>>,
    ) -> Result<(LangTyp, HashSet<usize>, HashSet<usize>), Invalid> {
        let mut params_pos = HashSet::new();
        let mut generic_pos = HashSet::new();

        if let Some(edges) = self.hierarchy.edges.get(&pos) {
            let mut typargs = Vec::new();
            let mut parameters = Vec::new();

            for child_id in edges {
                if !self.used_changes.contains(child_id) {
                    continue;
                }

                let child_change = self.hierarchy.changes.get(*child_id).unwrap();
                match child_change {
                    Change::AddVariant(_, _) | Change::AddBase(_) => {
                        panic!("Root type changes cannot be children of other changes")
                    }
                    Change::AddGeneric(generic_pos, typ) => {
                        let (generic_typ, _, _) = self.build_type(
                            typ.clone(),
                            *child_id,
                            generic_positions,
                            parameter_positions,
                        )?;
                        typargs.push((generic_typ, *generic_pos))
                    }
                    Change::AddParameter(param_pos, param_name, typ) => {
                        let (param_typ, _, _) = self.build_type(
                            typ.clone(),
                            *child_id,
                            generic_positions,
                            parameter_positions,
                        )?;
                        parameters.push((param_typ, *param_pos, param_name.clone()))
                    }
                    Change::AddExtends(typ) => {
                        if let Some(bases) = cur_typ.get_bases_mut() {
                            let (base_typ, _, _) = self.build_type(
                                typ.clone(),
                                *child_id,
                                generic_positions,
                                parameter_positions,
                            )?;
                            bases.push(base_typ);
                        }
                    }
                    _ => panic!("Pattern change is a child of a type change"),
                }
            }

            typargs.sort_by(|(_, p1), (_, p2)| p1.cmp(p2));
            parameters.sort_by(|(_, p1, _), (_, p2, _)| p1.cmp(p2));

            let cur_set = parameter_positions.get(cur_typ.get_name());
            for (_, param_position, _) in &parameters {
                if cur_set.is_none() || cur_set.unwrap().contains(param_position) {
                    params_pos.insert(*param_position);
                }
            }

            let cur_set = generic_positions.get(cur_typ.get_name());

            for (_, gen_pos) in &typargs {
                if cur_set.is_none() || cur_set.unwrap().contains(gen_pos) {
                    generic_pos.insert(*gen_pos);
                }
            }

            if let Some(params) = cur_typ.get_params_mut() {
                *params = parameters.into_iter().map(|(t, _, _)| t).collect();
            }

            if let Some(generics) = cur_typ.get_typargs_mut() {
                *generics = typargs.into_iter().map(|(t, _)| t).collect();
            }

            // check that no undefined generics or types are used
            if let (Some(params), Some(generics)) = (cur_typ.get_params(), cur_typ.get_typargs()) {
                for param in params
                    .iter()
                    .chain(cur_typ.get_bases().unwrap_or(&vec![]))
                    .chain(generics)
                {
                    if !Self::type_is_defined(param, parameter_positions) {
                        println!("Used undefined param {param} in {cur_typ}");
                        return Err(Invalid {});
                    }
                }
                let cur_generics = TypeGenerator::get_generics(&cur_typ);

                for generic in cur_generics {
                    if !generics.contains(&generic) {
                        println!("Used undefined generics");
                        return Err(Invalid {});
                    }
                }
            }
        } else {
            Self::fix_type_generics(&mut cur_typ, generic_positions);
        }
        Ok((cur_typ, params_pos, generic_pos))
    }

    fn fix_type_generics(
        cur_typ: &mut LangTyp,
        generic_positions: &HashMap<String, HashSet<usize>>,
    ) {
        if let Some(extends) = cur_typ.get_bases_mut() {
            for base in extends {
                Self::fix_type_generics(base, generic_positions);
            }
        }
        if let Some(params) = cur_typ.get_params_mut() {
            for param in params {
                Self::fix_type_generics(param, generic_positions);
            }
        }
        if cur_typ.get_typargs().is_none() {
            return;
        }
        if !generic_positions.contains_key(cur_typ.get_name()) {
            return;
        }
        let generics = generic_positions.get(cur_typ.get_name()).unwrap();
        let gens = cur_typ.get_typargs_mut().unwrap();
        let n = gens.len();
        for i in 0..n {
            let pos = n - i - 1;
            if !generics.contains(&pos) {
                gens.remove(pos);
            } else {
                let typarg = gens.get_mut(pos).unwrap();
                Self::fix_type_generics(typarg, generic_positions);
            }
        }
    }

    /// only checks the type arguments, this is mainly intended for to_match_type
    fn type_is_defined(typ: &LangTyp, param_positions: &HashMap<String, HashSet<usize>>) -> bool {
        if typ.is_primitive() || typ.is_generic() {
            return true;
        }

        if typ.is_tuple() {
            let params = typ.get_params().unwrap();
            let first_defined = Self::type_is_defined(params.first().unwrap(), param_positions);
            if !first_defined {
                return false;
            }
            return Self::type_is_defined(params.get(1).unwrap(), param_positions);
        }

        if typ.is_base() || typ.is_variant() {
            if !param_positions.contains_key(typ.get_name()) {
                return false;
            }
            if let Some(typargs) = typ.get_typargs() {
                return typargs
                    .iter()
                    .all(|t| Self::type_is_defined(t, param_positions));
            }
            return true;
        }
        false
    }

    fn delete_generics(
        mut typ: LangTyp,
        generic_positions: &HashMap<String, HashSet<usize>>,
    ) -> LangTyp {
        if typ.is_base() || typ.is_variant() {
            let name = typ.get_name().to_string();
            if let Some(typargs) = typ.get_typargs_mut() {
                if let Some(positions) = generic_positions.get(&name) {
                    let new_typargs: Vec<Option<LangTyp>> = typargs
                        .iter_mut()
                        .enumerate()
                        .map(|(i, t)| {
                            if positions.contains(&i) {
                                Some(Self::delete_generics(t.clone(), generic_positions))
                            } else {
                                None
                            }
                        })
                        .collect();
                    *typargs = new_typargs.into_iter().flatten().collect();
                }
            }
        }
        if typ.is_tuple() {
            if let Some(parameters) = typ.get_params_mut() {
                let new_params = parameters
                    .clone()
                    .into_iter()
                    .map(|t| Self::delete_generics(t, generic_positions))
                    .collect();
                *parameters = new_params;
            }
        }
        typ
    }
}
