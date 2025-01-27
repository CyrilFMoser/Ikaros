package Program_30 

package Program_0 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: Byte, b: D, c: (Byte,Char)) extends T_A[C, D]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (_,_)) => 0 
  case CC_A(0, _, _) => 1 
}
}
// This is not matched: (CC_A Boolean Byte Boolean Wildcard Wildcard Wildcard (T_A Boolean Byte))
// This is not matched: Pattern match is empty without constants