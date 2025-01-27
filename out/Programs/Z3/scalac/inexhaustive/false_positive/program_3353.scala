package Program_13 

object Test {
sealed trait T_B
case class CC_C() extends T_B
case class CC_E(a: (CC_C,T_B)) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E((_,CC_C())) => 0 
}
}
// This is not matched: (CC_C Char Byte Wildcard Wildcard (T_A Byte Char))