package Program_10 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (Char,Boolean), b: T_A[C, D]) extends T_A[C, T_A[Int, Boolean]]
case class CC_B[E, F](a: CC_A[F, E], b: E) extends T_A[T_A[Char, Int], E]

val v_a: T_A[Byte, T_A[Int, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(('x',_), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants