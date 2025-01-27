package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D]) extends T_A[D, T_A[D, D]]
case class CC_B[E]() extends T_B[E]
case class CC_C[F](a: Byte, b: T_B[F]) extends T_B[F]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_C(_, _)) => 1 
}
}
// This is not matched: CC_C(_, CC_B())