package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E](a: T_A[E, E], b: E) extends T_A[T_A[T_A[Char, Int], CC_A[Char, Char]], E]
case class CC_C[F](a: CC_A[F, T_A[F, F]], b: CC_B[F], c: T_A[F, F]) extends T_A[T_A[T_A[Char, Int], CC_A[Char, Char]], F]

val v_a: CC_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}