package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Char,Int), b: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: T_A[D], b: CC_A[D], c: T_A[D]) extends T_A[C]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(('x',12), _) => 0 
  case CC_A((_,_), _) => 1 
  case CC_A(('x',_), CC_A(_, _)) => 2 
  case CC_A((_,12), CC_B(_, _, _)) => 3 
  case CC_A((_,12), CC_A(_, _)) => 4 
  case CC_B(CC_B(_, _, _), CC_A(_, _), CC_B(_, _, _)) => 5 
  case CC_B(_, _, CC_A(_, _)) => 6 
  case CC_B(_, _, _) => 7 
  case CC_B(CC_B(_, _, _), CC_A(_, _), CC_A(_, _)) => 8 
  case CC_B(CC_A(_, _), CC_A(_, _), CC_B(_, _, _)) => 9 
  case CC_B(CC_B(_, _, _), _, _) => 10 
  case CC_B(CC_B(_, _, _), _, CC_A(_, _)) => 11 
  case CC_B(_, _, CC_B(_, _, _)) => 12 
}
}
// This is not matched: (CC_B Boolean Boolean Wildcard Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_C Wildcard Wildcard (T_A (T_A Int)))