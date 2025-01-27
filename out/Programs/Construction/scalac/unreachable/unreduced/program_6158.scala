package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: (T_A[Int, Int],Boolean), b: C, c: D) extends T_A[C, T_A[C, C]]
case class CC_B[E](a: CC_A[E, E], b: T_A[E, E], c: Int) extends T_A[E, T_A[E, E]]
case class CC_C[F](a: T_A[F, T_A[F, F]]) extends T_A[F, T_A[F, F]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(_) => 2 
}
}