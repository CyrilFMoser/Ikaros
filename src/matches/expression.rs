use super::pattern::Pattern;

#[derive(Clone, Debug, Hash, PartialEq, PartialOrd, Ord, Eq)]

pub enum Expression<T: PartialOrd> {
    Match(MatchExp<T>),
    Var(Var<T>),
    BottomType, // represents for example null, undefined
    Bool(bool),
    Byte(u8),
    Int(u32),
    Char(char),
}
#[derive(Clone, Debug, Hash, PartialEq, PartialOrd, Ord, Eq)]

pub struct MatchExp<T: PartialOrd> {
    pub to_match: Box<Expression<T>>,
    pub cases: Vec<Pattern<T>>,
    pub arms: Vec<Expression<T>>,
    pub removed_pattern: Option<Pattern<T>>,
}

#[derive(Clone, Debug, Hash, PartialEq, PartialOrd, Ord, Eq)]
pub struct Var<T: PartialOrd> {
    pub name: String,
    pub typ: T,
}
