use std::fmt::Debug;
use std::{collections::HashMap, fmt::Display};

use rand::Rng;
use rand_chacha::ChaCha8Rng;

use crate::types::{languages::scala::variance::Variance, template::Template, type_trait::Type};

use super::typegen_args::TypeContextArgs;

pub struct TypeGenerator<LangTyp: Type> {
    pub all_types: Vec<LangTyp>,
    pub available_types: Vec<usize>,
    pub complex_types: Vec<usize>,
    pub typgen_args: TypeContextArgs,
    pub base_instantiations: HashMap<String, Vec<LangTyp>>, // all the instantiations for that name of a base
    pub names: Vec<String>,
    pub rng: ChaCha8Rng,
}

impl<LangTyp: Type + Clone + PartialEq + Display> TypeGenerator<LangTyp> {
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
            self.add_type(&base);
        }
        for base in bases {
            println!("{}", base);
            let templates = base
                .get_case_templates()
                .expect("A base should have case templates it provides");
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
                                *typarg = self.generate_type(&generics, 0);
                            } else {
                                generics.push(typarg.clone());
                            }
                        }
                    }
                }
                let template_ind = self.rng.gen_range(0..(templates.len()));
                let template = templates.get(template_ind).unwrap().clone();
                //TODO: Continue here, create cases
            }
        }
    }

    pub fn add_type(&mut self, t: &LangTyp) {
        self.all_types.push(t.clone());
        if !t.is_local() {
            self.available_types.push(self.available_types.len() - 1);
        }
        if t.is_complex() {
            self.complex_types.push(self.available_types.len() - 1);
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
            let mut subs = Vec::new();
            // collect all the substitutions
            if let Some(cur_typargs) = typ.get_typargs() {
                for typarg in cur_typargs {
                    if typarg.is_generic() {
                        if !typargs.is_empty()
                            && !self
                                .rng
                                .gen_bool(self.typgen_args.instantiate_existing_complex_type_prob)
                        {
                            // choose a random typarg of typargs that are in scope
                            let typ_ind = self.rng.gen_range(0..(typargs.len()));
                            let substitution =
                                (typarg.clone(), typargs.get(typ_ind).unwrap().clone());
                            subs.push(substitution);
                        } else {
                            let substitution =
                                (typarg.clone(), self.generate_type(typargs, depth + 1));
                            subs.push(substitution);
                        }
                    }
                }
            }
            // apply them
            for (typarg, new_typ) in subs {
                Self::substitute(&mut typ, &typarg, &new_typ)
            }
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

    pub fn generate_generic(&mut self) -> LangTyp {
        let mut template = LangTyp::get_generic_template();
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
}
