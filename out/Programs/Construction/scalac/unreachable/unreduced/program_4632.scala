package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Byte, b: E, c: E) extends T_A[(T_B[Byte, Char],T_B[Boolean, Char]), E]
case class CC_B[F](a: T_A[F, F], b: Boolean) extends T_A[T_B[T_A[Byte, Byte], CC_A[Int]], F]
case class CC_C[G]() extends T_A[G, Char]
case class CC_D[H, I](a: T_B[I, H]) extends T_B[H, T_A[(Byte,Char), Char]]
case class CC_E[J](a: J, b: CC_C[J]) extends T_B[J, T_A[(Byte,Char), Char]]
case class CC_F[K](a: T_A[K, K], b: CC_A[T_A[K, Char]], c: Int) extends T_B[K, T_A[(Byte,Char), Char]]

val v_a: T_B[Char, T_A[(Byte,Char), Char]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E('x', CC_C()) => 1 
  case CC_E(_, CC_C()) => 2 
}
}
// This is not matched: CC_F(CC_C(), _, _)