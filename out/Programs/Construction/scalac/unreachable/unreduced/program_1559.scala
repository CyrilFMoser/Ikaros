package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E]) extends T_A[T_A[T_A[(Char,Boolean), E], E], E]
case class CC_B[F](a: T_B[F, CC_A[F]]) extends T_A[T_A[T_A[(Char,Boolean), F], F], F]
case class CC_C[G](a: T_A[G, G], b: CC_A[G]) extends T_A[T_A[T_A[(Char,Boolean), G], G], G]
case class CC_D[I, H, J](a: T_B[J, H], b: H, c: CC_A[J]) extends T_B[I, H]
case class CC_E[L, K]() extends T_B[L, K]
case class CC_F[M, N](a: T_B[M, T_A[N, M]], b: CC_E[N, N]) extends T_B[N, M]

val v_a: T_A[T_A[T_A[(Char,Boolean), Int], Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_D(_, _, _)) => 1 
  case CC_B(CC_E()) => 2 
  case CC_B(CC_F(_, _)) => 3 
  case CC_C(_, CC_A(_, _)) => 4 
}
}