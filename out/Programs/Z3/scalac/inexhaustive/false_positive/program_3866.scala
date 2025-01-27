package Program_15 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: (Char,Byte), b: Char, c: T_A[B]) extends T_A[B]
case class CC_B[D](a: Int) extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_B(12) => 1 
  case CC_A(_, _, CC_A(_, _, _)) => 2 
  case CC_A(_, 'x', CC_A(_, _, _)) => 3 
  case CC_A((_,0), 'x', _) => 4 
  case CC_A((_,_), 'x', CC_B(_)) => 5 
  case CC_A((_,0), 'x', CC_B(_)) => 6 
  case CC_A((_,_), 'x', CC_A(_, _, _)) => 7 
  case CC_A(_, 'x', CC_B(_)) => 8 
  case CC_A(('x',_), _, CC_A(_, _, _)) => 9 
  case CC_A(('x',_), _, CC_B(_)) => 10 
  case CC_A(_, _, _) => 11 
  case CC_A((_,_), _, CC_A(_, _, _)) => 12 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_A Byte (CC_A Byte Wildcard (T_A Byte)) (T_A Byte))