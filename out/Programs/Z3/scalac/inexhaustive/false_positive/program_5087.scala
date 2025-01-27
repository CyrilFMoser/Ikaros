package Program_15 

package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: (Int,Boolean), b: T_A[C], c: T_A[C]) extends T_A[B]
case class CC_B(a: CC_A[Int, Char]) extends T_A[T_A[Byte]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_B(_)) => 0 
  case CC_A((_,_), CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_A(_, _, CC_B(_)) => 2 
  case CC_A((_,_), CC_B(_), CC_B(_)) => 3 
  case CC_A((12,_), CC_B(_), CC_A(_, _, _)) => 4 
  case CC_A((_,_), CC_A(_, _, _), _) => 5 
  case CC_A((_,_), CC_B(_), CC_A(_, _, _)) => 6 
  case CC_A((_,_), CC_A(_, _, _), CC_B(_)) => 7 
  case CC_A((12,_), _, CC_B(_)) => 8 
  case CC_A((12,_), CC_A(_, _, _), _) => 9 
  case CC_A((_,_), CC_B(_), _) => 10 
  case CC_A((12,_), CC_A(_, _, _), CC_A(_, _, _)) => 11 
  case CC_A((12,_), CC_A(_, _, _), CC_B(_)) => 12 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 13 
  case CC_A((_,_), _, CC_A(_, _, _)) => 14 
  case CC_A(_, CC_B(_), _) => 15 
  case CC_A((12,_), _, CC_A(_, _, _)) => 16 
  case CC_A((12,_), CC_B(_), CC_B(_)) => 17 
  case CC_A(_, _, CC_A(_, _, _)) => 18 
  case CC_A((12,_), CC_B(_), _) => 19 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A Char))
// This is not matched: Pattern match is empty without constants