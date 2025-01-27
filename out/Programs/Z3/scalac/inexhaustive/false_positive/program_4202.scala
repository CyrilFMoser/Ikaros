package Program_12 

object Test {
sealed trait T_B
case class CC_C() extends T_B
case class CC_D(a: CC_C, b: T_B) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(_, CC_C()) => 0 
}
}
// This is not matched: (CC_C Wildcard T_A)