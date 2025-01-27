package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, E]) extends T_A[E, F]
case class CC_B[G, H]() extends T_A[H, G]
case class CC_C[J, I](a: T_B[I, I], b: J) extends T_A[J, I]
case class CC_D[K](a: (CC_B[Byte, Boolean],T_A[Int, Byte]), b: T_A[T_A[K, K], K]) extends T_B[T_A[K, K], K]
case class CC_E[L](a: L) extends T_B[T_A[L, L], L]

val v_a: CC_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B()) => 1 
  case CC_A(CC_C(_, _)) => 2 
}
}