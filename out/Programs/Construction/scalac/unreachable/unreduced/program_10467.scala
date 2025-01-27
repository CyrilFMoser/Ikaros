package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, T_B[T_A[Boolean, Boolean]]]
case class CC_B[F]() extends T_A[F, CC_A[T_B[Boolean], T_A[Int, Byte]]]
case class CC_C() extends T_A[T_A[T_B[Int], Byte], CC_B[CC_B[Char]]]
case class CC_D[G]() extends T_B[G]
case class CC_E[H](a: T_A[H, H], b: H) extends T_B[H]
case class CC_F[I](a: I, b: CC_D[I]) extends T_B[I]

val v_a: T_B[T_A[T_A[T_B[Int], Byte], CC_B[CC_B[Char]]]] = null
val v_b: Int = v_a match{
  case CC_E(_, _) => 0 
  case CC_F(_, CC_D()) => 1 
}
}
// This is not matched: CC_D()