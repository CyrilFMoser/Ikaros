package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[D, C]
case class CC_B[E, F](a: E, b: F, c: T_A[F, F]) extends T_A[F, E]

val v_a: CC_B[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A()) => 0 
}
}
// This is not matched: (CC_C Int Boolean Boolean (CC_B Boolean (T_A Boolean)) (T_B Int Boolean))