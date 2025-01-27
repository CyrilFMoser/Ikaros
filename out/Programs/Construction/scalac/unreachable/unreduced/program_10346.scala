package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[Byte, E], b: T_A[E, E]) extends T_A[Byte, E]
case class CC_B[F](a: T_A[Byte, F]) extends T_A[Byte, F]
case class CC_C[H, G](a: T_B[H, H], b: CC_A[G], c: G) extends T_B[G, H]
case class CC_D[I, J](a: Boolean, b: T_A[J, J], c: T_B[I, I]) extends T_B[J, I]
case class CC_E[L, K](a: CC_D[K, L], b: CC_B[L]) extends T_B[L, K]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_B(CC_B(CC_A(_, _))) => 1 
  case CC_B(CC_B(CC_B(_))) => 2 
}
}
// This is not matched: CC_A(_, _)