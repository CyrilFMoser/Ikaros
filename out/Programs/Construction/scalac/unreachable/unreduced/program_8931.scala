package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[(T_B[Char, Char],T_A[Byte, (Int,Boolean)]), E]
case class CC_B[F]() extends T_A[(T_B[Char, Char],T_A[Byte, (Int,Boolean)]), F]
case class CC_C[G]() extends T_A[(T_B[Char, Char],T_A[Byte, (Int,Boolean)]), G]
case class CC_D[H](a: H) extends T_B[H, T_B[H, H]]
case class CC_E[I](a: I, b: T_B[CC_B[I], I], c: CC_A[T_A[I, Byte]]) extends T_B[I, T_B[I, I]]
case class CC_F[J]() extends T_B[J, T_B[J, J]]

val v_a: T_B[Int, T_B[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(_, _, CC_A()) => 1 
  case CC_F() => 2 
}
}