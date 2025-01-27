package Program_0; 

class TestClass {sealed interface I_A<A>{}
sealed interface I_B{}
record R_A<B>(I_B a, I_A<B> b, I_A<B> c) implements I_A<B>{}
record R_B() implements I_A<R_A<I_B>>{}
record R_D() implements I_B{}
record R_E() implements I_B{}
public static void main(String args[]) {

I_A<R_A<I_B>> v_a = null;
Integer v_b = switch (v_a){
  case R_B() -> 0; 
  case R_A(R_D(), var a, var b) -> 1; 
  case R_A(R_E(), var a, R_A(var b, var c, var d)) -> 2; 
  case R_A(var a, var b, R_B()) -> 3; 
};
}

};
