package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, D], c: D) extends T_A[D]
case class CC_B[E](a: CC_A[T_A[E]]) extends T_A[E]
case class CC_C[F](a: T_A[F], b: F, c: CC_A[F]) extends T_A[F]
case class CC_D[G](a: G, b: Int, c: T_A[G]) extends T_B[CC_B[T_A[Int]], G]
case class CC_E[H](a: T_A[H]) extends T_B[Int, H]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, CC_A(_, _, _))) => 1 
  case CC_B(CC_A(_, _, CC_B(_))) => 2 
  case CC_B(CC_A(_, _, CC_C(_, _, _))) => 3 
  case CC_C(_, _, _) => 4 
}
}