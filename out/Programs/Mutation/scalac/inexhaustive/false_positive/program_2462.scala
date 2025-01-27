package Program_19 

object Test {
sealed trait T_B[B, C]
case class CC_C[D, E](a: Int) extends T_B[E, D]

val v_a: CC_C[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_C(12) => 0 
}
}
// This is not matched: (CC_B Boolean Wildcard (T_A Boolean))