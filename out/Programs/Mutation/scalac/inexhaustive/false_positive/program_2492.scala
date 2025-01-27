package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[E, F](a: T_A[E, E]) extends T_A[F, E]

val v_a: CC_B[Char, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
}
}
// This is not matched: (CC_A (T_A (T_A Byte)))