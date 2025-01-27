package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Byte) extends T_A[E, Char]
case class CC_B[F](a: T_A[F, F], b: F) extends T_A[F, Char]
case class CC_C[G](a: CC_B[G], b: G) extends T_A[CC_A[CC_A[Byte]], Char]
case class CC_D[H, I](a: Byte, b: Char, c: H) extends T_B[H, I]
case class CC_E[K, J](a: T_B[K, T_A[J, Char]], b: T_B[J, J]) extends T_B[J, K]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, _, _), _) => 0 
  case CC_A(CC_E(_, _), _) => 1 
  case CC_B(_, 0) => 2 
}
}
// This is not matched: CC_B(_, _)