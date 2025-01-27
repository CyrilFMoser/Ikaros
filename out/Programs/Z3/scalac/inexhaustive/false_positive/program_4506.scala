package Program_15 

object Test {
sealed trait T_B[C]
case class CC_D[H](a: Char) extends T_B[H]

val v_a: CC_D[Boolean] = null
val v_b: Int = v_a match{
  case CC_D('x') => 0 
}
}
// This is not matched: (CC_B (CC_B Wildcard T_A) T_A)