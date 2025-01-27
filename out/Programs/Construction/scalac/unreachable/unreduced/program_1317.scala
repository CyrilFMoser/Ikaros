package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B(a: T_A[T_A[CC_A]]) extends T_A[T_B]
case class CC_C(a: T_A[CC_A], b: T_A[T_B], c: T_B) extends T_A[T_B]
case class CC_D(a: (Char,CC_B)) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, CC_A(_), CC_D(_)) => 1 
  case CC_C(_, CC_A(_), CC_E()) => 2 
  case CC_C(_, CC_B(_), CC_D(_)) => 3 
  case CC_C(_, CC_B(_), CC_E()) => 4 
  case CC_C(_, CC_C(_, _, _), CC_D(_)) => 5 
  case CC_C(_, CC_C(_, _, _), CC_E()) => 6 
}
}
// This is not matched: CC_B(_)