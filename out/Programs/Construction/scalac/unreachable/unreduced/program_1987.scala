package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, F]) extends T_A[F, E]
case class CC_B[G, H](a: H, b: Byte) extends T_A[G, H]
case class CC_C[J, I]() extends T_A[I, J]
case class CC_D[K]() extends T_B[Char, K]

val v_a: T_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C()