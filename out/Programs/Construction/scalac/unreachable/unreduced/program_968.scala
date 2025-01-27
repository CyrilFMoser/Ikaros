package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[E, E], E], b: Char) extends T_A[T_B[E, E], E]
case class CC_B[F]() extends T_A[T_B[F, F], F]
case class CC_C[H, G](a: T_A[T_B[H, H], H], b: Byte, c: G) extends T_B[H, G]
case class CC_D[I, J](a: T_A[T_B[J, J], J]) extends T_B[J, I]
case class CC_E(a: Byte, b: CC_A[Boolean]) extends T_B[CC_B[CC_D[Char, Int]], CC_A[CC_D[Boolean, Boolean]]]

val v_a: CC_D[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _)) => 0 
  case CC_D(CC_B()) => 1 
}
}