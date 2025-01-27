package Program_30 

package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[E, D](a: T_B[D], b: T_A[D, D], c: T_A[D, D]) extends T_A[E, D]
case class CC_B[F](a: T_A[F, F]) extends T_A[T_A[F, F], F]
case class CC_C[G]() extends T_B[G]
case class CC_D[H]() extends T_B[T_A[Char, Int]]

val v_a: T_B[T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
}
}
// This is not matched: (CC_D Boolean (T_B (T_A Char Int)))
// This is not matched: (CC_B Char Wildcard Char (T_A Char Char))