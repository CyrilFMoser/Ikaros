package Program_28 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E, F](a: E, b: T_A[D, E], c: T_A[F, F]) extends T_A[D, E]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Boolean Wildcard Wildcard Wildcard (T_A Byte Boolean))
// This is not matched: (CC_B (T_A Char) Wildcard Wildcard (T_A (T_A Char)))