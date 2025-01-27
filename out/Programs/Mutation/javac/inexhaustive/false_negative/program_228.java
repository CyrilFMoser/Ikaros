package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B{}
record R_A() implements I_A{}
record R_B(I_A a) implements I_A{}
record R_D() implements I_B{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_A() -> 0; 
  case R_B(R_B(var a)) -> 1; 
};
}

};
// Mutation information: 
// Expanded var WILDCARD at position 8 into: 
// {
//  R_A(var WILDCARD, var WILDCARD, var WILDCARD)
// }
//
