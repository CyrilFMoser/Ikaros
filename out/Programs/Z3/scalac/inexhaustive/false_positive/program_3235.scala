package Program_15 

object Test {
sealed trait T_B
case class CC_E(a: Int) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(12) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)