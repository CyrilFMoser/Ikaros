package Program_30 

package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[Boolean, E]) extends T_A[D, C]

val v_a: CC_A[Char, Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Char
//      Byte
//      Char
//      (CC_A Boolean
//            Char
//            Boolean
//            (CC_A Boolean Boolean Boolean Wildcard (T_A Boolean Boolean))
//            (T_A Boolean Char))
//      (T_A Char Byte))
// This is not matched: (CC_A (CC_B Wildcard Wildcard (Tuple Wildcard Wildcard) T_A) Wildcard T_A)