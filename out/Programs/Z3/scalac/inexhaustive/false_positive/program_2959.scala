package Program_15 

package Program_13 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A[Int], b: CC_A[T_A]) extends T_A
case class CC_C(a: CC_A[CC_B]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_, _)) => 0 
  case CC_A(_, CC_C(_)) => 1 
  case CC_A(_, _) => 2 
  case CC_B(_, CC_A(_, _)) => 3 
  case CC_C(_) => 4 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)