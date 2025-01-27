package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_A[D, D], c: T_B[D]) extends T_A[D, T_B[D]]
case class CC_B[E]() extends T_B[E]
case class CC_C[F]() extends T_B[F]

val v_a: T_A[Int, T_B[Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
}
}
// This is not matched: (CC_C (CC_C Wildcard (CC_A T_A) Wildcard T_A) Wildcard Wildcard T_A)