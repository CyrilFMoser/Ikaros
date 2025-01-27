package Program_29 

package Program_14 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: T_A) extends T_A
case class CC_B(a: CC_A[(Int,Char)], b: T_A) extends T_A
case class CC_C(a: T_A, b: CC_A[CC_B]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(CC_A(_, _), CC_A(_, _)) => 3 
  case CC_B(CC_A(_, _), CC_C(_, _)) => 4 
  case CC_C(_, CC_A(_, _)) => 5 
  case CC_C(CC_B(_, _), CC_A(_, _)) => 6 
  case CC_C(CC_C(_, _), _) => 7 
  case CC_C(CC_A(_, _), _) => 8 
  case CC_C(CC_B(_, _), _) => 9 
  case CC_C(CC_C(_, _), CC_A(_, _)) => 10 
}
}
// This is not matched: (CC_A (CC_B T_A T_A T_A) Wildcard Wildcard T_A)
// This is not matched: (CC_C Wildcard Wildcard T_A)