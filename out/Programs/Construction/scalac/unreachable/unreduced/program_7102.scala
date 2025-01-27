package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_B[E, E], E]
case class CC_B[F](a: T_B[F, F]) extends T_A[T_B[F, F], F]
case class CC_C[G](a: T_A[T_B[G, G], G]) extends T_A[T_B[G, G], G]
case class CC_D[H](a: T_A[T_B[H, H], H]) extends T_B[H, T_B[CC_B[Int], CC_A[Byte]]]
case class CC_E[I]() extends T_B[I, T_B[CC_B[Int], CC_A[Byte]]]
case class CC_F[J](a: CC_A[J]) extends T_B[J, T_B[CC_B[Int], CC_A[Byte]]]

val v_a: T_A[T_B[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(CC_A()) => 2 
  case CC_C(CC_B(_)) => 3 
  case CC_C(CC_C(CC_A())) => 4 
  case CC_C(CC_C(CC_B(_))) => 5 
  case CC_C(CC_C(CC_C(_))) => 6 
}
}