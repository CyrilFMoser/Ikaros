package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[T_A[E, E], E]
case class CC_B(a: T_A[CC_A[Int], Byte], b: Boolean, c: (Char,T_B[Byte, Char])) extends T_A[T_A[T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]], T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]], T_A[T_A[CC_A[Byte], CC_A[Byte]], CC_A[Byte]]]
case class CC_C[F, G](a: CC_B, b: T_A[T_A[G, G], G], c: Char) extends T_B[G, F]
case class CC_D[I, H](a: Byte, b: T_A[I, H], c: CC_A[I]) extends T_B[H, I]

val v_a: CC_C[Char, Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _), CC_A(), _) => 0 
}
}