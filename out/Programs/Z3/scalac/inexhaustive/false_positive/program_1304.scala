package Program_31 

object Test {
sealed trait T_B[C, D]
case class CC_E[J](a: J) extends T_B[J, Boolean]

val v_a: CC_E[Char] = null
val v_b: Int = v_a match{
  case CC_E('x') => 0 
}
}
// This is not matched: (CC_D Wildcard (CC_A T_A) T_B)