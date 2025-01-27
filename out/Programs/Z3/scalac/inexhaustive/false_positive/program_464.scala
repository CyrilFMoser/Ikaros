package Program_31 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: C, b: T_B, c: C) extends T_A[B]
case class CC_B[D](a: CC_A[D, D], b: CC_A[D, D]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_B T_B Wildcard Wildcard T_B)
// This is not matched: (CC_B Wildcard (CC_B (CC_A T_A) Wildcard Wildcard T_A) Wildcard T_A)