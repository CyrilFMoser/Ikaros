package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B(a: CC_A[T_A[Char]]) extends T_A[Byte]
case class CC_C[E](a: T_B[E, E]) extends T_A[E]
case class CC_D[F]() extends T_B[CC_A[F], F]
case class CC_E[G](a: T_A[CC_B], b: T_B[CC_A[G], G], c: CC_A[T_A[G]]) extends T_B[CC_A[G], G]
case class CC_F[H](a: CC_C[H]) extends T_B[CC_A[H], H]

val v_a: T_B[CC_A[Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_A(_), CC_D(), _) => 1 
  case CC_E(CC_C(_), CC_D(), _) => 2 
  case CC_E(CC_A(_), CC_E(_, _, _), _) => 3 
  case CC_E(CC_C(_), CC_E(_, _, _), _) => 4 
  case CC_E(CC_A(_), CC_F(_), _) => 5 
  case CC_E(CC_C(_), CC_F(_), _) => 6 
  case CC_F(CC_C(_)) => 7 
}
}