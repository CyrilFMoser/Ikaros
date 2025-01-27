package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean], b: C, c: Int) extends T_A[C, Boolean]
case class CC_B[D](a: T_A[D, D], b: T_A[Char, Boolean]) extends T_A[D, Boolean]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), 'x', _) => 0 
  case CC_A(CC_A(_, _, _), _, _) => 1 
  case CC_A(CC_B(_, _), 'x', _) => 2 
  case CC_B(_, CC_A(CC_A(_, _, _), 'x', _)) => 3 
  case CC_B(_, CC_A(CC_B(_, _), 'x', _)) => 4 
  case CC_B(_, CC_A(CC_A(_, _, _), _, _)) => 5 
  case CC_B(_, CC_A(CC_B(_, _), _, _)) => 6 
  case CC_B(_, CC_B(_, _)) => 7 
}
}
// This is not matched: CC_A(CC_B(_, _), _, _)