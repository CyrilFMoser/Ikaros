use crate::types::type_trait::TypeTag;

#[derive(Debug, Hash, Clone, PartialEq, Eq, PartialOrd, Ord)]
pub struct Generic {
    pub name: String,
    pub id: u32,
    pub tag: Option<TypeTag>,
}
