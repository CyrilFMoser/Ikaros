package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, E]) extends T_A[F, E]
case class CC_B[G](a: Boolean, b: Boolean, c: CC_A[G, G]) extends T_A[T_A[G, G], G]
case class CC_C[H, I](a: Int, b: Boolean, c: T_A[T_A[I, I], I]) extends T_A[H, I]
case class CC_D[J, K](a: Int) extends T_B[K, J]
case class CC_E[L](a: (((Boolean,Byte),Boolean),Byte)) extends T_B[Char, CC_D[CC_B[Int], CC_A[Boolean, Char]]]
case class CC_F(a: CC_A[CC_A[Char, Byte], Boolean], b: CC_C[T_A[Char, Int], CC_C[Boolean, Char]]) extends T_B[Char, CC_D[CC_B[Int], CC_A[Boolean, Char]]]

val v_a: CC_D[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
}
}