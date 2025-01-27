package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[T_B[T_B[E, Boolean], E], E]
case class CC_B[F](a: T_A[F, F], b: T_A[F, F], c: T_B[F, F]) extends T_A[T_B[T_B[F, Boolean], F], F]
case class CC_C[G](a: G, b: Byte) extends T_B[G, CC_A[Char]]
case class CC_D[H](a: H, b: T_B[H, CC_A[Char]], c: T_B[H, H]) extends T_B[H, CC_A[Char]]

val v_a: T_A[T_B[T_B[Int, Boolean], Int], Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}