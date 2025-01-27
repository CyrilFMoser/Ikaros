package Program_30 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A], c: T_B[T_A]) extends T_A
case class CC_B[B](a: B, b: B, c: CC_A) extends T_A
case class CC_C[C](a: (CC_A,CC_A)) extends T_B[C]
case class CC_D[D](a: T_B[T_A]) extends T_B[D]
case class CC_E[E](a: CC_B[E], b: CC_D[E]) extends T_B[E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_A(_, CC_D(_), _) => 1 
  case CC_A(CC_A(_, _, _), CC_D(_), CC_C(_)) => 2 
  case CC_A(_, CC_E(_, _), _) => 3 
  case CC_A(CC_A(_, _, _), CC_E(_, _), CC_D(_)) => 4 
  case CC_A(CC_A(_, _, _), CC_C(_), CC_E(_, _)) => 5 
  case CC_A(_, _, _) => 6 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B Wildcard T_A)