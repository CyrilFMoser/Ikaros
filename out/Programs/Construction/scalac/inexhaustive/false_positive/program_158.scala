package Program_30 

package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G](a: T_A[G, G]) extends T_A[F, E]
case class CC_B[H, I]() extends T_A[I, H]
case class CC_C[J](a: Int, b: Int, c: T_A[J, J]) extends T_A[J, Boolean]
case class CC_D[K](a: Char, b: T_A[K, K]) extends T_B[K, T_A[CC_B[Boolean, Byte], Boolean]]
case class CC_E[L](a: T_A[L, L], b: (T_A[Char, Int],Char)) extends T_B[(T_A[Char, Boolean],T_A[Boolean, Boolean]), L]
case class CC_F[M](a: M, b: (CC_C[Boolean],Boolean), c: T_B[M, M]) extends T_B[M, T_A[CC_B[Boolean, Byte], Boolean]]

val v_a: CC_E[Int] = null
val v_b: Int = v_a match{
  case CC_E(CC_B(), _) => 0 
}
}
// This is not matched: CC_E(CC_A(_), _)
// This is not matched: CC_C()