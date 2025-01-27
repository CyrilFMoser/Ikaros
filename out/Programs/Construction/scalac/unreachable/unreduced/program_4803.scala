package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E, F](a: T_B[F, E]) extends T_A[E]
case class CC_C(a: T_A[T_A[Boolean]], b: T_A[T_A[Boolean]], c: T_A[Int]) extends T_A[CC_B[CC_A[Char], T_A[Boolean]]]
case class CC_D[G](a: CC_A[CC_B[G, G]], b: G, c: Char) extends T_B[T_A[Boolean], G]
case class CC_E[H](a: H, b: T_A[T_A[Byte]]) extends T_B[T_A[Boolean], H]
case class CC_F[I](a: T_B[I, I], b: T_B[T_A[Boolean], I]) extends T_B[T_A[Boolean], I]

val v_a: T_B[T_A[Boolean], Char] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_, _) => 1 
  case CC_F(_, CC_D(CC_A(), 'x', _)) => 2 
  case CC_F(_, CC_D(CC_A(), _, _)) => 3 
  case CC_F(_, CC_E(_, _)) => 4 
  case CC_F(_, CC_F(_, CC_E(_, _))) => 5 
  case CC_F(_, CC_F(_, CC_F(_, _))) => 6 
}
}
// This is not matched: CC_F(_, CC_F(_, CC_D(_, _, _)))