package Program_30 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: (Char,Boolean), b: T_A[Char, E], c: T_A[E, E]) extends T_A[C, D]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_), _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, _) => 1 
  case CC_A((_,_), _, _) => 2 
  case CC_A(('x',_), _, _) => 3 
  case CC_A(('x',_), CC_A(_, _, _), CC_A(_, _, _)) => 4 
  case CC_A(('x',_), CC_A(_, _, _), _) => 5 
}
}
// This is not matched: (CC_A Byte Int Boolean Wildcard Wildcard Wildcard (T_A Byte Int))
// This is not matched: (CC_A Byte Int Boolean Wildcard Wildcard Wildcard (T_A Byte Int))