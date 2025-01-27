package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E]) extends T_A[T_A[E, E], E]
case class CC_B[F]() extends T_A[T_A[F, F], F]
case class CC_C[H, G](a: T_A[T_A[G, G], G], b: T_A[T_A[G, G], G]) extends T_B[G, H]
case class CC_D[J, I]() extends T_B[J, I]
case class CC_E[L, K](a: CC_C[CC_B[K], K], b: CC_A[K], c: T_B[K, K]) extends T_B[L, K]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_A(_, _), _), _) => 0 
  case CC_A(CC_C(CC_B(), _), _) => 1 
  case CC_A(CC_D(), _) => 2 
  case CC_A(CC_E(CC_C(_, _), CC_A(_, _), CC_C(_, _)), _) => 3 
  case CC_A(CC_E(CC_C(_, _), CC_A(_, _), CC_D()), _) => 4 
  case CC_A(CC_E(CC_C(_, _), CC_A(_, _), CC_E(_, _, _)), _) => 5 
  case CC_B() => 6 
}
}