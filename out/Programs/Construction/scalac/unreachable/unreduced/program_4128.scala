package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: Char, c: T_A[Boolean, E]) extends T_A[Boolean, E]
case class CC_B[F](a: F, b: T_B[F, F]) extends T_A[Boolean, F]
case class CC_C[G](a: G) extends T_A[Boolean, G]
case class CC_D[H]() extends T_B[H, CC_B[H]]
case class CC_E[I](a: I, b: T_B[I, I]) extends T_B[I, CC_B[I]]
case class CC_F(a: T_A[T_A[Boolean, Byte], CC_C[Byte]]) extends T_B[Boolean, CC_B[Boolean]]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_)