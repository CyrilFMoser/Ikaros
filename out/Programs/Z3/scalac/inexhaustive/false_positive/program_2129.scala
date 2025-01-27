package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: (T_B,T_B), b: B, c: T_A[B]) extends T_A[B]
case class CC_B[C](a: T_A[C]) extends T_A[C]
case class CC_C[D]() extends T_A[T_A[T_B]]
case class CC_D(a: CC_C[T_B]) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_A(_, CC_B(_), CC_B(_)) => 1 
  case CC_A((CC_D(_),CC_D(_)), _, _) => 2 
  case CC_B(CC_B(_)) => 3 
  case CC_B(_) => 4 
}
}
// This is not matched: (CC_C T_B (T_A (T_A T_B)))
// This is not matched: (CC_B (CC_A T_A) Wildcard T_A)