package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[G, H](a: T_A[H, G], b: T_B[G, G]) extends T_A[G, H]
case class CC_C[I, J](a: CC_B[J, J], b: I, c: J) extends T_A[I, J]
case class CC_D[K, L](a: CC_B[K, L], b: T_A[L, K], c: T_A[K, L]) extends T_B[Char, K]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A()