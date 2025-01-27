package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
record R_A<C, D>(I_A<C, D> a, I_A<D, C> b) implements I_A<C, D>{}
record R_B<F, E>() implements I_A<F, E>{}
public static void main(String args[]) {

I_A<Character, Byte> v_a = null;
Integer v_b = switch (v_a){
  case R_A(var a, R_A(var b, var c)) -> 0; 
  case R_B() -> 1; 
};
}

};
// Mutation information: 
// Generalizing a concrete pattern in R_A(var WILDCARD, var WILDCARD, var WILDCARD) at pattern position 9 to a wildcard pattern :
// {
//  var WILDCARD
// }
//
