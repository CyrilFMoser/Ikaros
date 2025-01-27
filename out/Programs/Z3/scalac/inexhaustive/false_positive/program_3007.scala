package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, C]) extends T_A[T_A[T_B, T_B], C]
case class CC_B() extends T_B
case class CC_C() extends T_B

val v_a: T_A[T_A[T_B, T_B], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(), _) => 0 
}
}
// This is not matched: (CC_B (CC_C Int Wildcard T_B) T_A)