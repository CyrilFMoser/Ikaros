package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: Byte, c: T_B) extends T_A
case class CC_C() extends T_B
case class CC_E() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_E()) => 0 
}
}
// This is not matched: (CC_A Boolean
//      (CC_A Byte Wildcard Wildcard Wildcard (T_A Byte Boolean))
//      (CC_C Boolean (T_A Boolean Boolean))
//      (CC_A Boolean Wildcard Wildcard Wildcard (T_A Boolean Boolean))
//      (T_A Boolean Boolean))