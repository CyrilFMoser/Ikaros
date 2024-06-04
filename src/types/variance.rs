#[derive(Debug, Hash, Clone, PartialEq, Eq, PartialOrd, Ord)]

pub enum Variance {
    Covariant,
    Contravariant,
    Invariant,
}
