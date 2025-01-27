package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[G, H]() extends T_A[H, G]
case class CC_C[I](a: T_A[I, I]) extends T_A[T_A[I, I], I]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: Pattern match is empty without constants