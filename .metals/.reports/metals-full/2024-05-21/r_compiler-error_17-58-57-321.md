file:///G:/Projects/Bachelor-Thesis/Ikaros/out/Programs/reduction/TestClass.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.1
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.1\scala3-library_3-3.3.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.10\scala-library-2.13.10.jar [exists ]
Options:



action parameters:
uri: file:///G:/Projects/Bachelor-Thesis/Ikaros/out/Programs/reduction/TestClass.java
text:
```scala
public class TestClass {
  sealed interface I_A<A>{}
sealed interface I_B<B>{}
record R_A<C>() implements I_A<C>{}
record R_B<D>(Byte a, D b) implements I_A<D>{}
record R_C<E>(R_A<E> a, Boolean b, E c) implements I_A<E>{}
record R_D<F>(Integer a, Byte b) implements I_A<F>{}
record R_E<G>() implements I_B<G>{}
record R_F(Byte a, Byte b, I_B<I_A<Boolean>> c) implements I_B<I_A<Byte>>{}
record R_G() implements I_B<I_A<Byte>>{}
record R_H() implements I_B<I_A<Byte>>{}
record R_I<H>(I_A<H> a, H b, H c) implements I_B<H>{}
record R_J<I>(I_A<I> a) implements I_B<I>{}
record R_K() implements I_B<I_A<Byte>>{}
record R_L(I_B<Boolean> a, R_G b) implements I_B<I_A<Byte>>{}
record R_M() implements I_B<I_A<Byte>>{}
public static void main(String args[]) {

I_B<I_A<Byte>> v_a = null;
Integer v_b = switch (v_a){
  case R_E<I_A<Byte>>() -> 0; 
  case R_F(var a, var b, R_E<I_A<Boolean>>()) -> 1; 
  case R_F(var a, var b, R_I<I_A<Boolean>>(var c, var d, var e)) -> 2; 
  case R_F(var a, var b, R_J<I_A<Boolean>>(var c)) -> 3; 
  case R_G() -> 4; 
  case R_H() -> 5; 
  case R_I<I_A<Byte>>(var a, R_A<Byte>(), var b) -> 6; 
  case R_I<I_A<Byte>>(var a, R_B<Byte>(var b, var c), var d) -> 7; 
  case R_I<I_A<Byte>>(var a, R_C<Byte>(var b, var c, var d), var e) -> 8; 
  case R_I<I_A<Byte>>(var a, R_D<Byte>(var b, var c), var d) -> 9; 
  case R_J<I_A<Byte>>(R_A<I_A<Byte>>()) -> 10; 
  case R_J<I_A<Byte>>(R_B<I_A<Byte>>(var a, var b)) -> 11; 
  case R_J<I_A<Byte>>(R_C<I_A<Byte>>(var a, var b, var c)) -> 12; 
  case R_J<I_A<Byte>>(R_D<I_A<Byte>>(var a, var b)) -> 13; 
  case R_K() -> 14; 
  case R_L(R_E<Boolean>(), R_G()) -> 15; 
  case R_L(R_I<Boolean>(var a, var b, var c), R_G()) -> 16; 
  case R_L(R_J<Boolean>(var a), R_G()) -> 17; 
  case R_M() -> 18; 
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