package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_B]
case class CC_B[B]() extends T_A[B]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: (CC_C (CC_E T_B Wildcard T_B) Wildcard T_B)