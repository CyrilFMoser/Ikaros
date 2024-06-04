use crate::matches::expression::MatchExp;
use crate::types::languages::haskell::base;
use crate::types::type_trait::Type;
use std::collections::HashSet;
use std::fmt::Debug;
use std::fmt::Display;
use std::hash::Hash;
use z3::ast;
use z3::ast::Array;
use z3::ast::Ast;
use z3::ast::Bool;
use z3::ast::Datatype;
use z3::ast::Int;
use z3::DatatypeAccessor;
use z3::DatatypeBuilder;
use z3::DatatypeSort;
use z3::FuncDecl;
use z3::RecFuncDecl;
use z3::Solver;
use z3::Sort;
use z3::Symbol;
use z3::{Config, Context};

pub struct Z3Checker<LangTyp: Type + Clone + PartialEq + Debug + Eq + Hash + Display> {
    pub matchexp: MatchExp<LangTyp>,
}

impl<LangTyp: Type + Clone + PartialEq + Debug + Eq + Hash + Display> Z3Checker<LangTyp> {
    pub fn check(&mut self, declarations: &Vec<usize>, all_types: &Vec<LangTyp>) {
        let cfg = Config::new();
        let ctx = Context::new(&cfg);

        let mut typ = DatatypeBuilder::new(&ctx, "Type")
            .variant(
                "Base",
                vec![
                    ("base_name", DatatypeAccessor::Sort(Sort::string(&ctx))),
                    (
                        "base_typargs",
                        DatatypeAccessor::Sort(Sort::array(
                            &ctx,
                            &Sort::int(&ctx),
                            &Sort::uninterpreted(&ctx, Symbol::String("Type".to_string())),
                        )),
                    ),
                ],
            )
            .variant(
                "Case",
                vec![
                    ("case_name", DatatypeAccessor::Sort(Sort::string(&ctx))),
                    (
                        "case_typargs",
                        DatatypeAccessor::Sort(Sort::array(
                            &ctx,
                            &Sort::int(&ctx),
                            &Sort::uninterpreted(&ctx, Symbol::String("Type".to_string())),
                        )),
                    ),
                    (
                        "case_params",
                        DatatypeAccessor::Sort(Sort::array(
                            &ctx,
                            &Sort::int(&ctx),
                            &Sort::uninterpreted(&ctx, Symbol::String("Type".to_string())),
                        )),
                    ),
                    (
                        "extends",
                        DatatypeAccessor::Datatype(Symbol::String("Type".to_string())),
                    ),
                ],
            )
            .variant(
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
        for t in LangTyp::get_prelude_types() {
            typ = typ.variant(t.0.get_name(), vec![]);
        }

        let typ = typ.finish();
        let t1 = Datatype::new_const(&ctx, "t1", &typ.sort);
        let t2 = Datatype::new_const(&ctx, "t2", &typ.sort);

        let valid = self.build_valid(&ctx, &typ, declarations, all_types);

        let s = Solver::new(&ctx);
        s.assert(&Datatype::distinct(&ctx, &[&t1, &t2]));
        s.assert(&subtype(&ctx, &t1, &t2, &typ));

        println!("{:?}", s.check());
        println!("{}", s.get_model().unwrap());
    }

    pub fn build_valid<'a>(
        &mut self,
        ctx: &'a Context,
        typ: &'a DatatypeSort,
        declarations: &'a Vec<usize>,
        all_types: &'a [LangTyp],
    ) -> RecFuncDecl<'a> {
        let valid = RecFuncDecl::new(ctx, "valid", &[&typ.sort], &Sort::bool(ctx));
        let t = Datatype::new_const(ctx, "t", &typ.sort);

        let mut available_base_names = Vec::new();
        let mut available_case_names = Vec::new();

        let base_tester = &typ.variants.first().unwrap().tester;
        let t_is_base = base_tester.apply(&[&t]).as_bool().unwrap();

