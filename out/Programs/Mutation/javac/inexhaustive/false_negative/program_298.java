package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B{}
record R_A() implements I_A{}
record R_B(I_A a) implements I_A{}
record R_C() implements I_B{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_A() -> 0; 
  case R_B(R_B(var a)) -> 1; 
};
}

};
// Mutation information: 
// Expanded var WILDCARD at position 16 into: 
// {
//  R_C(var WILDCARD, var WILDCARD)
//  R_D(var WILDCARD, var WILDCARD)
// }
//
