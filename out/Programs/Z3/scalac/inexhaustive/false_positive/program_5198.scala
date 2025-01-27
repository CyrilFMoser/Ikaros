package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_B(a: T_B[T_A]) extends T_A
case class CC_D[B]() extends T_B[B]
case class CC_E[C]() extends T_B[C]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_E()) => 0 
}
}
// This is not matched: (CC_C Wildcard T_B)