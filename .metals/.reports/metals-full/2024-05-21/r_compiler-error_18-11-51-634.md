file:///G:/Projects/Bachelor-Thesis/Ikaros/out/Programs/reduction/tempprog.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.1
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.1\scala3-library_3-3.3.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.10\scala-library-2.13.10.jar [exists ]
Options:



action parameters:
uri: file:///G:/Projects/Bachelor-Thesis/Ikaros/out/Programs/reduction/tempprog.java
text:
```scala
class TestClass {sealed interface I_A<A, B>{}
sealed interface I_B<C, D>{}
record R_A<E, F>(Boolean a, I_A<F, F> b, Character c) implements I_A<F, E>{}
record R_B<H, G>() implements I_A<H, G>{}
record R_C<I>(R_A<I_A<I, I>, I> a, R_B<I, I> b) implements I_B<I, R_B<I, I>>{}
record R_D<J, K>(Boolean a, Integer b, I_A<K, K> c) implements I_B<J, K>{}
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
  case R_D<Integer, R_B<Integer, Integer>>(var a, var b, R_A<R_B<Integer, Integer>, R_B<Integer, Integer>>(var c, var d, var e)) -> 1; 
  case R_D<Integer, R_B<Integer, Integer>>(var a, var b, R_B<R_B<Integer, Integer>, R_B<Integer, Integer>>()) -> 2; 
  case R_E<Integer>() -> 3; 
  case R_F<Integer>(R_D<I_B<Integer, Integer>, Integer>(var a, var b, var c), var d, R_D<Boolean, Integer>(var e, var f, var g)) -> 4; 
  case R_H<Integer>(var a, var b) -> 5; 
  case R_I<Integer>() -> 6; 
  case R_J<Integer>(var a, R_D<Integer, Integer>(var b, var c, var d)) -> 7; 
};
}

};
```



#### Error stacktrace:

```
scala.collection.Iterator$$anon$19.next(Iterator.scala:973)
	scala.collection.Iterator$$anon$19.next(Iterator.scala:971)
	scala.collection.mutable.MutationTracker$CheckedIterator.next(MutationTracker.scala:76)
	scala.collection.IterableOps.head(Iterable.scala:222)
	scala.collection.IterableOps.head$(Iterable.scala:222)
	scala.collection.AbstractIterable.head(Iterable.scala:933)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:168)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.PcCollector.<init>(PcCollector.scala:44)
	scala.meta.internal.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:90)
	scala.meta.internal.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:110)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator