package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: F, b: T_B[F, Char]) extends T_A[E, F]
case class CC_B[G, H](a: H, b: T_A[H, H]) extends T_A[G, H]
case class CC_C[I](a: CC_B[I, I], b: CC_A[I, CC_A[I, I]], c: T_A[I, I]) extends T_B[I, T_A[I, CC_B[I, I]]]
case class CC_D[J](a: (T_A[Boolean, Byte],CC_B[Byte, Byte])) extends T_B[J, T_A[J, CC_B[J, J]]]
case class CC_E[K]() extends T_B[K, T_A[K, CC_B[K, K]]]

val v_a: T_B[Char, T_A[Char, CC_B[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D((CC_A(_, _),CC_B(_, _))) => 1 
  case CC_E() => 2 
}
}
// This is not matched: CC_D((CC_B(_, _),CC_B(_, _)))