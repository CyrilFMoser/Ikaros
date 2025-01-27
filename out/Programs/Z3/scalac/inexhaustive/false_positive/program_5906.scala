package Program_13 

package Program_5 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_A[F, F], b: T_A[F, F], c: CC_A[F]) extends T_A[F, T_A[F, F]]
case class CC_C[G]() extends T_A[G, T_A[G, G]]
case class CC_D[H](a: H) extends T_B[CC_C[Byte], H]
case class CC_E[I, J]() extends T_B[CC_C[Byte], I]

val v_a: T_B[CC_C[Byte], Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E() => 1 
}
}
// This is not matched: (CC_E Boolean Boolean (T_B (CC_C Byte Boolean) Boolean))
// This is not matched: (CC_A T_A)