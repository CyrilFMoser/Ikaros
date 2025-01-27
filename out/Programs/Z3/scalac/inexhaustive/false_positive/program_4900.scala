package Program_13 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: C, c: T_A[B]) extends T_A[B]
case class CC_B[D](a: T_A[D]) extends T_A[D]

val v_a: CC_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x', CC_B(_)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A (CC_A Wildcard T_A) T_A)