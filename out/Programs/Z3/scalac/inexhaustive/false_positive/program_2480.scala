package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: T_A[B], c: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: T_B, b: Char, c: Char) extends T_A[T_A[T_B]]
case class CC_C(a: Int) extends T_B
case class CC_D(a: (CC_B,CC_C)) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_B(CC_D(_), 'x', 'x') => 0 
  case CC_B(CC_C(_), 'x', _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_B(CC_C(_), _, 'x') => 3 
  case CC_B(CC_C(_), _, _) => 4 
  case CC_B(CC_D(_), _, _) => 5 
  case CC_B(CC_C(_), 'x', 'x') => 6 
  case CC_A(_, CC_A(_, _, _), CC_D(_)) => 7 
  case CC_A(CC_B(_, _, _), CC_B(_, _, _), CC_C(_)) => 8 
  case CC_A(_, CC_B(_, _, _), CC_D(_)) => 9 
  case CC_A(CC_B(_, _, _), CC_A(_, _, _), _) => 10 
  case CC_A(CC_A(_, _, _), CC_B(_, _, _), _) => 11 
  case CC_A(CC_B(_, _, _), CC_A(_, _, _), CC_D(_)) => 12 
  case CC_A(CC_B(_, _, _), CC_B(_, _, _), _) => 13 
  case CC_A(CC_B(_, _, _), CC_B(_, _, _), CC_D(_)) => 14 
  case CC_A(_, _, _) => 15 
  case CC_A(CC_A(_, _, _), _, CC_C(_)) => 16 
  case CC_A(CC_A(_, _, _), _, _) => 17 
  case CC_A(CC_B(_, _, _), _, _) => 18 
  case CC_A(CC_A(_, _, _), _, CC_D(_)) => 19 
  case CC_A(CC_B(_, _, _), CC_A(_, _, _), CC_C(_)) => 20 
  case CC_A(CC_B(_, _, _), _, CC_D(_)) => 21 
}
}
// This is not matched: (CC_A T_B Wildcard Wildcard Wildcard (T_A (T_A T_B)))
// This is not matched: (CC_A T_B Int Int (T_A Int T_B))