package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[E, E], E]
case class CC_B[F](a: T_B[F, T_A[F, F]], b: F, c: F) extends T_B[F, T_A[F, F]]
case class CC_C[G](a: T_A[G, G], b: G) extends T_B[G, T_A[G, G]]
case class CC_D[H](a: Char, b: CC_A[CC_A[H]]) extends T_B[H, T_A[H, H]]

val v_a: T_B[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_C(_, 12) => 0 
  case CC_C(_, _) => 1 
  case CC_D(_, CC_A()) => 2 
}
}
// This is not matched: CC_B(_, _, _)