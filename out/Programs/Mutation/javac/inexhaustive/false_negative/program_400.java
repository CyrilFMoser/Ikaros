package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
sealed interface I_B{}
record R_A<D, C>(I_A<I_B, D> a, I_A<C, I_B> b) implements I_A<C, D>{}
record R_B<E>() implements I_A<R_A<E, E>, E>{}
record R_C<F, G>() implements I_A<F, G>{}
record R_E() implements I_B{}
public static void main(String args[]) {

I_A<I_B, R_E> v_a = null;
Integer v_b = switch (v_a){
  case R_C() -> 0; 
  case R_A(R_A(var a, var b), R_A(var c, var d)) -> 1; 
  case R_A(var a, R_C()) -> 2; 
  case R_A(R_C(), var a) -> 3; 
};
}

};
// Mutation information: 
// Generalizing a concrete pattern in R_A(var WILDCARD, var WILDCARD) at pattern position 2 to a wildcard pattern :
// {
//  var WILDCARD
// }
//
