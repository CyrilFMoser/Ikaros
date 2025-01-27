package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_B[T_A[C]]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: T_A[Int], b: Char, c: Byte) extends T_A[E]
case class CC_D[F, G](a: T_B[G], b: CC_C[F], c: CC_A[F]) extends T_B[F]
case class CC_E[H](a: (CC_C[Boolean],T_B[(Byte,Byte)]), b: T_A[H]) extends T_B[H]
case class CC_F[I]() extends T_B[I]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_A(CC_D(_, _, _))) => 0 
  case CC_D(_, _, CC_A(CC_E(_, _))) => 1 
  case CC_D(_, _, CC_A(CC_F())) => 2 
  case CC_E(_, _) => 3 
  case CC_F() => 4 
}
}