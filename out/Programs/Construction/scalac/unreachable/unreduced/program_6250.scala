package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[T_A[D, D], D]]
case class CC_B[E](a: T_A[E, T_B[E]]) extends T_A[E, T_A[T_A[E, E], E]]
case class CC_C[F]() extends T_A[F, T_A[T_A[F, F], F]]
case class CC_D[G](a: G) extends T_B[G]
case class CC_E[H](a: H, b: CC_C[T_B[H]]) extends T_B[H]
case class CC_F[I](a: CC_E[I], b: I, c: CC_B[I]) extends T_B[I]

val v_a: T_A[Char, T_A[T_A[Char, Char], Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()