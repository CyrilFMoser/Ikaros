package Program_15 

package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B]) extends T_A[B]
case class CC_B(a: T_A[T_B]) extends T_B
case class CC_C[C](a: Char, b: T_A[C], c: T_A[C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C('x', CC_A(_), _) => 1 
  case CC_C(_, _, CC_A(_)) => 2 
  case CC_C('x', _, CC_A(_)) => 3 
  case CC_C(_, CC_A(_), CC_A(_)) => 4 
  case CC_C(_, CC_A(_), _) => 5 
  case CC_C(_, _, _) => 6 
}
}
// This is not matched: (CC_C T_B Wildcard Wildcard Wildcard T_B)
// This is not matched: (CC_C T_B Wildcard Wildcard Wildcard T_B)