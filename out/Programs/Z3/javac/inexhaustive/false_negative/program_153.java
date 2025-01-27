package Program_0; 

class TestClass {sealed interface I_A{}
sealed interface I_B<A, B>{}
record R_A(I_B<I_A, I_A> a, I_A b, I_B<I_A, Integer> c) implements I_A{}
record R_B() implements I_A{}
record R_C() implements I_A{}
record R_D<D, C>() implements I_B<D, C>{}
record R_E<E, F>() implements I_B<F, E>{}
record R_F<H, G>() implements I_B<H, G>{}
public static void main(String args[]) {

I_A v_a = null;
Integer v_b = switch (v_a){
  case R_B() -> 0; 
  case R_C() -> 1; 
  case R_A(var a, R_A(var b, var c, var d), var e) -> 2; 
  case R_A(R_D(), var a, var b) -> 3; 
  case R_A(R_F(), var a, var b) -> 4; 
  case R_A(R_E(), R_B(), var a) -> 5; 
  case R_A(var a, R_C(), var b) -> 6; 
};
}

};
