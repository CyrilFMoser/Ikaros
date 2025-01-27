package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Byte,Char), b: T_A[B]) extends T_A[T_A[Byte]]
case class CC_B(a: Int) extends T_A[T_A[Byte]]
case class CC_C(a: CC_B, b: T_A[CC_B]) extends T_A[T_A[Byte]]

val v_a: CC_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A((_,'x'), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// This is not matched: (CC_B Byte Wildcard Wildcard (T_A Byte Char))