package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B{}
record R_A(I_B a, I_A b, I_B c) implements I_A{}
record R_B() implements I_A{}
record R_C() implements I_B{}
record R_D() implements I_B{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_A(var a, R_A(var b, var c, var d), var e) -> 0; 
  case R_A(var a, R_B(), R_C()) -> 1; 
  case R_A(var a, var b, R_D()) -> 2; 
  case R_B() -> 3; 
};
}

};
// Mutation information: 
// Expanded var WILDCARD at position 20 into: 
// {
//  R_C(var WILDCARD, var WILDCARD)
// }
//
