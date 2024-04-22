use super::type_template::Template;

pub trait Type {
    fn is_subtype(&self, other: &dyn Type) -> bool;

    fn get_params(&self) -> &Vec<Self>
    where
        Self: Sized;

    fn get_params_mut(&mut self) -> &mut Vec<Self>
    where
        Self: Sized;

    fn get_typargs(&self) -> &Vec<Self>
    where
        Self: Sized;

    fn get_typargs_mut(&mut self) -> &mut Vec<Self>
    where
        Self: Sized;

    fn get_types(&self) -> Vec<Template<Self>>
    where
        Self: Sized;
}
