package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[T_A[T_A[(Byte,Boolean), Byte], Int], E]
case class CC_B[F](a: CC_A[F]) extends T_A[T_A[T_A[(Byte,Boolean), Byte], Int], F]
case class CC_C[G](a: Boolean, b: Int, c: Char) extends T_B[CC_B[G], G]
case class CC_D[H](a: T_A[H, H], b: H) extends T_B[CC_B[H], H]

val v_a: T_A[T_A[T_A[(Byte,Boolean), Byte], Int], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}