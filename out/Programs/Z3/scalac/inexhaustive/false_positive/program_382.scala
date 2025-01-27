package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, F]) extends T_A[F, E]
case class CC_B[G, H]() extends T_A[CC_A[Char, Char], G]
case class CC_C[I, J](a: CC_B[I, Char], b: CC_B[J, J]) extends T_B[J, I]
case class CC_D[K, L](a: K) extends T_B[K, L]
case class CC_E[M, N](a: CC_D[N, N], b: CC_B[M, N], c: Byte) extends T_B[M, N]

val v_a: T_A[CC_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_)) => 1 
  case CC_A(CC_B()) => 2 
}
}
// This is not matched: (CC_B Char Boolean (T_A (CC_A Char Char Boolean Boolean) Char))
// This is not matched: (CC_B Int Boolean (T_A Boolean Int))