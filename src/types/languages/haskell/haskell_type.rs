use std::{collections::HashMap, fmt::Display, hash::Hash};

use regex::Regex;

use crate::{
    matches::{
        expression::{Expression, MatchExp},
        pattern::{Pattern, Variant},
        statements::{Declaration, Statement, VarDecl},
    },
    types::{template::Template, type_trait::Type},
};
use core::fmt::Debug;

use super::{base::Base, case::Case, generic::Generic, tuple::Tuple};

#[derive(Clone, Debug, Hash, PartialEq, Eq, PartialOrd, Ord)]
pub enum HaskellType {
    Base(Base),
    Case(Case),
    Generic(Generic),
    Tuple(Tuple),
    Int,
    Char,
    Bool,
}

impl Type for HaskellType {
    fn is_subtype(&self, other: &Self) -> bool {
        if self == other && !self.is_generic() {
            return true;
        }
        match self {
            HaskellType::Case(c) => {
                if let Some(base) = c.extends.first() {
                    return base == other;
                }
                false
            }
            _ => false,
        }
    }

    fn set_name(&mut self, name: String) {
        use HaskellType as H;
        match self {
            H::Base(b) => b.name = name,
            H::Case(c) => c.name = name,
            H::Generic(g) => g.name = name,
            _ => (),
        }
    }

    fn get_name(&self) -> &str {
        use HaskellType as H;
        match self {
            H::Tuple(t) => &t.name,
            H::Base(b) => b.name.as_str(),
            H::Case(c) => c.name.as_str(),
            H::Generic(g) => g.name.as_str(),
            H::Bool => "Bool",
            H::Int => "Int",
            H::Char => "Char",
        }
    }

    fn generate_name(&mut self, names: &mut Vec<String>) {
        if let HaskellType::Tuple(t) = self {
            t.name = format!(
                "({},{})",
                t.params.first().unwrap(),
                t.params.get(1).unwrap()
            );
            return;
        }
        let mut prefix = String::from(match self {
            HaskellType::Base(_) => "B_",
            HaskellType::Case(_) => "C_",
            HaskellType::Generic(_) => "",
            _ => return,
        });
        let others_count = match self {
            HaskellType::Base(_) => names.iter().filter(|s| s.starts_with("B_")).count(),
            HaskellType::Case(_) => names.iter().filter(|s| s.starts_with("C_")).count(),
            HaskellType::Generic(_) => names.iter().filter(|s| !s.contains('_')).count(),
            _ => return,
        };
        prefix.push(('A'..='Z').nth(others_count % 26).unwrap());
        let mut count = 0;
        if self.is_generic() {
            prefix = prefix.to_ascii_lowercase();
        }
        let mut cur_name = prefix.clone();
        while names.contains(&cur_name) {
            count += 1;
            cur_name = format!("{}_{}", prefix.clone(), count);
        }
        names.push(cur_name.clone());
        self.set_name(cur_name);
    }

    fn get_variances(&self) -> Option<&Vec<crate::types::variance::Variance>> {
        match self {
            HaskellType::Base(b) => Some(&b.variances),
            _ => None,
        }
    }

    fn get_variances_mut(&mut self) -> Option<&mut Vec<crate::types::variance::Variance>> {
        match self {
            HaskellType::Base(b) => Some(&mut b.variances),
            _ => None,
        }
    }

    fn can_declare_variance() -> bool {
        false
    }

    fn is_generic(&self) -> bool {
        matches!(self, HaskellType::Generic(_))
    }

    fn get_generic_template() -> Template<Self>
    where
        Self: Sized,
    {
        Template(HaskellType::Generic(Generic {
            name: "".to_string(),
            id: 0,
        }))
    }

    fn get_min_params(&self) -> Option<u32> {
        if matches!(self, HaskellType::Tuple(_)) {
            Some(2)
        } else {
            None
        }
    }

    fn get_max_params(&self) -> Option<u32> {
        if matches!(self, HaskellType::Case(_)) {
            None
        } else if matches!(self, HaskellType::Tuple(_)) {
            Some(2)
        } else {
            Some(0)
        }
    }

