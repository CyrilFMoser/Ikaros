package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[T_A[T_B]]
case class CC_B(a: CC_A[T_B]) extends T_A[T_A[T_B]]
case class CC_C() extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(_, _)) => 1 
}
}