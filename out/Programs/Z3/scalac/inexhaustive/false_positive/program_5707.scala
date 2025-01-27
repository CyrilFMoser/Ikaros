package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[Boolean, C]
case class CC_C[E](a: T_A[Boolean, E]) extends T_A[Boolean, E]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard T_A)