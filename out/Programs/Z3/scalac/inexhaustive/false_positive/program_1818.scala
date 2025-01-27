package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: Byte, b: D, c: (Byte,Char)) extends T_A[C, D]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, 0, (_,'x')) => 0 
  case CC_A(_, 0, (0,'x')) => 1 
  case CC_A(_, _, _) => 2 
  case CC_A(0, _, (0,_)) => 3 
  case CC_A(_, _, (0,_)) => 4 
  case CC_A(0, 0, (_,_)) => 5 
  case CC_A(0, 0, (_,'x')) => 6 
}
}
// This is not matched: (CC_A Boolean Byte Boolean Byte Wildcard Wildcard (T_A Boolean Byte))
// This is not matched: Pattern match is empty without constants