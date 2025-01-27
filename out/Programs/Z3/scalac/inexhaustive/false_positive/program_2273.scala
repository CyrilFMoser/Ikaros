package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Boolean, E]
case class CC_B[F](a: F, b: T_A[F, F]) extends T_B[T_A[Boolean, F], F]

val v_a: T_B[T_A[Boolean, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_B(0, _) => 0 
}
}
// This is not matched: Pattern match is empty without constants