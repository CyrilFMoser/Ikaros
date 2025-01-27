package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[D], D]
case class CC_B[F](a: T_A[T_B[F], F], b: CC_A[F], c: T_B[F]) extends T_B[F]
case class CC_C[G]() extends T_B[G]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_C()) => 0 
}
}
// This is not matched: CC_D(_, _, CC_A())