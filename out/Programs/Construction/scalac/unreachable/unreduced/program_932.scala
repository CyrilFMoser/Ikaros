package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: (T_A[Char],T_A[Int]), b: T_A[E]) extends T_A[E]
case class CC_C[F]() extends T_A[F]
case class CC_D[G](a: T_A[G], b: CC_A[G], c: Byte) extends T_B[G, T_A[CC_A[Boolean]]]
case class CC_E[H](a: T_A[H], b: Int, c: (Byte,T_A[Boolean])) extends T_B[H, T_A[CC_A[Boolean]]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}