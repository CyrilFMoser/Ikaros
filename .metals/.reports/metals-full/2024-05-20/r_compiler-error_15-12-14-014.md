file:///G:/Projects/Bachelor-Thesis/Ikaros/out/Programs/reduction/tempprog.scala
### java.lang.AssertionError: assertion failed

occurred in the presentation compiler.

presentation compiler configuration:
Scala version: 3.3.1
Classpath:
<HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala3-library_3\3.3.1\scala3-library_3-3.3.1.jar [exists ], <HOME>\AppData\Local\Coursier\cache\v1\https\repo1.maven.org\maven2\org\scala-lang\scala-library\2.13.10\scala-library-2.13.10.jar [exists ]
Options:



action parameters:
uri: file:///G:/Projects/Bachelor-Thesis/Ikaros/out/Programs/reduction/tempprog.scala
text:
```scala
object 
sealed trait T_A[A, B]
sealed trait T_B[C]
sealed trait T_C[D]
case class CC_A[E](a: T_B[E], b: T_B[E]) extends T_A[Byte, E]
case class CC_B[F](a: CC_A[F], b: T_A[Byte, T_A[Byte, CC_A[T_A[Char, Int]]]], c: F) extends T_A[Byte, T_A[Byte, CC_A[T_A[Char, Int]]]]
case class CC_C[G](a: G, b: Char) extends T_B[G]
case class CC_D(a: CC_C[CC_C[T_B[Byte]]], b: Byte, c: Byte) extends T_B[Byte]
case class CC_E(a: T_A[Byte, T_A[Byte, CC_A[T_A[Char, Int]]]], b: CC_D) extends T_B[Byte]
case class CC_F(a: T_A[Char, CC_D]) extends T_B[Byte]
case class CC_G[H](a: T_B[H], b: CC_F) extends T_B[H]
case class CC_H(a: CC_B[T_A[Byte, T_A[Byte, CC_A[T_A[Char, Int]]]]], b: T_B[CC_C[Char]]) extends T_B[Byte]
case class CC_I(a: T_B[Int]) extends T_C[T_A[Byte, CC_B[CC_A[Char]]]]
case class CC_J[I]() extends T_C[I]
case class CC_K(a: T_C[T_C[T_C[T_A[Byte, CC_B[CC_A[Char]]]]]], b: T_A[CC_I, T_B[T_A[Byte, T_A[Byte, CC_A[T_A[Char, Int]]]]]], c: CC_E) extends T_C[T_A[Byte, CC_B[CC_A[Char]]]]
case class CC_L(a: T_B[CC_G[T_A[Byte, T_A[Byte, CC_A[T_A[Char, Int]]]]]], b: Byte, c: CC_C[CC_I]) extends T_C[T_A[Byte, CC_B[CC_A[Char]]]]
case class CC_M(a: T_A[Byte, T_A[Byte, CC_A[T_A[Char, Int]]]]) extends T_C[T_A[Byte, CC_B[CC_A[Char]]]]
case class CC_N(a: T_B[T_A[Byte, T_A[Byte, CC_A[T_A[Char, Int]]]]]) extends T_C[T_A[Byte, CC_B[CC_A[Char]]]]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_C(_, _), _, _) => 1 
  case CC_E(CC_A(_, _), _) => 2 
  case CC_E(CC_B(_, _, _), _) => 3 
  case CC_F(_) => 4 
  case CC_G(CC_C(_, _), CC_F(_)) => 5 
  case CC_G(CC_D(_, _, _), CC_F(_)) => 6 
  case CC_G(CC_E(_, _), CC_F(_)) => 7 
  case CC_G(CC_F(_), CC_F(_)) => 8 
  case CC_G(CC_G(_, _), CC_F(_)) => 9 
  case CC_G(CC_H(_, _), CC_F(_)) => 10 
  case CC_H(_, CC_C(_, _)) => 11 
  case CC_H(_, CC_G(_, _)) => 12 
}
```



#### Error stacktrace:

