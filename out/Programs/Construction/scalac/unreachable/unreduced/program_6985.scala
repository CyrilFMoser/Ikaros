package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Int, b: Char, c: Int) extends T_A[C, T_A[T_B, T_B]]
case class CC_B[D](a: CC_A[D], b: T_A[D, D], c: CC_A[D]) extends T_A[D, T_A[T_B, T_B]]

val v_a: T_A[Char, T_A[T_B, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 12) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_A(_, _, _)