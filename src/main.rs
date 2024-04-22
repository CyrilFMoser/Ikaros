use rand::SeedableRng;
use rand_chacha::ChaCha8Rng;
use types::type_trait::Type;
mod types;
fn main() {
    let rng = ChaCha8Rng::from_entropy();
    let x = Scala {};
    x.is_subtype(&x);
    test(x, Scala {});
}

fn test<T: Type>(x: T, y: T) -> T {
    x.is_subtype(&y);
    x
}

pub struct Scala {}

impl Type for Scala {
    fn is_subtype(&self, other: &dyn Type) -> bool {
        todo!()
    }

    fn get_params(&self) -> &Vec<Self>
    where
        Self: Sized,
    {
        todo!()
    }

    fn get_params_mut(&mut self) -> &mut Vec<Self>
    where
        Self: Sized,
    {
        todo!()
    }

    fn get_typargs(&self) -> &Vec<Self>
    where
        Self: Sized,
    {
        todo!()
    }

    fn get_typargs_mut(&mut self) -> &mut Vec<Self>
    where
        Self: Sized,
    {
        todo!()
    }

    fn get_types(&self) -> Vec<types::type_template::Template<Self>>
    where
        Self: Sized,
    {
        todo!()
    }
}
