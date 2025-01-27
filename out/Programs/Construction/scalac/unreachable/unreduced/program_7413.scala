package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B]) extends T_A[T_A[T_B]]
case class CC_B() extends T_A[T_A[T_B]]
case class CC_C(a: T_A[T_A[T_B]]) extends T_B
case class CC_D[B](a: Boolean, b: (CC_A,T_A[T_B])) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
  case CC_D(_, (CC_A(_),_)) => 1 
}
}
// This is not matched: CC_C(CC_A(_))