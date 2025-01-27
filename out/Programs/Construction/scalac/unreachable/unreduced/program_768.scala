package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: CC_A[E], b: E, c: T_B[E, E]) extends T_A[E]
case class CC_C() extends T_A[CC_B[T_A[Byte]]]
case class CC_D[F]() extends T_B[F, CC_C]
case class CC_E[G](a: Int, b: T_B[CC_D[G], G]) extends T_B[G, CC_C]
case class CC_F[H](a: Boolean, b: CC_A[Boolean]) extends T_B[H, CC_C]

val v_a: T_B[Int, CC_C] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _) => 1 
  case CC_F(_, _) => 2 
}
}