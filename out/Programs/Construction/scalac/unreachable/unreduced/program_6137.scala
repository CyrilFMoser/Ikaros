package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[T_B[Char, E], T_B[E, Char]], E]
case class CC_B[F](a: T_B[F, F], b: T_A[F, F], c: F) extends T_A[T_A[T_B[Char, F], T_B[F, Char]], F]
case class CC_C[G](a: G, b: T_B[G, G], c: CC_A[G]) extends T_A[T_A[T_B[Char, G], T_B[G, Char]], G]
case class CC_D[H, I](a: T_B[H, H]) extends T_B[H, I]
case class CC_E[J](a: T_B[J, J], b: T_B[J, J], c: J) extends T_B[T_B[J, J], J]
case class CC_F[K](a: T_B[K, CC_C[K]], b: Boolean) extends T_B[T_B[K, K], K]

val v_a: T_A[T_A[T_B[Char, Byte], T_B[Byte, Char]], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_, CC_D(CC_D(_)), _) => 2 
}
}