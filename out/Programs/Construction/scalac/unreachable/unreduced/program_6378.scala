package Program_28 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[Int, Int], T_A[T_A[Int, Int], T_A[Int, Int]]]) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: T_A[E, T_A[E, E]], b: E, c: E) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: Int, b: T_A[F, T_A[F, F]], c: Int) extends T_A[F, T_A[F, F]]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_, _, _)) => 1 
  case CC_A(CC_C(_, _, _)) => 2 
}
}