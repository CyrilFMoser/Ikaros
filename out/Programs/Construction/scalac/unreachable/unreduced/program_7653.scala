package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[E, E]) extends T_A[E, F]
case class CC_B[H, G](a: G) extends T_A[G, H]
case class CC_C[I, J](a: T_B[J, I]) extends T_A[I, J]
case class CC_D[K]() extends T_B[K, CC_C[K, K]]
case class CC_E[L](a: T_A[L, L], b: T_B[L, CC_C[L, L]], c: (CC_A[Char, Int],CC_C[Byte, Char])) extends T_B[L, CC_C[L, L]]
case class CC_F(a: Byte) extends T_B[CC_C[CC_B[Int, Char], Byte], CC_C[CC_C[CC_B[Int, Char], Byte], CC_C[CC_B[Int, Char], Byte]]]

val v_a: T_B[T_B[CC_C[CC_B[Int, Char], Byte], CC_C[CC_C[CC_B[Int, Char], Byte], CC_C[CC_B[Int, Char], Byte]]], CC_C[T_B[CC_C[CC_B[Int, Char], Byte], CC_C[CC_C[CC_B[Int, Char], Byte], CC_C[CC_B[Int, Char], Byte]]], T_B[CC_C[CC_B[Int, Char], Byte], CC_C[CC_C[CC_B[Int, Char], Byte], CC_C[CC_B[Int, Char], Byte]]]]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _, (CC_A(_),CC_C(_))) => 1 
}
}