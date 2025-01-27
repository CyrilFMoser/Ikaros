package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B{}
record R_A() implements I_A{}
record R_B(I_B a, I_A b) implements I_A{}
record R_C() implements I_B{}
record R_D() implements I_B{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_A() -> 0; 
  case R_B(var a, R_A()) -> 1; 
};
}

};
// Mutation information: 
// Generalizing a concrete pattern in R_C(var WILDCARD, var WILDCARD) at pattern position 24 to a wildcard pattern :
// {
//  var WILDCARD
// }
//
