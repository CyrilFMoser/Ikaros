package Program_0; 

class TestClass {sealed interface I_A<A>{}
sealed interface I_B<B>{}
record R_A<C>() implements I_A<C>{}
record R_B<D>() implements I_A<D>{}
record R_C<E>() implements I_A<E>{}
record R_D<F>(I_B<F> a, F b, F c) implements I_B<F>{}
record R_E() implements I_B<I_A<Boolean>>{}
public static void main(String args[]) {

I_B<I_A<Boolean>> v_a = null;
Integer v_b = switch (v_a){
  case R_E() -> 0; 
  case R_D(var a, var b, R_B()) -> 1; 
  case R_D(R_E(), var a, var b) -> 2; 
  case R_D(var a, var b, R_C()) -> 3; 
  case R_D(R_D(var a, var b, var c), var d, R_A()) -> 4; 
};
}

};
