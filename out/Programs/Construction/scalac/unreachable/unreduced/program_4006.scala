package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, D], b: T_A[D, D], c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: E, b: T_A[E, T_A[E, E]]) extends T_A[CC_B[E], E]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, _, _)) => 2 
  case CC_B(_, _, CC_A(CC_A(_))) => 3 
  case CC_B(_, _, CC_A(CC_B(_, _, _))) => 4 
  case CC_B(_, _, CC_B(_, _, CC_A(_))) => 5 
}
}
// This is not matched: CC_B(_, _, CC_B(_, _, CC_B(_, _, _)))