package Program_15 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: E, b: T_A[E, Char]) extends T_A[C, D]

val v_a: CC_A[Byte, Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
  case CC_A(0, CC_A(_, _)) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B Char (CC_A Char Boolean Wildcard (T_A Char)) Boolean (T_A Char))