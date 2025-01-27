package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_B, T_B]
case class CC_B(a: CC_A, b: T_A[T_B, T_B]) extends T_A[T_B, T_B]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
}
}
// This is not matched: (CC_D (CC_C Wildcard Wildcard T_B) T_B)