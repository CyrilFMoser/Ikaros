package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: (Byte,T_A), b: T_B) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B((_,CC_A()), _) => 0 
}
}
// This is not matched: (CC_C Wildcard T_A)