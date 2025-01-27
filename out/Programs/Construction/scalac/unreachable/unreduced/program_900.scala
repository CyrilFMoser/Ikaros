package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (Boolean,T_A[Int, Boolean])) extends T_A[E, Char]
case class CC_B[F](a: T_A[F, Char], b: CC_A[T_B[F, F]], c: T_B[F, F]) extends T_A[F, Char]
case class CC_C[H, G](a: CC_B[G], b: T_A[T_A[G, G], H], c: T_A[H, G]) extends T_B[H, G]
case class CC_D[I, J](a: CC_C[J, I]) extends T_B[I, J]
case class CC_E[K](a: K, b: T_A[K, Char]) extends T_B[K, T_B[K, K]]

val v_a: CC_B[Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), CC_A(_), CC_C(_, _, _)) => 0 
  case CC_B(CC_B(_, _, _), CC_A(_), CC_C(_, _, _)) => 1 
  case CC_B(CC_A(_), CC_A(_), CC_D(_)) => 2 
  case CC_B(CC_B(_, _, _), CC_A(_), CC_D(_)) => 3 
}
}