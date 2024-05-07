use super::expression::{Expression, Var};

#[derive(Clone)]
pub enum Statement<LangTyp> {
    Decl(Declaration<LangTyp>),
}
#[derive(Clone)]

pub enum Declaration<LangTyp> {
    Var(VarDecl<LangTyp>),
}
#[derive(Clone)]
pub struct VarDecl<LangTyp> {
    pub name: String,
    pub typ_annotation: bool,
    pub typ: LangTyp,
    pub exp: Expression<LangTyp>,
}

impl<LangTyp: Clone> VarDecl<LangTyp> {
    pub fn new(name: String, typ: LangTyp, exp: Expression<LangTyp>) -> VarDecl<LangTyp> {
        VarDecl {
            name,
            typ_annotation: true,
            typ,
            exp,
        }
    }
    pub fn get_var(&self) -> Var<LangTyp> {
        Var {
            name: self.name.clone(),
            typ: self.typ.clone(),
        }
    }
}
