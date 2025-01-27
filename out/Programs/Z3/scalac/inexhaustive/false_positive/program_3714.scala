package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: Byte, b: T_A[E, E]) extends T_A[T_A[Char, Boolean], E]

val v_a: T_A[T_A[Char, Boolean], Int] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)