package Program_28 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_B() extends T_A
case class CC_E[E, D](a: D) extends T_B[E, D]

val v_a: CC_E[CC_B, Char] = null
val v_b: Int = v_a match{
  case CC_E('x') => 0 
}
}
// This is not matched: (CC_B Byte Boolean Wildcard (T_A Byte))