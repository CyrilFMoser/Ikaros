package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B{}
record R_A(I_B a, Integer b) implements I_A{}
record R_B(I_A a) implements I_A{}
record R_C(Integer a, R_A b) implements I_B{}
record R_D(I_A a) implements I_B{}
record R_E(I_B a, R_D b) implements I_B{}
public static void main(String args[]) {

I_B v_a = null;
Integer v_b = switch (v_a){
  case R_E(R_C(var a, var b), var c) -> 0; 
};
}

};
// This is not matched: (R_D Wildcard I_B)
