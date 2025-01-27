package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[G, H](a: H) extends T_A[G, T_B[Char, T_A[Char, Byte]]]
case class CC_C[I, J](a: (CC_A[Byte, Byte],T_B[Int, Int]), b: I, c: CC_B[J, J]) extends T_A[I, T_B[Char, T_A[Char, Byte]]]
case class CC_D[K](a: CC_C[K, K], b: T_A[K, K]) extends T_B[K, CC_A[T_B[(Byte,Int), Int], T_B[Byte, Boolean]]]
case class CC_E[L, M](a: L) extends T_B[L, CC_A[T_B[(Byte,Int), Int], T_B[Byte, Boolean]]]
case class CC_F[N](a: T_A[CC_A[N, N], CC_A[Int, N]]) extends T_B[N, CC_A[T_B[(Byte,Int), Int], T_B[Byte, Boolean]]]

val v_a: T_A[Byte, T_B[Char, T_A[Char, Byte]]] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C((CC_A(),_), 0, _) => 1 
  case CC_C((CC_A(),_), _, _) => 2 
}
}
// This is not matched: CC_A()