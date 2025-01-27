package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: Byte) extends T_A[T_B[T_A[Byte, Byte]], D]
case class CC_B[E](a: T_B[E], b: Char, c: T_A[E, E]) extends T_A[T_B[T_A[Byte, Byte]], E]
case class CC_C[F](a: CC_A[F], b: T_A[F, F], c: CC_A[T_A[F, F]]) extends T_B[F]

val v_a: T_A[T_B[T_A[Byte, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_C(CC_A(_, _), _, CC_A(_, _)), _, _) => 1 
}
}