use crate::types::type_trait::Type;

#[derive(Clone)]
pub enum Pattern<T> {
    WildCard(WildCard<T>),
    Variant(Variant<T>),
}
#[derive(Clone)]
pub struct WildCard<T> {
    pub typ: T,
    pub annotate: bool,
}

#[derive(Clone)]
pub struct Variant<T> {
    pub typ: T,
    pub parameters: Vec<Pattern<T>>,
}
impl<LangTyp: Type + Clone> Variant<LangTyp> {
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
