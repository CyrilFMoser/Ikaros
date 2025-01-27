package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_B[D, D], c: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: Int) extends T_A[E]
case class CC_C[F](a: T_B[F, F], b: F, c: T_A[F]) extends T_B[CC_B[T_A[Char]], F]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
  case CC_B(CC_B(_, _), _) => 2 
}
}