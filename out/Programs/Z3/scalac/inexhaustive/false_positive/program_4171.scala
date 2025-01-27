package Program_14 

package Program_3 

object Test {
sealed trait T_A
case class CC_A(a: Byte, b: T_A, c: T_A) extends T_A
case class CC_B[A](a: Boolean, b: CC_A, c: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0, CC_A(_, _, _), CC_B(_, _, _)) => 0 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_A(_, CC_B(_, _, _), _) => 2 
  case CC_A(_, CC_A(_, _, _), CC_B(_, _, _)) => 3 
  case CC_A(0, CC_A(_, _, _), _) => 4 
  case CC_A(0, CC_A(_, _, _), CC_A(_, _, _)) => 5 
  case CC_A(0, _, _) => 6 
  case CC_B(_, _, CC_A(_, _, _)) => 7 
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 8 
}
}
// This is not matched: (CC_B (CC_A T_A T_A T_A T_A) Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_C (CC_B Wildcard T_A) T_A)