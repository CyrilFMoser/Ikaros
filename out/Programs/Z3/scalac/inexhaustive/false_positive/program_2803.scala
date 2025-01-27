package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (Char,Int), b: Byte, c: T_A[C, D]) extends T_A[Int, C]
case class CC_B[E](a: T_A[Int, E]) extends T_A[CC_A[(Byte,Int), Boolean], E]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(('x',12), 0, _) => 0 
  case CC_A(('x',12), _, _) => 1 
  case CC_A((_,_), 0, _) => 2 
  case CC_A(_, _, _) => 3 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A Int Char))
// This is not matched: (CC_B Wildcard Wildcard (CC_A (Tuple Wildcard Wildcard) Int Wildcard T_A) T_A)