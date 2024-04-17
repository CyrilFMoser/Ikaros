use std::{collections::HashMap, fmt::format};

use rand::Rng;
use rand_chacha::ChaCha8Rng;

use crate::ir::{
    base::Base,
    id::{BasId, GenId, Id, VarId},
    ir_type::{Primitive, Type},
    variant::Variant,
};

use super::context::TypeContext;

pub struct ContextGenerator {
    ctxt_args: ContextArgs,
    base_count: usize,
    variants_count: usize,
    generics_count: usize,
    custom_types: Vec<BasId>, // contains only base declarations, no parameters
    bases: HashMap<BasId, Base>,
    variants: HashMap<VarId, Variant>,
    base_names: HashMap<BasId, String>,
    variant_names: HashMap<VarId, String>,
    generic_names: HashMap<GenId, String>,
    pub rng: ChaCha8Rng,
}

impl ContextGenerator {
    pub fn new(args: ContextArgs, rng: ChaCha8Rng) -> ContextGenerator {
        ContextGenerator {
            ctxt_args: args,
            base_count: 0,
            variants_count: 0,
            generics_count: 0,
            bases: HashMap::new(),
            variants: HashMap::new(),
            custom_types: Vec::new(),
            base_names: HashMap::new(),
            variant_names: HashMap::new(),
            generic_names: HashMap::new(),
            rng,
        }
    }
    pub fn generate(&mut self) -> TypeContext {
        let num_bases = self.rng.gen_range(1..=self.ctxt_args.max_num_bases);
        println!("Generating {} bases", num_bases);
        for _ in 0..num_bases {
            self.generate_base();
        }
        TypeContext::new(
            self.custom_types.clone(),
            self.bases.clone(),
            self.variants.clone(),
            self.base_names.clone(),
            self.variant_names.clone(),
            self.generic_names.clone(),
        )
    }

    fn generate_base(&mut self) {
        let id = BasId(self.base_count);
        self.base_count += 1;
        let num_typargs = self.rng.gen_range(0..=self.ctxt_args.max_base_typargs);
        let mut typargs = Vec::new();
        for _ in 0..num_typargs {
            typargs.push(self.generate_generic());
        }
        let num_variants = self.rng.gen_range(1..=self.ctxt_args.max_num_variants);
        let mut variants = Vec::new();
        for _ in 0..num_variants {
            // TODO: Allow some variants to instantiate their bases, for scala inheritance.
            let variant = self.generate_variant(id, &typargs, &variants);
            variants.push(variant);
        }
        let base = Base::new(
            id,
            typargs.into_iter().map(Type::Generic).collect(),
            variants,
        );
        self.add_base(base);
        self.custom_types.push(id);
    }

    fn generate_variant(
        &mut self,
        bas_id: BasId,
        typargs: &Vec<GenId>,
        other_vars: &Vec<VarId>,
    ) -> VarId {
        let id = VarId(self.variants_count);
        self.variants_count += 1;
        let param_count = self.rng.gen_range(0..=self.ctxt_args.max_variant_params);
        let mut params = Vec::new();
        for _ in 0..param_count {
            params.push(self.generate_parameter(bas_id, typargs));
        }
        let new_typargs = typargs.clone().into_iter().map(Type::Generic).collect();
        /*  TODO:
            For each type argument:
            - Decide if we want to instantiate it
                - If we do, decide if we want to use an instantiation of another variant of this base
                - Otherwise get a Primitive, or custom type to instantiate
                - Instantiate the variant
                - Add it
                - Somehow handle conflict with original base  <- (Not an issue if no new bases get added for instantiations)
        */
        self.add_variant(Variant {
            id,
            base: Some(bas_id),
            typargs: new_typargs,
            parameters: params,
        });
        id
    }

