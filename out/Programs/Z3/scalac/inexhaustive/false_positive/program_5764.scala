package Program_15 

package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_A[T_B]) extends T_B
case class CC_C[B](a: CC_B, b: B, c: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C(_, _, CC_A(_)) => 1 
  case CC_C(CC_B(_), _, _) => 2 
  case CC_C(CC_B(_), _, CC_A(_)) => 3 
}
}
// This is not matched: (CC_C Boolean Wildcard Boolean Wildcard T_B)
// This is not matched: (CC_B (CC_A Wildcard Wildcard Wildcard T_A) Wildcard T_A)