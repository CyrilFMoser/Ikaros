package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: Boolean, b: T_A[C, D]) extends T_A[D, C]
case class CC_B[F, E]() extends T_A[F, E]

val v_a: CC_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: CC_B()