package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_B(a: Byte, b: T_B[(Int,Boolean)]) extends T_A
case class CC_C[B]() extends T_B[B]
case class CC_E[D]() extends T_B[D]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_E()) => 0 
}
}
// This is not matched: (CC_A (T_A (T_A Byte)))