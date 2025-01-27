package Program_63 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_A[Boolean, T_B[Byte]]]
case class CC_B[E]() extends T_B[E]
case class CC_C[F](a: T_A[F, F], b: (T_B[Boolean],T_B[Int]), c: T_B[F]) extends T_B[F]

val v_a: CC_C[Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_B()) => 0 
}
}
// This is not matched: CC_B(_)