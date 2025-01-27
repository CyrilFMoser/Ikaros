package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[E, E]]
case class CC_B[F, G](a: T_B[F, F], b: F, c: T_A[F, G]) extends T_A[G, F]
case class CC_C[H, I](a: CC_A[I], b: CC_A[H], c: CC_A[H]) extends T_A[H, T_A[H, H]]
case class CC_D[J](a: T_A[J, J], b: CC_B[J, J]) extends T_B[J, T_A[J, CC_C[Byte, J]]]
case class CC_E[K, L](a: Int) extends T_B[K, T_A[K, CC_C[Byte, K]]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C(_, CC_A(), CC_A())