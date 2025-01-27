package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
sealed interface I_B{}
record R_A<D, C>(I_B a, I_B b) implements I_A<D, C>{}
record R_C() implements I_B{}
record R_D() implements I_B{}
record R_E() implements I_B{}
public static void main(String args[]) {

R_A<Character, Byte> v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_D(), var a) -> 0; 
  case R_A(R_E(), var a) -> 1; 
  case R_A(var a, R_E()) -> 2; 
  case R_A(R_C(), R_D()) -> 3; 
  case R_A(var a, R_C()) -> 4; 
};
}

};
