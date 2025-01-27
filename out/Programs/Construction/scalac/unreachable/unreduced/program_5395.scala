package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_B[D, D], c: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: Boolean, b: (T_A[Char],T_B[Int, Int]), c: T_B[E, E]) extends T_A[E]
case class CC_C() extends T_A[Char]
case class CC_D[F](a: T_A[F], b: T_A[F]) extends T_B[F, T_B[F, F]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_A(_, _, _)