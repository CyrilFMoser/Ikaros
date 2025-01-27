package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: E) extends T_A[E, Byte]
case class CC_B[F, G](a: CC_A[G], b: T_B[F, T_B[F, F]], c: T_B[F, F]) extends T_B[G, F]
case class CC_C[H, I, J](a: CC_A[J]) extends T_B[H, I]
case class CC_D[K](a: K, b: Char) extends T_B[T_B[K, K], K]

val v_a: T_B[T_B[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B(CC_A(_, _), _, _)) => 0 
  case CC_B(_, _, CC_C(_)) => 1 
  case CC_D(_, _) => 2 
}
}
// This is not matched: CC_C(_)