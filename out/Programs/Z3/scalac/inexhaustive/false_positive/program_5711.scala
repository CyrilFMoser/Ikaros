package Program_14 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: Int) extends T_A[F, E]
case class CC_B[H, G, I](a: T_A[G, I]) extends T_A[H, G]
case class CC_C[J](a: T_A[J, J], b: (Byte,(Byte,Char)), c: T_B[J, J]) extends T_B[T_A[Boolean, Byte], J]
case class CC_D[K](a: (Boolean,Byte), b: T_B[K, K]) extends T_B[T_A[Boolean, Byte], K]
case class CC_E[L, M, N]() extends T_B[L, M]

val v_a: CC_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Wildcard T_A)