package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Byte, E]
case class CC_B[F](a: T_A[F, F]) extends T_A[F, (T_A[Byte, Boolean],T_B[Boolean, Int])]
case class CC_C[G](a: CC_B[G], b: G) extends T_A[Byte, G]
case class CC_D[I, H](a: T_B[I, I], b: (CC_C[Boolean],T_B[Int, Int]), c: T_A[Byte, H]) extends T_B[H, I]
case class CC_E[J](a: CC_C[J], b: J, c: T_A[Byte, J]) extends T_B[J, Byte]
case class CC_F[K](a: T_A[K, K]) extends T_B[K, Byte]

val v_a: T_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_E(_, _, _) => 0 
  case CC_F(_) => 1 
}
}
// This is not matched: CC_D(_, _, _)