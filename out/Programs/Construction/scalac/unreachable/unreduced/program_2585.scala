package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,T_A[T_B]), b: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: CC_A, b: Char, c: Boolean) extends T_A[T_B]
case class CC_C() extends T_A[T_B]
case class CC_D(a: T_A[Boolean]) extends T_B
case class CC_E[B]() extends T_B
case class CC_F() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_F()