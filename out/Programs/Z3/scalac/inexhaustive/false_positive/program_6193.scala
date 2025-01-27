package Program_13 

object Test {
sealed trait T_A
case class CC_A() extends T_A
case class CC_B(a: (CC_A,T_A)) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((_,CC_B(_))) => 0 
}
}
// This is not matched: (CC_B (Tuple Wildcard (CC_C Wildcard T_A)) Wildcard Wildcard T_A)