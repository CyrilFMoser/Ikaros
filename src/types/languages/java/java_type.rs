use std::fmt::Display;

use regex::Regex;

use crate::{
    matches::{
        expression::{Expression, MatchExp},
        pattern::{Pattern, Variant},
        statements::{Declaration, Statement, VarDecl},
    },
    types::{template::Template, type_trait::Type, variance::Variance},
};

use super::{generic::Generic, interface::Interface, record::Record};
#[derive(Clone, Debug, Hash, PartialEq, Eq, PartialOrd, Ord)]
pub enum JavaType {
    Interface(Interface),
    Record(Record),
    Generic(Generic),
    Int,
    Char,
    Bool,
    Byte,
}

impl JavaType {
    fn subtype_primitive(&self, other: &Self) -> bool {
        *self == *other
    }
}

impl Type for JavaType {
    fn is_subtype(&self, other: &Self) -> bool {
        if self == other {
            return !self.is_generic(); // only allow subtypes of non generics
        }
        match self {
            JavaType::Bool | JavaType::Byte | JavaType::Char | JavaType::Int => {
                self.subtype_primitive(other)
            }
            JavaType::Record(rec) => rec.subtype_record(other),
            JavaType::Interface(tr) => tr.subtype_interface(other),
            _ => false,
        }
    }

