package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[E, D]() extends T_A[E, D]
case class CC_C[I, H](a: I, b: T_A[H, I]) extends T_A[H, I]

val v_a: CC_C[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)