package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B(a: Char, b: T_A[Char]) extends T_A[Char]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)