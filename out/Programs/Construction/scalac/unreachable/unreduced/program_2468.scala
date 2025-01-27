package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_B[D]) extends T_A[D, T_A[D, D]]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C[F](a: T_A[F, F], b: CC_A[F], c: F) extends T_A[F, T_A[F, F]]
case class CC_D[G]() extends T_B[G]
case class CC_E[H]() extends T_B[H]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_D()) => 0 
  case CC_A(_, CC_E()) => 1 
  case CC_B() => 2 
  case CC_C(_, _, _) => 3 
}
}