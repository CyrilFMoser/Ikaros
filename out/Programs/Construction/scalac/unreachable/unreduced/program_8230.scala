package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: E, b: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_A[F], c: Int) extends T_A[F]
case class CC_D[G](a: Char, b: Char, c: T_A[G]) extends T_B[CC_C[G], G]
case class CC_E[H]() extends T_B[CC_C[H], H]
case class CC_F[I](a: T_A[T_A[I]]) extends T_B[CC_C[I], I]

val v_a: T_B[CC_C[Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E() => 1 
  case CC_F(CC_A(_)) => 2 
  case CC_F(CC_B(CC_A(_), _)) => 3 
  case CC_F(CC_B(CC_B(_, _), _)) => 4 
  case CC_F(CC_B(CC_C(_, _, _), _)) => 5 
  case CC_F(CC_C(CC_A(_), _, _)) => 6 
  case CC_F(CC_C(CC_B(_, _), _, _)) => 7 
}
}
// This is not matched: CC_F(CC_C(CC_C(_, _, _), _, _))