    fn generate_parameter(&mut self, bas_id: BasId, typargs: &Vec<GenId>) -> Type {
        let ct_available = !self.custom_types.is_empty(); // Can we use custom_types?
        let ta_available = !typargs.is_empty(); // Can we use a generic?

        if self.rng.gen_bool(self.ctxt_args.recursive_prob) {
            // use the base as parameter
            // TODO: Instantiate some type parameters, very annoying because we'd need to store the base which is not yet finished
            return Type::Base(bas_id);
        }
        if (!ct_available && !ta_available) || self.rng.gen_bool(self.ctxt_args.primitive_prob) {
            // generate a primitive
            let primitives = Type::get_primitives();
            let prim_ind = self.rng.gen_range(0..primitives.len());
            return primitives.get(prim_ind).unwrap().clone();
        }
        if ta_available && (!ct_available || self.rng.gen_bool(self.ctxt_args.typarg_prob)) {
            // use a type argument
            let gen_ind = self.rng.gen_range(0..typargs.len());
            return Type::Generic(*typargs.get(gen_ind).unwrap());
        }
        // use a custom type, which must exist
        let ct_ind = self.rng.gen_range(0..self.custom_types.len());
        let id = self.custom_types.get(ct_ind).unwrap();
        let new_bas_id = self.add_replaced_base(*id, typargs, 0);
        Type::Base(new_bas_id)
    }
    /// Creates new base with replaced generics of orig_base using new_typargs generics
    /// possibly using some generics multiple times
    /// can also instantiate!
    fn add_replaced_base(
        &mut self,
        orig_bas_id: BasId,
        new_typargs: &Vec<GenId>,
        depth: u32,
    ) -> BasId {
        let orig_bas = self.bases.get(&orig_bas_id).unwrap();
        let mut new_bas = orig_bas.clone();
        new_bas.id = BasId(self.base_count);
        self.base_count += 1;
        let mut new_typarg_ind = 0;
        for i in 0..new_bas.typargs.len() {
            let new_typ;
            if new_typargs.is_empty() || self.rng.gen_bool(self.ctxt_args.base_instantiation_prob) {
                // instantiate this parameter with a non generic
                if self.custom_types.is_empty()
                    || depth >= self.ctxt_args.max_param_depth
                    || self.rng.gen_bool(self.ctxt_args.instantiate_primitive_prob)
                {
                    // use a primitive
                    let primitives = Type::get_primitives();
                    let primitives_ind = self.rng.gen_range(0..primitives.len());
                    new_typ = primitives.get(primitives_ind).unwrap().clone();
                } else {
                    // use a custom type
                    let typ_ind = self.rng.gen_range(0..self.custom_types.len());
                    let custom_bas = self.custom_types.get(typ_ind).unwrap();
                    new_typ =
                        Type::Base(self.add_replaced_base(*custom_bas, new_typargs, depth + 1));
                }
            } else if let Some(gen_id) = new_typargs.get(new_typarg_ind) {
                // we have an unnused generic we can use
                //TODO: Could add merging of generics here
                new_typ = Type::Generic(*gen_id);
                new_typarg_ind += 1;
            } else {
                // use a random generic of the previous ones
                let gen_pos = self.rng.gen_range(0..(new_typargs.len()));
                new_typ = Type::Generic(*new_typargs.get(gen_pos).unwrap());
            }
            let cur_typarg = new_bas.typargs.get_mut(i).unwrap();
            if let Type::Generic(typarg_id) = cur_typarg.clone() {
                self.instantiate(cur_typarg, Some(new_bas.id), typarg_id, &new_typ);
            }
        }
        let id = new_bas.id;
        new_bas.original = Some(orig_bas_id);
        self.add_base(new_bas);
        id
    }

