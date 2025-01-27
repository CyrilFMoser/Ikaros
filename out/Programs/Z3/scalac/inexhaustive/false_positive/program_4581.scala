package Program_13 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B[B, C](a: (CC_A,Char)) extends T_A[B]
case class CC_C() extends T_A[T_B]
case class CC_D() extends T_B
case class CC_E(a: Char, b: T_A[CC_A]) extends T_B

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E('x', _) => 0 
  case CC_E(_, CC_B(_)) => 1 
}
}
// This is not matched: (CC_E Char (CC_B (CC_A T_B) T_B Wildcard (T_A (CC_A T_B))) T_B)
// This is not matched: (CC_C (T_A (CC_A Byte Boolean Boolean Boolean Boolean)))