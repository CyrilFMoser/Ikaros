package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: T_A[T_A[T_A[Int, Int], T_A[Int, Int]], T_A[T_A[T_A[Int, Int], T_A[Int, Int]], T_A[T_A[Int, Int], T_A[Int, Int]]]], c: T_A[D, (Char,Int)]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(CC_A(_, _), CC_B(_, _, _)) => 1 
  case CC_A(CC_B(CC_A(_, _), _, _), CC_A(_, _)) => 2 
  case CC_A(CC_B(CC_A(_, _), _, _), CC_B(_, _, _)) => 3 
  case CC_A(CC_B(CC_B(_, _, _), _, _), CC_A(_, _)) => 4 
  case CC_A(CC_B(CC_B(_, _, _), _, _), CC_B(_, _, _)) => 5 
  case CC_B(CC_A(_, _), CC_A(CC_A(_, _), CC_A(_, _)), _) => 6 
  case CC_B(CC_B(_, _, _), CC_A(CC_A(_, _), CC_A(_, _)), _) => 7 
  case CC_B(CC_A(_, _), CC_A(CC_B(_, _, _), CC_A(_, _)), _) => 8 
  case CC_B(CC_B(_, _, _), CC_A(CC_B(_, _, _), CC_A(_, _)), _) => 9 
  case CC_B(CC_A(_, _), CC_A(CC_A(_, _), CC_B(_, _, _)), _) => 10 
  case CC_B(CC_B(_, _, _), CC_A(CC_A(_, _), CC_B(_, _, _)), _) => 11 
  case CC_B(CC_A(_, _), CC_A(CC_B(_, _, _), CC_B(_, _, _)), _) => 12 
  case CC_B(CC_B(_, _, _), CC_A(CC_B(_, _, _), CC_B(_, _, _)), _) => 13 
  case CC_B(CC_A(_, _), CC_B(CC_A(_, _), _, _), _) => 14 
  case CC_B(CC_B(_, _, _), CC_B(CC_A(_, _), _, _), _) => 15 
  case CC_B(CC_A(_, _), CC_B(CC_B(_, _, _), _, _), _) => 16 
  case CC_B(CC_B(_, _, _), CC_B(CC_B(_, _, _), _, _), _) => 17 
}
}