package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F](a: F) extends T_B[T_A[F], F]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
}
}
// This is not matched: CC_B(CC_B(CC_A(_, _)))