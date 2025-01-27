package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: E) extends T_A[E, T_A[T_B[E, E], E]]
case class CC_B[F](a: T_B[F, F], b: T_A[F, F]) extends T_A[F, T_A[T_B[F, F], F]]
case class CC_C[G](a: CC_A[G]) extends T_A[G, T_A[T_B[G, G], G]]

val v_a: T_A[Int, T_A[T_B[Int, Int], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(CC_A(_, _)) => 2 
}
}