package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, Byte]
case class CC_B[D]() extends T_A[D, CC_A[T_B]]
case class CC_C[E](a: Byte) extends T_A[E, Byte]
case class CC_D() extends T_B
case class CC_E(a: Boolean) extends T_B
case class CC_F(a: T_B, b: T_A[T_B, T_A[CC_D, Byte]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_F(_, _) => 1 
}
}
// This is not matched: CC_E(_)