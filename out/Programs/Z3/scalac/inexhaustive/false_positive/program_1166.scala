package Program_31 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_B[B], b: B, c: T_B[B]) extends T_A
case class CC_B() extends T_B[CC_A[T_A]]
case class CC_C(a: Byte) extends T_B[CC_A[T_A]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(0) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Char (T_A Char (T_A Char Char)))