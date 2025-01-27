package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C) extends T_A[C, T_A[C, C]]
case class CC_B(a: CC_A[T_A[T_B, T_B]]) extends T_B
case class CC_C(a: CC_A[T_B]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_C(CC_A(_)) => 1 
}
}
// This is not matched: CC_D()