package Program_15 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_B[C], b: C, c: T_A[C]) extends T_A[C]
case class CC_B[E](a: E, b: T_A[Boolean], c: (Byte,Char)) extends T_A[E]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B(_, _, _)) => 0 
  case CC_A(_, _, _) => 1 
  case CC_A(_, 0, _) => 2 
  case CC_B(_, CC_B(_, _, _), (_,_)) => 3 
  case CC_B(_, _, (_,'x')) => 4 
  case CC_B(_, CC_A(_, _, _), _) => 5 
  case CC_B(0, CC_A(_, _, _), (0,_)) => 6 
  case CC_B(_, _, _) => 7 
  case CC_B(0, CC_A(_, _, _), (0,'x')) => 8 
  case CC_B(0, CC_A(_, _, _), (_,_)) => 9 
  case CC_B(0, CC_A(_, _, _), _) => 10 
  case CC_B(_, CC_A(_, _, _), (_,_)) => 11 
  case CC_B(_, _, (_,_)) => 12 
  case CC_B(_, CC_A(_, _, _), (0,'x')) => 13 
  case CC_B(0, _, _) => 14 
  case CC_B(_, CC_A(_, _, _), (_,'x')) => 15 
  case CC_B(_, CC_B(_, _, _), (0,'x')) => 16 
  case CC_B(0, CC_B(_, _, _), (0,'x')) => 17 
  case CC_B(0, CC_B(_, _, _), (0,_)) => 18 
  case CC_B(_, CC_B(_, _, _), (0,_)) => 19 
  case CC_B(0, CC_A(_, _, _), (_,'x')) => 20 
  case CC_B(_, CC_A(_, _, _), (0,_)) => 21 
  case CC_B(0, CC_B(_, _, _), (_,_)) => 22 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard Wildcard (T_A Byte))
// This is not matched: (CC_B (T_A (T_A Boolean)))