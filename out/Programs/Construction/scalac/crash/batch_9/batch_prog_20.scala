package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[E, T_A[E, E]], E]
case class CC_B[F]() extends T_A[T_B[F, T_A[F, F]], F]
case class CC_C[G, H](a: G, b: Byte, c: CC_B[G]) extends T_A[G, H]

val v_a: T_A[T_B[Boolean, T_A[Boolean, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, CC_B())