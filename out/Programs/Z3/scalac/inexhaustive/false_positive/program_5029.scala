package Program_14 

package Program_3 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B[A](a: CC_A, b: Boolean) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
  case CC_A(CC_B(_, _), CC_B(_, _)) => 2 
  case CC_A(CC_A(_, _), _) => 3 
}
}
// This is not matched: (CC_A (CC_B (CC_A T_A T_A T_A) Wildcard Wildcard T_A)
//      (CC_B T_A Wildcard Wildcard T_A)
//      T_A)
// This is not matched: (CC_B (CC_A T_A) Wildcard T_A)