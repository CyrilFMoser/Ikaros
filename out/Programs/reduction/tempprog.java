class TestClass {sealed interface I_A<A, B>{}
sealed interface I_B<C, D>{}
record R_A<F, E>(Boolean a, I_A<E, E> b, Character c) implements I_A<E, F>{}
record R_B<G, H>() implements I_A<H, G>{}
record R_C<I>(R_A<I, I_A<I, I>> a, R_B<I, I> b) implements I_B<R_B<I, I>, I>{}
record R_D<J, K>(Boolean a, Integer b, I_A<K, K> c) implements I_B<J, K>{}
record R_E<L>() implements I_B<L, I_B<L, L>>{}
record R_F<M>(I_B<I_B<M, M>, M> a, M b, I_B<M, Boolean> c) implements I_B<M, I_B<M, M>>{}
record R_G<N>(N a, N b, R_A<N, N> c) implements I_B<Character, N>{}
record R_H<O>(Character a, Integer b) implements I_B<O, I_B<O, O>>{}
record R_I<P>() implements I_B<R_B<P, P>, P>{}
record R_J<Q>(I_B<Q, I_B<Q, Q>> a, I_B<Q, Q> b) implements I_B<R_B<Q, Q>, Q>{}
public static void main(String args[]) {

I_B<Integer, I_B<Integer, Integer>> v_a = null;
Integer v_b = switch (v_a){
  case R_D<Integer, I_B<Integer, Integer>>(var a, var b, R_A<I_B<Integer, Integer>, I_B<Integer, Integer>>(var c, var d, var e)) -> 0; 
  case R_D<Integer, I_B<Integer, Integer>>(var a, var b, R_B<I_B<Integer, Integer>, I_B<Integer, Integer>>()) -> 1; 
  case R_E<Integer>() -> 2; 
  case R_F<Integer>(R_D<I_B<Integer, Integer>, Integer>(var a, var b, var c), var d, var e) -> 3; 
  case R_H<Integer>(var a, var b) -> 4; 
};
}

};