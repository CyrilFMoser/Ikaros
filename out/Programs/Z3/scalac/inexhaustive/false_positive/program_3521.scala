package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[F, E]() extends T_A[F, E]
case class CC_C(a: Char, b: T_A[T_B, T_B]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
}
}
// This is not matched: Pattern match is empty without constants