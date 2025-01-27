package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[D, C]
case class CC_D() extends T_B
case class CC_E(a: (CC_D,T_B)) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E((_,CC_D())) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)