use std::fmt::Display;

use super::id::{BasId, GenId, VarId};

#[derive(Clone)]
pub enum Type {
    Base(BasId),
    Variant(VarId),
    Primitive(Primitive),
    Generic(GenId),
}

impl Type {
    pub fn get_primitives() -> Vec<Type> {
        use Primitive as P;
        let primitives = [P::Int, P::Bool, P::Char, P::Byte];
        primitives.map(Type::Primitive).into_iter().collect()
    }
}
#[derive(Clone)]
pub enum Primitive {
    Int,
    Bool,
    Char,
    Byte,
}
impl Display for Primitive {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        match self {
            Primitive::Int => write!(f, "Int"),
            Primitive::Bool => write!(f, "Bool"),
            Primitive::Char => write!(f, "Char"),
            Primitive::Byte => write!(f, "Byte"),
        }
    }
}