        let case_tester = &typ.variants.get(1).unwrap().tester;
        let t_is_case = case_tester.apply(&[&t]).as_bool().unwrap();

        let name_accessor = typ.variants.first().unwrap().accessors.first().unwrap();
        let typarg_accessor = typ.variants.first().unwrap().accessors.get(1).unwrap();
        let typarg_array = typarg_accessor.apply(&[&t]).as_array().unwrap();

        let t_name = name_accessor.apply(&[&t]).as_string().unwrap();
        println!("HERE");

        let mut typarg_valid_vec = Vec::new(); // contains for all traits: (name == TRAIT_NAME) => (ALL TYPARGS VALID)
        for decl_id in declarations {
            let typ = all_types.get(*decl_id).unwrap();
            if typ.is_base() || typ.is_variant() {
                if typ.is_base() {
                    available_base_names.push(typ.get_name());
                } else {
                    available_case_names.push(typ.get_name());
                }
                let mut valid_typargs = Vec::new();

                let typargs = typ.get_typargs().unwrap();
                for i in 0..typargs.len() {
                    let cur_typarg = typarg_array.select(&Int::from_u64(ctx, i as u64));
                    let appl = valid.apply(&[&cur_typarg]);
                    println!("FINISHED");
                    valid_typargs.push(appl.as_bool().unwrap());
                }
                let name_eq = t_name._eq(&ast::String::from_str(ctx, typ.get_name()).unwrap());

                let valid_typargs_ref_vec: Vec<&Bool> = valid_typargs.iter().collect();
                let all_typargs_valid = Bool::and(ctx, &valid_typargs_ref_vec);

                typarg_valid_vec.push(name_eq.implies(&all_typargs_valid));
            }
        }
        let names_mapped: Vec<Bool> = available_base_names
            .iter()
            .map(|cur_name| t_name._eq(&ast::String::from_str(ctx, cur_name).unwrap()))
            .collect();
        let names_mapped_ref: Vec<&Bool> = names_mapped.iter().collect();
        let base_name_constr = t_is_base.implies(&Bool::or(ctx, &names_mapped_ref)); // If it is a base, it has to have an available name

        let names_mapped: Vec<Bool> = available_case_names
            .iter()
            .map(|cur_name| t_name._eq(&ast::String::from_str(ctx, cur_name).unwrap()))
            .collect();
        let names_mapped_ref: Vec<&Bool> = names_mapped.iter().collect();
        let case_name_constr = t_is_case.implies(&Bool::or(ctx, &names_mapped_ref)); // If it is a case, it has to have an available name

        let typarg_valid_ref: Vec<&Bool> = typarg_valid_vec.iter().collect();
        let all_typargs_valid = Bool::and(ctx, &typarg_valid_ref);
        valid.add_def(
            &[&t],
            &Bool::and(
                ctx,
                &[&base_name_constr, &case_name_constr, &all_typargs_valid],
            ),
        );
        valid
    }
}
fn subtype<'a>(
    ctx: &'a Context,
    t1: &'a Datatype<'a>,
    t2: &'a Datatype<'a>,
    typ: &'a DatatypeSort,
) -> Bool<'a> {
    let equal = t1._eq(t2);
    let trait_tester = &typ.variants.first().unwrap().tester;
    let t2_trait = trait_tester.apply(&[t2]).as_bool().unwrap();

    let case_class_tester = &typ.variants.get(1).unwrap().tester;
    let t1_cc = case_class_tester.apply(&[t1]).as_bool().unwrap();

    let t1_accessor = &typ.variants.get(1).unwrap().accessors;
    let t1_extends = t1_accessor.get(3).unwrap().apply(&[t1]);

    let cc_tr = Bool::and(ctx, &[&t1_cc, &t2_trait]);
    let extends_matches = t1_extends.as_datatype().unwrap()._eq(t2);

    let actual_sub = Bool::and(ctx, &[&cc_tr, &extends_matches]);
    Bool::or(ctx, &[&equal, &actual_sub])
}
