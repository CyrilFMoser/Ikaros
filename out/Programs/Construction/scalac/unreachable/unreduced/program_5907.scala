package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[T_A[T_A[C, C], C], C]
case class CC_B[E](a: CC_A[E, E], b: T_A[E, E], c: Int) extends T_A[T_A[T_A[E, E], E], E]
case class CC_C[F]() extends T_A[T_A[T_A[F, F], F], F]

val v_a: T_A[T_A[T_A[Boolean, Boolean], Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C() => 2 
}
}