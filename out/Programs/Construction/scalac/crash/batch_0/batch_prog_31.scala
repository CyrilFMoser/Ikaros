package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[C, C], b: T_A[D, D]) extends T_A[C, D]
case class CC_B[E](a: E, b: T_A[CC_A[E, E], E]) extends T_A[E, T_A[E, CC_A[E, E]]]

val v_a: CC_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}