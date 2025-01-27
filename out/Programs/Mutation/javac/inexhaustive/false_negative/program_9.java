package Program_0; 

class TestClass {sealed interface I_A{}
record R_A(I_A a, I_A b) implements I_A{}
record R_B(R_A a, I_A b) implements I_A{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_B(R_A(var a, R_B(var b, var c)), R_A(var d, R_A(var e, var f))) -> 0; 
  case R_B(var a, R_A(var b, R_B(var c, var d))) -> 1; 
  case R_B(R_A(var a, R_A(var b, var c)), var d) -> 2; 
  case R_B(var a, R_B(var b, var c)) -> 3; 
  case R_A(var a, var b) -> 4; 
};
}

};
// Mutation information: 
// Generalizing a concrete pattern in R_A(var WILDCARD, var WILDCARD) at pattern position 19 to a wildcard pattern :
// {
//  var WILDCARD
// }
//
