package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[T_A[Boolean, Boolean], T_A[Int, Char]], E]
case class CC_B(a: CC_A[CC_A[Char]], b: T_A[Byte, T_A[Char, Char]]) extends T_A[T_B[T_A[Boolean, Boolean], T_A[Int, Char]], T_A[T_A[Int, Boolean], T_A[Char, Boolean]]]
case class CC_C[G, F]() extends T_B[F, G]
case class CC_D[H](a: H, b: H, c: CC_B) extends T_B[T_B[H, H], H]
case class CC_E[I](a: CC_D[I], b: Byte) extends T_B[T_B[I, I], I]

val v_a: T_B[T_B[CC_B, CC_B], CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D(CC_B(_, _), _, CC_B(_, _)) => 1 
  case CC_E(_, _) => 2 
}
}