package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_C() extends T_A
case class CC_D() extends T_B[CC_C]
case class CC_F(a: T_B[CC_C], b: T_B[(Byte,Int)]) extends T_B[CC_C]

val v_a: CC_F = null
val v_b: Int = v_a match{
  case CC_F(CC_D(), _) => 0 
}
}
// This is not matched: (CC_C Int (T_A Int))