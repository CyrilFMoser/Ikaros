package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: Boolean, b: D) extends T_A[T_A[D, D], D]
case class CC_C[E](a: E, b: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(true, _) => 1 
  case CC_B(false, _) => 2 
  case CC_C(_, _) => 3 
}
}