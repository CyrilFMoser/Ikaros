package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[T_A[Boolean, T_B[(Byte,Int), Int]], E]
case class CC_B[F]() extends T_A[T_A[Boolean, T_B[(Byte,Int), Int]], F]
case class CC_C[G](a: G, b: Char, c: T_A[G, G]) extends T_A[T_A[Boolean, T_B[(Byte,Int), Int]], G]
case class CC_D[H](a: Char, b: CC_C[H]) extends T_B[H, (CC_A[Byte],CC_B[Int])]
case class CC_E[I](a: CC_A[I], b: T_A[I, I]) extends T_B[I, (CC_A[Byte],CC_B[Int])]
case class CC_F[J, K, L](a: CC_D[CC_B[K]], b: CC_E[L], c: CC_B[J]) extends T_B[J, K]

val v_a: T_A[T_A[Boolean, T_B[(Byte,Int), Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_F(_, _, _)) => 0 
  case CC_B() => 1 
  case CC_C(_, _, _) => 2 
}
}