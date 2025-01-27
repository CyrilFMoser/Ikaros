package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_A[T_A[T_B[Int, Char]]]) extends T_A[D]
case class CC_B[F](a: T_B[F, F]) extends T_A[F]
case class CC_C[G]() extends T_B[G, T_A[G]]
case class CC_D[H](a: H, b: T_B[H, T_A[H]], c: CC_A[H]) extends T_B[H, T_A[H]]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_)) => 1 
}
}
// This is not matched: CC_B(_)