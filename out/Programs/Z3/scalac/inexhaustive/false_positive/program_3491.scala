package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B[B]() extends T_A[B]
case class CC_E(a: T_A[T_B]) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_B()) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard T_A)