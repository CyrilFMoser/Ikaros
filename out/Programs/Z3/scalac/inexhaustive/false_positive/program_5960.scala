package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Char, b: T_A[C, D]) extends T_A[C, D]
case class CC_C[H, G]() extends T_A[H, G]

val v_a: CC_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)