package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_C(a: T_A, b: T_B) extends T_B
case class CC_D() extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_D()) => 0 
}
}
// This is not matched: (CC_A (CC_B T_A) Wildcard Wildcard T_A)