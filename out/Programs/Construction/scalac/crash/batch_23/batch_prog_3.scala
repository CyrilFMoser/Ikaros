package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[F, E](a: T_A[F, F], b: T_A[E, E], c: T_A[E, E]) extends T_A[F, E]
case class CC_C[G, H](a: CC_A[T_A[H, H], G], b: (T_A[Byte, Char],Boolean), c: T_A[H, G]) extends T_A[H, G]

val v_a: CC_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
}
}