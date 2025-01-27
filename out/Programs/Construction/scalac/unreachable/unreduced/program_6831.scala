package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C]) extends T_A[C, Char]
case class CC_B[D](a: T_B, b: T_A[D, Char], c: T_A[D, Char]) extends T_A[D, Char]
case class CC_C[E](a: T_A[E, Char], b: Char, c: T_A[E, E]) extends T_A[E, Char]
case class CC_D() extends T_B
case class CC_E(a: T_A[CC_A[CC_D], Char], b: Char) extends T_B

val v_a: T_A[CC_E, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_D(), _, CC_A(_)) => 1 
  case CC_B(CC_E(_, _), _, CC_A(_)) => 2 
  case CC_B(CC_D(), _, CC_B(CC_D(), CC_A(_), _)) => 3 
  case CC_B(CC_E(_, _), _, CC_B(CC_D(), CC_A(_), _)) => 4 
  case CC_B(CC_D(), _, CC_B(CC_D(), CC_B(_, _, _), _)) => 5 
  case CC_B(CC_E(_, _), _, CC_B(CC_D(), CC_B(_, _, _), _)) => 6 
  case CC_B(CC_D(), _, CC_B(CC_D(), CC_C(_, _, _), _)) => 7 
  case CC_B(CC_E(_, _), _, CC_B(CC_D(), CC_C(_, _, _), _)) => 8 
  case CC_B(CC_D(), _, CC_B(CC_E(_, _), CC_A(_), _)) => 9 
  case CC_B(CC_E(_, _), _, CC_B(CC_E(_, _), CC_A(_), _)) => 10 
  case CC_B(CC_D(), _, CC_B(CC_E(_, _), CC_B(_, _, _), _)) => 11 
  case CC_B(CC_E(_, _), _, CC_B(CC_E(_, _), CC_B(_, _, _), _)) => 12 
  case CC_B(CC_D(), _, CC_B(CC_E(_, _), CC_C(_, _, _), _)) => 13 
  case CC_B(CC_E(_, _), _, CC_B(CC_E(_, _), CC_C(_, _, _), _)) => 14 
  case CC_B(CC_D(), _, CC_C(CC_A(_), 'x', _)) => 15 
  case CC_B(CC_E(_, _), _, CC_C(CC_A(_), 'x', _)) => 16 
  case CC_B(CC_D(), _, CC_C(CC_A(_), _, _)) => 17 
  case CC_B(CC_E(_, _), _, CC_C(CC_A(_), _, _)) => 18 
  case CC_B(CC_D(), _, CC_C(CC_B(_, _, _), 'x', _)) => 19 
  case CC_B(CC_E(_, _), _, CC_C(CC_B(_, _, _), 'x', _)) => 20 
  case CC_B(CC_D(), _, CC_C(CC_B(_, _, _), _, _)) => 21 
  case CC_B(CC_E(_, _), _, CC_C(CC_B(_, _, _), _, _)) => 22 
  case CC_B(CC_D(), _, CC_C(CC_C(_, _, _), 'x', _)) => 23 
  case CC_B(CC_E(_, _), _, CC_C(CC_C(_, _, _), 'x', _)) => 24 
  case CC_B(CC_D(), _, CC_C(CC_C(_, _, _), _, _)) => 25 
  case CC_B(CC_E(_, _), _, CC_C(CC_C(_, _, _), _, _)) => 26 
  case CC_C(_, _, _) => 27 
}
}