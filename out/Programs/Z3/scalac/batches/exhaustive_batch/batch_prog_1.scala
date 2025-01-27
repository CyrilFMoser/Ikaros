package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E]() extends T_A[Boolean, E]
case class CC_C[F](a: T_A[F, F]) extends T_A[F, T_A[F, Byte]]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(CC_A()) => 0 
  case CC_C(CC_B()) => 1 
  case CC_C(_) => 2 
}
}