use crate::matches::expression::Expression;
use crate::matches::expression::MatchExp;
use crate::matches::pattern::Pattern;
use crate::matches::statements::Declaration;
use crate::matches::statements::Statement;
use crate::matches::statements::VarDecl;
use crate::types::type_trait::Type;
use std::fmt::Debug;
use std::fmt::Display;
use std::hash::Hash;
pub struct RestructedProgram<
    LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
> {
    pub types: Vec<LangTyp>,
    pub to_match_type: LangTyp,
    pub patterns: Vec<Pattern<LangTyp>>,
}

impl<
        LangTyp: Type + Clone + PartialEq + Debug + Ord + PartialOrd + Eq + Hash + Display + Sync + Send,
    > RestructedProgram<LangTyp>
{
    pub fn output_prog(&self) -> String {
        let types: Vec<&LangTyp> = self.types.iter().collect();
        let declarations = LangTyp::declarations_to_string(&types);

        let mut statements = Vec::new();
        let var_decl = VarDecl::new(
            "v_a".to_string(),
            self.to_match_type.clone(),
            Expression::BottomType,
        );
        let var = Expression::Var(var_decl.get_var());
        statements.push(Statement::Decl(Declaration::Var(var_decl)));

        let mut arms = Vec::new();
        for i in 0..self.patterns.len() {
            arms.push(Expression::Int(i as u32));
        }
        let to_match = Box::new(var);

        let match_exp = MatchExp {
            to_match,
            cases: self.patterns.clone(),
            arms,
            removed_pattern: None,
        };

        let match_var_decl = VarDecl::new(
            "v_b".to_string(),
            LangTyp::get_number_type(),
            Expression::Match(match_exp),
        );
        statements.push(Statement::Decl(Declaration::Var(match_var_decl)));

        let ms = statements.iter().fold(String::new(), |current, s| {
            format!("{}\n{}", current, LangTyp::statement_to_string(s))
        });
        format!("{}{}", declarations, ms)
    }
}
