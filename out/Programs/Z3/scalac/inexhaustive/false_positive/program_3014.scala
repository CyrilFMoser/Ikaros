package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, D]
case class CC_B[F, E](a: F, b: T_A[E, E]) extends T_A[F, E]

val v_a: CC_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, _)) => 0 
}
}
// This is not matched: (CC_B T_A)