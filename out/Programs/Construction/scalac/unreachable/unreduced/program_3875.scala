package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: CC_A, b: CC_A, c: Byte) extends T_A
case class CC_D[C](a: CC_A, b: Boolean, c: CC_B) extends T_B[C, T_B[CC_B, T_B[Byte, CC_C]]]
case class CC_E[D]() extends T_B[D, T_B[CC_B, T_B[Byte, CC_C]]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_A(_, _), _, _) => 1 
}
}
// This is not matched: CC_A(_, _)