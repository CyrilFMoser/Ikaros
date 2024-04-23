use std::collections::HashSet;
use std::fmt::Debug;
use std::hash::Hash;
use std::{collections::HashMap, fmt::Display};

use rand::Rng;
use rand_chacha::ChaCha8Rng;

use crate::types::{languages::scala::variance::Variance, template::Template, type_trait::Type};

use super::typegen_args::TypeContextArgs;

pub struct TypeGenerator<LangTyp: Type> {
    pub all_types: Vec<LangTyp>,
    pub available_types: Vec<usize>,
    pub complex_types: Vec<usize>,
    pub declarations: Vec<usize>,
    pub typgen_args: TypeContextArgs,
    pub base_instantiations: HashMap<String, Vec<LangTyp>>, // all the instantiations for that name of a base
    pub names: Vec<String>,
    pub generic_count: u32,
    pub rng: ChaCha8Rng,
}

impl<LangTyp: Type + Clone + PartialEq + Eq + Hash + Display> TypeGenerator<LangTyp> {
    pub fn new(typgen_args: TypeContextArgs, rng: ChaCha8Rng) -> Self {
        let types = LangTyp::get_types();
        let all_types: Vec<LangTyp> = types
            .iter()
            .filter_map(|t| {
                if !t.0.needs_declaration() {
                    Some(&t.0)
                } else {
                    None
                }
            })
            .cloned()
            .collect();
        let complex_types = all_types
            .iter()
            .enumerate()
            .filter_map(|(i, t)| if t.is_complex() { Some(i) } else { None })
            .collect();
        let available_types = (0..(all_types.len())).collect();
        TypeGenerator {
            all_types,
            available_types,
            complex_types,
            typgen_args,
            names: Vec::new(),
            base_instantiations: HashMap::new(),
            rng,
            declarations: Vec::new(),
            generic_count: 0,
        }
    }
    pub fn generate_bases(&mut self) {
        let base_templates: Vec<Template<LangTyp>> = LangTyp::get_types()
            .iter()
            .filter(|t| t.0.is_base())
            .cloned()
            .collect();
        let mut bases = Vec::new();
        let num_bases = self.rng.gen_range(1..=(self.typgen_args.max_num_bases));
        for _ in 0..num_bases {
            let template_ind = self.rng.gen_range(0..(base_templates.len()));
            let base_template = base_templates.get(template_ind).unwrap();
            let mut base = base_template.0.clone();
            if base.can_have_own_typargs() {
                if let Some(typargs) = base.get_typargs_mut() {
                    let num_typargs = self
                        .rng
                        .gen_range(0..=(self.typgen_args.max_num_base_typargs));
                    for _ in 0..num_typargs {
                        typargs.push(self.generate_generic());
                    }
                    if LangTyp::can_declare_variance() {
                        if let Some(variances) = base.get_variances_mut() {
                            for _ in 0..num_typargs {
                                variances.push(self.generate_variance());
                            }
                        }
                    }
                }
            }
            base.generate_name(&mut self.names);
            bases.push(base.clone());
            self.add_type(&base, true);
        }
        for base in bases {
            let num_cases = self.rng.gen_range(0..(self.typgen_args.max_num_base_cases));
            for _ in 0..num_cases {
                let mut cur_base = base.clone();
                if cur_base.allows_base_instantiation() {
                    let existing_instantiations_opt = self.base_instantiations.get(base.get_name());
                    if self
                        .rng
                        .gen_bool(self.typgen_args.use_same_instantiation_prob)
                        && existing_instantiations_opt.is_some()
                    {
                        let existing_instantiations = existing_instantiations_opt.unwrap();
                        let inst_ind = self.rng.gen_range(0..(existing_instantiations.len()));
                        cur_base = existing_instantiations.get(inst_ind).unwrap().clone();
                    }
                    if let Some(typargs) = cur_base.get_typargs_mut() {
                        let mut generics = Vec::new();
                        for typarg in typargs {
                            if !typarg.is_generic() {
                                // don't replace non generics
                                continue;
                            }
                            if self.rng.gen_bool(self.typgen_args.base_instantiation_prob) {
                                let new_typ = self.generate_type(&generics, 0);
                                *typarg = new_typ;
                            } else {
                                generics.push(typarg.clone());
                            }
                        }
                    }
                }
                let templates = base
                    .get_case_templates()
                    .expect("A base should have case templates it provides");
                let template_ind = self.rng.gen_range(0..(templates.len()));
                let mut template = templates.get(template_ind).unwrap().clone();
                let mut typargs = Vec::new();
                //TODO: If the case type allows it, try to extend multiple bases
                template.0.generate_name(&mut self.names);
                // accumulate the typargs we need
                typargs.append(&mut Self::get_generics(&cur_base).into_iter().collect());
                if template.0.can_have_own_typargs()
                    && self
                        .rng
                        .gen_bool(self.typgen_args.add_additional_typarg_case_prob)
                {
                    // generate a new typarg to add to this case
                    typargs.push(self.generate_generic());
                }
                // add the typargs to this cases typargs
                if let Some(case_typargs) = template.0.get_typargs_mut() {
                    case_typargs.append(&mut typargs);
                }
                // Store this base with the case (if we want to)
                if let Some(bases) = template.0.get_bases_mut() {
                    bases.push(cur_base);
                }
                // this case has parameters that we should instantiate
                if template.0.get_params().is_some() {
                    let min_params = if let Some(minimum) = template.0.get_min_params() {
                        minimum
                    } else {
                        0
                    };
                    let max_params = if let Some(maximum) = template.0.get_max_params() {
                        maximum
                    } else {
                        self.typgen_args.max_num_params
                    };
                    // otherwise the gen_range panics
                    if min_params < max_params {
                        let num_params = self.rng.gen_range(min_params..max_params);
                        let typargs = if let Some(case_typargs) = template.0.get_typargs() {
                            case_typargs.clone()
                        } else {
                            Vec::new()
                        };
                        let params = template.0.get_params_mut().unwrap();
                        for _ in 0..num_params {
                            let param = self.generate_type(typargs.as_slice(), 0);
                            params.push(param);
                        }
                    }
                }
                self.add_type(&template.0, true);
            }
        }
    }

