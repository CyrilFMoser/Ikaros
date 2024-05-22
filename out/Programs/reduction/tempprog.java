class TestClass {sealed interface I_A<A, B>{}
sealed interface I_B<C, D>{}
record R_A<F, E>(Boolean a, I_A<E, E> b, Character c) implements I_A<E, F>{}
record R_B<H, G>() implements I_A<H, G>{}
record R_C<I>(R_A<I_A<I, I>, I> a, R_B<I, I> b) implements I_B<R_B<I, I>, I>{}
record R_D<J, K>(Boolean a, Integer b, I_A<K, K> c) implements I_B<K, J>{}
record R_E<L>() implements I_B<I_B<L, L>, L>{}
record R_F<M>(I_B<I_B<M, M>, M> a, M b, I_B<M, Boolean> c) implements I_B<I_B<M, M>, M>{}
record R_G<N>(N a, N b, R_A<N, N> c) implements I_B<N, Character>{}
record R_H<O>(Character a, Integer b) implements I_B<I_B<O, O>, O>{}
record R_I<P>() implements I_B<R_B<P, P>, P>{}
record R_J<Q>(I_B<I_B<Q, Q>, Q> a, I_B<Q, Q> b) implements I_B<R_B<Q, Q>, Q>{}
public static void main(String args[]) {

I_B<R_B<Integer, Integer>, Integer> v_a = null;
Integer v_b = switch (v_a){
  case R_C<Integer>(R_A<I_A<Integer, Integer>, Integer>(var a, var b, var c), R_B<Integer, Integer>()) -> 0; 
  case R_D<Integer, R_B<Integer, Integer>>(var a, var b, R_A<R_B<Integer, Integer>, R_B<Integer, Integer>>(var c, var d, var e)) -> 1; 
  case R_D<Integer, R_B<Integer, Integer>>(var a, var b, R_B<R_B<Integer, Integer>, R_B<Integer, Integer>>()) -> 2; 
  case R_E<Integer>() -> 3; 
  case R_F<Integer>(R_C<Integer>(var a, var b), var c, R_D<Boolean, Integer>(var d, var e, var f)) -> 4; 
  case R_F<Integer>(R_D<Integer, R_B<Integer, Integer>>(var a, var b, var c), var d, R_D<Boolean, Integer>(var e, var f, var g)) -> 5; 
  case R_F<Integer>(R_E<Integer>(), var a, R_D<Boolean, Integer>(var b, var c, var d)) -> 6; 
  case R_F<Integer>(R_F<Integer>(var a, var b, var c), var d, R_D<Boolean, Integer>(var e, var f, var g)) -> 7; 
  case R_F<Integer>(R_H<Integer>(var a, var b), var c, R_D<Boolean, Integer>(var d, var e, var f)) -> 8; 
  case R_F<Integer>(R_I<Integer>(), var a, R_D<Boolean, Integer>(var b, var c, var d)) -> 9; 
  case R_F<Integer>(R_J<Integer>(var a, var b), var c, R_D<Boolean, Integer>(var d, var e, var f)) -> 10; 
  case R_H<Integer>(var a, var b) -> 11; 
  case R_I<Integer>() -> 12; 
  case R_J<Integer>(var a, R_D<Integer, Integer>(var b, var c, var d)) -> 13; 
};
}

};