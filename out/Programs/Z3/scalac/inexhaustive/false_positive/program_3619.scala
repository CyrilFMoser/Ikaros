package Program_13 

package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C], b: C, c: T_A[C, D]) extends T_A[C, T_A[C, C]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12, CC_A(_, _, _)) => 0 
  case CC_A(_, 12, _) => 1 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_E (T_B (T_B Byte Boolean) (T_A Byte)))