package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, Byte]) extends T_A[E, T_B[T_B[E, E], E]]
case class CC_B[F](a: F, b: F) extends T_A[F, T_B[T_B[F, F], F]]
case class CC_C[G]() extends T_B[G, CC_A[Boolean]]

val v_a: T_A[Int, T_B[T_B[Int, Int], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(12, 12) => 1 
  case CC_B(_, 12) => 2 
  case CC_B(12, _) => 3 
}
}
// This is not matched: CC_B(_, _)