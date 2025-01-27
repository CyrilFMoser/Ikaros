package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D], b: T_A[D, C]) extends T_A[D, C]
case class CC_B[E]() extends T_A[E, Char]

val v_a: CC_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)