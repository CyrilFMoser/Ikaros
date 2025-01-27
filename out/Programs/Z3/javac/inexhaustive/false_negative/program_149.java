package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
sealed interface I_B{}
record R_A<D, C>(I_A<C, D> a, I_A<C, D> b, I_B c) implements I_A<C, D>{}
record R_C<F, G>() implements I_A<F, G>{}
record R_D() implements I_B{}
record R_E() implements I_B{}
record R_F() implements I_B{}
public static void main(String args[]) {

I_A<Character, R_F> v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_C(), var a, R_F()) -> 0; 
  case R_A(var a, var b, R_E()) -> 1; 
  case R_A(R_A(var a, var b, var c), var d, var e) -> 2; 
  case R_A(var a, var b, R_D()) -> 3; 
  case R_C() -> 4; 
};
}

};
