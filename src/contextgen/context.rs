use std::collections::HashMap;

use crate::ir::{
    base::Base,
    id::{BasId, GenId, VarId},
    variant::Variant,
};

pub struct TypeContext {
    custom_types: Vec<BasId>,
    bases: HashMap<BasId, Base>,
    variants: HashMap<VarId, Variant>,
    base_names: HashMap<BasId, String>,
    variant_names: HashMap<VarId, String>,
    generic_names: HashMap<GenId, String>,
}

impl TypeContext {
    pub fn new(
        custom_types: Vec<BasId>,
        bases: HashMap<BasId, Base>,
        variants: HashMap<VarId, Variant>,
        base_names: HashMap<BasId, String>,
        variant_names: HashMap<VarId, String>,
        generic_names: HashMap<GenId, String>,
    ) -> TypeContext {
        TypeContext {
            custom_types,
            bases,
            variants,
            base_names,
            variant_names,
            generic_names,
        }
    }
}
