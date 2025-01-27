package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, T_A[D]]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F](a: F) extends T_A[F]
case class CC_D[G](a: T_B[G, G]) extends T_B[T_B[G, G], G]
case class CC_E[H](a: Char) extends T_B[T_B[H, H], H]
case class CC_F[I](a: CC_A[I], b: Boolean, c: T_B[CC_E[I], I]) extends T_B[T_B[I, I], I]

val v_a: T_B[T_B[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_) => 1 
}
}
// This is not matched: CC_F(_, _, _)