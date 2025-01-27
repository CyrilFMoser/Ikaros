package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[T_B[T_A[F, F], T_A[F, F]], F], b: T_A[E, E], c: T_B[E, E]) extends T_A[F, E]
case class CC_B[H, I](a: T_A[H, H], b: Byte) extends T_A[H, I]
case class CC_C[J](a: T_B[J, J]) extends T_B[T_A[Byte, J], J]
case class CC_D[K](a: K) extends T_B[T_A[Byte, K], K]
case class CC_E[L]() extends T_B[T_A[Byte, L], L]

val v_a: T_B[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_) => 1 
  case CC_E() => 2 
}
}