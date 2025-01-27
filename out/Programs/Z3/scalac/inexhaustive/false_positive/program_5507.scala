package Program_15 

object Test {
sealed trait T_B
case class CC_C() extends T_B
case class CC_D(a: T_B, b: T_B) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C()) => 0 
}
}
// This is not matched: (CC_A (CC_D (T_A T_B T_B) T_B) Byte (T_A Byte (CC_D (T_A T_B T_B) T_B)))