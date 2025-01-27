package Program_31 

package Program_5 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B(a: Boolean) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(CC_B(_), CC_B(_), _) => 1 
  case CC_A(CC_B(_), CC_A(_, _, _), CC_A(_, _, _)) => 2 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B(_)) => 3 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 4 
  case CC_A(_, _, CC_A(_, _, _)) => 5 
  case CC_A(_, CC_B(_), CC_B(_)) => 6 
  case CC_A(CC_B(_), CC_A(_, _, _), CC_B(_)) => 7 
  case CC_A(_, CC_B(_), CC_A(_, _, _)) => 8 
  case CC_A(_, _, CC_B(_)) => 9 
  case CC_A(_, CC_A(_, _, _), _) => 10 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 11 
}
}
// This is not matched: (CC_A T_A
//      (CC_A Wildcard (CC_B Wildcard T_A) Wildcard (CC_B Wildcard T_A) T_A)
//      Wildcard
//      Wildcard
//      T_A)
// This is not matched: (CC_A Wildcard (T_A Char))