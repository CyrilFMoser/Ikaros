package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
case class CC_A[B, C]() extends T_A[B]
case class CC_B(a: CC_A[Byte, Boolean]) extends T_A[T_A[Int]]
case class CC_C(a: T_A[CC_B], b: (CC_B,CC_B), c: (CC_B,CC_B)) extends T_A[T_A[Int]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(), _, (CC_B(_),CC_B(_))) => 0 
}
}
// This is not matched: (CC_C (CC_A (CC_B Wildcard Wildcard) Boolean (T_A (CC_B Wildcard Wildcard)))
//      Wildcard
//      Wildcard
//      (T_A (T_A Int)))
// This is not matched: (CC_E (T_B (CC_A (T_B T_A) T_A T_A)))