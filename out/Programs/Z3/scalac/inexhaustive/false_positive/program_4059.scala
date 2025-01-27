package Program_15 

object Test {
sealed trait T_A[A]
case class CC_B() extends T_A[Boolean]
case class CC_C(a: T_A[Boolean]) extends T_A[Boolean]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: (CC_B (CC_A Wildcard Wildcard T_A) Wildcard Wildcard T_A)