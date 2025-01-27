package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[E, E], E], b: T_B[E, T_A[E, E]], c: T_B[E, E]) extends T_A[T_A[E, E], E]
case class CC_B[G, F](a: Boolean) extends T_A[G, F]
case class CC_C[H](a: H, b: CC_A[H]) extends T_A[T_A[H, H], H]
case class CC_D[I](a: CC_B[(Char,Boolean), I], b: T_B[T_A[I, I], I], c: T_A[I, I]) extends T_B[CC_B[Char, CC_C[Boolean]], I]
case class CC_E[J](a: CC_B[J, J], b: J) extends T_B[CC_B[Char, CC_C[Boolean]], J]

val v_a: T_B[CC_B[Char, CC_C[Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, true) => 1 
  case CC_E(_, false) => 2 
}
}