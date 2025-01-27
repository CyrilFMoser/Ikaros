package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, T_A[E, E]]]
case class CC_B[F, G](a: F, b: Char) extends T_B[G, F]
case class CC_C[H](a: CC_B[H, H], b: CC_B[H, T_A[H, H]]) extends T_B[H, T_A[H, H]]
case class CC_D[I](a: T_B[I, T_A[I, I]], b: CC_A[I]) extends T_B[I, T_A[I, I]]

val v_a: T_B[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_B(_, _), _) => 1 
}
}
// This is not matched: CC_D(_, _)