package Program_26 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D], c: Boolean) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_B[T_B[T_A[Char], F], F]
case class CC_D[G](a: G, b: Byte, c: T_B[G, G]) extends T_B[G, T_A[G]]
case class CC_E[H](a: CC_C[H], b: T_A[H]) extends T_B[H, T_A[H]]

val v_a: T_B[Char, T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(CC_C(), CC_A(_, _, _)) => 1 
  case CC_E(CC_C(), CC_B(_)) => 2 
}
}