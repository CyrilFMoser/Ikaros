package Program_31 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: B, b: B, c: Byte) extends T_A[T_A[Char]]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 0) => 0 
  case CC_A(0, 0, _) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B Wildcard T_A)