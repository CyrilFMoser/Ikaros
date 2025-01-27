package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E], c: T_A[E, E]) extends T_A[T_A[T_B[Int, Boolean], T_B[Char, Boolean]], E]
case class CC_B[F](a: T_A[F, F], b: T_B[F, F]) extends T_B[Byte, F]
case class CC_C[G](a: CC_B[G], b: T_A[G, T_B[G, G]], c: T_B[T_B[Byte, G], G]) extends T_B[T_B[Byte, G], G]
case class CC_D[H](a: H, b: CC_A[H]) extends T_B[Byte, H]

val v_a: T_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D(_, _) => 1 
}
}