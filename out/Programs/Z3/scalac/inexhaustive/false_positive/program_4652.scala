package Program_15 

object Test {
sealed trait T_A
case class CC_C(a: Char) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_B (T_A T_B (T_A (Tuple Byte Byte) T_B)))