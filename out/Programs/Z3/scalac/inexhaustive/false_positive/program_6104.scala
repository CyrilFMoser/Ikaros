package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[D, D], b: T_A[D, C]) extends T_A[C, D]
case class CC_B[F, E]() extends T_A[F, E]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_A T_A)