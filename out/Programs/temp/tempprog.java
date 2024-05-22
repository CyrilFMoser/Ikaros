class TestClass {sealed interface I_A<A, B>{}
sealed interface I_B<C, D>{}
record R_A<E, F>(Boolean a, I_A<F, F> b, Character c) implements I_A<E, F>{}
record R_B<G, H>() implements I_A<G, H>{}
record R_C<I>(R_A<I_A<I, I>, I> a, R_B<I, I> b) implements I_B<I, R_B<I, I>>{}
record R_D<K, J>(Boolean a, Integer b, I_A<J, J> c) implements I_B<J, K>{}
record R_E<L>() implements I_B<L, I_B<L, L>>{}
record R_F<M>(I_B<I_B<M, M>, M> a, M b, I_B<Boolean, M> c) implements I_B<M, I_B<M, M>>{}
record R_G<N>(N a, N b, R_A<N, N> c) implements I_B<Character, N>{}
record R_H<O>(Character a, Integer b) implements I_B<O, I_B<O, O>>{}
record R_I<P>() implements I_B<P, R_B<P, P>>{}
record R_J<Q>(I_B<Q, I_B<Q, Q>> a, I_B<Q, Q> b) implements I_B<Q, R_B<Q, Q>>{}
public static void main(String args[]) {

I_B<Integer, R_B<Integer, Integer>> v_a = null;
Integer v_b = switch (v_a){
  case R_C<Integer>(R_A<I_A<Integer, Integer>, Integer>(var a, var b, var c), R_B<Integer, Integer>()) -> 0; 
  case R_D<R_B<Integer, Integer>, Integer>(var a, var b, R_A<Integer, Integer>(var c, var d, var e)) -> 1; 
  case R_D<R_B<Integer, Integer>, Integer>(var a, var b, R_B<Integer, Integer>()) -> 2; 
  case R_I<Integer>() -> 3; 
  case R_J<Integer>(R_D<I_B<Integer, Integer>, Integer>(var a, var b, var c), var d) -> 4; 
  case R_J<Integer>(R_E<Integer>(), var a) -> 5; 
  case R_J<Integer>(R_F<Integer>(var a, var b, var c), var d) -> 6; 
  case R_J<Integer>(R_H<Integer>(var a, var b), var c) -> 7; 
};
}

};