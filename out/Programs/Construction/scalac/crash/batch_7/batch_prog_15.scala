package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E) extends T_A[E, T_B[E, E]]
case class CC_B[F](a: T_A[F, T_B[F, F]]) extends T_A[F, T_B[F, F]]

val v_a: CC_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
  case CC_A(_) => 1 
}
}