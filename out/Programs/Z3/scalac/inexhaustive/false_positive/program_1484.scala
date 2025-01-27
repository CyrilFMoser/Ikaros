package Program_31 

package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E, F](a: Char) extends T_A[D, E]
case class CC_B[G](a: T_A[G, G], b: G) extends T_A[CC_A[Boolean, Byte, Char], G]
case class CC_C(a: CC_A[Char, Boolean, Char], b: T_B[Char]) extends T_A[CC_A[Boolean, Byte, Char], CC_A[Int, (Boolean,Boolean), Byte]]
case class CC_D() extends T_B[CC_C]
case class CC_E() extends T_B[CC_C]

val v_a: CC_A[CC_E, CC_E, Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)