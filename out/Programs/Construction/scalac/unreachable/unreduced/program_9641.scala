package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, T_A[F, T_A[F, F]]]) extends T_A[F, E]
case class CC_B[I, H](a: Byte, b: T_B[H, I]) extends T_A[H, I]
case class CC_C[K, J]() extends T_A[K, J]
case class CC_D[L](a: Char, b: CC_C[L, L], c: Int) extends T_B[T_A[Char, T_B[Boolean, Char]], L]

val v_a: T_A[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_)