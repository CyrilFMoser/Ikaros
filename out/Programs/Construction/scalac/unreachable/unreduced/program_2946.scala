package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[E, E], E]
case class CC_B[G, F](a: T_A[T_B[F, F], F], b: T_A[G, G]) extends T_B[G, F]
case class CC_C[H, I](a: Char, b: T_A[T_B[H, H], H], c: Int) extends T_B[H, I]
case class CC_D[J]() extends T_B[J, T_B[J, J]]

val v_a: T_B[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, CC_A(), 12) => 1 
  case CC_D() => 2 
}
}
// This is not matched: CC_C(_, CC_A(), _)