    pub fn add_type(&mut self, t: &LangTyp, declaration: bool) {
        self.all_types.push(t.clone());
        let index = self.all_types.len() - 1;
        if !t.is_local() {
            self.available_types.push(index);
        }
        if t.is_complex() {
            self.complex_types.push(index);
        }
        if declaration {
            self.declarations.push(index);
        }
    }

    pub fn generate_type(&mut self, typargs: &[LangTyp], depth: u32) -> LangTyp {
        if depth >= self.typgen_args.max_type_depth
            || self.rng.gen_bool(self.typgen_args.use_prelude_type_prob)
        {
            let types = LangTyp::get_prelude_types();
            let typ_ind = self.rng.gen_range(0..types.len());
            types.get(typ_ind).unwrap().clone().0
        } else {
            let typ_ind = self.rng.gen_range(0..self.complex_types.len());
            let mut typ = self
                .all_types
                .get(*self.complex_types.get(typ_ind).unwrap())
                .unwrap()
                .clone();
            // collect all the substitutions and apply them
            if let Some(cur_typargs) = typ.get_typargs() {
                let mut unavailable_types = Vec::new();
                let mut generics: HashSet<LangTyp> = HashSet::new();
                for typarg in cur_typargs {
                    generics = generics
                        .union(&Self::get_generics(typarg))
                        .cloned()
                        .collect();
                }
                // we might need new generics temporarily, be sure to replace these here afterwards
                let mut new_generics = Vec::new();
                for typarg in generics {
                    if !typargs.is_empty()
                        && !self
                            .rng
                            .gen_bool(self.typgen_args.instantiate_existing_complex_type_prob)
                    {
                        // choose a random typarg of typargs that are in scope
                        let typ_ind = self.rng.gen_range(0..(typargs.len()));
                        let new_typ = typargs.get(typ_ind).unwrap().clone();
                        Self::substitute(&mut typ, &typarg, &new_typ);
                    } else {
                        unavailable_types.push(typarg.clone());
                        let mut new_typ = self.generate_type(typargs, depth + 1);
                        if Self::get_generics(&new_typ).contains(&typarg) {
                            // If the generic we are replacing is a part of the new type, we have to replace it there
                            // to avoid infinite recursion in substitution
                            let new_generic = self.generate_generic();
                            Self::substitute(&mut new_typ, &typarg, &new_generic);
                            new_generics.push(new_generic);
                        }
                        Self::substitute(&mut typ, &typarg, &new_typ);
                    }
                }
                // now replace the newly added generics by merging them with existing ones, or generating a type with no generics
                if let Some(typargs) = typ.get_typargs_mut() {
                    let typarg_generics: Vec<LangTyp> =
                        typargs.iter().filter(|t| t.is_generic()).cloned().collect();
                    for generic in new_generics {
                        let new_typ = self.generate_type(&typarg_generics, depth + 1);
                        Self::substitute(&mut typ, &generic, &new_typ);
                    }
                }
            }
            // This might have added new type arguments we need to add to the case
            let generics = Self::get_generics(&typ);
            for generic in generics {
                if let Some(typargs) = typ.get_typargs_mut() {
                    if !typargs.contains(&generic) {
                        typargs.push(generic);
                    }
                }
            }
            self.add_type(&typ, false);
            typ
        }
        //TODO: Generate other types, such as type unions etc. here
    }

