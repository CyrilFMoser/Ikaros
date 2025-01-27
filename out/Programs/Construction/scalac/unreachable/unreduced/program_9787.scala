package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_B[E, E], c: T_B[E, E]) extends T_A[T_A[T_A[Byte, Byte], Char], E]
case class CC_B[G, F, H](a: T_A[Byte, F], b: CC_A[H], c: Byte) extends T_B[F, G]
case class CC_C[I, J](a: CC_A[J]) extends T_B[J, I]
case class CC_D[L, K](a: K, b: T_B[L, L], c: T_B[CC_A[T_A[Int, Int]], CC_A[T_A[Int, Int]]]) extends T_B[K, L]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_) => 1 
  case CC_D(_, _, _) => 2 
}
}