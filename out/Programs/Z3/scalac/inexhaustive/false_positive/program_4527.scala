package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[F, E]
case class CC_C[J, I]() extends T_A[I, J]
case class CC_D[K, L](a: T_A[L, K]) extends T_B[K, L]

val v_a: CC_D[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_C()) => 0 
}
}
// This is not matched: (CC_A Wildcard (CC_A Wildcard (CC_C Char (T_A Char)) (T_A Char)) (T_A Char))