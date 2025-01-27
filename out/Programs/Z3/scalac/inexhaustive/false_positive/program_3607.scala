package Program_11 

object Test {
sealed trait T_B
case class CC_D() extends T_B
case class CC_F(a: T_B) extends T_B

val v_a: CC_F = null
val v_b: Int = v_a match{
  case CC_F(CC_D()) => 0 
}
}
// This is not matched: (CC_F (CC_E T_B) T_B)