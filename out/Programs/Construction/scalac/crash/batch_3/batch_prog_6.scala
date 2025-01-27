package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D], c: (T_A[Int],T_A[Byte])) extends T_A[D]
case class CC_B[E](a: Byte, b: CC_A[E], c: Char) extends T_A[E]
case class CC_C[F](a: Byte, b: Char) extends T_A[F]
case class CC_D[G]() extends T_B[CC_B[G], G]
case class CC_E[H](a: T_A[H], b: T_A[H], c: H) extends T_B[CC_B[H], H]
case class CC_F[I]() extends T_B[CC_B[I], I]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)