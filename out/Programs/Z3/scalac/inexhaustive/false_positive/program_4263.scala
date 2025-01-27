package Program_14 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[Char, Char], b: T_A[C, D]) extends T_A[C, D]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(_, _)) => 0 
  case CC_A(_, CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_A Boolean Char Boolean Wildcard Wildcard (T_A Char Boolean))
// This is not matched: (CC_A Boolean Char Boolean Wildcard Wildcard (T_A Char Boolean))