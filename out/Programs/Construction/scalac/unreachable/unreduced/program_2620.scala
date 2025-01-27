package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Boolean) extends T_A
case class CC_B() extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_B[C, C], b: CC_A, c: C) extends T_B[CC_C, C]
case class CC_E[D](a: Byte, b: T_A) extends T_B[CC_C, D]
case class CC_F(a: T_B[CC_C, T_B[CC_C, CC_A]]) extends T_B[CC_C, T_B[CC_C, T_A]]

val v_a: T_B[CC_C, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, _) => 1 
}
}