package Program_31 

package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[C, E]) extends T_A[C, D]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Char Char Boolean Wildcard (T_A Char Char))
// This is not matched: (CC_B Wildcard
//      Wildcard
//      (CC_B Wildcard
//            Boolean
//            (CC_B Wildcard Wildcard Wildcard (T_A Byte))
//            (T_A Byte))
//      (T_A Byte))