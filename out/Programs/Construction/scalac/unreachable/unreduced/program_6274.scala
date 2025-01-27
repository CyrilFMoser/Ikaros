package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[H, G](a: Boolean, b: T_A[G, Int], c: Byte) extends T_A[G, H]
case class CC_C[I, J](a: T_A[I, I], b: (T_A[Int, Char],T_A[Int, Char])) extends T_A[J, I]
case class CC_D[K](a: K) extends T_B[T_A[Byte, CC_A[Boolean, Byte]], K]
case class CC_E[L, M](a: T_A[L, L], b: Boolean) extends T_B[T_A[Byte, CC_A[Boolean, Byte]], L]
case class CC_F[N](a: T_B[N, N]) extends T_B[T_A[Byte, CC_A[Boolean, Byte]], N]

val v_a: T_B[T_A[Byte, CC_A[Boolean, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, _) => 1 
  case CC_F(_) => 2 
}
}