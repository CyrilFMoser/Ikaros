package Program_11 

package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_B) extends T_A[Int, C]
case class CC_B[E](a: CC_A[E, E], b: T_A[Int, E]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), CC_A(_)) => 0 
}
}
// This is not matched: (CC_B (CC_A T_B T_B T_B T_B) Wildcard Wildcard T_B)
// This is not matched: (CC_B T_B Wildcard Wildcard T_B)