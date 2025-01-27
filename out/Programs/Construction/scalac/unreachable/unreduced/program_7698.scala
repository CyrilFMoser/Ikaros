package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, T_A[C, C]], c: T_A[C, C]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: CC_A[D], b: D, c: Int) extends T_A[D, T_A[D, D]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(CC_A(_, _, _), _, _), _, _) => 1 
  case CC_B(_, _, 12) => 2 
  case CC_B(_, _, _) => 3 
}
}