    fn generate_generic(&mut self) -> GenId {
        let id = GenId(self.generics_count);
        self.add_generic(id);
        self.generics_count += 1;
        id
    }
    // instantiate gen_id in typ with new_type, this might result in adding many new types to the context
    // returns if anything was changed
    pub fn instantiate(
        &mut self,
        typ: &mut Type,
        bas_id_opt: Option<BasId>,
        gen_id: GenId,
        new_type: &Type,
    ) -> bool {
        match typ {
            Type::Base(cur_bas_id) => {
                let new_bas_id = self.instantiate_base(*cur_bas_id, gen_id, new_type);
                if *cur_bas_id != new_bas_id {
                    *typ = Type::Base(new_bas_id);
                    return true;
                }
                false
            }
            Type::Variant(cur_var_id) => {
                if bas_id_opt.is_none() {
                    if let Some(bas_id) = self.variants.get(cur_var_id).unwrap().base {
                        // We have not instantiated the base of this variant, but it has one
                        let new_bas_id = self.instantiate_base(bas_id, gen_id, new_type);
                        return new_bas_id != bas_id;
                    }
                }
                let new_var_id =
                    self.instantiate_variant(bas_id_opt, *cur_var_id, gen_id, new_type);
                if *cur_var_id != new_var_id {
                    *typ = Type::Variant(new_var_id);
                    return true;
                }
                false
            }
            Type::Generic(cur_gen_id) => {
                if *cur_gen_id == gen_id {
                    *typ = new_type.clone();
                    return true;
                }
                false
            }
            Type::Primitive(_) => false,
        }
    }
    pub fn instantiate_variant(
        &mut self,
        bas_id_opt: Option<BasId>,
        var_id: VarId,
        gen_id: GenId,
        new_type: &Type,
    ) -> VarId {
        let variant = self.variants.get(&var_id).unwrap();
        let mut new_variant = variant.clone();
        new_variant.base = bas_id_opt;
        let mut final_id = var_id;
        let mut changed = false;
        for typ in new_variant
            .parameters
            .iter_mut()
            .chain(new_variant.typargs.iter_mut())
        {
            changed |= self.instantiate(typ, bas_id_opt, gen_id, new_type);
        }
        if changed {
            new_variant.id = VarId(self.variants_count);
            self.variants_count += 1;
            final_id = new_variant.id;
            self.add_variant(new_variant);
        }
        final_id
    }
    pub fn instantiate_base(&mut self, bas_id: BasId, gen_id: GenId, new_type: &Type) -> BasId {
        let base = self.bases.get(&bas_id).unwrap();
        let mut new_base = base.clone();
        let mut final_id = BasId(self.base_count);
        self.base_count += 1;

        let mut changed = false;
        for typ in new_base.typargs.iter_mut() {
            changed |= self.instantiate(typ, Some(final_id), gen_id, new_type)
        }

        // we either had to change a mapping in the type arguments, or we instantiate with a non generic type
        if changed || !matches!(new_type, Type::Generic(_)) {
            for variant in new_base.variants.iter_mut() {
                *variant = self.instantiate_variant(Some(final_id), *variant, gen_id, new_type);
            }
            new_base.original = Some(bas_id);
            self.add_base(new_base);
        } else {
            // then we haven't actually changed anything, return old id
            final_id = bas_id;
            // only if we actually changed anything increment
            self.base_count -= 1;
        }
        final_id
    }

    pub fn add_base(&mut self, base: Base) {
        if base.original.is_none() {
            self.generate_name(Id::BasId(base.id));
        }
        self.bases.insert(base.id, base);
    }

    pub fn add_variant(&mut self, variant: Variant) {
        self.generate_name(Id::VarId(variant.id));
        self.variants.insert(variant.id, variant);
    }

    pub fn add_generic(&mut self, generic: GenId) {
        self.generate_name(Id::GenId(generic));
    }

    pub fn get_name(&self, id: Id) -> &String {
        match id {
            Id::BasId(bas_id) => {
                if let Some(orig) = self.bases.get(&bas_id).unwrap().original {
                    // If this is an instantiation, return the original name
                    return self.get_name(Id::BasId(orig));
                }
                self.base_names.get(&bas_id).unwrap()
            }
            Id::VarId(var_id) => self.variant_names.get(&var_id).unwrap(),
            Id::GenId(gen_id) => self.generic_names.get(&gen_id).unwrap(),
        }
    }
    fn generate_name(&mut self, id: Id) -> &str {
        let mut name = String::from(match id {
            Id::BasId(_) => "Ba_",
            Id::VarId(_) => "Va_",
            Id::GenId(_) => "",
        });
        let existing_count = match id {
            Id::BasId(_) => self.base_names.len(),
            Id::VarId(_) => self.variant_names.len(),
            Id::GenId(_) => self.generic_names.len(),
        };
        name.push(('A'..='Z').nth(existing_count % 26).unwrap());
        if matches!(id, Id::GenId(_)) {
            name = name.to_ascii_lowercase();
        }
        let additional_number = existing_count / 26;
        if additional_number > 0 {
            name.push_str(additional_number.to_string().as_str());
        }
        match id {
            Id::BasId(bas_id) => {
                self.base_names.insert(bas_id, name);
                self.base_names.get(&bas_id).unwrap()
            }
            Id::VarId(var_id) => {
                self.variant_names.insert(var_id, name);
                self.variant_names.get(&var_id).unwrap()
            }
            Id::GenId(gen_id) => {
                self.generic_names.insert(gen_id, name);
                self.generic_names.get(&gen_id).unwrap()
            }
        }
    }

