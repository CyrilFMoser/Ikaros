package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: Char, b: T_A[E, E], c: T_B[E, E]) extends T_A[F, E]
case class CC_B[G](a: CC_A[G, G]) extends T_A[T_B[Boolean, CC_A[Int, Int]], G]
case class CC_C[H](a: CC_B[H], b: T_A[CC_B[H], H]) extends T_A[H, (CC_B[Char],T_B[Boolean, (Boolean,Int)])]
case class CC_D[I](a: T_B[T_A[I, I], I]) extends T_B[T_A[I, I], I]
case class CC_E[J]() extends T_B[J, T_B[T_A[J, J], J]]
case class CC_F[K]() extends T_B[K, T_B[T_A[K, K], K]]

val v_a: T_A[T_B[Boolean, CC_A[Int, Int]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}