package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: Byte, b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, D], b: T_B, c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C(a: CC_B[((Boolean,Boolean),(Char,Int))], b: Int) extends T_B
case class CC_D(a: T_A[CC_C, T_A[CC_C, CC_C]]) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _)) => 0 
  case CC_D(CC_B(_, _, _)) => 1 
}
}