package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Byte, b: T_A[D, D]) extends T_A[T_B[D], D]
case class CC_B[E](a: Int) extends T_A[T_B[E], E]
case class CC_C(a: Char, b: Int) extends T_A[T_B[CC_A[Boolean]], CC_A[Boolean]]
case class CC_D[F](a: F, b: T_A[T_B[F], F]) extends T_B[F]
case class CC_E[G](a: G, b: G, c: Int) extends T_B[G]
case class CC_F[H](a: T_A[T_B[H], H], b: T_B[H]) extends T_B[H]

val v_a: T_A[T_B[CC_A[Boolean]], CC_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C(_, _)