package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B<A, B>{}
record R_A(I_A a, I_B<I_A, I_A> b) implements I_A{}
record R_B() implements I_A{}
record R_C<C, D>(D a) implements I_B<C, D>{}
record R_D<F, E>() implements I_B<E, F>{}
record R_E<G, H>() implements I_B<G, H>{}
public static void main(String args[]) {

R_A v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_A(var a, R_E()), var b) -> 0; 
  case R_A(R_A(var a, R_C(var b)), var c) -> 1; 
  case R_A(var a, R_E()) -> 2; 
  case R_A(R_A(R_B(), var a), var b) -> 3; 
  case R_A(R_A(R_A(var a, var b), R_D()), R_C(var c)) -> 4; 
  case R_A(R_B(), var a) -> 5; 
  case R_A(var a, R_D()) -> 6; 
};
}

};
// Mutation information: 
// Expanded var WILDCARD at position 1 into: 
// {
//  R_C(var WILDCARD)
// }
//
