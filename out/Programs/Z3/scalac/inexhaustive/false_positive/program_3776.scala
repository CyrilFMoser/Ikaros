package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E, F]() extends T_A[F, E]
case class CC_C(a: T_A[T_B, Byte]) extends T_A[CC_A[T_B, T_B], CC_A[T_B, T_B]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: (CC_A Char (T_A Char))