package Program_31 

package Program_13 

object Test {
sealed trait T_A
case class CC_A(a: Boolean, b: T_A, c: T_A) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C[A](a: T_A, b: A, c: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(_, CC_C(_, _, _), CC_C(_, _, _)) => 1 
  case CC_A(_, CC_A(_, _, _), CC_B(_)) => 2 
  case CC_A(_, CC_B(_), CC_A(_, _, _)) => 3 
  case CC_A(_, CC_B(_), CC_C(_, _, _)) => 4 
  case CC_A(_, CC_C(_, _, _), CC_A(_, _, _)) => 5 
  case CC_A(_, CC_B(_), CC_B(_)) => 6 
  case CC_A(_, _, CC_B(_)) => 7 
  case CC_A(_, CC_A(_, _, _), CC_C(_, _, _)) => 8 
  case CC_A(_, _, CC_C(_, _, _)) => 9 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 10 
  case CC_C(CC_A(_, _, _), _, CC_A(_, _, _)) => 11 
  case CC_C(CC_C(_, _, _), _, _) => 12 
  case CC_C(CC_B(_), _, CC_A(_, _, _)) => 13 
  case CC_C(_, _, CC_A(_, _, _)) => 14 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)