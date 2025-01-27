package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, T_A[C, C]], b: T_A[C, C], c: C) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_B(CC_A(_, _, _)), _, _) => 1 
  case CC_A(CC_B(CC_B(_)), _, _) => 2 
  case CC_B(CC_A(CC_A(_, _, _), _, _)) => 3 
  case CC_B(CC_A(CC_B(_), _, _)) => 4 
  case CC_B(CC_B(CC_A(_, _, _))) => 5 
  case CC_B(CC_B(CC_B(_))) => 6 
}
}