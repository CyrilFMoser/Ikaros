package Program_19 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_A[T_B], c: Boolean) extends T_A[T_B]
case class CC_B(a: T_A[T_B]) extends T_A[T_B]
case class CC_C[B]() extends T_B
case class CC_D() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_), _), _) => 1 
  case CC_B(CC_A(_, _, _)) => 2 
  case CC_B(CC_B(_)) => 3 
}
}
// This is not matched: CC_A(_, CC_B(_), _)