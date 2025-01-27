package Program_15 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[Boolean, E]]
case class CC_B[F, G](a: G, b: Boolean, c: CC_A[F]) extends T_A[F, T_A[Boolean, F]]
case class CC_C[H](a: Byte, b: T_B[H, Boolean]) extends T_A[H, T_A[Boolean, H]]

val v_a: CC_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(0, _, CC_A()) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Wildcard Wildcard (T_A (Tuple Char Char)))