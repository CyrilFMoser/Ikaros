package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_E[J](a: J) extends T_B[J]

val v_a: CC_E[Char] = null
val v_b: Int = v_a match{
  case CC_E('x') => 0 
}
}
// This is not matched: (CC_B Boolean (CC_B Wildcard Wildcard Wildcard T_B) Wildcard T_B)