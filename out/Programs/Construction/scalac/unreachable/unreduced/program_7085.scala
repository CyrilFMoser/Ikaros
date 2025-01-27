package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Char) extends T_A[D]
case class CC_B[E](a: Char) extends T_A[E]
case class CC_C[F](a: CC_A[T_A[F]], b: T_B[F, F], c: F) extends T_A[F]
case class CC_D[G](a: G, b: T_B[G, G], c: G) extends T_B[CC_C[Int], G]
case class CC_E[H](a: Byte, b: T_B[H, H]) extends T_B[CC_C[Int], H]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_)