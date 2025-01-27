package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[E](a: E, b: T_A[E, E]) extends T_A[T_A[Byte, Boolean], E]

val v_a: T_A[T_A[Byte, Boolean], Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, _) => 0 
}
}
// This is not matched: (CC_E Char (CC_B T_A T_A) Wildcard (T_B (CC_B T_A T_A) Char))