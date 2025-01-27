package Program_30 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A() extends T_A
case class CC_B[B, C](a: T_B[B]) extends T_B[B]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}
// This is not matched: (CC_B (CC_A T_A) T_A Wildcard (T_B (CC_A T_A)))
// This is not matched: (CC_B (CC_A T_A) T_A Wildcard (T_B (CC_A T_A)))