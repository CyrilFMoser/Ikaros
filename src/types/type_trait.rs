use crate::matches::{expression::Expression, pattern::Pattern, statements::Statement};

use super::{template::Template, variance::Variance};

pub trait Type {
    fn is_subtype(&self, other: &Self) -> bool;

    fn set_name(&mut self, name: String);

    fn get_name(&self) -> &str;

    /// generates an appropriate name that is not in names, sets the name of self to that name, and adds it to names
    fn generate_name(&mut self, names: &mut Vec<String>);

    /// gets the variances for each type argument (if present) of this type. Has to be as long as the type argument vector
    fn get_variances(&self) -> Option<&Vec<Variance>>;

    fn get_variances_mut(&mut self) -> Option<&mut Vec<Variance>>;

    fn can_declare_variance() -> bool;

    fn is_generic(&self) -> bool;

    fn is_variant(&self) -> bool;

    fn get_generic_template() -> Template<Self>
    where
        Self: Sized;

    // minimal number of parameters this type needs, None if there is no minimum
    fn get_min_params(&self) -> Option<u32>;

    // maximal number of parameters this type can use, None if there is no maximum
    fn get_max_params(&self) -> Option<u32>;

    fn get_params(&self) -> Option<&Vec<Self>>
    where
        Self: Sized;

    fn get_params_mut(&mut self) -> Option<&mut Vec<Self>>
    where
        Self: Sized;

    fn get_typargs(&self) -> Option<&Vec<Self>>
    where
        Self: Sized;

    fn get_typargs_mut(&mut self) -> Option<&mut Vec<Self>>
    where
        Self: Sized;
    // Returns a template vector with all available types as templates
    fn get_types() -> Vec<Template<Self>>
    where
        Self: Sized;
    /// Returns a vector of types that are always present in the program (primitives for example)
    fn get_prelude_types() -> Vec<Template<Self>>
    where
        Self: Sized;

    /// Returns true if this type is interesting to match against
    fn match_against(&self) -> bool;

    fn get_number_type() -> Self;

    fn statement_to_string(s: &Statement<Self>) -> String
    where
        Self: Sized;

    /// Returns this types case types as templates
    fn get_case_templates(&self) -> Option<Vec<Template<Self>>>
    where
        Self: Sized;
    /// Returns if we can consider a type as a base
    fn is_base(&self) -> bool;
    /// Returns if this (type, but intended for base) base can be instantiated to give a new base (as in scala traits)
    fn allows_base_instantiation(&self) -> bool;

    /// Returns if this type is able to be a subcase of multiple bases (case classes in scala can, haskell variants can't)
    fn allows_multiple_bases(&self) -> bool;

    ///  Returns if a type can add its own type arguments (Scala case classes can, haskell variants can't)
    fn can_have_own_typargs(&self) -> bool;

    /// Returns this types bases if it has any
    fn get_bases(&self) -> Option<&Vec<Self>>
    where
        Self: Sized;

    /// Returns this types bases if it has any
    fn get_bases_mut(&mut self) -> Option<&mut Vec<Self>>
    where
        Self: Sized;

    ///  Returns if a type is useable outside of the declaration (Scala case classes are, haskell variants aren't)
    fn is_local(&self) -> bool;

    ///  Returns if a type can be refined into new cases (traits into case classes,
    ///  OR type combinations of types such as type unions) *EXHAUSTIVELY*
    fn is_sealed(&self) -> bool;

    ///  Returns if we consider a type to be complex (traits, case classes for example)
    fn is_complex(&self) -> bool;

    /// Returns if a type needs a declaration for us to use it (case classes, but not type unions)
    fn needs_declaration(&self) -> bool;

    /// Treat the supplied types as declarations and return the program as a string declaring all these types
    fn declarations_to_string(types: &[&Self]) -> String
    where
        Self: Sized;

    fn get_min_num_cases(&self) -> u32;

    fn get_compiler_name() -> String;

    fn get_compiler_args() -> Option<Box<[String]>>;

    fn get_suffix() -> String;

    fn get_test_script() -> String;

    fn pattern_to_string(p: &Pattern<Self>) -> String
    where
        Self: Sized;

    fn get_comment() -> String;

    fn get_compiler_path() -> String;

    fn is_bool(&self) -> bool;

    fn is_primitive(&self) -> bool;

    fn get_const_exp(&self) -> Expression<Self>
    where
        Self: Sized;
}
