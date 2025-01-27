package Program_59 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, E], b: T_B[F, F]) extends T_A[F, E]
case class CC_B[H, G]() extends T_A[G, H]
case class CC_C[I]() extends T_B[I, T_B[I, I]]

val v_a: CC_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard Wildcard (T_A (T_A Int)))