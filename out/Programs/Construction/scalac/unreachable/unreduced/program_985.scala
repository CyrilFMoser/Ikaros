package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, Boolean], b: T_A[E, F], c: E) extends T_A[F, E]
case class CC_B[G, H]() extends T_A[H, G]
case class CC_C[I, J]() extends T_A[J, I]
case class CC_D[K](a: T_A[CC_A[Byte, K], K], b: T_B[T_B[K, K], K]) extends T_B[T_B[K, K], K]
case class CC_E[L, M](a: L, b: M, c: L) extends T_B[L, Byte]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C()