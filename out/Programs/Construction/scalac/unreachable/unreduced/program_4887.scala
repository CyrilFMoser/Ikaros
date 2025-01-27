package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G]() extends T_A[E, F]
case class CC_B[I, H](a: T_A[I, I]) extends T_A[I, H]
case class CC_C[J](a: Int, b: CC_A[J, J, J], c: (CC_B[Boolean, Boolean],Byte)) extends T_A[J, CC_B[J, (Byte,Int)]]
case class CC_D[K, L](a: T_B[K, L], b: T_B[T_A[T_A[CC_C[Int], L], T_A[CC_C[Int], L]], T_A[CC_C[Int], L]]) extends T_B[T_A[K, K], K]
case class CC_E[N](a: T_A[N, N], b: T_A[N, N]) extends T_B[T_A[N, N], N]
case class CC_F[O]() extends T_B[T_A[O, O], O]

val v_a: T_B[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E(CC_A(), CC_B(_)) => 1 
  case CC_E(CC_B(CC_A()), CC_A()) => 2 
  case CC_E(CC_B(CC_A()), CC_B(_)) => 3 
  case CC_E(CC_B(CC_B(_)), CC_A()) => 4 
  case CC_E(CC_B(CC_B(_)), CC_B(_)) => 5 
  case CC_F() => 6 
}
}
// This is not matched: CC_E(CC_A(), CC_A())