package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: T_B, b: Boolean, c: T_A) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(_, _, _)) => 0 
}
}
// This is not matched: (CC_C (CC_C Wildcard Byte T_A) Wildcard T_A)