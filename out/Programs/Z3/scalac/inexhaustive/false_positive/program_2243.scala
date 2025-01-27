package Program_30 

package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: (Byte,Int)) extends T_A[C, D]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A((0,12)) => 1 
  case CC_A((0,_)) => 2 
  case CC_A((_,12)) => 3 
}
}
// This is not matched: (CC_A Byte Boolean Boolean Wildcard (T_A Boolean Byte))
// This is not matched: (CC_A Byte Int Wildcard Wildcard (T_A Byte Int))