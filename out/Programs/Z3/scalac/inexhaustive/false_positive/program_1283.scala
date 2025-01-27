package Program_31 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_B[D], b: Int, c: T_A[Char]) extends T_A[C]
case class CC_B[E](a: E) extends T_A[E]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
  case CC_B(_) => 1 
  case CC_A(_, _, CC_A(_, _, _)) => 2 
  case CC_A(_, _, CC_B(_)) => 3 
  case CC_A(_, 12, _) => 4 
  case CC_A(_, _, _) => 5 
}
}
// This is not matched: (CC_A Char (T_B Boolean) Wildcard Wildcard Wildcard (T_A Char))
// This is not matched: (CC_A Char (T_B Boolean) Wildcard Wildcard Wildcard (T_A Char))