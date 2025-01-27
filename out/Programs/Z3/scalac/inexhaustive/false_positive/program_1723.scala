package Program_30 

package Program_3 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A, c: Byte) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), 0) => 0 
  case CC_A(CC_A(_, _, _), _, 0) => 1 
  case CC_A(_, _, 0) => 2 
  case CC_A(CC_A(_, _, _), _, _) => 3 
  case CC_A(_, _, _) => 4 
  case CC_A(_, CC_A(_, _, _), _) => 5 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)