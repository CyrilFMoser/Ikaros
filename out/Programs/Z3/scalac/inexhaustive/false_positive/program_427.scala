package Program_31 

package Program_8 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: A, b: T_A, c: T_B) extends T_A
case class CC_B(a: CC_A[T_A], b: Char, c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, CC_A(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(CC_A(_, _, _), _, _) => 3 
  case CC_B(_, _, CC_B(_, _, _)) => 4 
  case CC_B(_, 'x', CC_B(_, _, _)) => 5 
  case CC_B(CC_A(_, _, _), 'x', CC_B(_, _, _)) => 6 
  case CC_B(CC_A(_, _, _), _, CC_A(_, _, _)) => 7 
  case CC_B(_, 'x', CC_A(_, _, _)) => 8 
  case CC_B(CC_A(_, _, _), 'x', _) => 9 
  case CC_B(CC_A(_, _, _), _, CC_B(_, _, _)) => 10 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_C Byte Wildcard Wildcard Wildcard (T_B Byte))