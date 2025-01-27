package Program_13 

object Test {
sealed trait T_B
case class CC_E() extends T_B
case class CC_F(a: T_B) extends T_B

val v_a: CC_F = null
val v_b: Int = v_a match{
  case CC_F(CC_E()) => 0 
}
}
// This is not matched: (CC_A Int Boolean Wildcard Wildcard (T_A Boolean Int))