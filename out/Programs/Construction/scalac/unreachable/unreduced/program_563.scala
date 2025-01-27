package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_A[F, F]) extends T_A[F, T_A[F, F]]
case class CC_C[G](a: T_A[G, T_A[G, G]]) extends T_A[G, T_A[G, G]]
case class CC_D[H, I](a: Boolean, b: T_B[I, I]) extends T_B[H, I]
case class CC_E[J, K]() extends T_B[J, K]
case class CC_F[L](a: L) extends T_B[L, T_A[L, T_A[L, L]]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _)) => 0 
  case CC_A(CC_E()) => 1 
  case CC_B(_) => 2 
  case CC_C(CC_A(_)) => 3 
  case CC_C(CC_B(_)) => 4 
  case CC_C(CC_C(_)) => 5 
}
}