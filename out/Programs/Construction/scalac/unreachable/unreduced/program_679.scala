package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, T_B[T_A[Boolean, Boolean]]]
case class CC_B[F]() extends T_A[F, T_B[T_A[Boolean, Boolean]]]
case class CC_C[G](a: G, b: CC_A[G, G]) extends T_B[G]
case class CC_D[H](a: T_B[H], b: T_A[H, H]) extends T_B[H]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A()) => 0 
  case CC_D(_, _) => 1 
}
}