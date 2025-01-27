package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_A[T_A[Boolean, Byte], Char]]
case class CC_B[F](a: Char, b: T_B[F, F]) extends T_A[F, T_A[T_A[Boolean, Byte], Char]]
case class CC_C[G](a: CC_B[G], b: CC_A[G]) extends T_A[G, T_A[T_A[Boolean, Byte], Char]]
case class CC_D[H](a: (Int,T_A[Char, Int]), b: T_B[H, H], c: Byte) extends T_B[H, CC_A[H]]
case class CC_E[I](a: (Char,CC_A[Char]), b: Byte, c: Char) extends T_B[I, CC_A[I]]

val v_a: T_A[Byte, T_A[T_A[Boolean, Byte], Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, CC_A()) => 2 
}
}