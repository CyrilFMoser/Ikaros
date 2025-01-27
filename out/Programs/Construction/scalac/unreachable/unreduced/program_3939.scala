package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], T_B[Boolean, T_A]]) extends T_A
case class CC_B(a: CC_A, b: Byte) extends T_A
case class CC_C(a: T_B[Byte, T_B[CC_B, T_A]]) extends T_A
case class CC_D(a: T_B[CC_B, CC_C]) extends T_B[CC_B, CC_C]
case class CC_E(a: CC_C, b: CC_C) extends T_B[CC_B, CC_C]
case class CC_F(a: Byte, b: CC_C, c: CC_B) extends T_B[CC_B, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_) => 2 
}
}