package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: T_B[T_B[Boolean]]) extends T_A[Byte, Boolean]
case class CC_B(a: T_B[Int], b: T_A[CC_A, (CC_A,CC_A)]) extends T_A[Byte, Boolean]
case class CC_C() extends T_A[Byte, Boolean]
case class CC_D(a: T_A[Byte, Boolean], b: Byte) extends T_B[CC_C]
case class CC_E(a: T_B[CC_C], b: (Char,(CC_B,CC_B))) extends T_B[CC_C]
case class CC_F(a: CC_D, b: T_A[CC_B, CC_D], c: CC_A) extends T_B[CC_C]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _)