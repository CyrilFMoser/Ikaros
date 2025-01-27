package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_B(a: T_A, b: T_B) extends T_A
case class CC_C() extends T_B
case class CC_E() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_E()) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard (T_A (T_B Boolean)))