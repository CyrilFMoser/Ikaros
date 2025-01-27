package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B{}
record R_A(I_B a) implements I_A{}
record R_C() implements I_B{}
record R_D() implements I_B{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_C()) -> 0; 
};
}

};
// Mutation information: 
// Expanded var WILDCARD at position 3 into: 
// {
//  R_C(var WILDCARD, var WILDCARD)
// }
//
