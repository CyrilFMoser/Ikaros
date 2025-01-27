package Program_14 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[G, H, I](a: CC_A[I, H], b: I, c: H) extends T_A[G, H]
case class CC_C[J](a: J, b: J) extends T_A[CC_A[Char, Boolean], J]
case class CC_D[K](a: K, b: CC_A[K, (Boolean,Int)]) extends T_B[K, CC_B[Byte, K, K]]
case class CC_E[L](a: T_B[L, L], b: T_A[L, L], c: CC_A[L, L]) extends T_B[L, CC_B[Byte, L, L]]
case class CC_F[M](a: CC_B[M, M, M], b: (Byte,(Int,Int))) extends T_B[M, CC_B[Byte, M, M]]

val v_a: CC_B[Int, Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _, 'x') => 0 
  case CC_B(CC_A(), 12, 'x') => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_E Wildcard (T_B (T_A Byte) (T_A Int)))