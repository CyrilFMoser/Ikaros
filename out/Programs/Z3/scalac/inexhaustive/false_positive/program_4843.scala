package Program_15 

package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, F]) extends T_A[E, F]
case class CC_B[G](a: G, b: CC_A[G, Boolean], c: (Int,Boolean)) extends T_A[G, T_B[G, G]]
case class CC_C[H](a: H, b: T_B[H, H]) extends T_A[H, T_B[H, H]]
case class CC_D[I, J](a: CC_A[I, J], b: CC_A[J, I]) extends T_B[T_A[I, Boolean], I]
case class CC_E[K, L](a: Int, b: T_B[K, K], c: CC_A[K, L]) extends T_B[K, L]
case class CC_F[M](a: Char, b: CC_E[M, M]) extends T_B[T_A[Int, Boolean], Int]

val v_a: CC_B[T_B[T_A[Int, Boolean], Int]] = null
val v_b: Int = v_a match{
  case CC_B(CC_E(_, _, _), _, (12,_)) => 0 
  case CC_B(CC_E(_, _, _), CC_A(_), (12,_)) => 1 
  case CC_B(CC_D(_, _), _, (12,_)) => 2 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Wildcard Wildcard T_A)