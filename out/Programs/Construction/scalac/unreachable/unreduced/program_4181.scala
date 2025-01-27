package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E], c: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]
case class CC_B[F](a: F) extends T_A[T_A[F, F], F]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_))) => 1 
  case CC_A(_, _, CC_B(_)) => 2 
  case CC_B(_) => 3 
}
}