    pub fn typ_to_string(&self, typ: &Type) -> String {
        match typ {
            Type::Base(bas_id) => self.bas_to_string(*bas_id),
            Type::Variant(var_id) => self.var_to_string(*var_id),
            Type::Generic(gen_id) => String::from(self.get_name(Id::GenId(*gen_id))),
            Type::Primitive(p) => p.to_string(),
        }
    }

    pub fn bas_to_string(&self, bas_id: BasId) -> String {
        let mut out = String::from(self.get_name(Id::BasId(bas_id)));
        let bas = self.bases.get(&bas_id).unwrap();
        for typarg in bas.typargs.iter() {
            let cur_str = &self.typ_to_string(typarg);
            if cur_str.contains(' ') {
                out.push_str(format!(" ({})", cur_str).as_str());
            } else {
                out.push_str(format!(" {}", cur_str).as_str());
            }
        }
        out
    }

    pub fn var_to_string(&self, var_id: VarId) -> String {
        let mut out = String::from(self.get_name(Id::VarId(var_id)));
        let var = self.variants.get(&var_id).unwrap();
        for parameter in var.parameters.iter() {
            let cur_str = &self.typ_to_string(parameter);
            if cur_str.contains(' ') {
                out.push_str(format!(" ({})", cur_str).as_str());
            } else {
                out.push_str(format!(" {}", cur_str).as_str());
            }
        }
        out
    }

    pub fn print_ctxt(&mut self) {
        for bas_id in self.custom_types.clone() {
            let name = self.bas_to_string(bas_id);
            print!("{} = ", name);
            let mut variants = String::new();
            for var_id in self.bases.get(&bas_id).unwrap().variants.iter() {
                variants.push_str(format!("{} | ", self.var_to_string(*var_id)).as_str());
            }
            // ! ASSUMPTION IS THAT THERE ARE NO BASES WITH NO VARIANTS !
            variants.pop();
            variants.pop();
            variants.pop();
            println!("{}", variants);
        }
    }
}
/// Arguments to be passed to a ```ContextGenerator```
/// #Fields
/// * `max_num_bases` - Maximal number of bases
/// * `max_num_variants` - Maximal number of variants per base
/// * `max_base_typargs` - Maximal number of type arguments per base
/// * `max_variant_params` - maximal number of parameters per variant
/// * `max_param_depth` - Maximal depth of parameters
/// * `primitive_prob` - Probability for a parameter to be a primitive
/// * `typarg_prob` - Probability to use a type argument as a parameter
/// * `recursive_prob` - Probability for a variant to have its own base as a parameter
/// * `recursive_instantiation_prob` - Probability for each type argument of a base used as a parameter (infinite type) to be instantiated
/// * `base_instantiation_prob` - Probability for a type argument of a base used as a parameter to be instantiated
/// * `instantiate_primitive_prob` - Probability to instantiate a type argument of a base used as a parameter with a primitive
pub struct ContextArgs {
    pub max_num_bases: u32,      // maximal number of bases
    pub max_num_variants: u32,   // maximal number of variants per base
    pub max_base_typargs: u32,   // maximal number of type arguments per base
    pub max_variant_params: u32, // maximal number of parameters per variant
    pub max_param_depth: u32,
    pub primitive_prob: f64, // probability for a parameter to be a primitive
    pub typarg_prob: f64,    // probability to use a type argument as a parameter
    pub recursive_prob: f64, // probability for a variant to have its own base as a parameter
    pub recursive_instantiation_prob: f64, // probability for each type argument of a base used as a parameter in its own variant (infinite type) to be instantiated
    pub base_instantiation_prob: f64,
    pub instantiate_primitive_prob: f64,
}
