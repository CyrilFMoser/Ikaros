use std::{fmt::Display, hash::Hash};

use super::{case_class::CaseClass, generic::Generic, traits::Trait, tuple::Tuple};
use crate::{
    matches::{
        expression::{Expression, MatchExp},
        pattern::{Pattern, Variant},
        statements::{Declaration, Statement, VarDecl},
    },
    types::{template::Template, type_trait::Type, variance::Variance},
};
use core::fmt::Debug;

#[derive(Clone, Debug, Hash, PartialEq, Eq, PartialOrd, Ord)]
pub enum ScalaType {
    Trait(Trait),
    CaseClass(CaseClass),
    Generic(Generic),
    Tuple(Tuple),
    Int,
    Char,
    Bool,
    Byte,
}

impl ScalaType {
    fn subtype_primitive(&self, other: &Self) -> bool {
        *self == *other
    }
}

impl Type for ScalaType {
    fn is_subtype(&self, other: &Self) -> bool {
        if self == other {
            return !self.is_generic(); // only allow subtypes of non generics
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
            ScalaType::Tuple(t) => Some(&t.params),
            _ => None,
        }
    }

    fn get_params_mut(&mut self) -> Option<&mut Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            ScalaType::CaseClass(cc) => Some(&mut cc.parameters),
            ScalaType::Tuple(t) => Some(&mut t.params),

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

    fn get_tuple_template() -> Option<Template<Self>> {
        Some(Template(ScalaType::Tuple(Tuple::default())))
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
        matches!(self, ScalaType::Generic(_))
    }

    fn is_sealed(&self) -> bool {
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
            ScalaType::Tuple(t1) => &t1.name,
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
        if let ScalaType::Tuple(t) = self {
            t.name = format!(
                "({},{})",
                t.params.first().unwrap(),
                t.params.get(1).unwrap()
            );
            return;
        }
        let mut prefix = String::from(match self {
            ScalaType::Trait(_) => "T_",
            ScalaType::CaseClass(_) => "CC_",
            ScalaType::Generic(_) => "",
            _ => return,
        });
        let others_count = match self {
            ScalaType::Trait(_) => names.iter().filter(|s| s.starts_with("T_")).count(),
            ScalaType::CaseClass(_) => names.iter().filter(|s| s.starts_with("CC_")).count(),
            ScalaType::Generic(_) => names.iter().filter(|s| !s.contains('_')).count(),
            _ => return,
        };
        prefix.push(('A'..='Z').nth(others_count % 26).unwrap());
        let mut count = 0;
        let mut cur_name = prefix.clone();
        while names.contains(&cur_name) {
            count += 1;
            cur_name = format!("{}_{}", prefix.clone(), count);
        }
        names.push(cur_name.clone());
        self.set_name(cur_name);
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

    fn get_number_type() -> Self {
        ScalaType::Int
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
        if matches!(self, ScalaType::Tuple(_)) {
            Some(2)
        } else {
            None
        }
    }

    fn get_max_params(&self) -> Option<u32> {
        match self {
            ScalaType::Tuple(_) => Some(2),
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
        out.push_str("object Test {\n");
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

    fn statement_to_string(s: &Statement<ScalaType>) -> String {
        match s {
            Statement::Decl(Declaration::Var(VarDecl {
                name,
                typ_annotation,
                typ,
                exp,
            })) => {
                let annotation = if *typ_annotation {
                    format!(": {}", typ)
                } else {
                    String::new()
                };
                format!("val {}{} = {}", name, annotation, exp_to_string(exp))
            }
        }
    }

    fn get_min_num_cases(&self) -> u32 {
        0
    }

    fn get_compiler_name() -> String {
        "scalac".to_string()
    }

    fn get_compiler_path() -> String {
        "scalac".to_string()
        //"C:/Users/cyril/AppData/Local/Coursier/data/bin/scalac.bat".to_string()
    }

    fn get_compiler_args() -> Option<Box<[String]>> {
        None
    }

    fn get_suffix() -> String {
        "scala".to_string()
    }

    fn get_test_script() -> String {
        "testscript_unreachable_scala.sh".to_string()
    }

    fn pattern_to_string(p: &Pattern<ScalaType>) -> String {
        match p {
            Pattern::Tuple(p1, p2) => format!(
                "({},{})",
                ScalaType::pattern_to_string(p1),
                ScalaType::pattern_to_string(p2)
            ),
            Pattern::Constant(c) => exp_to_string(&c.exp),
            Pattern::WildCard(w) => {
                if w.annotate {
                    format!("_:{}", w.typ)
                } else {
                    "_".to_string()
                }
            }
            Pattern::Variant(Variant { typ, parameters }) => {
                let mut out = format!("{}(", typ.get_name());
                for p in parameters {
                    out.push_str(format!("{}, ", ScalaType::pattern_to_string(p)).as_str());
                }
                if !parameters.is_empty() {
                    out.pop(); // comma
                    out.pop(); // space
                }
                out.push(')');
                out
            }
        }
    }

    fn get_comment() -> String {
        "//".to_string()
    }

    fn is_bool(&self) -> bool {
        matches!(self, ScalaType::Bool)
    }

    fn is_primitive(&self) -> bool {
        matches!(
            self,
            ScalaType::Bool | ScalaType::Byte | ScalaType::Char | ScalaType::Int
        )
    }

    fn get_const_exp(&self) -> Expression<ScalaType> {
        match self {
            ScalaType::Byte => Expression::Byte(0),
            ScalaType::Int => Expression::Byte(12),
            ScalaType::Char => Expression::Char('x'),
            _ => panic!("Called on a non const exp"),
        }
    }

    fn is_tuple(&self) -> bool {
        matches!(self, ScalaType::Tuple(_))
    }

    fn is_variant(&self) -> bool {
        matches!(self, ScalaType::CaseClass(_))
    }
}

fn exp_to_string(e: &Expression<ScalaType>) -> String {
    match e {
        Expression::Match(m) => match_to_string(m),
        Expression::Var(v) => v.name.clone(),
        Expression::BottomType => "null".to_string(),
        Expression::Int(i) => i.to_string(),
        Expression::Bool(b) => {
            if *b {
                "true".to_string()
            } else {
                "false".to_string()
            }
        }
        Expression::Byte(b) => b.to_string(),
        Expression::Char(b) => format!("\'{b}\'"),
    }
}

fn match_to_string(m: &MatchExp<ScalaType>) -> String {
    let mut out = format!("{} match{{\n", exp_to_string(&m.to_match));
    for (p, arm) in m.cases.iter().zip(&m.arms) {
        out.push_str(
            format!(
                "  case {} => {} \n",
                ScalaType::pattern_to_string(p),
                exp_to_string(arm)
            )
            .as_str(),
        );
    }
    out.push_str("}\n}"); // because of the object Test {, only works if we have exactly one match statement of course
    out
}

impl Display for ScalaType {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        use ScalaType as ST;
        match self {
            ST::Bool => write!(f, "Boolean"),
            ST::Char => write!(f, "Char"),
            ST::Int => write!(f, "Int"),
            ST::Byte => write!(f, "Byte"),
            ST::Trait(tr) => write!(f, "{tr}"),
            ST::CaseClass(cc) => write!(f, "{cc}"),
            ST::Generic(g) => write!(f, "{}", g.name),
            ST::Tuple(t) => write!(f, "{}", t.name),
        }
    }
}
