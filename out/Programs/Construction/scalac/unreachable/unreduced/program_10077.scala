package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: Char, c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), 'x', CC_A(_)) => 0 
  case CC_B(CC_A(_), 'x', CC_B(_, _, _)) => 1 
  case CC_B(CC_B(_, _, CC_A(_)), 'x', CC_A(_)) => 2 
  case CC_B(CC_B(_, _, CC_A(_)), 'x', CC_B(_, _, _)) => 3 
  case CC_B(CC_B(_, _, CC_B(_, _, _)), 'x', CC_A(_)) => 4 
  case CC_B(CC_B(_, _, CC_B(_, _, _)), 'x', CC_B(_, _, _)) => 5 
  case CC_B(CC_A(_), _, CC_A(_)) => 6 
  case CC_B(CC_A(_), _, CC_B(_, _, _)) => 7 
  case CC_B(CC_B(_, _, CC_A(_)), _, CC_A(_)) => 8 
  case CC_B(CC_B(_, _, CC_A(_)), _, CC_B(_, _, _)) => 9 
  case CC_B(CC_B(_, _, CC_B(_, _, _)), _, CC_A(_)) => 10 
}
}
// This is not matched: CC_B(CC_B(_, _, CC_B(_, _, _)), _, CC_B(_, _, _))