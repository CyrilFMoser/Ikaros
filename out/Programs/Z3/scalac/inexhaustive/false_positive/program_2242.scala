package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: (Byte,Int)) extends T_A[C, D]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A((_,_)) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Boolean Wildcard (T_A Boolean Byte))
// This is not matched: (CC_A Byte Int Wildcard Wildcard (T_A Byte Int))