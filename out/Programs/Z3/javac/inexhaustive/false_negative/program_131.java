package Program_0; 

class TestClass {sealed interface I_A<A>{}
sealed interface I_B<B>{}
record R_A<C>() implements I_A<C>{}
record R_C<D>(I_B<D> a) implements I_B<D>{}
record R_D<E>() implements I_B<E>{}
public static void main(String args[]) {

I_B<Boolean> v_a = null;
Integer v_b = switch (v_a){
  case R_D() -> 0; 
  case R_C(R_C(var a)) -> 1; 
};
}

};
