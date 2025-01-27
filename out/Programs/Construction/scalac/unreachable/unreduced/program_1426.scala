package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]], b: T_B) extends T_A[T_A[T_B]]
case class CC_B() extends T_A[T_A[T_B]]
case class CC_C(a: T_A[CC_B], b: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_D(a: T_B) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_D(_)) => 0 
  case CC_A(CC_B(), CC_D(_)) => 1 
  case CC_A(CC_C(_, _), CC_D(_)) => 2 
  case CC_B() => 3 
  case CC_C(_, CC_A(_, _)) => 4 
  case CC_C(_, CC_B()) => 5 
  case CC_C(_, CC_C(_, _)) => 6 
}
}