    fn get_params(&self) -> Option<&Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            HaskellType::Case(c) => Some(&c.parameters),
            HaskellType::Tuple(t) => Some(&t.params),
            _ => None,
        }
    }

    fn get_params_mut(&mut self) -> Option<&mut Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            HaskellType::Case(c) => Some(&mut c.parameters),
            HaskellType::Tuple(t) => Some(&mut t.params),
            _ => None,
        }
    }

    fn get_typargs(&self) -> Option<&Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            HaskellType::Base(b) => Some(&b.typargs),
            HaskellType::Case(c) => Some(&c.typargs),
            _ => None,
        }
    }

    fn get_typargs_mut(&mut self) -> Option<&mut Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            HaskellType::Base(b) => Some(&mut b.typargs),
            HaskellType::Case(c) => Some(&mut c.typargs),
            _ => None,
        }
    }

    fn get_types() -> Vec<Template<Self>>
    where
        Self: Sized,
    {
        use HaskellType as H;
        let types = [
            H::Base(Base::default()),
            H::Case(Case::default()),
            H::Bool,
            H::Char,
            H::Int,
        ];
        types.into_iter().map(Template).collect()
    }

    fn get_prelude_types() -> Vec<Template<Self>>
    where
        Self: Sized,
    {
        use HaskellType as H;
        let types = [H::Bool, H::Char, H::Int];
        types.into_iter().map(Template).collect()
    }

    fn get_number_type() -> Self {
        HaskellType::Int
    }

    fn statement_to_string(s: &Statement<Self>) -> String
    where
        Self: Sized,
    {
        match s {
            Statement::Decl(Declaration::Var(VarDecl {
                name,
                typ_annotation,
                typ,
                exp,
            })) => {
                let mut out = String::new();
                if *typ_annotation {
                    out = format!("{} :: {}\n", name, typ)
                }
                out.push_str(format!("{} = {}", name, exp_to_string(exp)).as_str());
                out
            }
        }
    }

    fn get_case_templates(&self) -> Option<Vec<Template<Self>>>
    where
        Self: Sized,
    {
        if matches!(self, HaskellType::Base(_)) {
            Some(vec![Template(HaskellType::Case(Case::default()))])
        } else {
            None
        }
    }

    fn is_base(&self) -> bool {
        matches!(self, HaskellType::Base(_))
    }

    fn allows_base_instantiation(&self) -> bool {
        matches!(self, HaskellType::Base(_))
        //false
    }

    fn can_have_own_typargs(&self) -> bool {
        matches!(self, HaskellType::Base(_))
    }

    fn get_bases(&self) -> Option<&Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            HaskellType::Case(c) => Some(&c.extends),
            _ => None,
        }
    }

    fn get_bases_mut(&mut self) -> Option<&mut Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            HaskellType::Case(c) => Some(&mut c.extends),
            _ => None,
        }
    }

    fn is_local(&self) -> bool {
        match self {
            HaskellType::Case(_) | HaskellType::Generic(_) => true,
            HaskellType::Tuple(t) => {
                t.params.first().unwrap().is_local() || t.params.get(1).unwrap().is_local()
            }
            _ => false,
        }
    }

    fn is_sealed(&self) -> bool {
        match self {
            HaskellType::Case(_) | HaskellType::Base(_) => true,
            HaskellType::Tuple(t) => {
                t.params.first().unwrap().is_sealed() || t.params.get(1).unwrap().is_sealed()
            }
            _ => false,
        }
    }

    fn is_complex(&self) -> bool {
        matches!(
            self,
            HaskellType::Base(_) | HaskellType::Case(_) | HaskellType::Tuple(_)
        )
    }

    fn needs_declaration(&self) -> bool {
        matches!(self, HaskellType::Base(_) | HaskellType::Case(_))
    }

    fn declarations_to_string(types: &[&Self]) -> String
    where
        Self: Sized,
    {
        let mut out = String::new();
        let bases = types.iter().filter(|t| matches!(t, Self::Base(_)));
        for base in bases {
            out.push_str(format!("data {}", base.get_name()).as_str());
            for typarg in base.get_typargs().unwrap_or(&Vec::new()) {
                out.push_str(format!(" {}", typarg).as_str());
            }
            out.push_str(" where\n");
            let cases = types.iter().filter(|t| matches!(t, Self::Case(_)));
            for case in cases {
                if let Some(extends) = case.get_bases() {
                    if !extends.is_empty() && extends.get(0).unwrap().get_name() == base.get_name() {
                        out.push_str(format!(" {case}\n").as_str());
                    }
                }
            }
        }
        out
    }

    fn get_min_num_cases(&self) -> u32 {
        1
    }

    fn get_compiler_name() -> String {
        "ghc".to_string()
    }

    fn get_compiler_path() -> String {
        "ghc".to_string()
    }

    fn get_compiler_args() -> Option<Box<[String]>> {
        Some(Box::new([
            "-fwarn-incomplete-patterns".to_string(),
            "-Woverlapping-patterns".to_string(),
            "-XGADTs".to_string(),
            "-fdiagnostics-color=never".to_string(),
        ]))
    }

    fn get_suffix() -> String {
        "hs".to_string()
    }

    fn get_test_script() -> String {
        todo!()
    }

    fn pattern_to_string(p: &Pattern<HaskellType>) -> String {
        match p {
            Pattern::Tuple(p1, p2) => format!(
                "({},{})",
                HaskellType::pattern_to_string(p1),
                HaskellType::pattern_to_string(p2)
            ),
            Pattern::Constant(c) => exp_to_string(&*c.exp),
            Pattern::WildCard(_) => "_".to_string(),
            Pattern::Variant(Variant { typ, parameters }) => {
                let mut out = typ.get_name().to_string();
                for p in parameters {
                    match p {
                        Pattern::WildCard(_) | Pattern::Constant(_) => {
                            out.push_str(format!(" {}", Self::pattern_to_string(p)).as_str());
                        }
                        Pattern::Variant(v) => {
                            if v.typ.get_params().is_some_and(|t| !t.is_empty())
                                || v.typ.get_typargs().is_some_and(|t| !t.is_empty())
                            {
                                out.push_str(format!(" ({})", Self::pattern_to_string(p)).as_str());
                            } else {
                                out.push_str(format!(" {}", Self::pattern_to_string(p)).as_str());
                            }
                        }
                        Pattern::Tuple(_, _) => {
                            out.push_str(format!(" ({})", Self::pattern_to_string(p)).as_str());
                        }
                    }
                }
                out
            }
        }
    }

    fn get_comment() -> String {
        "-- ".to_string()
    }

    fn is_bool(&self) -> bool {
        matches!(self, HaskellType::Bool)
    }

    fn is_variant(&self) -> bool {
        matches!(self, HaskellType::Case(_))
    }

    fn is_primitive(&self) -> bool {
        matches!(
            self,
            HaskellType::Bool | HaskellType::Char | HaskellType::Int
        )
    }

    fn get_const_exp(&self) -> Expression<HaskellType> {
        match self {
            HaskellType::Int => Expression::Byte(12),
            HaskellType::Char => Expression::Char('x'),
            _ => panic!("Called on a non const exp"),
        }
    }

    fn is_tuple(&self) -> bool {
        matches!(self, HaskellType::Tuple(_))
    }
    fn get_tuple_template() -> Option<Template<Self>> {
        Some(Template(HaskellType::Tuple(Tuple::default())))
    }

    fn get_not_exhaustive() -> String {
        "non-exhaustive".to_string()
    }

    fn get_unreachable() -> String {
        "redundant".to_string()
    }

    fn get_not_exhaustive_regex() -> Regex {
        Regex::new(
            r"(?<inexhaustive>[a-z | _ | \d*]*.hs)(:\d*:\d*: warning: \[-Wincomplete-patterns\])",
        )
        .unwrap()
    }
    fn get_unreachable_regex() -> Regex {
        Regex::new(
            r"(?<unreachable>[a-z | _ | \d*]*.hs)(:\d*:\d*: warning: \[-Woverlapping-patterns\])",
        )
        .unwrap()
    }

    fn get_crash_regex() -> Regex {
        Regex::new(r"panic! \(the 'impossible' happened\)").unwrap()
    }
}

