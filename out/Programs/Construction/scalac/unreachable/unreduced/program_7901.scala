package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, Boolean]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Int, b: T_A[D, T_A[D, D]], c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _), CC_A(_, _)) => 1 
  case CC_B(_, CC_A(_, _), CC_B(12, CC_A(_, _), _)) => 2 
  case CC_B(_, CC_A(_, _), CC_B(_, CC_A(_, _), _)) => 3 
  case CC_B(_, CC_A(_, _), CC_B(12, CC_B(_, _, _), _)) => 4 
  case CC_B(_, CC_A(_, _), CC_B(_, CC_B(_, _, _), _)) => 5 
  case CC_B(_, CC_B(_, _, _), CC_A(_, _)) => 6 
  case CC_B(_, CC_B(_, _, _), CC_B(12, CC_A(_, _), _)) => 7 
  case CC_B(_, CC_B(_, _, _), CC_B(_, CC_A(_, _), _)) => 8 
  case CC_B(_, CC_B(_, _, _), CC_B(12, CC_B(_, _, _), _)) => 9 
  case CC_B(_, CC_B(_, _, _), CC_B(_, CC_B(_, _, _), _)) => 10 
}
}