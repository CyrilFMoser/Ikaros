use super::scala_type::ScalaType;

#[derive(Clone, Debug, Hash, PartialEq, Eq, PartialOrd, Ord, Default)]

pub struct Tuple {
    pub params: Vec<ScalaType>,
    pub name: String,
}
