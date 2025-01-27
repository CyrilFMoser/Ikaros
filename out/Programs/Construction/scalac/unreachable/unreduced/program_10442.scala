package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[F, F], b: T_B[E, E], c: E) extends T_A[E, F]
case class CC_B[H, G](a: Char, b: CC_A[G, T_A[H, H]]) extends T_A[H, G]
case class CC_C[J, I](a: T_B[J, I], b: T_A[I, I]) extends T_A[J, I]
case class CC_D[K](a: T_A[K, K], b: K) extends T_B[T_B[K, K], K]
case class CC_E[L](a: T_A[L, L]) extends T_B[T_B[L, L], L]
case class CC_F[M](a: CC_A[M, M], b: T_A[CC_E[M], M]) extends T_B[CC_E[T_A[Boolean, Char]], M]

val v_a: T_B[T_B[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _), 12) => 0 
  case CC_D(CC_A(_, _, _), _) => 1 
  case CC_D(CC_B('x', CC_A(_, _, _)), 12) => 2 
  case CC_D(CC_B('x', CC_A(_, _, _)), _) => 3 
  case CC_D(CC_B(_, CC_A(_, _, _)), 12) => 4 
  case CC_D(CC_B(_, CC_A(_, _, _)), _) => 5 
  case CC_D(CC_C(_, CC_A(_, _, _)), 12) => 6 
  case CC_D(CC_C(_, CC_A(_, _, _)), _) => 7 
  case CC_D(CC_C(_, CC_B(_, _)), 12) => 8 
  case CC_D(CC_C(_, CC_B(_, _)), _) => 9 
  case CC_D(CC_C(_, CC_C(_, _)), 12) => 10 
  case CC_D(CC_C(_, CC_C(_, _)), _) => 11 
  case CC_E(_) => 12 
}
}