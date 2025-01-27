package Program_23 

object Test {
sealed trait T_B[B, C]
case class CC_C[G, F](a: F) extends T_B[G, F]

val v_a: CC_C[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_C (CC_B T_A) T_A)