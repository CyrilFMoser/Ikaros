package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E]() extends T_A[D]
case class CC_B[F](a: T_B[F, F], b: T_A[F]) extends T_A[F]
case class CC_C[G](a: T_A[G], b: T_A[G], c: CC_B[G]) extends T_B[T_A[G], G]
case class CC_D[H](a: T_B[T_A[H], H]) extends T_B[T_A[H], H]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, CC_A())) => 2 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 3 
}
}