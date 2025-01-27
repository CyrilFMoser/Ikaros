package Program_15 

object Test {
sealed trait T_B[B, C]
case class CC_B[E, D]() extends T_B[D, E]
case class CC_C[F](a: T_B[F, Int]) extends T_B[F, Int]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: (CC_C Wildcard (CC_B T_A) (CC_C Wildcard Wildcard Wildcard T_A) T_A)