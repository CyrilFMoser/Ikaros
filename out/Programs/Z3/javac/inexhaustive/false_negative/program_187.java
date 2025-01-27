package Program_0; 

class TestClass {sealed interface I_A<A, B>{}
sealed interface I_B<C, D>{}
record R_A<F, E>(I_A<F, F> a, I_A<E, E> b, I_A<E, E> c) implements I_A<F, E>{}
record R_B<H, G>() implements I_A<H, G>{}
record R_C<I, J>() implements I_B<I, J>{}
public static void main(String args[]) {

I_A<Character, I_B<I_A<Boolean, Integer>, I_A<Boolean, Boolean>>> v_a = null;
Integer v_b = switch (v_a){
  case R_B() -> 0; 
  case R_A(R_A(var a, var b, var c), var d, var e) -> 1; 
  case R_A(R_B(), R_A(var a, var b, var c), var d) -> 2; 
  case R_A(var a, R_B(), var b) -> 3; 
};
}

};
