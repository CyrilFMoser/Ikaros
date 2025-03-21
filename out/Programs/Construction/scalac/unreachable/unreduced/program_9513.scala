package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_B(a: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: CC_A, b: T_A[T_B], c: T_A[CC_B]) extends T_B
case class CC_D(a: T_A[CC_A], b: Byte) extends T_B
case class CC_E[B](a: CC_A, b: T_B) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_B(_), _), _) => 0 
  case CC_A(CC_B(_), _) => 1 
  case CC_B(CC_A(CC_A(_, _), _)) => 2 
  case CC_B(CC_A(CC_B(_), _)) => 3 
  case CC_B(CC_B(_)) => 4 
}
}
// This is not matched: CC_A(CC_A(CC_A(_, _), _), _)