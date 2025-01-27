package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[T_B[Byte, E], E], E]
case class CC_B[F](a: F) extends T_A[T_A[T_B[Byte, F], F], F]
case class CC_C[G, H](a: CC_B[CC_A[Int]], b: T_A[G, (Boolean,(Byte,Boolean))]) extends T_A[T_A[T_B[Byte, G], G], G]
case class CC_D[I, J](a: T_A[I, J], b: I, c: CC_C[J, I]) extends T_B[I, J]
case class CC_E[K, L](a: CC_B[CC_B[K]], b: T_A[K, L]) extends T_B[K, L]
case class CC_F[M, N](a: Char) extends T_B[M, N]

val v_a: T_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_E(_, _) => 0 
  case CC_F(_) => 1 
}
}
// This is not matched: CC_D(_, _, _)