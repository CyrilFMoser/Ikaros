package Program_11 

package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: ((Int,Char),Int)) extends T_A[B]
case class CC_B[D](a: D, b: T_A[D]) extends T_A[D]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_A(CC_A(_, _), ((_,_),_)) => 1 
  case CC_A(_, ((_,_),_)) => 2 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_B Byte
//      (CC_B Byte Wildcard Byte Wildcard (T_A Byte))
//      Wildcard
//      Wildcard
//      (T_A Byte))