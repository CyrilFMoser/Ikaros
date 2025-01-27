package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D]) extends T_A[T_A[Char, T_A[Int, Char]], D]
case class CC_B[E]() extends T_A[T_A[Char, T_A[Int, Char]], E]
case class CC_C[F](a: T_A[Byte, F], b: T_B[F]) extends T_A[T_A[Char, T_A[Int, Char]], F]

val v_a: T_A[T_A[Char, T_A[Int, Char]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _)