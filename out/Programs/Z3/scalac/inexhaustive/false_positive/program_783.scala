package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: E, b: T_B[E, F], c: T_A[F, F]) extends T_A[E, F]
case class CC_B[G, H]() extends T_A[G, H]
case class CC_C[I]() extends T_B[T_A[Boolean, Char], I]

val v_a: T_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_B()) => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_B (T_A (CC_A Int Boolean Boolean Boolean Boolean)))