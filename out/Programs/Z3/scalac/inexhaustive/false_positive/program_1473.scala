package Program_31 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: D) extends T_A[D]
case class CC_B(a: T_A[Char]) extends T_A[Byte]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
}
}
// This is not matched: (CC_B (CC_A Char Boolean Wildcard (T_A Char)) (T_A Byte))
// This is not matched: Pattern match is empty without constants