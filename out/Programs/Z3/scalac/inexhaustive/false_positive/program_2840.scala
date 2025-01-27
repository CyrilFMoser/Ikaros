package Program_29 

package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: (Int,Char), c: T_A[B]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), (_,'x'), CC_A(_, _, _)) => 0 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, _), (_,_), _) => 2 
  case CC_A(CC_A(_, _, _), (12,'x'), CC_A(_, _, _)) => 3 
  case CC_A(_, _, _) => 4 
  case CC_A(CC_A(_, _, _), (_,_), CC_A(_, _, _)) => 5 
  case CC_A(_, (12,'x'), CC_A(_, _, _)) => 6 
}
}
// This is not matched: (CC_A Boolean Wildcard (Tuple Wildcard Wildcard) Wildcard (T_A (T_A Byte)))
// This is not matched: (CC_A Byte Boolean (T_A Byte))