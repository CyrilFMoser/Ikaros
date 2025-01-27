package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_B[T_B[E, E], E]
case class CC_C[F](a: F, b: T_B[T_B[F, F], F]) extends T_B[T_B[F, F], F]

val v_a: T_B[T_B[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C(_, CC_B(CC_A(_))) => 1 
  case CC_C(_, CC_C(_, _)) => 2 
}
}