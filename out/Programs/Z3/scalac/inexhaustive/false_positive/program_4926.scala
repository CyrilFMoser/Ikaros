package Program_14 

object Test {
sealed trait T_B[C, D]
case class CC_C[H, G](a: Char) extends T_B[H, G]

val v_a: CC_C[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_C (CC_E Wildcard Wildcard T_B) Wildcard T_B)