package Program_31 

object Test {
sealed trait T_B
case class CC_E(a: Char) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E('x') => 0 
}
}
// This is not matched: (CC_A Int Wildcard Wildcard Wildcard (T_A (Tuple Char Boolean) Int))