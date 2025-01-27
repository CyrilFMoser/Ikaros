package Program_31 

object Test {
sealed trait T_B[A]
case class CC_E[C](a: Char) extends T_B[C]

val v_a: CC_E[Char] = null
val v_b: Int = v_a match{
  case CC_E('x') => 0 
}
}
// This is not matched: (CC_C Wildcard (T_B Byte))