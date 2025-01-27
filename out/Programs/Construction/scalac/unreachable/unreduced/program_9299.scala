package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Int, b: T_A[D, T_A[D, D]], c: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_C() extends T_B

val v_a: T_A[T_B, T_A[T_B, T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C()) => 0 
  case CC_B(_, _, _) => 1 
}
}