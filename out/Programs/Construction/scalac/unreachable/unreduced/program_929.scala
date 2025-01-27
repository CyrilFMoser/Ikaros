package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[T_B[E, (Int,Byte)], E]
case class CC_B[F]() extends T_A[T_B[F, (Int,Byte)], F]
case class CC_C[G](a: CC_B[G], b: CC_A[G]) extends T_A[T_B[G, (Int,Byte)], G]
case class CC_D[H](a: CC_B[H], b: H, c: T_B[H, H]) extends T_B[CC_A[CC_C[Char]], CC_B[T_B[Byte, Byte]]]

val v_a: T_A[T_B[Char, (Int,Byte)], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _)