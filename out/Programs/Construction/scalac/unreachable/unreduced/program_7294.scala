package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[T_A[Byte, E], E]]
case class CC_B[F](a: T_B[F, F], b: CC_A[F], c: F) extends T_A[F, T_B[T_A[Byte, F], F]]
case class CC_C[G, H, I](a: Char, b: Int, c: T_B[CC_B[Byte], H]) extends T_B[G, H]
case class CC_D[K, J](a: T_B[J, K]) extends T_B[J, K]
case class CC_E[L](a: T_A[L, L], b: CC_C[L, L, L], c: CC_D[L, L]) extends T_B[Boolean, L]

val v_a: T_B[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, _)) => 0 
  case CC_C(_, _, CC_D(CC_C(_, _, _))) => 1 
  case CC_C(_, _, CC_D(CC_D(_))) => 2 
  case CC_D(_) => 3 
  case CC_E(_, CC_C(_, 12, CC_C(_, _, _)), CC_D(CC_C(_, _, _))) => 4 
  case CC_E(_, CC_C(_, 12, CC_C(_, _, _)), CC_D(CC_D(_))) => 5 
  case CC_E(_, CC_C(_, 12, CC_C(_, _, _)), CC_D(CC_E(_, _, _))) => 6 
  case CC_E(_, CC_C(_, 12, CC_D(_)), CC_D(CC_C(_, _, _))) => 7 
  case CC_E(_, CC_C(_, 12, CC_D(_)), CC_D(CC_D(_))) => 8 
  case CC_E(_, CC_C(_, 12, CC_D(_)), CC_D(CC_E(_, _, _))) => 9 
  case CC_E(_, CC_C(_, _, CC_C(_, _, _)), CC_D(CC_C(_, _, _))) => 10 
  case CC_E(_, CC_C(_, _, CC_C(_, _, _)), CC_D(CC_D(_))) => 11 
  case CC_E(_, CC_C(_, _, CC_C(_, _, _)), CC_D(CC_E(_, _, _))) => 12 
  case CC_E(_, CC_C(_, _, CC_D(_)), CC_D(CC_C(_, _, _))) => 13 
  case CC_E(_, CC_C(_, _, CC_D(_)), CC_D(CC_D(_))) => 14 
  case CC_E(_, CC_C(_, _, CC_D(_)), CC_D(CC_E(_, _, _))) => 15 
}
}