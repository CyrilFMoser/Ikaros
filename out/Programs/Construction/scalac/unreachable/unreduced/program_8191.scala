package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: CC_A[E], b: T_A[E], c: T_A[E]) extends T_A[E]
case class CC_C(a: T_B[T_B[Int, Byte], Boolean], b: T_A[T_A[Boolean]]) extends T_A[T_A[CC_B[Char]]]
case class CC_D[F](a: F) extends T_B[F, T_B[T_A[F], F]]
case class CC_E[G, H]() extends T_B[G, T_B[T_A[G], G]]

val v_a: T_B[CC_C, T_B[T_A[CC_C], CC_C]] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _)) => 0 
  case CC_E() => 1 
}
}