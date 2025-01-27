package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[E, Char]]
case class CC_B[G, F](a: G, b: T_B[F, F]) extends T_A[G, F]
case class CC_C[H, I](a: T_A[H, H], b: (T_A[Int, Boolean],CC_B[Byte, Char])) extends T_A[H, I]
case class CC_D[J](a: T_A[J, J]) extends T_B[T_A[J, J], J]
case class CC_E[K](a: T_A[K, K], b: K, c: T_A[K, K]) extends T_B[T_A[K, K], K]
case class CC_F[L](a: L) extends T_B[T_A[L, L], L]

val v_a: CC_E[Int] = null
val v_b: Int = v_a match{
  case CC_E(CC_B(_, _), _, CC_B(_, _)) => 0 
  case CC_E(CC_C(_, _), _, CC_B(_, _)) => 1 
  case CC_E(CC_B(_, _), _, CC_C(_, _)) => 2 
  case CC_E(CC_C(_, _), _, CC_C(_, _)) => 3 
}
}