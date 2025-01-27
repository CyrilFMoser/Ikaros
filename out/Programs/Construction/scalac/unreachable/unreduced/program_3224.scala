package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: E, c: E) extends T_A[E, T_A[T_B[E, E], E]]
case class CC_B[G, F](a: T_A[G, F], b: T_A[G, F], c: T_A[F, F]) extends T_B[G, F]
case class CC_C[I, H]() extends T_B[I, H]
case class CC_D[J, K](a: T_B[K, K]) extends T_B[J, K]

val v_a: T_B[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_C()