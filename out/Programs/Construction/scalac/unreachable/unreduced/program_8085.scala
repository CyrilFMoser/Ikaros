package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[Byte, C], b: T_A[C, C], c: T_B) extends T_A[Byte, C]
case class CC_B(a: CC_A[(T_B,T_B)]) extends T_A[Byte, CC_A[(Byte,T_B)]]
case class CC_C[D](a: CC_A[D], b: Boolean) extends T_A[D, T_A[CC_A[T_B], Boolean]]
case class CC_D() extends T_B
case class CC_E() extends T_B
case class CC_F(a: T_A[Byte, T_B], b: CC_A[Char]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E() => 1 
  case CC_F(_, CC_A(_, _, _)) => 2 
}
}