package Program_15 

object Test {
sealed trait T_A
case class CC_B(a: Byte) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A Boolean
//      (CC_A Byte Wildcard Wildcard Wildcard (T_A Byte Boolean))
//      (CC_C Boolean (T_A Boolean Boolean))
//      (CC_A Boolean Wildcard Wildcard Wildcard (T_A Boolean Boolean))
//      (T_A Boolean Boolean))