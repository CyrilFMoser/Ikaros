package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D]() extends T_A[D, E]
case class CC_B[F](a: T_A[F, F], b: T_A[F, F]) extends T_B[F]
case class CC_C[G]() extends T_B[G]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A()) => 0 
  case CC_C() => 1 
}
}