package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
sealed interface I_B{}
record R_A<D, C>(I_B a, I_B b, I_A<C, C> c) implements I_A<C, D>{}
record R_D() implements I_B{}
record R_E() implements I_B{}
public static void main(String args[]) {

R_A<R_E, Integer> v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_D(), var a, var b) -> 0; 
  case R_A(var a, R_D(), var b) -> 1; 
  case R_A(R_E(), R_E(), var a) -> 2; 
};
}

};
