use super::pattern::Pattern;

#[derive(Clone)]

pub enum Expression<T> {
    Match(MatchExp<T>),
    Var(Var<T>),
    BottomType, // represents for example null, undefined
    Int(u32),
}
#[derive(Clone)]

pub struct MatchExp<T> {
    pub to_match: Box<Expression<T>>,
    pub cases: Vec<Pattern<T>>,
    pub arms: Vec<Expression<T>>,
    pub removed_pattern: Option<Pattern<T>>,
}

#[derive(Clone)]
pub struct Var<T> {
    pub name: String,
    pub typ: T,
}
