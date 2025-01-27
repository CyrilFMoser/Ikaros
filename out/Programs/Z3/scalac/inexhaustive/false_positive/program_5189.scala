package Program_15 

package Program_0 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: Boolean, c: A) extends T_A
case class CC_B(a: CC_A[T_A], b: T_A, c: Char) extends T_A
case class CC_C(a: T_A, b: CC_A[(Char,Int)]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(CC_C(_, _), _) => 1 
  case CC_C(_, _) => 2 
  case CC_C(CC_B(_, _, _), _) => 3 
  case CC_C(_, CC_A(_, _, _)) => 4 
  case CC_C(CC_A(_, _, _), CC_A(_, _, _)) => 5 
  case CC_C(CC_C(_, _), CC_A(_, _, _)) => 6 
  case CC_B(_, _, _) => 7 
  case CC_B(CC_A(_, _, _), CC_C(_, _), 'x') => 8 
  case CC_B(CC_A(_, _, _), _, _) => 9 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), 'x') => 10 
  case CC_B(_, CC_A(_, _, _), 'x') => 11 
  case CC_B(_, _, 'x') => 12 
  case CC_B(_, CC_A(_, _, _), _) => 13 
  case CC_B(_, CC_B(_, _, _), 'x') => 14 
  case CC_B(CC_A(_, _, _), CC_B(_, _, _), 'x') => 15 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B Int
//      Boolean
//      (CC_B Boolean Boolean Wildcard (T_A Boolean Boolean))
//      (T_A Boolean Int))