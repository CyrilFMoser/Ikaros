package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Char) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
}
}
// This is not matched: CC_B(CC_B(CC_A(_, _)))