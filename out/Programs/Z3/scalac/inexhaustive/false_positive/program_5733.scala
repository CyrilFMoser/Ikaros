package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[F, F]) extends T_A[E, F]
case class CC_C[I, H]() extends T_B[H, I]
case class CC_D[K, J]() extends T_B[J, K]

val v_a: CC_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A Char))