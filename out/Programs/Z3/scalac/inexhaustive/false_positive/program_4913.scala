package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_E[E](a: Boolean, b: E) extends T_B[(CC_B,T_A), E]

val v_a: CC_E[T_A] = null
val v_b: Int = v_a match{
  case CC_E(_, CC_B()) => 0 
}
}
// This is not matched: (CC_E T_A
//      Wildcard
//      (CC_A Wildcard Wildcard Wildcard T_A)
//      (T_B (Tuple (CC_B T_A T_A T_A) T_A) T_A))