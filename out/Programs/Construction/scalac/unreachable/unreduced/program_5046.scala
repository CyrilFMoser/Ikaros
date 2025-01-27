package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, E]) extends T_A[T_B[E, E], E]
case class CC_B[F](a: Byte, b: Int, c: T_A[T_B[F, F], F]) extends T_A[T_B[F, F], F]
case class CC_C[G]() extends T_A[T_B[G, G], G]
case class CC_D[H, I](a: Int) extends T_B[H, I]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _)) => 0 
  case CC_B(_, _, CC_B(_, _, _)) => 1 
  case CC_B(_, _, CC_C()) => 2 
}
}