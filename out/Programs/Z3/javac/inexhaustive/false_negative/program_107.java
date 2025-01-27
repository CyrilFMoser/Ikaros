package Program_0; 

class TestClass {sealed interface I_A<A>{}
sealed interface I_B<B, C>{}
record R_A<D>(I_B<D, D> a, I_A<D> b) implements I_A<D>{}
record R_B<E>() implements I_A<E>{}
record R_D<F, G>() implements I_B<G, F>{}
record R_E<H, I>(H a) implements I_B<H, I>{}
public static void main(String args[]) {

R_A<I_A<R_B<Character>>> v_a = null;
Integer v_b = switch (v_a){
  case R_A(R_E(var a), R_A(var b, var c)) -> 0; 
  case R_A(var a, R_B()) -> 1; 
  case R_A(R_D(), var a) -> 2; 
};
}

};
