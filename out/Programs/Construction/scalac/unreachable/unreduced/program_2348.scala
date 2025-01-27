package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_B[E]() extends T_A[T_A[E, E], E]
case class CC_C[F]() extends T_A[T_A[F, F], F]
case class CC_D[G](a: T_A[T_A[G, G], G]) extends T_B[G]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B()