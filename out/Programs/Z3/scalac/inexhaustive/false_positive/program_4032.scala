package Program_12 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: Byte) extends T_A[B]
case class CC_B[C, D]() extends T_A[C]
case class CC_C(a: Int, b: Char, c: T_A[Boolean]) extends T_A[CC_B[Int, Byte]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(12, _, CC_A(_)) => 0 
  case CC_C(_, 'x', CC_B()) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants