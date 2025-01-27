package Program_20 

object Test {
sealed trait T_B[B, C]
case class CC_C[D, E](a: Char) extends T_B[E, D]

val v_a: CC_C[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_C('x') => 0 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A Boolean))