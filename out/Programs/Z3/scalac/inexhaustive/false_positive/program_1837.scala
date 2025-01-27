package Program_31 

package Program_2 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: C, b: D) extends T_A[C]
case class CC_C(a: Char) extends T_A[Int]

val v_a: CC_B[CC_C, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, 'x') => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Char Byte (T_A Char Byte))