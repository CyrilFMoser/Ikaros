file:///G:/Projects/Bachelor-Thesis/Ikaros/MyClass.java
### java.util.NoSuchElementException: next on empty iterator

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.1
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.1\scala3-library_3-3.3.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.10\scala-library-2.13.10.jar [exists ]
Options:



action parameters:
offset: 38
uri: file:///G:/Projects/Bachelor-Thesis/Ikaros/MyClass.java
text:
```scala


sealed interface Shape<T, G> {}

rec@@ord Rectangle<G> (double length, double width) implements Shape<Integer, G> {}

record Circle<G> (Rectangle rectangle) implements Shape<String, G> {}
public class MyClass {
	public static void main(String args[]) {
        Shape<String,Integer> c = new Circle(new Rectangle(5.0,5.0));
        switch(c) {
            case Rectangle r -> System.out.println("THIS");
            case Circle (Rectangle r) -> System.out.println("THAT");
        }
    }

}
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