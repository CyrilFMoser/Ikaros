package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
sealed interface I_B{}
record R_A<D, C>() implements I_A<C, D>{}
record R_C() implements I_B{}
record R_D(I_B a, I_B b) implements I_B{}
record R_E() implements I_B{}
public static void main(String args[]) {

R_D v_a = null;
Integer v_b = switch (v_a){
  case R_D(R_E(), R_C()) -> 0; 
  case R_D(var a, R_D(var b, var c)) -> 1; 
  case R_D(R_D(var a, var b), var c) -> 2; 
  case R_D(R_C(), var a) -> 3; 
  case R_D(var a, R_E()) -> 4; 
};
}

};
