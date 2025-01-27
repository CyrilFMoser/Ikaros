package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
sealed interface I_B{}
record R_A<C>(I_A<I_B, C> a, I_A<C, C> b, I_A<C, C> c) implements I_A<I_B, C>{}
record R_B<D>() implements I_A<I_B, D>{}
record R_C<E>() implements I_A<I_B, E>{}
record R_E() implements I_B{}
public static void main(String args[]) {

R_A<I_B> v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_B(), var a, R_A(var b, var c, var d)) -> 0; 
  case R_A(R_C(), var a, var b) -> 1; 
  case R_A(var a, var b, R_B()) -> 2; 
  case R_A(var a, var b, R_C()) -> 3; 
  case R_A(R_A(var a, var b, var c), var d, var e) -> 4; 
};
}

};
