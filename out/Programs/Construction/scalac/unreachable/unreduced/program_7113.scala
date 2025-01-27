package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, F], b: T_B[E, E], c: F) extends T_A[F, E]
case class CC_B[H, G](a: Byte) extends T_A[G, H]
case class CC_C[I](a: (CC_B[Char, Byte],T_A[Char, Char])) extends T_A[I, T_A[I, I]]
case class CC_D[J](a: (T_A[Byte, Boolean],T_A[Boolean, Boolean]), b: (Byte,Byte), c: Byte) extends T_B[T_A[J, J], J]
case class CC_E[K](a: T_A[K, K], b: T_A[K, K], c: Boolean) extends T_B[T_A[K, K], K]
case class CC_F[L, M]() extends T_B[T_A[L, L], L]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(0) => 1 
}
}
// This is not matched: CC_B(_)