```
scala.runtime.Scala3RunTime$.assertFailed(Scala3RunTime.scala:11)
	dotty.tools.dotc.core.Annotations$LazyAnnotation.tree(Annotations.scala:136)
	dotty.tools.dotc.core.Annotations$Annotation$Child$.unapply(Annotations.scala:242)
	dotty.tools.dotc.typer.Namer.insertInto$1(Namer.scala:477)
	dotty.tools.dotc.typer.Namer.addChild(Namer.scala:488)
	dotty.tools.dotc.typer.Namer$Completer.register$1(Namer.scala:911)
	dotty.tools.dotc.typer.Namer$Completer.registerIfChild$$anonfun$1(Namer.scala:920)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:333)
	dotty.tools.dotc.typer.Namer$Completer.registerIfChild(Namer.scala:920)
	dotty.tools.dotc.typer.Namer$Completer.complete(Namer.scala:815)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:187)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:189)
	dotty.tools.dotc.core.Types$NamedType.info(Types.scala:2313)
	dotty.tools.dotc.core.Types$TermLambda.dotty$tools$dotc$core$Types$TermLambda$$_$compute$1(Types.scala:3826)
	dotty.tools.dotc.core.Types$TermLambda.foldArgs$2(Types.scala:3833)
	dotty.tools.dotc.core.Types$TermLambda.dotty$tools$dotc$core$Types$TermLambda$$_$compute$1(Types.scala:4453)
	dotty.tools.dotc.core.Types$TermLambda.dotty$tools$dotc$core$Types$TermLambda$$depStatus(Types.scala:3853)
	dotty.tools.dotc.core.Types$TermLambda.dependencyStatus(Types.scala:3867)
	dotty.tools.dotc.core.Types$TermLambda.isResultDependent(Types.scala:3889)
	dotty.tools.dotc.core.Types$TermLambda.isResultDependent$(Types.scala:3783)
	dotty.tools.dotc.core.Types$MethodType.isResultDependent(Types.scala:3928)
	dotty.tools.dotc.typer.TypeAssigner.assignType(TypeAssigner.scala:292)
	dotty.tools.dotc.typer.TypeAssigner.assignType$(TypeAssigner.scala:16)
	dotty.tools.dotc.typer.Typer.assignType(Typer.scala:116)
	dotty.tools.dotc.ast.tpd$.Apply(tpd.scala:49)
	dotty.tools.dotc.ast.tpd$TreeOps$.appliedToTermArgs$extension(tpd.scala:951)
	dotty.tools.dotc.ast.tpd$.New(tpd.scala:537)
	dotty.tools.dotc.ast.tpd$.New(tpd.scala:528)
	dotty.tools.dotc.core.Annotations$Annotation$Child$.makeChildLater$1(Annotations.scala:231)
	dotty.tools.dotc.core.Annotations$Annotation$Child$.later$$anonfun$1(Annotations.scala:234)
	dotty.tools.dotc.core.Annotations$LazyAnnotation.tree(Annotations.scala:140)
	dotty.tools.dotc.core.Annotations$Annotation$Child$.unapply(Annotations.scala:242)
	dotty.tools.dotc.typer.Namer.insertInto$1(Namer.scala:477)
	dotty.tools.dotc.typer.Namer.addChild(Namer.scala:488)
	dotty.tools.dotc.typer.Namer$Completer.register$1(Namer.scala:911)
	dotty.tools.dotc.typer.Namer$Completer.registerIfChild$$anonfun$1(Namer.scala:920)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:333)
	dotty.tools.dotc.typer.Namer$Completer.registerIfChild(Namer.scala:920)
	dotty.tools.dotc.typer.Namer$Completer.complete(Namer.scala:815)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.completeFrom(SymDenotations.scala:174)
	dotty.tools.dotc.core.Denotations$Denotation.completeInfo$1(Denotations.scala:187)
	dotty.tools.dotc.core.Denotations$Denotation.info(Denotations.scala:189)
	dotty.tools.dotc.core.SymDenotations$SymDenotation.ensureCompleted(SymDenotations.scala:393)
	dotty.tools.dotc.typer.Typer.retrieveSym(Typer.scala:2989)
	dotty.tools.dotc.typer.Typer.typedNamed$1(Typer.scala:3014)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3111)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3184)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3188)
	dotty.tools.dotc.typer.Typer.traverse$1(Typer.scala:3210)
	dotty.tools.dotc.typer.Typer.typedStats(Typer.scala:3256)
	dotty.tools.dotc.typer.Typer.typedPackageDef(Typer.scala:2812)
	dotty.tools.dotc.typer.Typer.typedUnnamed$1(Typer.scala:3081)
	dotty.tools.dotc.typer.Typer.typedUnadapted(Typer.scala:3112)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3184)
	dotty.tools.dotc.typer.Typer.typed(Typer.scala:3188)
	dotty.tools.dotc.typer.Typer.typedExpr(Typer.scala:3300)
	dotty.tools.dotc.typer.TyperPhase.typeCheck$$anonfun$1(TyperPhase.scala:44)
	dotty.tools.dotc.typer.TyperPhase.typeCheck$$anonfun$adapted$1(TyperPhase.scala:54)
	scala.Function0.apply$mcV$sp(Function0.scala:42)
	dotty.tools.dotc.core.Phases$Phase.monitor(Phases.scala:440)
	dotty.tools.dotc.typer.TyperPhase.typeCheck(TyperPhase.scala:54)
	dotty.tools.dotc.typer.TyperPhase.runOn$$anonfun$3(TyperPhase.scala:88)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.immutable.List.foreach(List.scala:333)
	dotty.tools.dotc.typer.TyperPhase.runOn(TyperPhase.scala:88)
	dotty.tools.dotc.Run.runPhases$1$$anonfun$1(Run.scala:246)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:15)
	scala.runtime.function.JProcedure1.apply(JProcedure1.java:10)
	scala.collection.ArrayOps$.foreach$extension(ArrayOps.scala:1321)
	dotty.tools.dotc.Run.runPhases$1(Run.scala:262)
	dotty.tools.dotc.Run.compileUnits$$anonfun$1(Run.scala:270)
	dotty.tools.dotc.Run.compileUnits$$anonfun$adapted$1(Run.scala:279)
	dotty.tools.dotc.util.Stats$.maybeMonitored(Stats.scala:67)
	dotty.tools.dotc.Run.compileUnits(Run.scala:279)
	dotty.tools.dotc.Run.compileSources(Run.scala:194)
	dotty.tools.dotc.interactive.InteractiveDriver.run(InteractiveDriver.scala:165)
	scala.meta.internal.pc.MetalsDriver.run(MetalsDriver.scala:45)
	scala.meta.internal.pc.PcCollector.<init>(PcCollector.scala:44)
	scala.meta.internal.pc.PcSemanticTokensProvider$Collector$.<init>(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector$lzyINIT1(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.Collector(PcSemanticTokensProvider.scala:61)
	scala.meta.internal.pc.PcSemanticTokensProvider.provide(PcSemanticTokensProvider.scala:90)
	scala.meta.internal.pc.ScalaPresentationCompiler.semanticTokens$$anonfun$1(ScalaPresentationCompiler.scala:110)
```
#### Short summary: 

java.lang.AssertionError: assertion failed