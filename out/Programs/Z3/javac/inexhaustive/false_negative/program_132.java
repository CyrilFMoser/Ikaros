package Program_0; 

class TestClass {sealed interface I_A<A>{}
sealed interface I_B<B>{}
record R_A<C>(I_A<C> a, I_A<C> b) implements I_A<C>{}
record R_B<D>() implements I_A<D>{}
record R_C<E>() implements I_A<E>{}
record R_D<F>() implements I_B<F>{}
public static void main(String args[]) {

I_A<Byte> v_a = null;
Integer v_b = switch (v_a){
  case R_A(var a, R_A(var b, var c)) -> 0; 
  case R_B() -> 1; 
  case R_C() -> 2; 
};
}

};
