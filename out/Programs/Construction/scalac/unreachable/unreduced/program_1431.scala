package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_B[T_B[F, Char], F], b: T_A[F, F]) extends T_A[F, T_A[F, F]]
case class CC_C[G]() extends T_A[G, T_A[G, G]]
case class CC_D[I, H](a: Int) extends T_B[H, I]
case class CC_E[K, J](a: J, b: T_A[J, T_A[J, J]], c: K) extends T_B[K, J]
case class CC_F[L](a: T_A[L, L], b: T_A[Char, L]) extends T_B[Int, L]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_D(_), _) => 1 
  case CC_B(CC_E(_, _, _), _) => 2 
}
}
// This is not matched: CC_C()