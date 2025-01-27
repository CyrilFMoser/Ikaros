package Program_30 

package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_A, b: T_B[B], c: T_B[B]) extends T_A
case class CC_B[C](a: T_A, b: T_A) extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_B(_, _), _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A Wildcard (CC_C Wildcard T_A) T_A)