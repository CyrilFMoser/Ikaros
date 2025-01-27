package Program_30 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (Char,Int), b: Byte, c: T_A[C, D]) extends T_A[Int, C]
case class CC_B[E](a: T_A[Int, E]) extends T_A[CC_A[(Byte,Int), Boolean], E]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, _) => 0 
  case CC_A(('x',_), 0, _) => 1 
  case CC_A(('x',_), _, _) => 2 
  case CC_A((_,12), 0, _) => 3 
  case CC_A((_,12), _, _) => 4 
  case CC_A(_, 0, _) => 5 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A Int Char))
// This is not matched: (CC_B Wildcard Wildcard (CC_A (Tuple Wildcard Wildcard) Int Wildcard T_A) T_A)