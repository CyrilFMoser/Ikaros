package Program_15 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Byte) extends T_A[C, T_A[C, C]]
case class CC_B[F, E](a: T_A[F, F]) extends T_A[F, E]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_A(_) => 1 
  case CC_B(_) => 2 
}
}
// This is not matched: (CC_A Char Boolean Wildcard (T_A Char (T_A Char Char)))
// This is not matched: Pattern match is empty without constants