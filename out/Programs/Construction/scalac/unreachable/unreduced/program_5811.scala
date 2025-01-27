package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[E, E], b: T_B[F, E]) extends T_A[E, F]
case class CC_B[G](a: CC_A[T_A[G, Byte], G], b: T_A[T_A[Byte, Byte], Byte], c: G) extends T_A[G, Byte]
case class CC_C[I]() extends T_A[I, Byte]
case class CC_D[J](a: Boolean) extends T_B[T_A[T_A[Byte, Int], Byte], J]
case class CC_E[K, L](a: CC_A[L, L], b: CC_B[L], c: (CC_A[Int, Int],T_A[Int, Char])) extends T_B[T_A[T_A[Byte, Int], Byte], K]
case class CC_F[M](a: CC_B[M], b: T_A[M, Byte], c: Byte) extends T_B[T_A[T_A[Byte, Int], Byte], T_A[T_A[Byte, Boolean], CC_E[Int, Byte]]]

val v_a: T_B[T_A[T_A[Byte, Int], Byte], T_A[T_A[Byte, Boolean], CC_E[Int, Byte]]] = null
val v_b: Int = v_a match{
  case CC_E(_, _, (CC_A(_, _),CC_A(_, _))) => 0 
  case CC_F(_, _, _) => 1 
}
}
// This is not matched: CC_D(_)