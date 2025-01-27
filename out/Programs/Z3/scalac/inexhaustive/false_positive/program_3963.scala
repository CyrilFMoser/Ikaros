package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C]) extends T_A[C]
case class CC_C[E]() extends T_A[E]

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_C()) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)