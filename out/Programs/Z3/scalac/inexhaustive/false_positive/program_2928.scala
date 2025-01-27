package Program_15 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C) extends T_A[C, T_A[C, Char]]
case class CC_B(a: T_A[Int, Byte]) extends T_A[CC_A[Int, Int], T_A[CC_A[Int, Int], Char]]

val v_a: CC_A[Int, CC_B] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: Pattern match is empty without constants