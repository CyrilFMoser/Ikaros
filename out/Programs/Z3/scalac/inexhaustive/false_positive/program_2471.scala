package Program_31 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: (Boolean,Boolean), b: T_B[C, C]) extends T_A
case class CC_B(a: CC_A[T_A], b: CC_A[T_A]) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((_,_), _) => 0 
  case CC_B(_, _) => 1 
  case CC_B(_, CC_A(_, _)) => 2 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)