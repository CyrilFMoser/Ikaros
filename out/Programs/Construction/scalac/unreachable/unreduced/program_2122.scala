package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: Boolean, c: E) extends T_A[T_A[T_B[Byte, Byte], Byte], E]
case class CC_B[F, G](a: T_B[F, F]) extends T_A[F, G]
case class CC_C[H](a: T_A[H, H]) extends T_A[T_A[T_B[Byte, Byte], Byte], H]
case class CC_D[I](a: I, b: CC_C[I]) extends T_B[T_B[I, I], I]

val v_a: T_A[T_A[T_B[Byte, Byte], Byte], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_)) => 2 
}
}