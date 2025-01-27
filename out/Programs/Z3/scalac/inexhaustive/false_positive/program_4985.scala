package Program_14 

package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: B, b: T_A[B], c: (Boolean,Byte)) extends T_A[B]
case class CC_B[D](a: T_A[D], b: T_A[D], c: T_A[D]) extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A('x', CC_A(_, _, _), _) => 1 
  case CC_A(_, _, _) => 2 
  case CC_A('x', CC_A(_, _, _), (_,_)) => 3 
  case CC_A(_, _, (_,_)) => 4 
  case CC_A('x', CC_B(_, _, _), (_,0)) => 5 
  case CC_A(_, _, (_,0)) => 6 
  case CC_A(_, CC_B(_, _, _), (_,0)) => 7 
  case CC_A('x', CC_A(_, _, _), (_,0)) => 8 
  case CC_A(_, CC_A(_, _, _), (_,_)) => 9 
  case CC_A(_, CC_B(_, _, _), (_,_)) => 10 
  case CC_A('x', _, (_,0)) => 11 
  case CC_A('x', _, _) => 12 
  case CC_A('x', CC_B(_, _, _), _) => 13 
  case CC_B(_, CC_B(_, _, _), _) => 14 
  case CC_B(_, _, CC_A(_, _, _)) => 15 
  case CC_B(CC_B(_, _, _), _, _) => 16 
  case CC_B(_, _, _) => 17 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A Char))
// This is not matched: (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A Char))