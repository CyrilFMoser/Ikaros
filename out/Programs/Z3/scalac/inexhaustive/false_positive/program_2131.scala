package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C]) extends T_A[T_A[T_B, T_B], C]
case class CC_D() extends T_B
case class CC_F() extends T_B

val v_a: T_A[T_A[T_B, T_B], CC_D] = null
val v_b: Int = v_a match{
  case CC_A(CC_F(), _) => 0 
}
}
// This is not matched: (CC_B (T_A Boolean))