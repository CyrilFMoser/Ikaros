package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[D, C]
case class CC_B[F, E](a: T_A[E, F]) extends T_A[F, E]

val v_a: CC_B[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_B Wildcard Wildcard Wildcard T_A) T_A)