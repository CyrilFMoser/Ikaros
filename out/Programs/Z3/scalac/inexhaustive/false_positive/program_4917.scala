package Program_15 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Char, b: T_A[D, Byte], c: T_A[C, Char]) extends T_A[C, Byte]

val v_a: T_A[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_A('x', CC_A(_, _, _), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B Boolean Byte (T_A Boolean Byte))