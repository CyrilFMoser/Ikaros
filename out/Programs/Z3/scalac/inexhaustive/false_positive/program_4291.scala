package Program_14 

package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: Byte, b: T_A[D, Char]) extends T_A[D, C]

val v_a: T_A[Char, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_A Char Char Boolean Wildcard Wildcard (T_A Char Char))
// This is not matched: (CC_C Boolean Wildcard Wildcard (T_B (T_B Boolean)))