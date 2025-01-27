package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_B[C, D](a: T_B[C, C], b: T_B[C, D]) extends T_B[C, D]
case class CC_C[F, E]() extends T_B[E, F]

val v_a: CC_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C()) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)