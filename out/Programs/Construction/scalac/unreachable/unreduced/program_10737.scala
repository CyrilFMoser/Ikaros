package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_A[T_B[Byte, Byte]]) extends T_A[F]
case class CC_D[H](a: T_A[H], b: T_A[H]) extends T_B[T_A[T_A[Char]], H]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, _)