use crate::matches::expression::Expression;
use crate::matches::expression::MatchExp;
use crate::matches::expression::Var;

use crate::types::type_trait::Type;
use std::borrow::Borrow;
use std::collections::HashMap;

use std::fmt::Debug;
use std::fmt::Display;

use std::hash::Hash;

use z3::ast::Ast;
use z3::ast::Bool;
use z3::ast::Datatype;
use z3::DatatypeAccessor;
use z3::DatatypeBuilder;
use z3::DatatypeSort;
use z3::RecFuncDecl;
use z3::SatResult;
use z3::Solver;
use z3::Sort;
use z3::Symbol;
use z3::{Config, Context};

pub struct Z3Checker<
    LangTyp: Type + Clone + PartialEq + Debug + Eq + Hash + Display + Ord + PartialOrd,
> {
    pub matchexp: MatchExp<LangTyp>,
}

impl<LangTyp: Type + Clone + PartialEq + Debug + Eq + Hash + Display + Ord + PartialOrd>
    Z3Checker<LangTyp>
{
    pub fn new(matchexp: MatchExp<LangTyp>) -> Z3Checker<LangTyp> {
        Z3Checker { matchexp }
    }

    pub fn check(
        &mut self,
        declarations: &[usize],
        all_types: &[LangTyp],
    ) -> (SatResult, Option<String>) {
        let mut cfg = Config::new();
        cfg.set_timeout_msec(500);

        let ctx = Context::new(&cfg);

        self.matchexp.cases.retain(|p| !p.is_const());

        if self.matchexp.cases.is_empty(){
            return (SatResult::Sat,Some(String::from("Pattern match is empty without constants")))
        }
        let mut typ = DatatypeBuilder::new(&ctx, "Type");

        typ = Self::add_bases(typ, declarations, all_types);

        typ = Self::add_cases(typ, declarations, all_types);

        for t in LangTyp::get_prelude_types() {
            typ = typ.variant(t.0.get_name(), vec![]);
        }
        if LangTyp::get_tuple_template().is_some() {
            typ = typ.variant(
                "Tuple",
                vec![
                    (
                        "first",
                        DatatypeAccessor::Datatype(Symbol::String("Type".to_string())),
                    ),
                    (
                        "second",
                        DatatypeAccessor::Datatype(Symbol::String("Type".to_string())),
                    ),
                ],
            );
        }
        typ = typ.variant("Wildcard", vec![]);
        typ = typ.variant(
            "Generic",
            vec![("name", DatatypeAccessor::Sort(Sort::string(&ctx)))],
        );
        let typ = typ.finish();

        let s = Solver::new(&ctx);

        let t1 = Datatype::new_const(&ctx, "t1", &typ.sort);

        let subcase = self.build_subcase(&ctx, &typ, declarations, all_types);
        let valid = self.build_valid(&ctx, &typ, declarations, all_types, &subcase);
        let matches = self.build_matches(&ctx, &typ, declarations, all_types, &t1);
        let constructable = self.build_constructable(&ctx, &typ, declarations, all_types);

        let to_match_type = Datatype::new_const(&ctx, "to_match_type", &typ.sort);

        let to_match_type_constraints =
            self.get_to_match_type_constraints(&ctx, &typ, &to_match_type, declarations, all_types);
        let to_match_type_constraints_ref: Vec<&Bool> = to_match_type_constraints.iter().collect();
        let to_match_type_constraints = &Bool::and(&ctx, &to_match_type_constraints_ref);

        //println!("TO_MATCH_TYPE_CONSTRAINTS: \n {to_match_type_constraints}");

        s.assert(to_match_type_constraints);

        s.assert(&subcase.apply(&[&t1, &to_match_type]).as_bool().unwrap());
        s.assert(&valid.apply(&[&t1]).as_bool().unwrap());
        s.assert(&constructable.apply(&[&t1]).as_bool().unwrap());
        s.assert(&matches.not());

        let result = s.check();

        if matches!(result, SatResult::Sat) {
            let model = s.get_model().unwrap();
            (
                result,
                Some(model.get_const_interp(&t1).unwrap().to_string()),
            )
        } else {
            (result, None)
        }
    }

    fn get_to_match_type_constraints<'a>(
        &'a self,
        ctx: &'a Context,
        typ: &'a DatatypeSort,
        t: &'a Datatype,
        declarations: &'a [usize],
        all_types: &'a [LangTyp],
    ) -> Vec<Bool<'a>> {
        let mut name_to_variant = HashMap::new();

        for (variant_id, decl_id) in declarations.iter().enumerate() {
            let cur_typ = all_types.get(*decl_id).unwrap();
            name_to_variant.insert(cur_typ.get_name(), variant_id); // Build up a mapping from the names of types to their corresponding z3 variant
        }
        // Do the same for prelude types
        let prelude_types = LangTyp::get_prelude_types();
        for prelude_typ in prelude_types.iter() {
            name_to_variant.insert(prelude_typ.0.get_name(), name_to_variant.len());
        }

        let cur_typ = if let Expression::Var(Var {
            name: _,
            typ: cur_typ,
        }) = self.matchexp.to_match.borrow()
        {
            cur_typ
        } else {
            todo!()
        };
        Self::to_z3(
            ctx,
            typ,
            t.clone(),
            cur_typ.clone(),
            &name_to_variant,
            false,
            true,
        )
    }

    fn build_matches<'a>(
        &mut self,
        ctx: &'a Context,
        typ: &'a DatatypeSort,
        declarations: &'a [usize],
        all_types: &'a [LangTyp],
        t: &'a Datatype,
    ) -> Bool<'a> {
        let mut name_to_variant = HashMap::new();

        for (variant_id, decl_id) in declarations.iter().enumerate() {
            let cur_typ = all_types.get(*decl_id).unwrap();
            name_to_variant.insert(cur_typ.get_name(), variant_id); // Build up a mapping from the names of types to their corresponding z3 variant
        }
        // Do the same for prelude types
        let prelude_types = LangTyp::get_prelude_types();
        for prelude_typ in prelude_types.iter() {
            name_to_variant.insert(prelude_typ.0.get_name(), name_to_variant.len());
        }

        let mut type_vec = Vec::new();
        let mut or_vec = vec![];
        for cur_pattern in &self.matchexp.cases {
            let cur_typ = cur_pattern.get_type();
            type_vec.push(cur_typ);
        }
        for cur_pos in 0..self.matchexp.cases.len() {
            let p_constraints = Self::to_z3(
                ctx,
                typ,
                t.clone(),
                type_vec.get(cur_pos).unwrap().clone(),
                &name_to_variant,
                true,
                false,
            );
            let p_constraints_ref: Vec<&Bool> = p_constraints.iter().collect();
            let p_and = Bool::and(ctx, &p_constraints_ref);
            or_vec.push(p_and.simplify());
        }

        let wildcard_tester = &typ.variants.get(typ.variants.len() - 2).unwrap().tester;

        let is_wildcard = wildcard_tester.apply(&[t]).as_bool().unwrap();
        or_vec.push(is_wildcard);

        let or_vec_ref: Vec<&Bool> = or_vec.iter().collect();
        let condition = Bool::or(ctx, &or_vec_ref).simplify();
        //println!("MATCHES CONDITION: \n{condition}");
        condition
    }

    fn build_typarg_eq<'a>(
        &mut self,
        ctx: &'a Context,
        typ: &'a DatatypeSort,
        declarations: &'a [usize],
        all_types: &'a [LangTyp],
    ) -> RecFuncDecl<'a> {
        let typarg_eq =
            RecFuncDecl::new(ctx, "typarg_eq", &[&typ.sort, &typ.sort], &Sort::bool(ctx));
        let typ1 = Datatype::new_const(ctx, "typ1_eq", &typ.sort);
        let typ2 = Datatype::new_const(ctx, "typ2_eq", &typ.sort);

        let equal = typ1._eq(&typ2);

        let mut or_vec = vec![equal];
        for (variant_id, decl_id) in declarations.iter().enumerate() {
            let cur_typ = all_types.get(*decl_id).unwrap();

            let mut cur_and_vec = Vec::new();

            let cur_tester = &typ.variants.get(variant_id).unwrap().tester;
            cur_and_vec.push(cur_tester.apply(&[&typ1]).as_bool().unwrap());
            cur_and_vec.push(cur_tester.apply(&[&typ2]).as_bool().unwrap());

            let cur_accessors = &typ.variants.get(variant_id).unwrap().accessors;

            if let Some(typargs) = cur_typ.get_typargs() {
                for i in 0..typargs.len() {
                    let cur_accessor = cur_accessors.get(i).unwrap();

                    let typ1_typarg = cur_accessor.apply(&[&typ1]).as_datatype().unwrap();
                    let typ2_typarg = cur_accessor.apply(&[&typ2]).as_datatype().unwrap();

                    let condition = typarg_eq
                        .apply(&[&typ1_typarg, &typ2_typarg])
                        .as_bool()
                        .unwrap();

                    cur_and_vec.push(condition);
                }
            }

            let cur_and_vec_ref: Vec<&Bool> = cur_and_vec.iter().collect();

            let cur_and = Bool::and(ctx, &cur_and_vec_ref);
            or_vec.push(cur_and);
        }
        let or_vec_ref: Vec<&Bool> = or_vec.iter().collect();
        let condition = Bool::or(ctx, &or_vec_ref);

        //println!("TYPARG_EQ_CONDITION: \n {condition}");
        typarg_eq.add_def(&[&typ1, &typ2], &condition);
        typarg_eq
    }

    fn build_subcase<'a>(
        &mut self,
        ctx: &'a Context,
        typ: &'a DatatypeSort,
        declarations: &'a [usize],
        all_types: &'a [LangTyp],
    ) -> RecFuncDecl<'a> {
        let subcase = RecFuncDecl::new(ctx, "subcase", &[&typ.sort, &typ.sort], &Sort::bool(ctx));
        let typ1 = Datatype::new_const(ctx, "typ1", &typ.sort);
        let typ2 = Datatype::new_const(ctx, "typ2", &typ.sort);

        let mut name_to_variant = HashMap::new();

        let mut base_testers = Vec::new();
        let mut base_tester_names = Vec::new();
        for (variant_id, decl_id) in declarations.iter().enumerate() {
            let cur_typ = all_types.get(*decl_id).unwrap();
            if cur_typ.is_base() {
                let tester = &typ.variants.get(variant_id).unwrap().tester;
                base_testers.push(tester);
                base_tester_names.push(cur_typ.get_name());
            }
            name_to_variant.insert(cur_typ.get_name(), variant_id); // Build up a mapping from the names of types to their corresponding z3 variant
        }

        // Build up name mapping for prelude types
        let prelude_types = LangTyp::get_prelude_types();
        for prelude_typ in prelude_types.iter() {
            name_to_variant.insert(prelude_typ.0.get_name(), name_to_variant.len());
        }

        let typarg_eq = self.build_typarg_eq(ctx, typ, declarations, all_types);

        let equal = typ1._eq(&typ2);

        let mut or_vec = vec![equal];
        for decl_id in declarations {
            let cur_typ = all_types.get(*decl_id).unwrap();
            if !cur_typ.is_variant() {
                continue;
            }
            // VARIANT <: TRAIT
            if let Some(extends) = cur_typ.get_bases() {
                let base = extends.first().unwrap();
                let base_id = name_to_variant.get(base.get_name()).unwrap();
                let tester = &typ.variants.get(*base_id).unwrap().tester;
                let typ2_is_base = tester.apply(&[&typ2]).as_bool().unwrap();

                let variant_id = name_to_variant.get(cur_typ.get_name()).unwrap();
                let typ1_tester = &typ.variants.get(*variant_id).unwrap().tester;
                let typ1_is_cur_typ = typ1_tester.apply(&[&typ1]).as_bool().unwrap();
                let typ1_extends = &typ
                    .variants
                    .get(*variant_id)
                    .unwrap()
                    .accessors
                    .last()
                    .unwrap()
                    .apply(&[&typ1])
                    .as_datatype()
                    .unwrap();

                let is_eq = typarg_eq.apply(&[typ1_extends, &typ2]).as_bool().unwrap();

                let condition = Bool::and(ctx, &[&typ2_is_base, &typ1_is_cur_typ, &is_eq]);
                or_vec.push(condition);
            }
            // VARIANT <: VARIANT
            if let Some(params) = cur_typ.get_params() {
                let num_typargs = if let Some(typargs) = cur_typ.get_typargs() {
                    typargs.len()
                } else {
                    0
                };
                let mut constraints = Vec::new();

                let variant_id = name_to_variant.get(cur_typ.get_name()).unwrap();
                let variant_tester = &typ.variants.get(*variant_id).unwrap().tester;

                let typ1_matches = variant_tester.apply(&[&typ1]).as_bool().unwrap();
                let typ2_matches = variant_tester.apply(&[&typ2]).as_bool().unwrap();

                constraints.push(typ1_matches);
                constraints.push(typ2_matches);

                let accessors = &typ.variants.get(*variant_id).unwrap().accessors;

                for i in 0..num_typargs {
                    let cur_accessor = accessors.get(i).unwrap();

                    let param1 = cur_accessor.apply(&[&typ1]).as_datatype().unwrap();
                    let param2 = cur_accessor.apply(&[&typ2]).as_datatype().unwrap();

                    let is_eq = typarg_eq.apply(&[&param1, &param2]).as_bool().unwrap();
                    constraints.push(is_eq);
                }

                for i in 0..params.len() {
                    let cur_accessor = accessors.get(i + num_typargs).unwrap();

                    let param1 = cur_accessor.apply(&[&typ1]).as_datatype().unwrap();
                    let param2 = cur_accessor.apply(&[&typ2]).as_datatype().unwrap();

                    let is_subcase = subcase.apply(&[&param1, &param2]).as_bool().unwrap();
                    constraints.push(is_subcase);
                }
                let constraints_ref: Vec<&Bool> = constraints.iter().collect();
                or_vec.push(Bool::and(ctx, &constraints_ref));
            }
        }
        if LangTyp::get_tuple_template().is_some() {
            let variant_id = typ.variants.len() - 3;
            let tuple_tester = &typ.variants.get(variant_id).unwrap().tester;

            let typ1_matches = tuple_tester.apply(&[&typ1]).as_bool().unwrap();
            let typ2_matches = tuple_tester.apply(&[&typ2]).as_bool().unwrap();

            let first_accessor = &typ
                .variants
                .get(variant_id)
                .unwrap()
                .accessors
                .first()
                .unwrap();
            let second_accessor = &typ
                .variants
                .get(variant_id)
                .unwrap()
                .accessors
                .get(1)
                .unwrap();

            let typ1_first = first_accessor.apply(&[&typ1]).as_datatype().unwrap();
            let typ2_first = first_accessor.apply(&[&typ2]).as_datatype().unwrap();
            let first_sub = subcase
                .apply(&[&typ1_first, &typ2_first])
                .as_bool()
                .unwrap();

            let typ1_second = second_accessor.apply(&[&typ1]).as_datatype().unwrap();
            let typ2_second = second_accessor.apply(&[&typ2]).as_datatype().unwrap();
            let second_sub = subcase
                .apply(&[&typ1_second, &typ2_second])
                .as_bool()
                .unwrap();

            let and_tuple = Bool::and(
                ctx,
                &[&typ1_matches, &typ2_matches, &first_sub, &second_sub],
            );
            or_vec.push(and_tuple);
        }
        let or_vec_ref: Vec<&Bool> = or_vec.iter().collect();
        let actual_subcase = Bool::or(ctx, &or_vec_ref);

        let wildcard_tester = &typ.variants.get(typ.variants.len() - 2).unwrap().tester;

        let typ1_wildcard = wildcard_tester.apply(&[&typ1]).as_bool().unwrap();
        let typ2_wildcard = wildcard_tester.apply(&[&typ2]).as_bool().unwrap();

        let condition = Bool::or(ctx, &[&actual_subcase, &typ2_wildcard, &typ1_wildcard]);
        //println!("SUBCASES CONDITION: \n {condition}");
        subcase.add_def(&[&typ1, &typ2], &condition);
        subcase
    }

    fn build_constructable<'a>(
        &mut self,
        ctx: &'a Context,
        typ: &'a DatatypeSort,
        declarations: &'a [usize],
        all_types: &'a [LangTyp],
    ) -> RecFuncDecl<'a> {
        let constructable = RecFuncDecl::new(ctx, "constructable", &[&typ.sort], &Sort::bool(ctx));
        let constructable_type = Datatype::new_const(ctx, "constructable_type", &typ.sort);

        let mut name_to_variant = HashMap::new();

        let mut typ1_not_base_vec = vec![];

        let mut base_testers = Vec::new();
        let mut base_tester_names = Vec::new();
        for (variant_id, decl_id) in declarations.iter().enumerate() {
            let cur_typ = all_types.get(*decl_id).unwrap();
            if cur_typ.is_base() {
                let tester = &typ.variants.get(variant_id).unwrap().tester;
                typ1_not_base_vec.push(
                    tester
                        .apply(&[&constructable_type])
                        .as_bool()
                        .unwrap()
                        .not(),
                );

                base_testers.push(tester);
                base_tester_names.push(cur_typ.get_name());
            }
            name_to_variant.insert(cur_typ.get_name(), variant_id); // Build up a mapping from the names of types to their corresponding z3 variant
        }

        // Make sure that no bases appear in parameters, as they can't be constructed directly
        for (variant_id, decl_id) in declarations.iter().enumerate() {
            let cur_typ = all_types.get(*decl_id).unwrap();
            if cur_typ.is_variant() && !cur_typ.get_params().unwrap().is_empty() {
                let mut cur_and_vec = Vec::new();
                let num_typargs = cur_typ.get_typargs().unwrap().len();
                let accessors = &typ.variants.get(variant_id).unwrap().accessors;

                for (i, cur_param) in cur_typ.get_params().unwrap().iter().enumerate() {
                    if !cur_param.is_base()
                        && !cur_param.is_generic()
                        && !cur_param
                            .get_params()
                            .is_some_and(|params| !params.is_empty())
                    {
                        continue;
                    }
                    let cur_z3 = accessors
                        .get(i + num_typargs)
                        .unwrap()
                        .apply(&[&constructable_type])
                        .as_datatype()
                        .unwrap();

                    cur_and_vec.push(constructable.apply(&[&cur_z3]).as_bool().unwrap());

                    // every parameter has to be constructable
                }
                if cur_and_vec.is_empty() {
                    continue;
                }
                let cur_and_vec_ref: Vec<&Bool> = cur_and_vec.iter().collect();
                let no_base_params = Bool::and(ctx, &cur_and_vec_ref).simplify();

                let tester = &typ.variants.get(variant_id).unwrap().tester;
                let is_cur_typ = tester.apply(&[&constructable_type]).as_bool().unwrap();

                typ1_not_base_vec.push(is_cur_typ.implies(&no_base_params));
            }
        }

        if LangTyp::get_tuple_template().is_some() {
            let tuple_id = typ.variants.len() - 3;
            let tuple_tester = &typ.variants.get(tuple_id).unwrap().tester;

            let is_tuple = tuple_tester
                .apply(&[&constructable_type])
                .as_bool()
                .unwrap();

            let tuple_accessors = &typ.variants.get(tuple_id).unwrap().accessors;
            let first = tuple_accessors
                .first()
                .unwrap()
                .apply(&[&constructable_type])
                .as_datatype()
                .unwrap();
            let second = tuple_accessors
                .get(1)
                .unwrap()
                .apply(&[&constructable_type])
                .as_datatype()
                .unwrap();

            let first_constructable = constructable.apply(&[&first]).as_bool().unwrap();
            let second_constructable = constructable.apply(&[&second]).as_bool().unwrap();

            let both_constructable = Bool::and(ctx, &[&first_constructable, &second_constructable]);

            typ1_not_base_vec.push(is_tuple.implies(&both_constructable));
        }
        let typ1_not_base_vec_ref: Vec<&Bool> = typ1_not_base_vec.iter().collect();

        let condition = Bool::and(ctx, &typ1_not_base_vec_ref);
        //println!("CONSTRUCTABLE: \n{condition}");
        constructable.add_def(&[&constructable_type], &condition);
        constructable
    }

    fn build_valid<'a>(
        &mut self,
        ctx: &'a Context,
        typ: &'a DatatypeSort,
        declarations: &'a [usize],
        all_types: &'a [LangTyp],
        subcase: &'a RecFuncDecl<'a>,
    ) -> RecFuncDecl<'a> {
        let valid = RecFuncDecl::new(ctx, "valid", &[&typ.sort], &Sort::bool(ctx));
        let t = Datatype::new_const(ctx, "t", &typ.sort);

        let mut name_to_variant = HashMap::new();

        for (variant_id, decl_id) in declarations.iter().enumerate() {
            let cur_typ = all_types.get(*decl_id).unwrap();
            name_to_variant.insert(cur_typ.get_name(), variant_id); // Build up a mapping from the names of types to their corresponding z3 variant
        }
        // Do the same for prelude types
        let prelude_types = LangTyp::get_prelude_types();
        for prelude_typ in prelude_types.iter() {
            name_to_variant.insert(prelude_typ.0.get_name(), name_to_variant.len());
        }

        let mut and_vec = Vec::new();
        for (variant_id, decl_id) in declarations.iter().enumerate() {
            let cur_typ = all_types.get(*decl_id).unwrap();

            let num_typargs = if let Some(typargs) = cur_typ.get_typargs() {
                typargs.len()
            } else {
                0
            };

            let all_accessor = &typ.variants.get(variant_id).unwrap().accessors;
            let tester = &typ.variants.get(variant_id).unwrap().tester;

            let all_valid: Vec<Bool> = all_accessor
                .iter()
                .skip(num_typargs) // we don't care whether the typeargs are valid, we only compare with typargeq anyways
                .map(|accessor| valid.apply(&[&accessor.apply(&[&t])]).as_bool().unwrap())
                .collect(); // every accessor is valid
            let all_valid_ref: Vec<&Bool> = all_valid.iter().collect();

            let accessors_valid = Bool::and(ctx, &all_valid_ref).simplify();

            let is_cur_typ = tester.apply(&[&t]).as_bool().unwrap();
            if cur_typ.is_base() {
                /*if !all_valid_ref.is_empty() {
                    and_vec.push(is_cur_typ.implies(&accessors_valid));
                }*/
                continue;
            }
            let mut constraints = Self::to_z3(
                ctx,
                typ,
                t.clone(),
                cur_typ.clone(),
                &name_to_variant,
                false,
                true,
            );
            constraints.remove(0); // remove the first element, as it is the same as the implication
            if let Some(parameters) = cur_typ.get_params() {
                let accessors = &typ.variants.get(variant_id).unwrap().accessors;

                let wildcard_tester = &typ.variants.get(typ.variants.len() - 2).unwrap().tester;

                let num_typargs = cur_typ.get_typargs().unwrap().len();

                for (i, param) in parameters.iter().enumerate() {
                    let new_z3 = accessors
                        .get(i + num_typargs) // the first accessors are typargs
                        .unwrap()
                        .apply(&[&t])
                        .as_datatype()
                        .unwrap();
                    let mut or_wild_card =
                        vec![wildcard_tester.apply(&[&new_z3]).as_bool().unwrap()];
                    let conditions =
                        if !param.is_complex() && !param.is_generic() && !param.is_tuple() {
                            Self::to_z3(
                                ctx,
                                typ,
                                new_z3,
                                param.clone(),
                                &name_to_variant,
                                false,
                                true,
                            )
                        } else {
                            self.to_z3_subcase(
                                ctx,
                                typ,
                                new_z3,
                                param.clone(),
                                &name_to_variant,
                                subcase,
                            )
                        };

                    let conditions_ref: Vec<&Bool> = conditions.iter().collect();
                    or_wild_card.push(Bool::and(ctx, &conditions_ref));

                    let or_wild_card_ref: Vec<&Bool> = or_wild_card.iter().collect();
                    let or_condition = Bool::or(ctx, &or_wild_card_ref);
                    constraints.push(or_condition);
                }
            }
            if let Some(extends) = cur_typ.get_bases() {
                let accessors = &typ.variants.get(variant_id).unwrap().accessors;
                let wildcard_tester = &typ.variants.get(typ.variants.len() - 2).unwrap().tester;

                let num_before = accessors.len() - extends.len();
                for (i, base) in extends.iter().enumerate() {
                    let new_z3 = accessors
                        .get(i + num_before) // the first accessors are typargs, then params
                        .unwrap()
                        .apply(&[&t])
                        .as_datatype()
                        .unwrap();
                    constraints.push(wildcard_tester.apply(&[&new_z3]).as_bool().unwrap().not());
                    constraints.append(&mut Self::to_z3(
                        ctx,
                        typ,
                        new_z3,
                        base.clone(),
                        &name_to_variant,
                        false,
                        true,
                    ))
                }
            }
            let constraints_ref: Vec<&Bool> = constraints.iter().collect();
            let mut correct_instantiations = Bool::and(ctx, &constraints_ref);
            if let Some(typargs) = cur_typ.get_typargs() {
                let accessors = &typ.variants.get(variant_id).unwrap().accessors;

                for (i, typarg) in typargs.iter().enumerate() {
                    let generic_accessor = accessors.get(i).unwrap();
                    let instantiation = generic_accessor.apply(&[&t]).as_datatype().unwrap();

                    let generic_constructor = &typ.variants.last().unwrap().constructor;
                    let to_replace = generic_constructor
                        .apply(&[&z3::ast::String::from_str(ctx, typarg.get_name()).unwrap()])
                        .as_datatype()
                        .unwrap();
                    correct_instantiations =
                        correct_instantiations.substitute(&[(&to_replace, &instantiation)]);
                }
            }
            correct_instantiations = correct_instantiations.simplify();
            let correct = Bool::and(ctx, &[&correct_instantiations, &accessors_valid]);
            and_vec.push(is_cur_typ.implies(&correct));
        }
        if LangTyp::get_tuple_template().is_some() {
            let variant_id = typ.variants.len() - 3;
            let tuple_tester = &typ.variants.get(variant_id).unwrap().tester;
            let is_tuple = tuple_tester.apply(&[&t]).as_bool().unwrap();

            let tuple_accessors = &typ.variants.get(variant_id).unwrap().accessors;
            let first_accessor = tuple_accessors.first().unwrap();
            let first = first_accessor.apply(&[&t]).as_datatype().unwrap();

            let second_accessor = tuple_accessors.get(1).unwrap();
            let second = second_accessor.apply(&[&t]).as_datatype().unwrap();

            let first_valid = valid.apply(&[&first]).as_bool().unwrap();
            let second_valid = valid.apply(&[&second]).as_bool().unwrap();

            let condition = is_tuple.implies(&Bool::and(ctx, &[&first_valid, &second_valid]));

            and_vec.push(condition);
        }

        let and_vec_ref: Vec<&Bool> = and_vec.iter().collect();
        let valid_condition = Bool::and(ctx, &and_vec_ref);
        //println!("VALID CONDITION: \n{valid_condition}");
        valid.add_def(&[&t], &valid_condition);
        valid
    }

    fn construct_z3<'a>(
        &mut self,
        ctx: &'a Context,
        typ: &'a DatatypeSort,
        cur_typ: LangTyp,
        name_to_variant: &HashMap<&str, usize>,
    ) -> Datatype<'a> {
        if cur_typ.is_generic() {
            // If our current type is a generic the current z3 typ has to be a generic with the same name
            // unless the generic name is WILDCARD, where we add a wildcard instead.
            if cur_typ.get_name() == "WILDCARD" {
                let wild_card_constructor = &typ
                    .variants
                    .get(typ.variants.len() - 2)
                    .unwrap()
                    .constructor;
                let wild_card = wild_card_constructor.apply(&[]).as_datatype().unwrap();
                return wild_card;
            }
            let generic = typ
                .variants
                .last()
                .unwrap()
                .constructor
                .apply(&[&z3::ast::String::from_str(ctx, cur_typ.get_name()).unwrap()])
                .as_datatype()
                .unwrap();
            return generic;
        }
        if cur_typ.is_primitive() {
            let variant_id = name_to_variant.get(cur_typ.get_name()).unwrap();
            let primitive_constructor = &typ.variants.get(*variant_id).unwrap().constructor;
            return primitive_constructor.apply(&[]).as_datatype().unwrap();
        }
        if cur_typ.is_tuple() {
            let variant_id = typ.variants.len() - 3;
            let tuple_constructor = &typ.variants.get(variant_id).unwrap().constructor;
            let tuple_params = cur_typ.get_params().unwrap();

            let first = tuple_params.first().unwrap();
            let second = tuple_params.get(1).unwrap();

            let first_z3 = self.construct_z3(ctx, typ, first.clone(), name_to_variant);
            let second_z3 = self.construct_z3(ctx, typ, second.clone(), name_to_variant);

            let tuple = tuple_constructor
                .apply(&[&first_z3, &second_z3])
                .as_datatype()
                .unwrap();
            return tuple;
        }
        let num_typargs = if let Some(typargs) = cur_typ.get_typargs() {
            typargs.len()
        } else {
            0
        };
        let variant_id = name_to_variant.get(cur_typ.get_name()).unwrap();
        let variant_constructor = &typ.variants.get(*variant_id).unwrap().constructor;

        let mut param_vec = Vec::new();

        if let Some(typargs) = cur_typ.get_typargs() {
            for typarg in typargs {
                let cur_typarg_z3 = self.construct_z3(ctx, typ, typarg.clone(), name_to_variant);
                param_vec.push(cur_typarg_z3);
            }
        }
        // fill parameters with wildcards, as they don't define the type
        let num_accessors = typ.variants.get(*variant_id).unwrap().accessors.len();

        let wild_card_constructor = &typ
            .variants
            .get(typ.variants.len() - 2)
            .unwrap()
            .constructor;
        let wild_card = wild_card_constructor.apply(&[]).as_datatype().unwrap();

        for _ in num_typargs..num_accessors {
            param_vec.push(wild_card.clone());
        }

        let param_vec_ref: Vec<&dyn Ast> = param_vec.iter().map(|t| t as &dyn Ast).collect();

        let variant = variant_constructor
            .apply(&param_vec_ref)
            .as_datatype()
            .unwrap();
        variant
    }

    fn to_z3_subcase<'a>(
        &mut self,
        ctx: &'a Context,
        typ: &'a DatatypeSort,
        cur_typ_z3: Datatype<'a>,
        cur_typ: LangTyp,
        name_to_variant: &HashMap<&str, usize>,
        subcase: &'a RecFuncDecl<'a>,
    ) -> Vec<Bool<'a>> {
        if cur_typ.is_generic() {
            // If our current type is a generic the current z3 typ has to be a generic with the same name
            // unless the generic name is WILDCARD, where we add a wildcard instead.
            if cur_typ.get_name() == "WILDCARD" {
                let wild_card_constructor = &typ
                    .variants
                    .get(typ.variants.len() - 2)
                    .unwrap()
                    .constructor;
                let wild_card = wild_card_constructor.apply(&[]).as_datatype().unwrap();
                return vec![cur_typ_z3._eq(&wild_card)];
            }
            let generic = typ
                .variants
                .last()
                .unwrap()
                .constructor
                .apply(&[&z3::ast::String::from_str(ctx, cur_typ.get_name()).unwrap()])
                .as_datatype()
                .unwrap();
            return vec![subcase.apply(&[&cur_typ_z3, &generic]).as_bool().unwrap()];
        }
        if cur_typ.is_primitive() {
            let variant_id = name_to_variant.get(cur_typ.get_name()).unwrap();
            let primitive_tester = &typ.variants.get(*variant_id).unwrap().tester;
            return vec![primitive_tester.apply(&[&cur_typ_z3]).as_bool().unwrap()];
        }
        if cur_typ.is_tuple() {
            let variant_id = typ.variants.len() - 3;
            let mut constraints = Vec::new();
            let tuple_tester = &typ.variants.get(variant_id).unwrap().tester;
            constraints.push(tuple_tester.apply(&[&cur_typ_z3]).as_bool().unwrap());

            let tuple_accessors = &typ.variants.get(variant_id).unwrap().accessors;
            let first_accessor = tuple_accessors.first().unwrap();
            let first = first_accessor.apply(&[&cur_typ_z3]).as_datatype().unwrap();

            let second_accessor = tuple_accessors.get(1).unwrap();
            let second = second_accessor.apply(&[&cur_typ_z3]).as_datatype().unwrap();

            let tuple_params = cur_typ.get_params().unwrap();

            let first_z3 = self.construct_z3(
                ctx,
                typ,
                tuple_params.first().unwrap().clone(),
                name_to_variant,
            );
            constraints.push(subcase.apply(&[&first, &first_z3]).as_bool().unwrap());

            let second_z3 = self.construct_z3(
                ctx,
                typ,
                tuple_params.get(1).unwrap().clone(),
                name_to_variant,
            );
            constraints.push(subcase.apply(&[&second, &second_z3]).as_bool().unwrap());

            return constraints;
        }
        let mut constraints = Vec::new();

        let cur_z3_constructed = self.construct_z3(ctx, typ, cur_typ, name_to_variant);

        constraints.push(
            subcase
                .apply(&[&cur_typ_z3, &cur_z3_constructed])
                .as_bool()
                .unwrap(),
        ); // check the cur_typ is a subtype of it

        constraints
    }

    fn to_z3<'a>(
        ctx: &'a Context,
        typ: &'a DatatypeSort,
        cur_typ_z3: Datatype<'a>,
        cur_typ: LangTyp,
        name_to_variant: &HashMap<&str, usize>,
        expand_params: bool,
        no_pattern: bool,
    ) -> Vec<Bool<'a>> {
        let is_wild = if !no_pattern {
            let wild_card_tester = &typ.variants.get(typ.variants.len() - 2).unwrap().tester;

            wild_card_tester.apply(&[&cur_typ_z3]).as_bool().unwrap()
        } else {
            Bool::from_bool(ctx, false)
        };
        if cur_typ.is_generic() {
            // If our current type is a generic the current z3 typ has to be a generic with the same name
            // unless the generic name is WILDCARD, where we add a wildcard instead.
            if cur_typ.get_name() == "WILDCARD" {
                if !no_pattern {
                    return vec![Bool::from_bool(ctx, true)];
                }
                let wild_card_constructor = &typ
                    .variants
                    .get(typ.variants.len() - 2)
                    .unwrap()
                    .constructor;
                let wild_card = wild_card_constructor.apply(&[]).as_datatype().unwrap();
                return vec![cur_typ_z3._eq(&wild_card)];
            }
            let generic = typ
                .variants
                .last()
                .unwrap()
                .constructor
                .apply(&[&z3::ast::String::from_str(ctx, cur_typ.get_name()).unwrap()])
                .as_datatype()
                .unwrap();
            let condition = Bool::or(ctx, &[&is_wild, &cur_typ_z3._eq(&generic)]).simplify();
            return vec![condition];
        }
        if cur_typ.is_primitive() {
            let variant_id = name_to_variant.get(cur_typ.get_name()).unwrap();
            let primitive_tester = &typ.variants.get(*variant_id).unwrap().tester;
            let is_primitive = primitive_tester.apply(&[&cur_typ_z3]).as_bool().unwrap();
            let condition = Bool::or(ctx, &[&is_wild, &is_primitive]).simplify();
            return vec![condition];
        }
        if cur_typ.is_tuple() {
            let variant_id = typ.variants.len() - 3;
            let tuple_tester = &typ.variants.get(variant_id).unwrap().tester;

            let tuple_accessors = &typ.variants.get(variant_id).unwrap().accessors;
            let first_accessor = tuple_accessors.first().unwrap();
            let first = first_accessor.apply(&[&cur_typ_z3]).as_datatype().unwrap();

            let second_accessor = tuple_accessors.get(1).unwrap();
            let second = second_accessor.apply(&[&cur_typ_z3]).as_datatype().unwrap();

            let tuple_params = cur_typ.get_params().unwrap();

            let wild_card_tester = &typ.variants.get(typ.variants.len() - 2).unwrap().tester;

            let first_is_wild = wild_card_tester.apply(&[&first]).as_bool().unwrap();

            let first_constraints = Self::to_z3(
                ctx,
                typ,
                first,
                tuple_params.first().unwrap().clone(),
                name_to_variant,
                expand_params,
                no_pattern,
            );
            let first_constraints_ref: Vec<&Bool> = first_constraints.iter().collect();
            let first_and = Bool::and(ctx, &first_constraints_ref);
            let first_match = if !no_pattern {
                Bool::or(ctx, &[&first_is_wild, &first_and])
            } else {
                first_and
            };

            let second_is_wild = wild_card_tester.apply(&[&second]).as_bool().unwrap();
            let second_constraints = Self::to_z3(
                ctx,
                typ,
                second,
                tuple_params.get(1).unwrap().clone(),
                name_to_variant,
                expand_params,
                no_pattern,
            );
            let is_tuple = tuple_tester.apply(&[&cur_typ_z3]).as_bool().unwrap();

            let second_constraints_ref: Vec<&Bool> = second_constraints.iter().collect();
            let second_and = Bool::and(ctx, &second_constraints_ref);
            let second_match = if !no_pattern {
                Bool::or(ctx, &[&second_is_wild, &second_and])
            } else {
                second_and
            };

            let tuple_condition = Bool::and(ctx, &[&is_tuple, &first_match, &second_match]);
            let condition = Bool::or(ctx, &[&tuple_condition, &is_wild]).simplify();
            return vec![condition];
        }
        let mut constraints = Vec::new();
        let variant_id = name_to_variant.get(cur_typ.get_name()).unwrap();

        let tester = &typ.variants.get(*variant_id).unwrap().tester;
        constraints.push(tester.apply(&[&cur_typ_z3]).as_bool().unwrap()); // Check it is the correct type
        if let Some(typargs) = cur_typ.get_typargs() {
            let accessors = &typ.variants.get(*variant_id).unwrap().accessors;
            for (id, typarg) in typargs.iter().enumerate() {
                let new_z3 = accessors
                    .get(id)
                    .unwrap()
                    .apply(&[&cur_typ_z3])
                    .as_datatype()
                    .unwrap();
                let mut cur_constraints = Self::to_z3(
                    ctx,
                    typ,
                    new_z3,
                    typarg.clone(),
                    name_to_variant,
                    false,
                    no_pattern,
                );
                constraints.append(&mut cur_constraints);
            }
        }

        if expand_params {
            if let Some(parameters) = cur_typ.get_params() {
                let accessors = &typ.variants.get(*variant_id).unwrap().accessors;
                let num_typargs = if let Some(typargs) = cur_typ.get_typargs() {
                    typargs.len()
                } else {
                    0
                };

                for (id, param) in parameters.iter().enumerate() {
                    let new_z3 = accessors
                        .get(id + num_typargs)
                        .unwrap()
                        .apply(&[&cur_typ_z3])
                        .as_datatype()
                        .unwrap();

                    let wild_card_tester =
                        &typ.variants.get(typ.variants.len() - 2).unwrap().tester;
                    let is_wild = wild_card_tester.apply(&[&new_z3]).as_bool().unwrap();

                    let mut cur_constraints = Self::to_z3(
                        ctx,
                        typ,
                        new_z3,
                        param.clone(),
                        name_to_variant,
                        expand_params,
                        no_pattern,
                    );
                    if !no_pattern {
                        let cur_constraints_ref: Vec<&Bool> = cur_constraints.iter().collect();
                        if cur_constraints_ref.is_empty() {
                            constraints.push(is_wild);
                        } else {
                            let cur_and = Bool::and(ctx, &cur_constraints_ref);
                            let condition = Bool::or(ctx, &[&cur_and, &is_wild]);
                            constraints.push(condition);
                        }
                    } else {
                        constraints.append(&mut cur_constraints);
                    }
                }
            }
        }
        constraints
    }

    fn add_cases<'a>(
        mut typ: DatatypeBuilder<'a>,
        declarations: &'a [usize],
        all_types: &'a [LangTyp],
    ) -> DatatypeBuilder<'a> {
        for decl_ind in declarations {
            let cur_type = all_types.get(*decl_ind).unwrap();
            if cur_type.is_variant() {
                let typargs: Vec<String> = cur_type
                    .get_typargs()
                    .unwrap()
                    .clone()
                    .into_iter()
                    .map(|t| t.get_name().to_string())
                    .collect();

                let mut z3_typargs: Vec<(&str, DatatypeAccessor)> = typargs
                    .iter()
                    .map(|t| (t.as_str(), DatatypeAccessor::Datatype("Type".into())))
                    .collect();

                let num_params = cur_type.get_params().unwrap().len();
                let mut param_names = Vec::new();
                for (i, c) in ('a'..='z').enumerate() {
                    if i >= num_params {
                        break;
                    }
                    param_names.push(format!("{}_{}", cur_type.get_name(), c));
                }

                let mut z3_params: Vec<(&str, DatatypeAccessor)> = param_names
                    .iter()
                    .map(|t| (t.as_str(), DatatypeAccessor::Datatype("Type".into())))
                    .collect();

                z3_typargs.append(&mut z3_params);
                let extends_name = format!("{}_extends", cur_type.get_name());
                z3_typargs.push((
                    extends_name.as_str(),
                    DatatypeAccessor::Datatype("Type".into()),
                ));

                typ = typ.variant(cur_type.get_name(), z3_typargs);
            }
        }
        typ
    }

    fn add_bases<'a>(
        mut typ: DatatypeBuilder<'a>,
        declarations: &'a [usize],
        all_types: &'a [LangTyp],
    ) -> DatatypeBuilder<'a> {
        for decl_ind in declarations {
            let cur_type = all_types.get(*decl_ind).unwrap();
            if cur_type.is_base() {
                let typargs: Vec<String> = cur_type
                    .get_typargs()
                    .unwrap()
                    .clone()
                    .into_iter()
                    .map(|t| t.get_name().to_string())
                    .collect();

                let z3_typargs = typargs
                    .iter()
                    .map(|t| (t.as_str(), DatatypeAccessor::Datatype("Type".into())))
                    .collect();

                typ = typ.variant(cur_type.get_name(), z3_typargs);
            }
        }
        typ
    }
}
