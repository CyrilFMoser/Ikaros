package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: Byte) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[(Boolean,Char), T_A[(Boolean,Char), (Boolean,Char)]], b: T_A[D, T_A[D, D]], c: Int) extends T_A[D, T_A[D, D]]
case class CC_C(a: CC_B[CC_A[Boolean]]) extends T_A[Boolean, T_A[Boolean, Boolean]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _, _) => 1 
  case CC_B(CC_B(_, _, _), _, _) => 2 
  case CC_C(CC_B(_, _, 12)) => 3 
  case CC_C(CC_B(_, _, _)) => 4 
}
}