package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[T_A[D, D], D], b: (T_A[Char, Boolean],T_B[Char]), c: T_A[T_B[D], D]) extends T_A[T_A[D, D], D]
case class CC_B[E](a: Byte, b: CC_A[E], c: T_B[E]) extends T_A[T_A[E, E], E]
case class CC_C[F, G](a: (T_A[(Int,Int), Int],CC_B[Byte]), b: G, c: T_B[F]) extends T_A[T_A[F, F], F]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: CC_C((_,CC_B(_, _, _)), _, _)