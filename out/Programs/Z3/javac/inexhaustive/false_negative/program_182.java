package Program_0; 

class TestClass {sealed interface I_A<A>{}
sealed interface I_B<B>{}
record R_A<C>() implements I_A<C>{}
record R_B<D>() implements I_A<D>{}
record R_C<E>(I_B<E> a, I_A<E> b) implements I_B<E>{}
record R_D<F>() implements I_B<F>{}
record R_E() implements I_B<I_A<Boolean>>{}
public static void main(String args[]) {

I_B<I_A<Boolean>> v_a = null;
Integer v_b = switch (v_a){
  case R_D() -> 0; 
  case R_E() -> 1; 
  case R_C(R_C(var a, var b), var c) -> 2; 
  case R_C(R_D(), R_B()) -> 3; 
  case R_C(var a, R_A()) -> 4; 
  case R_C(R_E(), var a) -> 5; 
};
}

};
