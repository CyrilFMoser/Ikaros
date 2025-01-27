package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, E], b: T_A[F, F]) extends T_A[E, F]
case class CC_B[G, H](a: T_A[H, H]) extends T_A[G, H]
case class CC_C[J, I](a: Byte, b: CC_B[I, J]) extends T_A[I, J]
case class CC_D[K, L](a: T_B[L, L]) extends T_B[K, L]
case class CC_E[M, N](a: CC_B[N, M]) extends T_B[M, CC_D[CC_C[Char, Boolean], ((Byte,Boolean),Char)]]
case class CC_F[O]() extends T_B[O, CC_D[CC_C[Char, Boolean], ((Byte,Boolean),Char)]]

val v_a: T_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
}
}