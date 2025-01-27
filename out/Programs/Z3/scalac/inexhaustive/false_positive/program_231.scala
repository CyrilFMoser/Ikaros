package Program_31 

package Program_8 

object Test {
sealed trait T_A
case class CC_A(a: Int, b: T_A) extends T_A
case class CC_B[A](a: CC_A, b: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(12, _) => 1 
  case CC_A(12, CC_A(_, _)) => 2 
  case CC_A(_, CC_B(_, _)) => 3 
  case CC_B(_, _) => 4 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: (CC_C Byte Boolean (T_A Boolean Byte))