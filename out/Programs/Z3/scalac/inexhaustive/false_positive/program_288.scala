package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: (CC_A,T_A), b: T_B[C, CC_A]) extends T_B[CC_A, C]

val v_a: T_B[CC_A, Boolean] = null
val v_b: Int = v_a match{
  case CC_C((_,CC_B()), _) => 0 
}
}
// This is not matched: (CC_B (T_B (T_B Char Boolean) Boolean) (T_A (T_B (T_B Char Boolean) Boolean)))