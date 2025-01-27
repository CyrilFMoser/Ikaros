package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: Boolean) extends T_A[F, E]
case class CC_B[H, G](a: Boolean, b: T_B[H, G]) extends T_A[G, H]
case class CC_C[I](a: CC_B[I, I]) extends T_A[T_A[T_A[Boolean, Byte], CC_A[(Byte,Int), Boolean]], I]
case class CC_D[J]() extends T_B[J, CC_C[J]]
case class CC_E[K](a: Char, b: T_A[K, K], c: (T_A[(Char,Char), Boolean],CC_B[(Byte,Byte), Byte])) extends T_B[K, CC_C[K]]
case class CC_F[L](a: T_A[L, L]) extends T_B[L, T_B[CC_D[Int], CC_C[CC_D[Int]]]]

val v_a: CC_F[Char] = null
val v_b: Int = v_a match{
  case CC_F(CC_A(_)) => 0 
  case CC_F(CC_B(_, _)) => 1 
}
}