    fn get_params(&self) -> Option<&Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            JavaType::Record(rec) => Some(&rec.parameters),
            _ => None,
        }
    }

    fn get_params_mut(&mut self) -> Option<&mut Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            JavaType::Record(rec) => Some(&mut rec.parameters),
            _ => None,
        }
    }

    fn get_typargs(&self) -> Option<&Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            JavaType::Record(rec) => Some(&rec.typargs),
            JavaType::Interface(tr) => Some(&tr.typargs),
            _ => None,
        }
    }

    fn get_typargs_mut(&mut self) -> Option<&mut Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            JavaType::Record(rec) => Some(&mut rec.typargs),
            JavaType::Interface(tr) => Some(&mut tr.typargs),
            _ => None,
        }
    }

    fn get_types() -> Vec<Template<Self>>
    where
        Self: Sized,
    {
        use JavaType as T;
        let types = [
            T::Interface(Interface::default()),
            T::Record(Record::default()),
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
        use JavaType as T;
        let types = [T::Bool, T::Byte, T::Char, T::Int];
        types.into_iter().map(Template).collect()
    }

    fn get_case_templates(&self) -> Option<Vec<Template<Self>>>
    where
        Self: Sized,
    {
        match self {
            JavaType::Interface(_) => Some(vec![Template(JavaType::Record(Record::default()))]),
            _ => None,
        }
    }

    fn allows_base_instantiation(&self) -> bool {
        matches!(self, JavaType::Interface(_))
    }

    fn can_have_own_typargs(&self) -> bool {
        matches!(self, JavaType::Record(_) | JavaType::Interface(_))
    }

    fn is_local(&self) -> bool {
        matches!(self, JavaType::Generic(_))
    }

    fn is_sealed(&self) -> bool {
        matches!(self, JavaType::Interface(_) | JavaType::Record(_))
    }

    fn is_complex(&self) -> bool {
        matches!(self, JavaType::Interface(_) | JavaType::Record(_))
    }

    fn needs_declaration(&self) -> bool {
        matches!(
            self,
            JavaType::Interface(_) | JavaType::Record(_) | JavaType::Generic(_)
        )
    }

    fn set_name(&mut self, name: String) {
        match self {
            JavaType::Interface(tr) => tr.name = name,
            JavaType::Record(rec) => rec.name = name,
            JavaType::Generic(g) => g.name = name,
            _ => (),
        }
    }

    fn get_name(&self) -> &str {
        match self {
            JavaType::Interface(tr) => &tr.name,
            JavaType::Record(rec) => &rec.name,
            JavaType::Generic(g) => &g.name,
            JavaType::Int => "Integer",
            JavaType::Char => "Char",
            JavaType::Bool => "Boolean",
            JavaType::Byte => "Byte",
        }
    }

    fn generate_name(&mut self, names: &mut Vec<String>) {
        let mut prefix = String::from(match self {
            JavaType::Interface(_) => "I_",
            JavaType::Record(_) => "R_",
            JavaType::Generic(_) => "",
            _ => return,
        });
        let others_count = match self {
            JavaType::Interface(_) => names.iter().filter(|s| s.starts_with("I_")).count(),
            JavaType::Record(_) => names.iter().filter(|s| s.starts_with("R_")).count(),
            JavaType::Generic(_) => names.iter().filter(|s| !s.contains('_')).count(),
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

    fn get_generic_template() -> Template<JavaType> {
        Template(JavaType::Generic(Generic {
            name: String::new(),
            id: 0,
        }))
    }

    fn get_variances(&self) -> Option<&Vec<Variance>> {
        match self {
            JavaType::Record(rec) => Some(&rec.variances),
            JavaType::Interface(tr) => Some(&tr.variances),
            _ => None,
        }
    }

    fn get_variances_mut(&mut self) -> Option<&mut Vec<Variance>> {
        match self {
            JavaType::Record(rec) => Some(&mut rec.variances),
            JavaType::Interface(tr) => Some(&mut tr.variances),
            _ => None,
        }
    }

    fn is_base(&self) -> bool {
        matches!(self, JavaType::Interface(_))
    }

    fn can_declare_variance() -> bool {
        false
    }

    fn is_generic(&self) -> bool {
        matches!(self, JavaType::Generic(_))
    }

    fn is_variant(&self) -> bool {
        matches!(self, JavaType::Record(_))
    }

    fn get_number_type() -> Self {
        JavaType::Int
    }

    fn get_bases(&self) -> Option<&Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            JavaType::Record(rec) => Some(&rec.extends),
            _ => None,
        }
    }

    fn get_bases_mut(&mut self) -> Option<&mut Vec<Self>>
    where
        Self: Sized,
    {
        match self {
            JavaType::Record(rec) => Some(&mut rec.extends),
            _ => None,
        }
    }

    fn get_min_params(&self) -> Option<u32> {
        None
    }

    fn get_max_params(&self) -> Option<u32> {
        match self {
            JavaType::Record(_) => None,
            JavaType::Interface(_)
            | JavaType::Generic(_)
            | JavaType::Int
            | JavaType::Char
            | JavaType::Byte
            | JavaType::Bool => Some(0),
        }
    }

    fn declarations_to_string(types: &[&Self]) -> String
    where
        Self: Sized,
    {
        let mut out = String::from("class TestClass {");
        let interfaces = types.iter().filter(|t| matches!(t, Self::Interface(_)));
        for tr in interfaces {
            out.push_str("sealed interface ");
            out.push_str(tr.get_name());
            if let Some(typargs) = tr.get_typargs() {
                let n = typargs.len();
                if n > 0 {
                    out.push('<');
                    for i in 0..n {
                        out.push_str(typargs.get(i).unwrap().get_name());
                        out.push_str(", ");
                    }
                    out.pop();
                    out.pop();
                    out.push('>');
                }
            }
            out.push_str("{}\n");
        }
        let records = types.iter().filter(|t| matches!(t, Self::Record(_)));
        for rec in records {
            out.push_str("record ");
            out.push_str(rec.to_string().as_str());
            out.push('(');
            let mut param_names = 'a'..='z'; // Assume that there are leq than 52 parameters in a case class
            if let Some(params) = rec.get_params() {
                for param in params {
                    out.push_str(format!("{} {}, ", param, param_names.next().unwrap()).as_str());
                }
                if !params.is_empty() {
                    out.pop(); // remove ','
                    out.pop(); // remove ' '
                }
            }
            out.push(')');
            if let Some(extends) = rec.get_bases() {
                out.push_str(" implements ");
                for tr in extends {
                    out.push_str(format!("{},", tr).as_str());
                }
                out.pop(); // remove ,
            }
            out.push_str("{}\n");
        }
        out.push_str("public static void main(String args[]) {\n");
        out
    }

    fn statement_to_string(s: &Statement<JavaType>) -> String {
        match s {
            Statement::Decl(Declaration::Var(VarDecl {
                name,
                typ_annotation: _,
                typ,
                exp,
            })) => {
                format!("{typ} {name} = {};", exp_to_string(exp))
            }
        }
    }

    fn get_min_num_cases(&self) -> u32 {
        1
    }

    fn get_compiler_name() -> String {
        "javac".to_string()
    }

    fn get_compiler_path() -> String {
        "javac".to_string()
    }

    fn get_compiler_args() -> Option<Box<[String]>> {
        None
    }

    fn get_suffix() -> String {
        "java".to_string()
    }

    fn get_test_script() -> String {
        todo!();
    }

    fn pattern_to_string(p: &Pattern<JavaType>) -> String {
        match p {
            Pattern::Constant(c) => exp_to_string(&c.exp),
            Pattern::Tuple(_, _) => panic!("No tuples in java"),
            Pattern::WildCard(_) => "var WILDCARD".to_string(),
            Pattern::Variant(Variant { typ, parameters }) => {
                let mut out = typ.get_name().to_string();
                if let Some(typargs) = typ.get_typargs() {
                    let mut typarg_string = String::new();
                    for typarg in typargs {
                        typarg_string.push_str(format!("{typarg}, ").as_str());
                    }
                    if !typargs.is_empty() {
                        typarg_string.pop(); // comma
                        typarg_string.pop(); // space
                        out.push_str(format!("<{typarg_string}>").as_str());
                    }
                }

                out.push('(');
                for p in parameters {
                    out.push_str(format!("{}, ", JavaType::pattern_to_string(p)).as_str());
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
        matches!(self, JavaType::Bool)
    }

    fn is_primitive(&self) -> bool {
        matches!(
            self,
            JavaType::Bool | JavaType::Byte | JavaType::Char | JavaType::Int
        )
    }

    fn get_const_exp(&self) -> Expression<JavaType> {
        match self {
            JavaType::Byte => Expression::Byte(0),
            JavaType::Int => Expression::Byte(12),
            JavaType::Char => Expression::Char('x'),
            _ => panic!("Called on a non const exp"),
        }
    }

    fn get_tuple_template() -> Option<Template<Self>> {
        None
    }
    fn is_tuple(&self) -> bool {
        false
    }

    fn get_not_exhaustive() -> String {
        "does not cover all possible input values".to_string()
    }

    fn get_unreachable() -> String {
        "dominated".to_string()
    }

    fn get_not_exhaustive_regex() -> Regex {
        Regex::new(
            r"(?<inexhaustive>[a-z | _ | \d*]*.java)(:\d*: error: the switch expression does not cover all possible input values)",
        )
        .unwrap()
    }

    fn get_unreachable_regex() -> Regex {
        Regex::new(
            r"(?<unreachable>[a-z | _ | \d*]*.java)(:\d*: error: this case label is dominated by a preceding case label)",
        ).unwrap()
    }
}

fn exp_to_string(e: &Expression<JavaType>) -> String {
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

fn match_to_string(m: &MatchExp<JavaType>) -> String {
    let mut out = format!("switch ({}){{\n", exp_to_string(&m.to_match));
    for (p, arm) in m.cases.iter().zip(&m.arms) {
        let mut raw_pattern = JavaType::pattern_to_string(p);
        let mut new_pattern;
        let mut name_count = 0;
        let mut names = Vec::new();
        loop {
            let prefix = ('a'..='z').nth(name_count % 26).unwrap().to_string();
            let mut count = 0;
            let mut cur_name = prefix.clone();
            while names.contains(&cur_name) {
                count += 1;
                cur_name = format!("{}_{}", prefix.clone(), count);
            }
            names.push(cur_name.clone());
            new_pattern =
                raw_pattern.replacen("var WILDCARD", format!("var {cur_name}").as_str(), 1);
            if new_pattern != raw_pattern {
                raw_pattern = new_pattern;
                name_count += 1;
            } else {
                break;
            }
        }
        out.push_str(format!("  case {} -> {}; \n", new_pattern, exp_to_string(arm)).as_str());
    }
    out.push_str("};\n}\n\n}"); // first switch, then main method, then MyClass. only works if we have exactly one match statement of course
    out
}

impl Display for JavaType {
    fn fmt(&self, f: &mut std::fmt::Formatter<'_>) -> std::fmt::Result {
        use JavaType as JT;
        match self {
            JT::Bool => write!(f, "Boolean"),
            JT::Char => write!(f, "Character"),
            JT::Int => write!(f, "Integer"),
            JT::Byte => write!(f, "Byte"),
            JT::Interface(tr) => write!(f, "{tr}"),
            JT::Record(rec) => write!(f, "{rec}"),
            JT::Generic(g) => write!(f, "{}", g.name),
        }
    }
}
