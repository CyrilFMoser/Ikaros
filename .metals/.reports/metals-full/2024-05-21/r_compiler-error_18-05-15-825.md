file:///G:/Projects/Bachelor-Thesis/Ikaros/out/Programs/reduction/tempprog.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.1
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.1\scala3-library_3-3.3.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.10\scala-library-2.13.10.jar [exists ]
Options:



action parameters:
offset: 0
uri: file:///G:/Projects/Bachelor-Thesis/Ikaros/out/Programs/reduction/tempprog.java
text:
```scala
@@class TestClass {sealed interface I_A<A>{}
record R_A<B>() implements I_A<B>{}
record R_B<C>(I_A<C> a, C b) implements I_A<C>{}
record R_C<D>(I_A<D> a, Byte b) implements I_A<D>{}
public static void main(String args[]) {

I_A<Byte> v_a = null;
Integer v_b = switch (v_a){
  case R_A<Byte>() -> 0; 
  case R_B<Byte>(R_A<Byte>(), 0) -> 1; 
  case R_B<Byte>(R_B<Byte>(var a, var b), 0) -> 2; 
  case R_B<Byte>(R_C<Byte>(var a, var b), 0) -> 3; 
  case R_B<Byte>(R_A<Byte>(), var a) -> 4; 
  case R_B<Byte>(R_B<Byte>(var a, var b), var c) -> 5; 
  case R_B<Byte>(R_C<Byte>(var a, var b), var c) -> 6; 
  case R_C<Byte>(R_A<Byte>(), var a) -> 7; 
  case R_C<Byte>(R_B<Byte>(var a, var b), var c) -> 8; 
  case R_C<Byte>(R_C<Byte>(var a, var b), var c) -> 9; 
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
	scala.meta.internal.pc.HoverProvider$.hover(HoverProvider.scala:36)
	scala.meta.internal.pc.ScalaPresentationCompiler.hover$$anonfun$1(ScalaPresentationCompiler.scala:366)
```
#### Short summary: 

java.util.NoSuchElementException: next on empty iterator