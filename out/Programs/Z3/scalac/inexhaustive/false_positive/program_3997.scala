package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: Byte) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
}
}
// This is not matched: (CC_B Boolean
//      Boolean
//      Wildcard
//      (CC_E Byte (Tuple Boolean (CC_D T_B)) Byte T_B)
//      (T_A Boolean))