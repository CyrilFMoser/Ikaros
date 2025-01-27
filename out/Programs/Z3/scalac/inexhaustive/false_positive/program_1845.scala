package Program_31 

package Program_6 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A) extends T_A

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Boolean (CC_A T_A (CC_A T_A (CC_A T_A Wildcard T_A) T_A) T_A) T_A)
// This is not matched: (CC_B Boolean (T_A Boolean))