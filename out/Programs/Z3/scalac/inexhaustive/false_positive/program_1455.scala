package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_C() extends T_A
case class CC_E[C](a: Char) extends T_B[C]

val v_a: CC_E[CC_C] = null
val v_b: Int = v_a match{
  case CC_E('x') => 0 
}
}
// This is not matched: (CC_A Boolean (T_A (T_A Boolean Boolean) Boolean))