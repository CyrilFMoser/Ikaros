package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[D](a: D, b: (T_B,T_B)) extends T_A[T_B, D]
case class CC_E() extends T_B
case class CC_F() extends T_B

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, (_,CC_E())) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard Wildcard T_A) Wildcard T_A)