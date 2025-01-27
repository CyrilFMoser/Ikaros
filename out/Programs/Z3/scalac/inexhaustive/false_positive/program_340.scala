package Program_30 

package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G](a: T_A[F, F]) extends T_A[F, E]
case class CC_B[H](a: CC_A[Boolean, H, H]) extends T_A[H, T_B[H, H]]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean (T_A Boolean Boolean) Wildcard (T_A Boolean Boolean))
// This is not matched: (CC_B (CC_B Wildcard (CC_A Wildcard Wildcard T_A) T_A) Wildcard T_A)