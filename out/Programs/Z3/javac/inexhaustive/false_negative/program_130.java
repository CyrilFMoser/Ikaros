package Program_0; 

class TestClass {sealed interface I_A<A>{}
sealed interface I_B<B>{}
record R_A<C>() implements I_A<C>{}
record R_B<D>(I_A<D> a, I_B<D> b) implements I_A<D>{}
record R_C<E>() implements I_A<E>{}
record R_D<F>() implements I_B<F>{}
record R_E<G>() implements I_B<G>{}
public static void main(String args[]) {

R_B<Integer> v_a = null;
Integer v_b = switch (v_a){
  case R_B(var a, R_D()) -> 0; 
  case R_B(R_A(), var a) -> 1; 
  case R_B(R_B(var a, var b), var c) -> 2; 
  case R_B(R_C(), R_E()) -> 3; 
};
}

};
