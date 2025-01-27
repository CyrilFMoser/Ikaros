package Program_12 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[F, E], b: E) extends T_A[F, E]
case class CC_B[G, H, I](a: T_B[I, H]) extends T_A[H, G]
case class CC_C[J](a: T_A[J, Int]) extends T_A[J, T_B[Char, Boolean]]
case class CC_D[K, L](a: CC_B[K, K, L]) extends T_B[K, L]
case class CC_E[M](a: ((Char,Int),Boolean), b: CC_A[M, M]) extends T_B[Char, M]
case class CC_F[N](a: CC_A[N, N], b: CC_E[N]) extends T_B[Char, N]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_B Int Char Boolean Wildcard (T_A Char Int))
// This is not matched: Pattern match is empty without constants