package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[T_B[F, E], F], b: E) extends T_A[E, T_A[T_A[(Byte,Char), Boolean], Byte]]
case class CC_B[G](a: (T_A[Boolean, (Int,Char)],T_A[Char, (Byte,Byte)]), b: Boolean) extends T_A[G, T_A[T_A[(Byte,Char), Boolean], Byte]]
case class CC_C[H](a: H) extends T_A[H, T_A[T_A[(Byte,Char), Boolean], Byte]]
case class CC_D[I, J](a: Char, b: T_B[J, J]) extends T_B[I, J]
case class CC_E[L, K](a: T_A[(Boolean,Boolean), L], b: L, c: T_A[K, L]) extends T_B[K, L]
case class CC_F[N, M](a: T_A[M, M], b: T_B[T_A[M, Char], M]) extends T_B[N, M]

val v_a: T_A[Byte, T_A[T_A[(Byte,Char), Boolean], Byte]] = null
val v_b: Int = v_a match{
  case CC_B((_,_), _) => 0 
  case CC_C(0) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: CC_A(_, _)