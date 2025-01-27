package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Int, Char], b: T_A[Int, Char]) extends T_A[Int, Char]
case class CC_B(a: T_B, b: T_A[Int, T_B], c: T_A[(CC_A,CC_A), T_A[Int, Char]]) extends T_A[Int, Char]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_A(CC_A(_, _), CC_A(_, _))) => 1 
  case CC_A(CC_B(_, _, _), CC_A(CC_A(_, _), CC_A(_, _))) => 2 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_A(_, _), CC_B(_, _, _))) => 3 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_A(CC_A(_, _), CC_B(_, _, _))) => 4 
  case CC_A(CC_B(_, _, _), CC_A(CC_A(_, _), CC_B(_, _, _))) => 5 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_B(_, _, _), CC_A(_, _))) => 6 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_A(_, _))) => 7 
  case CC_A(CC_B(_, _, _), CC_A(CC_B(_, _, _), CC_A(_, _))) => 8 
  case CC_A(CC_A(CC_A(_, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 9 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 10 
  case CC_A(CC_B(_, _, _), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 11 
  case CC_A(CC_A(CC_A(_, _), _), CC_B(_, _, _)) => 12 
  case CC_A(CC_A(CC_B(_, _, _), _), CC_B(_, _, _)) => 13 
  case CC_A(CC_B(_, _, _), CC_B(_, _, _)) => 14 
  case CC_B(_, _, _) => 15 
}
}