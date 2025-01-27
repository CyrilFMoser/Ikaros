package Program_20 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Int], b: C, c: T_A[C, Int]) extends T_A[C, Int]
case class CC_B[D](a: T_A[D, D], b: CC_A[D], c: Int) extends T_A[D, Int]
case class CC_C[E](a: Char) extends T_A[E, CC_A[E]]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), true, CC_A(_, _, _)), _, _) => 0 
  case CC_A(CC_A(CC_A(_, _, _), false, CC_A(_, _, _)), _, _) => 1 
  case CC_A(CC_A(CC_B(_, _, _), true, CC_A(_, _, _)), _, _) => 2 
  case CC_A(CC_A(CC_B(_, _, _), false, CC_A(_, _, _)), _, _) => 3 
  case CC_A(CC_A(CC_A(_, _, _), true, CC_B(_, _, _)), _, _) => 4 
  case CC_A(CC_A(CC_A(_, _, _), false, CC_B(_, _, _)), _, _) => 5 
  case CC_A(CC_A(CC_B(_, _, _), true, CC_B(_, _, _)), _, _) => 6 
  case CC_A(CC_A(CC_B(_, _, _), false, CC_B(_, _, _)), _, _) => 7 
  case CC_A(CC_B(_, _, 12), _, _) => 8 
  case CC_A(CC_B(_, _, _), _, _) => 9 
  case CC_B(_, CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _) => 10 
  case CC_B(_, CC_A(CC_B(_, _, _), _, CC_A(_, _, _)), _) => 11 
  case CC_B(_, CC_A(CC_A(_, _, _), _, CC_B(_, _, _)), _) => 12 
  case CC_B(_, CC_A(CC_B(_, _, _), _, CC_B(_, _, _)), _) => 13 
}
}