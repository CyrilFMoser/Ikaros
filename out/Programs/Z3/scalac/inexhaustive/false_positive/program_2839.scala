package Program_30 

package Program_5 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: (Int,Char), c: T_A[B]) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, (12,_), _) => 0 
  case CC_A(_, (_,'x'), _) => 1 
  case CC_A(_, (_,_), _) => 2 
  case CC_A(CC_A(_, _, _), (_,'x'), _) => 3 
  case CC_A(CC_A(_, _, _), (12,_), _) => 4 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A (T_A Byte)))
// This is not matched: (CC_A Byte Boolean (T_A Byte))