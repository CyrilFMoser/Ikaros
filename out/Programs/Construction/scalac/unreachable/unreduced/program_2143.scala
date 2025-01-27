package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_A[T_A[T_B[Char], T_B[Char]], T_A[T_B[Char], T_B[Char]]], T_A[T_B[Char], T_B[Char]]]) extends T_A[T_A[D, D], D]
case class CC_B[F](a: CC_A[F], b: Char) extends T_A[T_A[F, F], F]
case class CC_C[G](a: T_A[G, G]) extends T_A[T_A[G, G], G]
case class CC_D[H](a: H) extends T_B[H]
case class CC_E[I](a: T_A[T_A[I, I], I]) extends T_B[I]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D(true) => 0 
  case CC_D(false) => 1 
  case CC_E(CC_A(CC_A(_))) => 2 
  case CC_E(CC_A(CC_B(_, _))) => 3 
  case CC_E(CC_A(CC_C(_))) => 4 
  case CC_E(CC_C(_)) => 5 
}
}
// This is not matched: CC_E(CC_B(_, _))