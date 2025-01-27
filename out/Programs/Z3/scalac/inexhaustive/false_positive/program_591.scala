package Program_31 

package Program_10 

object Test {
sealed trait T_A
case class CC_A[A](a: Int, b: A) extends T_A
case class CC_B(a: T_A, b: Boolean, c: T_A) extends T_A
case class CC_C(a: Char) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_) => 1 
  case CC_C('x') => 2 
  case CC_B(CC_B(_, _, _), _, CC_C(_)) => 3 
  case CC_B(_, _, _) => 4 
  case CC_B(CC_A(_, _), _, CC_C(_)) => 5 
  case CC_B(_, _, CC_A(_, _)) => 6 
  case CC_B(_, _, CC_B(_, _, _)) => 7 
  case CC_B(CC_B(_, _, _), _, CC_A(_, _)) => 8 
  case CC_B(CC_B(_, _, _), _, _) => 9 
  case CC_B(CC_A(_, _), _, CC_A(_, _)) => 10 
  case CC_B(CC_A(_, _), _, CC_B(_, _, _)) => 11 
  case CC_B(CC_C(_), _, CC_C(_)) => 12 
  case CC_B(CC_C(_), _, CC_A(_, _)) => 13 
  case CC_B(_, _, CC_C(_)) => 14 
  case CC_B(CC_A(_, _), _, _) => 15 
  case CC_B(CC_C(_), _, CC_B(_, _, _)) => 16 
  case CC_B(CC_C(_), _, _) => 17 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_D Wildcard Wildcard T_B)