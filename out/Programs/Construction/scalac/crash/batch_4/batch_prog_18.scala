package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Char]) extends T_A[C, Char]
case class CC_B[E, D](a: T_A[D, E], b: CC_A[T_A[D, D]]) extends T_A[D, E]
case class CC_C[F](a: T_A[F, F], b: F) extends T_A[T_A[F, F], F]

val v_a: CC_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _), _), CC_A(_)) => 0 
}
}