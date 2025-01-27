package Program_14 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: A, b: A) extends T_A
case class CC_B[B](a: CC_A[B], b: (T_B,T_B), c: CC_A[B]) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A Int (T_A Int))