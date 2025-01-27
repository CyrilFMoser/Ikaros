package Program_26 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C, b: T_A[C, T_A[C, C]]) extends T_A[T_A[Int, T_A[Byte, Int]], C]
case class CC_B[E](a: CC_A[E, E], b: E, c: CC_A[E, E]) extends T_A[T_A[Int, T_A[Byte, Int]], E]
case class CC_C[F]() extends T_A[T_A[Int, T_A[Byte, Int]], F]

val v_a: T_A[T_A[Int, T_A[Byte, Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _, _)