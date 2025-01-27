package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[D, D]) extends T_A[C, D]
case class CC_B[F, E]() extends T_A[F, E]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_B()) => 0 
}
}
// This is not matched: (CC_A T_A)