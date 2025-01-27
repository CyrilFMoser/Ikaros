package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, Char]) extends T_A[T_B[E, E], E]
case class CC_B[F](a: T_A[T_B[F, F], F], b: Char, c: T_A[F, T_B[F, F]]) extends T_A[T_B[F, F], F]

val v_a: T_A[T_B[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_A(_), _, _) => 1 
  case CC_B(CC_B(CC_A(_), _, _), _, _) => 2 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, _) => 3 
}
}