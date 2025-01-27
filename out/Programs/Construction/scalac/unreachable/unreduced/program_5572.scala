package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_A[E, E], c: T_A[E, E]) extends T_A[(T_B[(Boolean,Char), Boolean],T_B[Char, Boolean]), E]
case class CC_B[F]() extends T_A[(T_B[(Boolean,Char), Boolean],T_B[Char, Boolean]), F]
case class CC_C[G](a: CC_A[G]) extends T_A[Byte, G]
case class CC_D[H](a: T_B[H, H], b: H) extends T_B[H, T_A[Byte, H]]
case class CC_E[I]() extends T_B[I, T_A[Byte, I]]

val v_a: T_B[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_D(_, 0) => 0 
  case CC_D(_, _) => 1 
  case CC_E() => 2 
}
}