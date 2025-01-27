package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, F], b: T_A[E, T_A[T_A[E, E], T_A[E, E]]], c: Char) extends T_A[E, F]
case class CC_B[I, H](a: I, b: T_B[I, H]) extends T_A[I, H]
case class CC_C[J, K](a: K, b: J, c: Byte) extends T_A[J, K]
case class CC_D[L](a: CC_A[L, L], b: T_A[L, L]) extends T_B[L, T_A[L, L]]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_, _, _)