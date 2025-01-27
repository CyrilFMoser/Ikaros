package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: D, c: T_B[D]) extends T_A[T_A[D, D], D]
case class CC_B[E](a: CC_A[E], b: T_B[E], c: T_A[E, E]) extends T_A[T_A[E, E], E]
case class CC_C[F]() extends T_A[T_A[F, F], F]
case class CC_D[G](a: CC_A[G]) extends T_B[G]
case class CC_E[H]() extends T_B[H]
case class CC_F[I]() extends T_B[I]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x', _) => 0 
  case CC_A(_, _, _) => 1 
  case CC_B(CC_A(_, 'x', _), CC_D(_), _) => 2 
  case CC_B(CC_A(_, _, _), CC_D(_), _) => 3 
  case CC_B(CC_A(_, 'x', _), CC_E(), _) => 4 
  case CC_B(CC_A(_, _, _), CC_E(), _) => 5 
  case CC_B(CC_A(_, 'x', _), CC_F(), _) => 6 
  case CC_B(CC_A(_, _, _), CC_F(), _) => 7 
  case CC_C() => 8 
}
}