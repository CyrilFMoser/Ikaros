use crate::types::type_trait::Type;

use super::expression::Expression;

#[derive(Clone, Debug, Hash, PartialEq, Eq, PartialOrd, Ord)]
pub enum Pattern<T: PartialOrd> {
    WildCard(WildCard<T>),
    Variant(Variant<T>),
    Constant(Constant<T>),
    Tuple(Box<Pattern<T>>, Box<Pattern<T>>),
}

impl<LangTyp: Type + Clone + PartialOrd> Pattern<LangTyp> {
    pub fn depth(&self) -> u32 {
        match self {
            Pattern::WildCard(_) => 1,
            Pattern::Variant(v) => 1 + v.parameters.iter().map(|p| p.depth()).max().unwrap_or(0),
            Pattern::Constant(_) => 1,
            Pattern::Tuple(p1, p2) => 1 + p1.depth().max(p2.depth()),
        }
    }

    pub fn match_same(&self, other: &Pattern<LangTyp>) -> bool {
        if self == other {
            return true;
        }
        match (&self, other) {
            (Pattern::WildCard(_), Pattern::WildCard(_)) => true,
            (Pattern::Variant(v1), Pattern::Variant(v2)) => {
                if v1.typ.get_name() == v2.typ.get_name()
                    && v1.parameters.len() == v2.parameters.len()
                {
                    for (p1, p2) in v1.parameters.iter().zip(v2.parameters.iter()) {
                        if !p1.match_same(p2) {
                            return false;
                        }
                    }
                }
                false
            }
            (Pattern::Tuple(p1_first, p1_second), Pattern::Tuple(p2_first, p2_second)) => {
                p1_first.match_same(p2_first) && p1_second.match_same(p2_second)
            }
            (Pattern::Constant(c1), Pattern::Constant(c2)) => c1 == c2,
            _ => false,
        }
    }

    pub fn get_type(&self) -> LangTyp {
        match self {
            Pattern::WildCard(_) => {
                let mut generic = LangTyp::get_generic_template().0;
                generic.set_name("WILDCARD".to_string());
                generic
            }
            Pattern::Constant(c) => c.typ.clone(),
            Pattern::Variant(v) => {
                let mut new_typ = v.typ.clone();
                for (i, param) in new_typ.get_params_mut().unwrap().iter_mut().enumerate() {
                    let pattern_typ = v.parameters.get(i).unwrap().get_type();
                    *param = pattern_typ;
                }
                new_typ
            }
            Pattern::Tuple(p1, p2) => {
                let mut tuple = LangTyp::get_tuple_template().unwrap();
                let params = tuple.0.get_params_mut().unwrap();
                params.push(p1.get_type());
                params.push(p2.get_type());
                tuple.0
            }
        }
    }

    pub fn replace_type(&mut self, typ: LangTyp) {
        match self {
            Pattern::WildCard(wild_card) => wild_card.typ = typ,
            Pattern::Variant(variant) => variant.typ = typ,
            Pattern::Constant(constant) => constant.typ = typ,
            Pattern::Tuple(pattern1, pattern2) => {
                let params = typ.get_params().unwrap();
                pattern1.replace_type(params.first().unwrap().clone());
                pattern2.replace_type(params.get(1).unwrap().clone());
            }
        }
    }

    pub fn get_actual_type(&self) -> LangTyp {
        match self {
            Pattern::WildCard(w) => w.typ.clone(),
            Pattern::Constant(c) => c.typ.clone(),
            Pattern::Variant(v) => {
                let mut new_typ = v.typ.clone();
                if let Some(params) = new_typ.get_params_mut() {
                    for (i, param) in params.iter_mut().enumerate() {
                        let pattern_typ = v.parameters.get(i).unwrap().get_actual_type();
                        *param = pattern_typ;
                    }
                }
                new_typ
            }
            Pattern::Tuple(p1, p2) => {
                let mut tuple = LangTyp::get_tuple_template().unwrap();
                let params = tuple.0.get_params_mut().unwrap();
                params.push(p1.get_actual_type());
                params.push(p2.get_actual_type());
                tuple.0
            }
        }
    }

    pub fn is_const(&self) -> bool {
        match &self {
            Pattern::WildCard(_) => false,
            Pattern::Variant(v) => v.parameters.iter().any(|p| p.is_const()),
            Pattern::Constant(_) => true,
            Pattern::Tuple(p1, p2) => p1.is_const() || p2.is_const(),
        }
    }

    /// Checks if a pattern has no more non-wildcards as children
    pub fn is_leaf(&self) -> bool {
        match &self {
            Pattern::WildCard(_) => false,
            Pattern::Variant(v) => v
                .parameters
                .iter()
                .all(|p| matches!(p, Pattern::WildCard(_))),
            Pattern::Constant(_) => true,
            Pattern::Tuple(p1, p2) => {
                matches!(**p1, Pattern::WildCard(_)) && matches!(**p2, Pattern::WildCard(_))
            }
        }
    }

    pub fn get_place_holder(&self) -> Pattern<LangTyp> {
        match self {
            Pattern::Constant(_) | Pattern::WildCard(_) => self.clone(),
            Pattern::Variant(v) => Variant::get_variant_pattern(&v.typ),
            Pattern::Tuple(p1, p2) => {
                let w1 = Pattern::WildCard(WildCard {
                    typ: p1.get_actual_type(),
                    annotate: false,
                });
                let w2 = Pattern::WildCard(WildCard {
                    typ: p2.get_actual_type(),
                    annotate: false,
                });
                Pattern::Tuple(Box::new(w1), Box::new(w2))
            }
        }
    }
}
#[derive(Clone, Debug, Hash, PartialEq, Eq, PartialOrd, Ord)]
pub struct WildCard<T> {
    pub typ: T,
    pub annotate: bool,
}
#[derive(Clone, Debug, Hash, PartialEq, Eq, PartialOrd, Ord)]

pub struct Constant<T: PartialOrd> {
    pub typ: T,
    pub exp: Box<Expression<T>>,
}

#[derive(Clone, Debug, Hash, PartialEq, Eq, PartialOrd, Ord)]
pub struct Variant<T: PartialOrd> {
    pub typ: T,
    pub parameters: Vec<Pattern<T>>,
}
impl<LangTyp: Type + Clone + PartialOrd> Variant<LangTyp> {
    pub fn get_variant_pattern(typ: &LangTyp) -> Pattern<LangTyp> {
        let mut parameters = Vec::new();
        if let Some(params) = typ.get_params() {
            let num_args = params.len();
            for i in 0..num_args {
                let w = WildCard {
                    typ: params.get(i).unwrap().clone(),
                    annotate: false,
                };
                parameters.push(Pattern::WildCard(w))
            }
        }
        let pt = Variant {
            typ: typ.clone(),
            parameters,
        };
        Pattern::Variant(pt)
    }
}
