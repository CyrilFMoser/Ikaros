package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E](a: CC_A[E], b: E) extends T_A[E]
case class CC_C[F](a: F) extends T_A[F]
case class CC_D[G](a: T_A[G]) extends T_B[T_A[G], G]
case class CC_E[H](a: T_A[H], b: T_B[H, H]) extends T_B[H, T_A[(Int,Int)]]
case class CC_F[I](a: Byte, b: CC_E[I]) extends T_B[I, T_A[(Int,Int)]]

val v_a: T_B[T_A[T_A[(Int,Int)]], T_A[(Int,Int)]] = null
val v_b: Int = v_a match{
  case CC_E(CC_A(CC_A(_)), _) => 0 
  case CC_E(CC_A(CC_B(_, _)), _) => 1 
  case CC_E(CC_A(CC_C(_)), _) => 2 
  case CC_E(CC_B(_, _), _) => 3 
  case CC_E(CC_C(_), _) => 4 
  case CC_F(_, _) => 5 
}
}
// This is not matched: CC_D(_)