package Program_31 

package Program_12 

object Test {
sealed trait T_A
case class CC_A[A](a: Int, b: T_A) extends T_A
case class CC_B(a: T_A, b: CC_A[T_A], c: Char) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(12, CC_A(_, _)) => 1 
  case CC_B(CC_B(_, _, _), _, 'x') => 2 
  case CC_B(CC_A(_, _), CC_A(_, _), 'x') => 3 
  case CC_B(_, _, 'x') => 4 
  case CC_B(CC_B(_, _, _), _, _) => 5 
  case CC_B(_, CC_A(_, _), 'x') => 6 
  case CC_B(CC_B(_, _, _), CC_A(_, _), 'x') => 7 
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 8 
  case CC_B(_, _, _) => 9 
  case CC_B(CC_B(_, _, _), CC_A(_, _), _) => 10 
  case CC_B(_, CC_A(_, _), _) => 11 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_D Wildcard
//      (CC_B Boolean Wildcard (T_A Boolean))
//      (CC_A (CC_C Wildcard Wildcard Wildcard)
//            (T_A (CC_C Wildcard Wildcard Wildcard)))
//      (T_B (T_A Char)))