package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[F, F], b: T_A[E, F], c: E) extends T_A[E, F]
case class CC_B[G, H](a: (T_A[Boolean, Boolean],T_A[(Boolean,Boolean), Boolean]), b: CC_A[H, G], c: T_B[G, G]) extends T_A[G, H]
case class CC_C[J, I, K](a: K, b: T_A[K, J], c: T_A[K, K]) extends T_A[I, J]
case class CC_D[L](a: T_A[L, L]) extends T_B[T_A[L, L], L]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)