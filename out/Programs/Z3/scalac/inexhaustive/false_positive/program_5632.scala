package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_F[I, J](a: T_A[J]) extends T_B[J, I]

val v_a: CC_F[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_F(CC_B()) => 0 
}
}
// This is not matched: (CC_C (CC_C Wildcard Int Wildcard T_B) Wildcard Wildcard T_B)