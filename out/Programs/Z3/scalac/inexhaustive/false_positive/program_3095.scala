package Program_14 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: T_B) extends T_B
case class CC_C[A](a: CC_B, b: CC_A, c: T_A) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
  case CC_B(CC_C(_, _, _)) => 1 
}
}
// This is not matched: (CC_B (CC_C T_A (CC_B Wildcard T_B) (CC_A T_A) (CC_A T_A) T_B) T_B)
// This is not matched: (CC_B Wildcard Int T_A)