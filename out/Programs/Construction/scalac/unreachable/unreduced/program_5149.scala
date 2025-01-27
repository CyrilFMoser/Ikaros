package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[E, E], E]
case class CC_B[F](a: F, b: T_A[T_A[F, F], F], c: Char) extends T_A[T_B[F, F], F]
case class CC_C[G](a: T_A[T_B[G, G], G], b: Byte, c: CC_A[G]) extends T_A[T_B[G, G], G]
case class CC_D[H, I](a: I, b: T_A[T_B[I, I], I]) extends T_B[H, I]

val v_a: T_A[T_B[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, 'x') => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(CC_A(), _, _) => 3 
  case CC_C(CC_B(_, _, _), _, _) => 4 
  case CC_C(CC_C(CC_A(), _, CC_A()), _, _) => 5 
  case CC_C(CC_C(CC_C(_, _, _), _, CC_A()), _, _) => 6 
}
}
// This is not matched: CC_C(CC_C(CC_B(_, _, _), _, CC_A()), _, _)