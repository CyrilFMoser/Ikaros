package Program_13 

package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[(Char,Boolean), E]) extends T_A[(Byte,Int), D]
case class CC_B(a: T_B[Int], b: CC_A[(Char,Byte), Byte], c: (Byte,Int)) extends T_A[(Byte,Int), CC_A[Byte, (Boolean,Boolean)]]
case class CC_C(a: T_B[Byte], b: T_A[Char, CC_B], c: T_B[CC_B]) extends T_B[CC_A[CC_B, CC_B]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, (_,12)) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_A Wildcard Wildcard T_A)