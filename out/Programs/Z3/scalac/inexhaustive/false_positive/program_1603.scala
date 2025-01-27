package Program_29 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_B, c: T_A[C, C]) extends T_A[T_A[T_B, C], C]
case class CC_B[D](a: CC_A[D]) extends T_A[T_A[T_B, D], D]
case class CC_C[E](a: E, b: CC_B[E], c: Byte) extends T_A[T_A[T_B, E], E]
case class CC_D[F](a: T_A[F, F], b: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
}
}
// This is not matched: (CC_D T_B Wildcard Wildcard T_B)
// This is not matched: (CC_A Wildcard T_A)