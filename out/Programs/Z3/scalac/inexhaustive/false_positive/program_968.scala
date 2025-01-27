package Program_29 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C]) extends T_A[B]

val v_a: CC_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Byte
//      Byte
//      (CC_A Byte
//            Boolean
//            (CC_A Boolean Boolean Wildcard (T_A Boolean))
//            (T_A Byte))
//      (T_A Byte))
// This is not matched: (CC_B Wildcard Wildcard T_B)