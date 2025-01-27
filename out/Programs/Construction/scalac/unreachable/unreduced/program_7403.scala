package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Int, b: Char, c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(12, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(12, _, CC_B(_, _))) => 1 
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 2 
  case CC_A(_, _, CC_A(_, _, CC_B(_, _))) => 3 
  case CC_A(_, _, CC_B(_, _)) => 4 
  case CC_B(_, _) => 5 
}
}