package Program_63 

package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_B[E, E], E], b: T_B[E, E], c: Boolean) extends T_A[T_B[E, E], E]
case class CC_B[F](a: F, b: T_B[F, F]) extends T_A[T_B[F, F], F]
case class CC_C[G, H](a: H) extends T_B[G, T_A[T_B[G, G], G]]
case class CC_D[I](a: CC_C[I, I]) extends T_B[I, T_A[T_B[I, I], I]]
case class CC_E[J](a: T_B[Char, J], b: Int, c: J) extends T_B[Char, J]

val v_a: T_A[T_B[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(0, _) => 1 
}
}
// This is not matched: CC_B(_, _)
// This is not matched: CC_A()