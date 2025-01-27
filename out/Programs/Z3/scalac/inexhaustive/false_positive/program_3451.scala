package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_A[T_B]]
case class CC_C(a: Int, b: T_A[CC_A]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(12, _) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard Wildcard T_A) Wildcard T_A)