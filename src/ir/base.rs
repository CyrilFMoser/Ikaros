use super::{
    id::{BasId, VarId},
    ir_type::Type,
};
#[derive(Clone)]
pub struct Base {
    pub id: BasId,
    pub original: Option<BasId>,
    pub typargs: Vec<Type>,
    pub variants: Vec<VarId>,
}

impl Base {
    pub fn new(id: BasId, typargs: Vec<Type>, variants: Vec<VarId>) -> Base {
        Base {
            id,
            original: None,
            typargs,
            variants,
        }
    }
}
