package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[E]() extends T_A[E, T_A[E, E]]
case class CC_C[F](a: T_A[F, T_A[F, F]]) extends T_A[F, T_A[F, F]]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(CC_B()) => 0 
}
}
// This is not matched: CC_B()