package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[G, F](a: T_A[F, F]) extends T_A[F, G]

val v_a: CC_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard T_A)