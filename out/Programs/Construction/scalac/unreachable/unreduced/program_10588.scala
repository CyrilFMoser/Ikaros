package Program_28 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D, c: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: CC_B[F]) extends T_B[F, T_A[F]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B()) => 1 
  case CC_B() => 2 
}
}