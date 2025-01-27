package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[T_A[(Byte,Int)]]) extends T_A[D]
case class CC_B[F](a: T_A[T_A[Boolean]], b: T_B[F, F], c: Byte) extends T_A[F]
case class CC_C[G](a: Boolean, b: T_A[G], c: T_A[CC_A[G]]) extends T_B[T_A[Int], G]
case class CC_D[H](a: (CC_B[(Boolean,Byte)],CC_B[Char]), b: Byte, c: CC_B[H]) extends T_B[T_A[Int], H]
case class CC_E[I]() extends T_B[T_A[Int], I]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, _, _)) => 2 
  case CC_B(_, _, _) => 3 
}
}