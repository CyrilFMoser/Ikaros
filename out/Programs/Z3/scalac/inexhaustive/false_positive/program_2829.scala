package Program_31 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A, b: T_A) extends T_A
case class CC_B(a: T_A, b: T_B[T_A, T_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _) => 0 
  case CC_B(_, _) => 1 
  case CC_A(_, _) => 2 
  case CC_A(CC_A(_, _), _) => 3 
  case CC_A(CC_B(_, _), CC_A(_, _)) => 4 
  case CC_A(CC_A(_, _), CC_B(_, _)) => 5 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B Wildcard Wildcard T_A)