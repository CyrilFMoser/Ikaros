package Program_27 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[T_B[T_B[Byte, Int], T_B[Boolean, Boolean]]]
case class CC_B[E](a: E) extends T_A[E]
case class CC_C() extends T_A[T_A[(Byte,Int)]]
case class CC_D[F](a: T_B[F, F]) extends T_B[F, CC_B[CC_B[CC_C]]]
case class CC_E[G](a: CC_A[G], b: T_A[G], c: T_A[G]) extends T_B[G, CC_B[CC_B[CC_C]]]
case class CC_F[H](a: CC_E[H], b: CC_B[H]) extends T_B[H, CC_B[CC_B[CC_C]]]

val v_a: T_B[Boolean, CC_B[CC_B[CC_C]]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_A(_), _, CC_B(_)) => 1 
}
}
// This is not matched: CC_F(_, _)