package Program_15 

object Test {
sealed trait T_B
case class CC_B(a: Char) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)