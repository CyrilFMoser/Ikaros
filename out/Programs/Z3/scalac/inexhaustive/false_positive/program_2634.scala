package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[D, D], b: T_A[C, E]) extends T_A[C, D]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A Char Char (T_A Boolean Boolean) Wildcard Wildcard (T_A Char Char))
// This is not matched: (CC_A Char Char (T_A Boolean Boolean) Wildcard Wildcard (T_A Char Char))