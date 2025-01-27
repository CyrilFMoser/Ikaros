package Program_28 

package Program_7 

object Test {
sealed trait T_A
case class CC_A(a: Char, b: T_A, c: T_A) extends T_A
case class CC_B[A](a: Char) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A('x', CC_A(_, _, _), CC_B(_)) => 1 
  case CC_A(_, CC_B(_), CC_B(_)) => 2 
  case CC_A('x', CC_B(_), CC_B(_)) => 3 
  case CC_A('x', CC_A(_, _, _), CC_A(_, _, _)) => 4 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 5 
  case CC_A(_, CC_B(_), _) => 6 
  case CC_A(_, CC_A(_, _, _), _) => 7 
  case CC_A('x', _, CC_A(_, _, _)) => 8 
  case CC_A(_, _, CC_A(_, _, _)) => 9 
  case CC_A('x', _, CC_B(_)) => 10 
}
}
// This is not matched: (CC_B T_A Wildcard T_A)
// This is not matched: (CC_A Char Char Char (T_A Char Char))