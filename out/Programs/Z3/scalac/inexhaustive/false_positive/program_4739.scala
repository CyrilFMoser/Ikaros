package Program_14 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: (T_B,T_B), b: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: T_A[C], b: T_B, c: CC_A[D]) extends T_A[C]
case class CC_C() extends T_B

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _, _)) => 1 
}
}
// This is not matched: (CC_A Char
//      Wildcard
//      (CC_B Char T_B Wildcard Wildcard Wildcard (T_A Char))
//      (T_A Char))
// This is not matched: (CC_B Wildcard
//      (T_A (T_A Boolean Int) (CC_A Byte Char Boolean Boolean Boolean Boolean)))