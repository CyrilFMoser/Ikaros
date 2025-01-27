package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[(Boolean,Char), E]) extends T_A[Byte, E]
case class CC_B[G, F](a: T_A[CC_A[G], G], b: T_B[F, F], c: T_A[G, F]) extends T_A[G, F]
case class CC_C[H](a: T_A[H, H], b: H, c: CC_B[H, H]) extends T_A[Byte, H]
case class CC_D[I, J](a: Int, b: T_A[Byte, I]) extends T_B[I, Char]

val v_a: T_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)