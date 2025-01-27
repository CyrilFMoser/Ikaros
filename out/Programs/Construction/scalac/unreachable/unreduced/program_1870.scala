package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C) extends T_A[C, T_A[C, C]]
case class CC_B[D, E](a: T_A[E, E]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_A(_, _)