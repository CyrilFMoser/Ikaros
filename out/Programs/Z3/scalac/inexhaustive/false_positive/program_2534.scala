package Program_31 

package Program_12 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B[A](a: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
  case CC_A(CC_B(_), _) => 2 
  case CC_A(_, CC_B(_)) => 3 
  case CC_A(CC_B(_), CC_B(_)) => 4 
}
}
// This is not matched: (CC_A (CC_A Wildcard Wildcard T_A) (CC_B T_A Wildcard T_A) T_A)
// This is not matched: (CC_B (CC_A T_A T_A T_A) Wildcard T_A)