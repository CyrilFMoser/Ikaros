use std::{fmt::Display, hash::Hash};

use crate::types::{template::Template, type_trait::Type};

use super::{case_class::CaseClass, generic::Generic, traits::Trait, variance::Variance};

#[derive(Clone, Hash, PartialEq, Eq, PartialOrd, Ord)]
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
            return self.is_generic(); // only allow subtypes of non generics
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
            id: 0,
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

    fn get_min_params(&self) -> Option<u32> {
        None
    }

    fn get_max_params(&self) -> Option<u32> {
        match self {
            ScalaType::CaseClass(_) => None,
            ScalaType::Trait(_)
            | ScalaType::Generic(_)
            | ScalaType::Int
            | ScalaType::Char
            | ScalaType::Byte
            | ScalaType::Bool => Some(0),
        }
    }

    fn declarations_to_string(types: &[&Self]) -> String
    where
        Self: Sized,
    {
        let mut out = String::new();
        let traits = types.iter().filter(|t| matches!(t, Self::Trait(_)));
        for tr in traits {
            out.push_str("sealed trait ");
            out.push_str(tr.get_name());
            if let Some(typargs) = tr.get_typargs() {
                if let Some(variances) = tr.get_variances() {
                    let n = typargs.len();
                    if n > 0 {
                        out.push('[');
                        for i in 0..n {
                            match variances.get(i).unwrap() {
                                Variance::Covariant => out.push('+'),
                                Variance::Contravariant => out.push('-'),
                                Variance::Invariant => (),
                            }
                            out.push_str(typargs.get(i).unwrap().get_name());
                            out.push_str(", ");
                        }
                        out.pop();
                        out.pop();
                        out.push(']');
                    }
                }
            }
            out.push('\n');
        }
        let case_classes = types.iter().filter(|t| matches!(t, Self::CaseClass(_)));
        for cc in case_classes {
            out.push_str("case class ");
            out.push_str(cc.to_string().as_str());
            out.push('(');
            let mut param_names = 'a'..='z'; // Assume that there are leq than 52 parameters in a case class
            if let Some(params) = cc.get_params() {
                for param in params {
                    out.push_str(format!("{}: {}, ", param_names.next().unwrap(), param).as_str());
                }
                if !params.is_empty() {
                    out.pop(); // remove ','
                    out.pop(); // remove ' '
                }
            }
            out.push(')');
            if let Some(extends) = cc.get_bases() {
                out.push_str(" extends ");
                for tr in extends {
                    out.push_str(format!("{},", tr).as_str());
                }
                out.pop(); // remove ,
            }
            out.push('\n');
        }

        out
    }

    fn set_id(&mut self, id: u32) {
        if let ScalaType::Generic(g) = self {
            g.id = id
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
