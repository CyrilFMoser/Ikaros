package Program_14 

package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: T_B) extends T_A[B]
case class CC_B(a: CC_A[Boolean]) extends T_B
case class CC_C[C](a: T_B, b: CC_A[T_B]) extends T_B
case class CC_D(a: CC_C[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_D(CC_C(_, _)) => 1 
  case CC_C(CC_B(_), _) => 2 
  case CC_C(CC_D(_), _) => 3 
  case CC_C(_, CC_A(_, _)) => 4 
}
}
// This is not matched: (CC_C T_B Wildcard Wildcard T_B)
// This is not matched: (CC_B Wildcard T_A)