use crate::{
    matches::pattern::Pattern,
    types::type_trait::Type,
};
use core::fmt::Debug;
use std::{fmt::Display, hash::Hash};
/// `AddVariant` Add a variant with the specified name
///
/// `AddBase` Add a base with the specified name
///
/// `AddGeneric` Add a typeargument at specified position
///
/// `AddParameter` Add a parameter with the given name at the specified position
///
/// `AddExtends` Add an extends field with the given type
///
/// `AddPattern` Adds a base Pattern at the specified position
///
/// `ExpandParam` Expands the parameter at the specified position with the given pattern
#[derive(Clone)]
#[allow(dead_code)]
pub enum Change<
    LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
> {
    // Type Context Changes
    AddVariant(String, LangTyp),
    AddBase(String),
    AddGeneric(usize, LangTyp),
    AddParameter(usize, String, LangTyp),
    AddExtends(LangTyp),
    // Pattern Changes
    AddPattern(usize, Pattern<LangTyp>),
    ExpandParam(usize, Pattern<LangTyp>),
}

impl<
        LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
    > Change<LangTyp>
{
    pub fn is_root_type(&self) -> bool {
        matches!(self, Change::AddBase(_) | Change::AddVariant(_, _))
    }
}

impl<
        LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
    > Display for Change<LangTyp>
{
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        use Change as C;
        match self {
            C::AddVariant(name, _) => write!(f, "Add Variant {name}"),
            C::AddBase(name) => write!(f, "Add Base {name}"),
            C::AddGeneric(pos, t) => write!(f, "Add Typeargument {t} at position {pos}"),
            C::AddParameter(pos, name, t) => {
                write!(f, "Add Parameter {t} at position {pos} and name {name}")
            }

            C::AddExtends(t) => write!(f, "Add Extends {t}"),
            C::AddPattern(pos, pattern) => write!(
                f,
                "Add pattern {} at position {pos}",
                LangTyp::pattern_to_string(pattern)
            ),
            C::ExpandParam(pos, pattern) => write!(
                f,
                "Expand Parameter to {} at position {pos}",
                LangTyp::pattern_to_string(pattern)
            ),
        }
    }
}
