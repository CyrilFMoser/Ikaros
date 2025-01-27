package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B[B](a: T_A[B]) extends T_A[T_B]
case class CC_C() extends T_B
case class CC_D(a: CC_B[CC_C], b: T_A[T_B]) extends T_B
case class CC_E(a: CC_B[CC_C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_B(_), CC_A()) => 1 
  case CC_D(CC_B(_), CC_B(_)) => 2 
  case CC_E(CC_B(_)) => 3 
}
}