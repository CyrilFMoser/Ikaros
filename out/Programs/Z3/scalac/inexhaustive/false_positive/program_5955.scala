package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C(a: CC_B[T_B], b: T_B, c: T_A[T_B]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard T_A)