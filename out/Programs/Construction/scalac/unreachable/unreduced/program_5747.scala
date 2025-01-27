package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: D, c: Int) extends T_A[D]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C[F, G](a: T_A[G], b: Int) extends T_B[F, T_B[F, CC_B[F]]]
case class CC_D[H](a: Char) extends T_B[H, T_B[H, CC_B[H]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(0) => 1 
}
}
// This is not matched: CC_B(_)