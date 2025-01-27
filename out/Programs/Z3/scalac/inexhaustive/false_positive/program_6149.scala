package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Char]) extends T_A
case class CC_D[B]() extends T_B[B]
case class CC_E[C]() extends T_B[C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_E()) => 0 
}
}
// This is not matched: (CC_A (T_A (T_A Int)))