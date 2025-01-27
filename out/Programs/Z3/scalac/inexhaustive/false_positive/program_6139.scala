package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[D](a: T_B, b: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard Wildcard T_A) Wildcard T_A)