package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B[F](a: T_B[F]) extends T_A[F, T_B[F]]
case class CC_C[G]() extends T_B[G]
case class CC_D[H]() extends T_B[H]

val v_a: CC_B[T_B[T_A[Byte, Int]]] = null
val v_b: Int = v_a match{
  case CC_B(CC_D()) => 0 
}
}
// This is not matched: (CC_B (CC_A T_A) Wildcard T_A)