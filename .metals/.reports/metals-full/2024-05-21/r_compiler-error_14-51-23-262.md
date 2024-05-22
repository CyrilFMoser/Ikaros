file:///G:/Projects/Bachelor-Thesis/Ikaros/out/Programs/scalac/unreachable/Program_1_reduced.scala
### dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition main is defined in
  G:/Projects/Bachelor-Thesis/Ikaros/out/Programs/reduction/temp_folder/testprog.scala
and also in
  G:/Projects/Bachelor-Thesis/Ikaros/out/Programs/scalac/unreachable/Program_3_reduced.scala
One of these files should be removed from the classpath.

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.1
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.1\scala3-library_3-3.3.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.10\scala-library-2.13.10.jar [exists ]
Options:



action parameters:
offset: 295
uri: file:///G:/Projects/Bachelor-Thesis/Ikaros/out/Programs/scalac/unreachable/Program_1_reduced.scala
text:
```scala
object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int, b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a:     T_B , b: T_A[CC_A], c: CC_A) extends T_A[T_B]
val v_a: T_A[T_B] = null
val v_b      = v_a match{
  case CC_A(_, CC_A(_, _)) => 0
  case CC_A(_, CC_B(_, _, _)) => 1
  c@@ase CC_B(CC_A      , _, _) => 5
}
}

```



#### Error stacktrace:

```

```
#### Short summary: 

dotty.tools.dotc.core.TypeError$$anon$1: Toplevel definition main is defined in
  G:/Projects/Bachelor-Thesis/Ikaros/out/Programs/reduction/temp_folder/testprog.scala
and also in
  G:/Projects/Bachelor-Thesis/Ikaros/out/Programs/scalac/unreachable/Program_3_reduced.scala
One of these files should be removed from the classpath.