fn exp_to_string(e: &Expression<HaskellType>) -> String {
    match e {
        Expression::Match(m) => match_to_string(m),
        Expression::Var(v) => v.name.clone(),
        Expression::BottomType => "undefined".to_string(),
        Expression::Int(i) => i.to_string(),
        Expression::Bool(b) => {
            if *b {
                "True".to_string()
            } else {
                "False".to_string()
            }
        }
        Expression::Byte(b) => b.to_string(),
        Expression::Char(b) => format!("\'{b}\'"),
    }
}

fn match_to_string(m: &MatchExp<HaskellType>) -> String {
    let mut out = format!("case {} of \n", exp_to_string(&m.to_match));
    for (p, arm) in m.cases.iter().zip(&m.arms) {
        out.push_str(
            format!(
                "  {} -> {} \n",
                HaskellType::pattern_to_string(p),
                exp_to_string(arm)
            )
            .as_str(),
        );
    }
    out
}

impl Display for HaskellType {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        use HaskellType as H;
        match self {
            H::Tuple(t) => write!(f, "{}", t.name),
            H::Bool => write!(f, "Bool"),
            H::Char => write!(f, "Char"),
            H::Int => write!(f, "Int"),
            H::Base(b) => write!(f, "{b}"),
            H::Case(c) => write!(f, "{c}"),
            H::Generic(g) => write!(f, "{}", g.name),
        }
    }
}
