package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_B[E, E]) extends T_A[T_B[E, E], E]
case class CC_B[G, F](a: T_A[F, F]) extends T_A[F, G]
case class CC_C[H](a: H, b: T_A[T_B[H, H], H]) extends T_B[T_A[T_B[Char, Char], Char], H]

val v_a: T_B[T_A[T_B[Char, Char], Char], Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_, _)) => 0 
  case CC_C(_, CC_B(_)) => 1 
}
}