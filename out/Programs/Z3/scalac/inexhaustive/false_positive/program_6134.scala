package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_B[F, E](a: T_B) extends T_A[F, E]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: CC_B[Int, CC_D] = null
val v_b: Int = v_a match{
  case CC_B(CC_D()) => 0 
}
}
// This is not matched: (CC_A (CC_A T_B T_B T_B T_B) Wildcard Wildcard (T_A (CC_A T_B T_B T_B T_B) T_B))