use std::fmt::{Debug, Display};

use crate::types::{template::Template, type_trait::Type};

use super::{case_class::CaseClass, generic::Generic, traits::Trait, variance::Variance};

#[derive(Clone, PartialEq, Eq, PartialOrd, Ord)]
pub enum ScalaType {
    Trait(Trait),
    CaseClass(CaseClass),
    Generic(Generic),
    Int,
    Char,
    Bool,
    Byte,
}

impl ScalaType {
    fn subtype_primitive(&self, other: &Self) -> bool {
        self == other
    }
}

impl Type for ScalaType {
    fn is_subtype(&self, other: &Self) -> bool {
        if self == other {
            return true;
        }
        match self {
            ScalaType::Bool | ScalaType::Byte | ScalaType::Char | ScalaType::Int => {
                self.subtype_primitive(other)
            }
            ScalaType::CaseClass(cc) => cc.subtype_caseclass(other),
            ScalaType::Trait(tr) => tr.subtype_trait(other),
            _ => false,
        }
    }

    fn get_params(&self) -> Option<&Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            ScalaType::CaseClass(cc) => Some(&cc.parameters),
            _ => None,
        }
    }

    fn get_params_mut(&mut self) -> Option<&mut Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            ScalaType::CaseClass(cc) => Some(&mut cc.parameters),
            _ => None,
        }
    }

    fn get_typargs(&self) -> Option<&Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            ScalaType::CaseClass(cc) => Some(&cc.typargs),
            ScalaType::Trait(tr) => Some(&tr.typargs),
            _ => None,
        }
    }

    fn get_typargs_mut(&mut self) -> Option<&mut Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            ScalaType::CaseClass(cc) => Some(&mut cc.typargs),
            ScalaType::Trait(tr) => Some(&mut tr.typargs),
            _ => None,
        }
    }

    fn get_types() -> Vec<Template<Self>>
    where
        Self: Sized,
    {
        use ScalaType as T;
        let types = [
            T::Trait(Trait::default()),
            T::CaseClass(CaseClass::default()),
            T::Bool,
            T::Byte,
            T::Char,
            T::Int,
        ];
        types.into_iter().map(Template).collect()
    }

    fn get_prelude_types() -> Vec<Template<Self>>
    where
        Self: Sized,
    {
        use ScalaType as T;
        let types = [T::Bool, T::Byte, T::Char, T::Int];
        types.into_iter().map(Template).collect()
    }

    fn match_against(&self) -> bool {
        matches!(self, ScalaType::Trait(_))
    }

    fn get_case_templates(&self) -> Option<Vec<Template<Self>>>
    where
        Self: Sized,
    {
        match self {
            ScalaType::Trait(_) => Some(vec![Template(ScalaType::CaseClass(CaseClass::default()))]),
            _ => None,
        }
    }

    fn allows_base_instantiation(&self) -> bool {
        matches!(self, ScalaType::Trait(_))
    }

    fn allows_multiple_bases(&self) -> bool {
        matches!(self, ScalaType::CaseClass(_))
    }

    fn can_have_own_typargs(&self) -> bool {
        matches!(self, ScalaType::CaseClass(_) | ScalaType::Trait(_))
    }

    fn is_local(&self) -> bool {
        !matches!(self, ScalaType::Generic(_))
    }

    fn sealed(&self) -> bool {
        matches!(self, ScalaType::Trait(_) | ScalaType::CaseClass(_))
    }

    fn is_complex(&self) -> bool {
        matches!(self, ScalaType::Trait(_) | ScalaType::CaseClass(_))
    }

    fn needs_declaration(&self) -> bool {
        matches!(
            self,
            ScalaType::Trait(_) | ScalaType::CaseClass(_) | ScalaType::Generic(_)
        )
    }

    fn set_name(&mut self, name: String) {
        match self {
            ScalaType::Trait(tr) => tr.name = name,
            ScalaType::CaseClass(cc) => cc.name = name,
            ScalaType::Generic(g) => g.name = name,
            _ => (),
        }
    }

    fn get_name(&self) -> &str {
        match self {
            ScalaType::Trait(tr) => &tr.name,
            ScalaType::CaseClass(cc) => &cc.name,
            ScalaType::Generic(g) => &g.name,
            ScalaType::Int => "Int",
            ScalaType::Char => "Char",
            ScalaType::Bool => "Boolean",
            ScalaType::Byte => "Byte",
        }
    }

    fn generate_name(&mut self, names: &mut Vec<String>) {
        let mut prefix = String::from(match self {
            ScalaType::Trait(_) => "T_",
            ScalaType::CaseClass(_) => "CC_",
            ScalaType::Generic(_) => "",
            _ => return,
        });
        prefix.push(('A'..='Z').nth(names.len() % 26).unwrap());
        let mut count = 0;
        while names.contains(&format!("{}_{}", prefix, count)) {
            count += 1;
        }
        if count > 0 {
            prefix.push_str(&format!("_{}", count));
        }
        names.push(prefix.clone());
        self.set_name(prefix);
    }

    fn get_generic_template() -> Template<ScalaType> {
        Template(ScalaType::Generic(Generic {
            name: String::new(),
        }))
    }

    fn get_variances(&self) -> Option<&Vec<Variance>> {
        match self {
            ScalaType::CaseClass(cc) => Some(&cc.variances),
            ScalaType::Trait(tr) => Some(&tr.variances),
            _ => None,
        }
    }

    fn get_variances_mut(&mut self) -> Option<&mut Vec<Variance>> {
        match self {
            ScalaType::CaseClass(cc) => Some(&mut cc.variances),
            ScalaType::Trait(tr) => Some(&mut tr.variances),
            _ => None,
        }
    }

    fn is_base(&self) -> bool {
        matches!(self, ScalaType::Trait(_))
    }

    fn can_declare_variance() -> bool {
        true
    }

    fn is_generic(&self) -> bool {
        matches!(self, ScalaType::Generic(_))
    }

    fn get_bases(&self) -> Option<&Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            ScalaType::CaseClass(cc) => Some(&cc.extends),
            ScalaType::Trait(tr) => Some(&tr.extends),
            _ => None,
        }
    }

    fn get_bases_mut(&mut self) -> Option<&mut Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            ScalaType::CaseClass(cc) => Some(&mut cc.extends),
            ScalaType::Trait(tr) => Some(&mut tr.extends),
            _ => None,
        }
    }
}

impl Display for ScalaType {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        use ScalaType as ST;
        match self {
            ST::Bool => write!(f, "Boolean"),
            ST::Char => write!(f, "Char"),
            ST::Int => write!(f, "Int"),
            ST::Byte => write!(f, "Byte"),
            ST::Trait(tr) => tr.fmt(f),
            ST::CaseClass(cc) => cc.fmt(f),
            ST::Generic(g) => write!(f, "{}", g.name),
        }
    }
}
