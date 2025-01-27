package Program_31 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[Byte]) extends T_A[Byte]
case class CC_B[B](a: T_A[Byte], b: T_A[Byte]) extends T_B
case class CC_C(a: CC_A, b: T_A[CC_A]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: (CC_B T_B Wildcard Wildcard T_B)
// This is not matched: (CC_B Wildcard T_A)