package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, T_A[Byte, T_A[Boolean, Char]]]
case class CC_B[E]() extends T_A[E, T_A[Byte, T_A[Boolean, Char]]]
case class CC_C[F]() extends T_A[F, T_A[Byte, T_A[Boolean, Char]]]
case class CC_D[G]() extends T_B[G]
case class CC_E[H](a: T_A[H, H]) extends T_B[H]
case class CC_F[I](a: Byte, b: T_B[I]) extends T_B[I]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_) => 1 
  case CC_F(_, CC_D()) => 2 
  case CC_F(_, CC_E(_)) => 3 
  case CC_F(_, CC_F(_, _)) => 4 
}
}