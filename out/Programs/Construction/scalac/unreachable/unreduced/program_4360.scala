package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Boolean, b: E, c: E) extends T_A[E, (T_A[Int, Int],T_A[Char, Byte])]
case class CC_B[F](a: F, b: T_B[T_A[F, F], F], c: T_A[F, F]) extends T_A[F, (T_A[Int, Int],T_A[Char, Byte])]
case class CC_C[H, G](a: Char) extends T_B[H, G]
case class CC_D[I, J](a: T_B[I, J]) extends T_B[I, J]
case class CC_E[K, L](a: T_A[K, K]) extends T_B[K, L]

val v_a: T_B[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_E(_) => 1 
}
}
// This is not matched: CC_D(_)