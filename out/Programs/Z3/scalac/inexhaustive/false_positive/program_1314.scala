package Program_30 

package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D]) extends T_A[Byte, C]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard (T_A Byte Byte))
// This is not matched: (CC_B Boolean
//      Boolean
//      (CC_C Boolean Wildcard Wildcard Char (T_A Boolean))
//      (T_A Boolean))