package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E](a: T_A[T_B, T_B]) extends T_A[E, T_B]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_D (CC_E T_B) T_B)