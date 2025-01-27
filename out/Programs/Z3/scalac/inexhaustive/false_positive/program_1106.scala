package Program_31 

object Test {
sealed trait T_B
case class CC_E(a: Int) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(12) => 0 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A Boolean))