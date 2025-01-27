package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[Boolean], b: T_B[D], c: T_B[D]) extends T_A[T_A[D, D], D]
case class CC_B[E](a: T_A[E, E], b: T_A[T_A[E, E], E], c: T_B[E]) extends T_A[T_A[E, E], E]
case class CC_C[F](a: T_A[F, F], b: T_B[F]) extends T_A[T_A[F, F], F]
case class CC_D[G, H](a: CC_C[H], b: T_B[G], c: T_A[T_A[G, G], G]) extends T_B[G]
case class CC_E[I](a: T_A[T_A[I, I], I]) extends T_B[I]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, CC_D(_, CC_E(_), _)) => 2 
  case CC_C(_, CC_E(CC_A(_, _, _))) => 3 
  case CC_C(_, CC_E(CC_B(_, _, _))) => 4 
  case CC_C(_, CC_E(CC_C(_, _))) => 5 
}
}
// This is not matched: CC_C(_, CC_D(_, CC_D(_, _, _), _))