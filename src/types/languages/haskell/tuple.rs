use super::haskell_type::HaskellType;

#[derive(Clone, Debug, Hash, PartialEq, Eq, PartialOrd, Ord, Default)]

pub struct Tuple {
    pub params: Vec<HaskellType>,
    pub name: String,
}
