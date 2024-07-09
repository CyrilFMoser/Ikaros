package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
sealed interface I_B{}
record R_A<C, D>(Character a) implements I_A<C, D>{}
record R_B(Character a, I_A<I_B, I_B> b) implements I_B{}
public static void main(String args[]) {

R_B v_a = null;
Integer v_b = switch (v_a){
  case R_B(var a, var b) -> 0; 
};
}

};