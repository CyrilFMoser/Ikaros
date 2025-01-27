package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_A[T_B]) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: CC_B, b: Int, c: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_D() extends T_B
case class CC_E(a: CC_B) extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(CC_B(_)) => 0 
  case CC_F() => 1 
}
}
// This is not matched: CC_D()