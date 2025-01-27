package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_D() extends T_B
case class CC_E(a: T_B) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_D()) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard T_A) T_A)