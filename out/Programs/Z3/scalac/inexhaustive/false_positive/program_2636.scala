package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[D, D], b: T_A[C, E]) extends T_A[C, D]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Char Char Boolean Wildcard Wildcard (T_A Char Char))
// This is not matched: Pattern match is empty without constants