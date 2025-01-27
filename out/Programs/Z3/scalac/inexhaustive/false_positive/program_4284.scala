package Program_14 

package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[T_B[E, Boolean], E]
case class CC_B[F](a: CC_A[F], b: CC_A[F]) extends T_A[T_B[F, Boolean], F]
case class CC_C[G](a: T_A[Boolean, Boolean]) extends T_A[T_B[G, Boolean], G]
case class CC_D[H](a: T_B[H, H], b: CC_B[H]) extends T_B[H, Boolean]
case class CC_E[I, J](a: T_B[I, Boolean], b: Byte, c: Int) extends T_B[J, I]
case class CC_F[L, K, M](a: T_B[K, M]) extends T_B[K, L]

val v_a: CC_F[Int, Byte, Int] = null
val v_b: Int = v_a match{
  case CC_F(CC_F(_)) => 0 
}
}
// This is not matched: (CC_F Int
//      Byte
//      Int
//      (CC_E Int Byte Wildcard Byte Int (T_B Byte Int))
//      (T_B Byte Int))
// This is not matched: (CC_A Wildcard T_A)