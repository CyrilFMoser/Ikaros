package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E]() extends T_A[T_B, E]
case class CC_D(a: T_A[T_B, T_B]) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_B()) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_B T_A) T_A)