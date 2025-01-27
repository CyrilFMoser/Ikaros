package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[E, E], b: T_B[T_B[E, E], F]) extends T_A[E, F]
case class CC_B[H, G]() extends T_A[H, G]
case class CC_C[I, J](a: T_A[I, I], b: T_A[J, I], c: T_A[I, J]) extends T_A[I, J]
case class CC_D[K]() extends T_B[K, Int]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}
// This is not matched: CC_C(_, _, _)