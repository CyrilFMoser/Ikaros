package Program_31 

package Program_15 

object Test {
sealed trait T_A
case class CC_A[A](a: A) extends T_A
case class CC_B(a: T_A, b: CC_A[T_A]) extends T_A

val v_a: CC_A[T_A] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _)) => 0 
  case CC_A(CC_A(_)) => 1 
}
}
// This is not matched: (CC_A T_A (CC_A T_A Wildcard T_A) T_A)
// This is not matched: (CC_A T_A (CC_A T_A Wildcard T_A) T_A)