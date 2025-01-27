package Program_23 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Int) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[CC_A[D], T_A[CC_A[D], CC_A[D]]]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_B(CC_B(_)) => 1 
}
}
// This is not matched: CC_A(_, _)