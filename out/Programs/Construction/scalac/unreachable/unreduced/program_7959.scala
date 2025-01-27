package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: F, b: T_A[F, F]) extends T_A[F, T_A[F, F]]
case class CC_C[G](a: T_A[G, T_A[G, G]], b: T_A[T_B[G, G], G]) extends T_A[G, T_A[G, G]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}