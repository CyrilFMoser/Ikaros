package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Char,T_A[Char, Char])) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_A[F, T_A[F, F]]) extends T_A[F, T_A[F, F]]
case class CC_C[G]() extends T_A[G, T_A[G, G]]
case class CC_D[I, H](a: I) extends T_B[H, I]
case class CC_E[J, K](a: T_A[K, T_A[K, K]], b: Byte) extends T_B[J, T_A[(Char,Boolean), T_A[(Char,Boolean), (Char,Boolean)]]]
case class CC_F[L](a: L, b: T_B[L, Char]) extends T_B[T_A[L, T_A[L, L]], L]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)