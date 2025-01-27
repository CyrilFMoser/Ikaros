package Program_0; 

class TestClass {sealed interface I_A<A>{}
sealed interface I_B{}
record R_B<C>() implements I_A<C>{}
record R_C() implements I_B{}
record R_D(I_B a, I_B b) implements I_B{}
record R_E() implements I_B{}
public static void main(String args[]) {

R_D v_a = null;
Integer v_b = switch (v_a){
  case R_D(R_E(), var a) -> 0; 
  case R_D(R_C(), R_C()) -> 1; 
  case R_D(var a, R_E()) -> 2; 
  case R_D(R_D(var a, var b), var c) -> 3; 
  case R_D(var a, R_D(var b, var c)) -> 4; 
};
}

};
