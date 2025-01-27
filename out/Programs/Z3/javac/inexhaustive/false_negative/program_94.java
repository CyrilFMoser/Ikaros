package Program_0; 

class TestClass {sealed interface I_A<A>{}
sealed interface I_B<B, C>{}
record R_A() implements I_A<I_B<Integer, Byte>>{}
record R_B<D>() implements I_A<D>{}
record R_C<E>(I_A<E> a, I_A<E> b, I_A<E> c) implements I_A<E>{}
record R_D<F>() implements I_B<I_B<R_A, R_A>, F>{}
public static void main(String args[]) {

I_A<I_B<Integer, Byte>> v_a = null;
Integer v_b = switch (v_a){
  case R_A() -> 0; 
  case R_B() -> 1; 
  case R_C(var a, R_B(), var b) -> 2; 
  case R_C(var a, R_A(), var b) -> 3; 
  case R_C(R_C(var a, var b, var c), var d, var e) -> 4; 
  case R_C(var a, var b, R_A()) -> 5; 
  case R_C(R_B(), var a, var b) -> 6; 
  case R_C(R_A(), R_C(var a, var b, var c), R_C(var d, var e, var f)) -> 7; 
  case R_C(var a, var b, R_B()) -> 8; 
};
}

};
