package Program_30 

package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: E) extends T_A[E, Boolean]
case class CC_B[G, F](a: Int, b: T_A[F, Boolean], c: T_A[G, G]) extends T_A[G, F]
case class CC_C[H](a: T_B[H, Int]) extends T_B[H, Int]
case class CC_D[I](a: T_B[I, Int], b: I, c: CC_C[I]) extends T_B[I, Int]
case class CC_E[J, K](a: Char, b: K) extends T_B[J, Int]

val v_a: CC_E[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_E(_, 'x') => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants