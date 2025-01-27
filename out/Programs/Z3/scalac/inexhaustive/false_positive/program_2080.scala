package Program_30 

object Test {
sealed trait T_B[C]
case class CC_C[H](a: H) extends T_B[H]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_B T_A)