package Program_31 

package Program_6 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: C) extends T_A[B]

val v_a: CC_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A('x') => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants