package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[F, F], b: T_A[E, F]) extends T_A[E, F]
case class CC_B[H, G](a: H, b: T_A[H, H]) extends T_A[G, H]
case class CC_C[I, J](a: Int, b: CC_B[J, J], c: J) extends T_B[J, I]
case class CC_D[K](a: K, b: T_A[K, K], c: K) extends T_B[K, T_A[K, K]]

val v_a: CC_A[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}