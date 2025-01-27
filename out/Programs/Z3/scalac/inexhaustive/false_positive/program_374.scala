package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_B[F](a: F, b: T_A[F, F]) extends T_A[T_A[F, F], F]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_B('x', _) => 0 
}
}
// This is not matched: (CC_C Wildcard Wildcard (CC_B Wildcard T_A) T_A)