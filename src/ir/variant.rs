use super::{
    id::{BasId, VarId},
    ir_type::Type,
};
#[derive(Clone)]
pub struct Variant {
    pub id: VarId,
    pub base: Option<BasId>,
    pub typargs: Vec<Type>,
    pub parameters: Vec<Type>,
}
