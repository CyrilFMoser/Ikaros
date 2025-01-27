package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean, b: T_A[E, E]) extends T_A[T_B[E, E], E]
case class CC_B[F](a: T_B[F, F]) extends T_A[T_B[F, F], F]
case class CC_C[G, H](a: T_B[G, H]) extends T_A[G, H]
case class CC_D[I](a: CC_B[I], b: I) extends T_B[I, CC_A[I]]
case class CC_E[J](a: CC_A[J], b: Byte, c: Boolean) extends T_B[Byte, J]
case class CC_F[K](a: T_A[T_B[K, K], K], b: K, c: T_B[Byte, K]) extends T_B[K, CC_A[K]]

val v_a: T_B[Char, CC_A[Char]] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_), _) => 0 
  case CC_F(CC_A(true, _), _, _) => 1 
  case CC_F(CC_A(false, _), _, _) => 2 
  case CC_F(CC_B(_), _, _) => 3 
  case CC_F(CC_C(_), _, _) => 4 
}
}