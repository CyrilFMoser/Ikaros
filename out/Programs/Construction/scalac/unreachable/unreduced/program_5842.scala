package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: D) extends T_A[D]
case class CC_B(a: (T_A[Byte],T_A[Int]), b: CC_A[T_A[Char]]) extends T_A[T_B[T_A[Boolean], CC_A[Boolean]]]
case class CC_C[E](a: T_A[E], b: CC_B) extends T_A[E]
case class CC_D[F](a: F) extends T_B[CC_A[Boolean], F]
case class CC_E[G](a: T_B[CC_A[Boolean], G]) extends T_B[CC_A[Boolean], G]
case class CC_F[H](a: Byte, b: H) extends T_B[CC_A[Boolean], H]

val v_a: T_A[T_B[T_A[Boolean], CC_A[Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B(_, _)