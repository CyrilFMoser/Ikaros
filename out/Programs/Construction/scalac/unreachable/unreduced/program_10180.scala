package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_B[D]) extends T_A[D, T_B[T_B[Byte]]]
case class CC_B[E](a: T_A[E, E], b: Char) extends T_A[E, T_B[T_B[Byte]]]
case class CC_C[F](a: F, b: Int, c: T_A[F, F]) extends T_A[F, T_B[T_B[Byte]]]
case class CC_D[G](a: G, b: Char) extends T_B[G]
case class CC_E[H](a: H, b: CC_D[H], c: CC_B[H]) extends T_B[H]

val v_a: T_A[Byte, T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)