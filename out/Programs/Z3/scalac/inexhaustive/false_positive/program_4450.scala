package Program_14 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[D, C]
case class CC_B[E, F](a: T_A[F, F], b: T_A[F, E]) extends T_A[F, E]

val v_a: CC_B[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard Wildcard T_A)