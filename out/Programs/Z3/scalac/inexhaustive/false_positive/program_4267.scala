package Program_13 

package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[Char, Char], b: T_A[C, D]) extends T_A[C, D]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Boolean Char Boolean Wildcard Wildcard (T_A Char Boolean))
// This is not matched: (CC_C (CC_B (CC_A T_A) T_A) Wildcard T_A)