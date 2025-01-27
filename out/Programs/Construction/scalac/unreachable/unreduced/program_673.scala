package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[C, C], b: T_A[C, C], c: Byte) extends T_A[C, T_B]
case class CC_B[D](a: Char, b: T_A[D, T_B], c: D) extends T_A[D, T_B]
case class CC_C(a: CC_B[Char], b: CC_A[(T_B,Char)]) extends T_B
case class CC_D(a: T_A[CC_C, T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_A(_, _, _)) => 1 
}
}
// This is not matched: CC_D(CC_B(_, _, _))