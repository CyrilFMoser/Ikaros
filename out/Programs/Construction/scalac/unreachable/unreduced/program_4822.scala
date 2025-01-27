package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, F]) extends T_A[E, F]
case class CC_B[H, G](a: T_B[G, H], b: H, c: T_A[H, H]) extends T_A[G, H]
case class CC_C[I, J](a: Int) extends T_A[I, J]
case class CC_D[K]() extends T_B[K, (CC_C[Boolean, Int],T_A[Char, Int])]
case class CC_E[L]() extends T_B[L, (CC_C[Boolean, Int],T_A[Char, Int])]
case class CC_F[M](a: T_B[M, M], b: Int) extends T_B[M, (CC_C[Boolean, Int],T_A[Char, Int])]

val v_a: T_B[Int, (CC_C[Boolean, Int],T_A[Char, Int])] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E() => 1 
  case CC_F(_, _) => 2 
}
}