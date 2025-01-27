package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_A[T_B, T_A[T_B, T_B]], C]
case class CC_B[D](a: Byte) extends T_A[T_A[T_B, T_A[T_B, T_B]], D]
case class CC_C[E](a: CC_A[E], b: T_A[E, E]) extends T_A[T_A[T_B, T_A[T_B, T_B]], E]
case class CC_D(a: CC_C[T_B], b: CC_A[CC_A[T_B]]) extends T_B
case class CC_E[F](a: F, b: T_A[F, F]) extends T_B

val v_a: T_A[T_A[T_B, T_A[T_B, T_B]], Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_A()