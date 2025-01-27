package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E, F]() extends T_A[F, E]
case class CC_D(a: T_A[T_B, T_B]) extends T_B

val v_a: CC_D = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
}
}
// This is not matched: (CC_C T_B)