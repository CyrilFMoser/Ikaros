package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: E) extends T_A[Byte, E]
case class CC_B[F]() extends T_A[F, T_A[F, F]]
case class CC_C[G](a: G, b: T_A[G, G]) extends T_A[Byte, G]
case class CC_D[H](a: CC_C[H], b: H) extends T_B[CC_C[CC_B[Boolean]], H]
case class CC_E[I]() extends T_B[CC_C[CC_B[Boolean]], I]

val v_a: T_B[CC_C[CC_B[Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _), _) => 0 
  case CC_E() => 1 
}
}