package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_B[E](a: T_B, b: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_A[F]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C()) => 0 
}
}
// This is not matched: (CC_B (Tuple (CC_C Wildcard Wildcard T_A) (Tuple Wildcard Byte)) Wildcard T_A)