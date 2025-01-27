package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: E) extends T_A[E]
case class CC_C[F](a: CC_B[F], b: F) extends T_B[CC_A[F], F]
case class CC_D[G](a: CC_A[G]) extends T_B[CC_A[G], G]
case class CC_E[H](a: H, b: T_B[CC_A[H], H]) extends T_B[CC_D[H], H]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}