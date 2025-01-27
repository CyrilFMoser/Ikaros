package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_A[F, E]) extends T_A[E, Boolean]
case class CC_B[G](a: T_A[G, Boolean]) extends T_A[CC_A[T_A[Byte, Boolean], T_A[Boolean, Boolean]], G]
case class CC_C[H]() extends T_A[H, Boolean]
case class CC_D[I, J](a: Boolean, b: T_A[J, Boolean], c: T_B[J, J]) extends T_B[I, J]
case class CC_E[K, L](a: K, b: CC_A[K, CC_D[L, L]]) extends T_B[L, K]
case class CC_F[M, N]() extends T_B[M, N]

val v_a: T_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_D(_, _, _)) => 0 
  case CC_D(_, _, CC_E(_, _)) => 1 
  case CC_D(_, _, CC_F()) => 2 
  case CC_E('x', CC_A(_)) => 3 
  case CC_E(_, CC_A(_)) => 4 
  case CC_F() => 5 
}
}