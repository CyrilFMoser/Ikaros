package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[E, E], E], b: T_A[E, E]) extends T_A[E, T_A[T_A[E, E], E]]
case class CC_B[F]() extends T_A[F, T_A[T_A[F, F], F]]
case class CC_C[G]() extends T_B[CC_A[CC_B[Char]], G]

val v_a: T_A[Boolean, T_A[T_A[Boolean, Boolean], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}