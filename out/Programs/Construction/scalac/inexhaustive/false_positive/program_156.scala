package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C]() extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: Byte, b: T_A[E]) extends T_B[E]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
}
}
// This is not matched: CC_E(_, _)