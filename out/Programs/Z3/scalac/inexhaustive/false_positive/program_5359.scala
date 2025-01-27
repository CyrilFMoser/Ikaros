package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_C(a: T_B) extends T_A
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_E()) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard Wildcard (T_A (T_A Byte Byte) Byte))