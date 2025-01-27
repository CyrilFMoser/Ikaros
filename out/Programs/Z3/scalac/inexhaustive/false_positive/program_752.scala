package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_C[F](a: Char, b: T_A[F, F]) extends T_A[F, Boolean]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_C('x', _) => 0 
}
}
// This is not matched: (CC_C Int Char Wildcard (T_A Int Boolean))