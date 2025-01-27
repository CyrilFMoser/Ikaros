package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: T_B, c: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_C(a: T_A[(T_B,T_B), T_A[(T_B,T_B), (T_B,T_B)]], b: CC_B[CC_A[T_B]], c: Int) extends T_A[Int, T_A[Int, Int]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_A(CC_C(_, _, _)) => 2 
  case CC_B(_, _, _) => 3 
  case CC_C(CC_A(_), CC_B(_, _, _), _) => 4 
}
}
// This is not matched: CC_C(CC_B(_, _, _), CC_B(_, _, _), _)