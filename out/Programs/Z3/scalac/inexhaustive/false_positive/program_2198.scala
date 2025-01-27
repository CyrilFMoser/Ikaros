package Program_30 

package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: E) extends T_A[D, E]
case class CC_B[F](a: F) extends T_A[T_A[Int, (Int,Boolean)], T_B[Char]]
case class CC_C[G](a: T_B[G], b: T_A[G, G]) extends T_B[G]
case class CC_D[H](a: CC_C[H]) extends T_B[H]
case class CC_E[I](a: CC_B[I]) extends T_B[I]

val v_a: CC_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A T_A)