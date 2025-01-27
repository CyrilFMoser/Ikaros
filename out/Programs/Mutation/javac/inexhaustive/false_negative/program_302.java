package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B{}
record R_A(I_B a, I_A b, I_B c) implements I_A{}
record R_C() implements I_B{}
record R_D() implements I_B{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_D(), var a, var b) -> 0; 
  case R_A(var a, var b, R_D()) -> 1; 
  case R_A(R_C(), var a, R_C()) -> 2; 
};
}

};
// Mutation information: 
// Expanded var WILDCARD at position 16 into: 
// {
//  R_A(var WILDCARD, var WILDCARD, var WILDCARD)
// }
//
