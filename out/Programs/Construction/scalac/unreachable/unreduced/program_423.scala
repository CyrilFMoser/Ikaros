package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Int) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: T_A[D, D], c: T_A[T_A[D, D], D]) extends T_A[D, T_A[T_A[D, D], D]]
case class CC_C[E]() extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}