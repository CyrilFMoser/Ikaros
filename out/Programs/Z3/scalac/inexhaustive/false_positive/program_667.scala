package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[D]) extends T_A[C]
case class CC_B[E](a: E, b: T_A[E]) extends T_B[E]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard (T_A Char))
// This is not matched: (CC_B (T_A (T_A Char)))