package Program_12 

package Program_7 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A) extends T_A

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Char (CC_A T_A (CC_A T_A (CC_A T_A Wildcard T_A) T_A) T_A) T_A)
// This is not matched: (CC_C (CC_C Wildcard Int Wildcard T_B) Wildcard Wildcard T_B)