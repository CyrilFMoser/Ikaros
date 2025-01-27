package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E]) extends T_A[T_A[T_A[Byte, Byte], T_A[Char, Boolean]], E]
case class CC_B[F]() extends T_A[T_A[T_A[Byte, Byte], T_A[Char, Boolean]], F]
case class CC_C[G]() extends T_A[T_A[T_A[Byte, Byte], T_A[Char, Boolean]], G]
case class CC_D[H](a: CC_A[H], b: T_A[H, H]) extends T_B[T_B[H, H], H]
case class CC_E[I]() extends T_B[T_B[I, I], I]
case class CC_F[J, K](a: J, b: K) extends T_B[T_B[J, J], J]

val v_a: T_B[T_B[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _), _) => 0 
  case CC_E() => 1 
  case CC_F(_, _) => 2 
}
}