    pub fn substitute(typ: &mut LangTyp, orig: &LangTyp, new_typ: &LangTyp) {
        if typ == orig {
            *typ = new_typ.clone();
        }
        if let Some(params) = typ.get_params_mut() {
            params
                .iter_mut()
                .for_each(|t| Self::substitute(t, orig, new_typ))
        }
        if let Some(typargs) = typ.get_typargs_mut() {
            typargs
                .iter_mut()
                .for_each(|t| Self::substitute(t, orig, new_typ))
        }
        if let Some(bases) = typ.get_bases_mut() {
            bases
                .iter_mut()
                .for_each(|t| Self::substitute(t, orig, new_typ))
        }
    }

    pub fn get_generics(typ: &LangTyp) -> HashSet<LangTyp> {
        let mut generics = Vec::new();
        if typ.is_generic() {
            generics.push(typ.clone());
        }
        if let Some(params) = typ.get_params() {
            for param in params {
                generics.append(&mut Self::get_generics(param).into_iter().collect());
            }
        }
        if let Some(typargs) = typ.get_typargs() {
            for typarg in typargs {
                generics.append(&mut Self::get_generics(typarg).into_iter().collect());
            }
        }
        if let Some(bases) = typ.get_bases() {
            for base in bases {
                generics.append(&mut Self::get_generics(base).into_iter().collect());
            }
        }
        generics.into_iter().collect()
    }

    pub fn generate_generic(&mut self) -> LangTyp {
        let mut template = LangTyp::get_generic_template();
        template.0.set_id(self.generic_count);
        self.generic_count += 1;
        template.0.generate_name(&mut self.names);
        template.0
    }

    pub fn generate_variance(&mut self) -> Variance {
        if self.rng.gen_bool(self.typgen_args.contravariance_prob) {
            Variance::Contravariant
        } else if self.rng.gen_bool(self.typgen_args.covariance_prob) {
            Variance::Covariant
        } else {
            Variance::Invariant
        }
    }

    pub fn declarations_to_string(&self) -> String {
        let mut types = Vec::new();
        for id in self.declarations.iter() {
            types.push(self.all_types.get(*id).unwrap());
        }
        LangTyp::declarations_to_string(&types)
    }
}
