package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[D](a: D, b: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_E Wildcard (T_B (T_A Byte) (T_A Int)))