package Program_31 

object Test {
sealed trait T_A
case class CC_C(a: Byte) extends T_A

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: (CC_C (CC_B Char Wildcard Wildcard T_A) Wildcard Wildcard T_B)