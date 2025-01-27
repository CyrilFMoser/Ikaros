package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D], c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_B[E](a: T_A[E, E], b: T_B[E], c: T_B[T_A[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_C[F]() extends T_A[F, T_A[F, F]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_, _, _))) => 1 
  case CC_A(_, _, CC_A(_, _, CC_C())) => 2 
  case CC_A(_, _, CC_B(_, _, _)) => 3 
  case CC_A(_, _, CC_C()) => 4 
  case CC_B(_, _, _) => 5 
  case CC_C() => 6 
}
}