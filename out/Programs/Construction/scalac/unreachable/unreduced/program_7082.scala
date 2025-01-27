package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_A[F, F], b: T_A[F, T_A[F, F]]) extends T_A[F, T_A[F, F]]
case class CC_C[G](a: Int, b: CC_A[G], c: G) extends T_B[T_A[T_B[Byte, Boolean], T_A[T_B[Byte, Boolean], T_B[Byte, Boolean]]], G]
case class CC_D[H](a: CC_C[H], b: H) extends T_B[T_A[T_B[Byte, Boolean], T_A[T_B[Byte, Boolean], T_B[Byte, Boolean]]], H]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
}
}