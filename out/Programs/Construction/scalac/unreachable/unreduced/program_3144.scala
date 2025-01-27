package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: T_B, b: T_A[CC_A]) extends T_A[T_B]

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
  case CC_B(_, _) => 2 
}
}
// This is not matched: CC_A(_, CC_A(_, CC_B(_, _)))