package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: D, c: T_B[D]) extends T_A[D, T_B[D]]
case class CC_B[E]() extends T_B[E]
case class CC_C[F]() extends T_B[F]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_B Wildcard T_A)