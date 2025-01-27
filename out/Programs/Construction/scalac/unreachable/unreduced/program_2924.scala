package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: E, b: T_A[E, F]) extends T_A[F, E]
case class CC_B[G](a: T_A[G, G], b: G, c: Byte) extends T_A[T_B[G, G], G]
case class CC_C[H]() extends T_B[H, T_A[H, H]]

val v_a: T_A[T_B[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_B(_, _, _) => 1 
}
}