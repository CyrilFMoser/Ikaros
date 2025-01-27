package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C](a: T_B, b: T_A[C, C]) extends T_A[C, D]
case class CC_B[F, G]() extends T_A[F, G]

val v_a: CC_A[T_B, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_E (CC_B T_A) Wildcard Wildcard T_B)