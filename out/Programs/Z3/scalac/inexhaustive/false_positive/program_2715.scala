package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[C, C]) extends T_A[D, C]

val v_a: CC_A[Byte, Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Byte
//      Boolean
//      Char
//      (CC_A Boolean
//            Boolean
//            Boolean
//            (CC_A Boolean Boolean Boolean Wildcard (T_A Boolean Boolean))
//            (T_A Boolean Boolean))
//      (T_A Byte Boolean))
// This is not matched: (CC_A T_A)