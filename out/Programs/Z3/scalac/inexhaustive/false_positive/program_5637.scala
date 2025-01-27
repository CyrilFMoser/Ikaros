package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[F, E](a: CC_A[F, E], b: T_A[F, F]) extends T_A[F, E]

val v_a: CC_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
}
}
// This is not matched: (CC_B T_A)