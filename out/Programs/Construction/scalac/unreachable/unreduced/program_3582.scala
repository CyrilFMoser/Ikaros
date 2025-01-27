package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E], c: T_A[E, E]) extends T_A[T_A[T_B[Char, Boolean], T_A[Char, Char]], E]
case class CC_B[F](a: T_B[F, F], b: F) extends T_A[T_A[T_B[Char, Boolean], T_A[Char, Char]], F]
case class CC_C[G](a: CC_B[G], b: CC_A[G], c: G) extends T_A[T_A[T_B[Char, Boolean], T_A[Char, Char]], G]

val v_a: T_A[T_A[T_B[Char, Boolean], T_A[Char, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, 'x') => 1 
  case CC_B(_, _) => 2 
  case CC_C(_, _, _) => 3 
}
}