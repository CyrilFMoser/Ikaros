package Program_31 

package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: T_A[Boolean], c: T_A[Char]) extends T_A[T_A[Char]]
case class CC_B[B, C](a: C, b: C) extends T_A[B]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_A(CC_B(_, _), _, _) => 1 
  case CC_A(_, CC_B(_, _), CC_B(_, _)) => 2 
  case CC_A(CC_B(_, _), _, CC_B(_, _)) => 3 
  case CC_A(CC_B(_, _), CC_B(_, _), CC_B(_, _)) => 4 
  case CC_A(_, CC_B(_, _), _) => 5 
  case CC_A(CC_B(_, _), CC_B(_, _), _) => 6 
  case CC_A(_, _, _) => 7 
}
}
// This is not matched: (CC_B (T_A Char) Boolean Wildcard Wildcard (T_A (T_A Char)))
// This is not matched: (CC_B Char Wildcard Wildcard (T_A Char))