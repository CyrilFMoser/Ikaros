package Program_13 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[D], b: D, c: T_A[D]) extends T_A[C]
case class CC_B[E](a: CC_A[E, E]) extends T_A[E]
case class CC_C(a: T_A[Char]) extends T_B[T_B[Char]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_C (CC_B Char Wildcard (T_A Char)) (T_B (T_B Char)))
// This is not matched: Pattern match is empty without constants