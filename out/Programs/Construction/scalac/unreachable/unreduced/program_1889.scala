package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[G, H](a: T_B[H, H], b: T_B[G, H], c: CC_A[G, T_A[H, Int]]) extends T_A[H, G]
case class CC_C[I](a: Char, b: T_A[I, I]) extends T_A[I, CC_B[I, I]]
case class CC_D[J](a: T_B[J, J]) extends T_B[J, CC_B[J, J]]

val v_a: T_A[Char, CC_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, CC_A()) => 1 
}
}
// This is not matched: CC_C(_, _)