package Program_13 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: T_B) extends T_A[B]
case class CC_B(a: CC_A[Boolean]) extends T_B
case class CC_C[C](a: T_B, b: CC_A[T_B]) extends T_B
case class CC_D(a: CC_C[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_D(_) => 1 
  case CC_C(CC_D(_), CC_A(_, _)) => 2 
  case CC_C(CC_C(_, _), CC_A(_, _)) => 3 
  case CC_C(CC_B(_), CC_A(_, _)) => 4 
}
}
// This is not matched: (CC_C T_B Wildcard Wildcard T_B)
// This is not matched: (CC_B Wildcard T_A)