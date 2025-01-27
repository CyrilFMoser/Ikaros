package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[D], D]
case class CC_B[E](a: T_A[E, E], b: (T_A[Char, Byte],T_B[Boolean])) extends T_A[T_B[E], E]
case class CC_C[F](a: T_B[F]) extends T_A[T_B[F], F]
case class CC_D[G](a: T_A[G, G]) extends T_B[G]
case class CC_E[H]() extends T_B[H]
case class CC_F[I](a: T_B[I]) extends T_B[I]

val v_a: T_A[T_B[Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_D(_)) => 2 
  case CC_C(CC_E()) => 3 
  case CC_C(CC_F(_)) => 4 
}
}