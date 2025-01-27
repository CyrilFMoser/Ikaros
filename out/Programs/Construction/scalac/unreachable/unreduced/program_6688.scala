package Program_25 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C], c: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: Int, b: T_A[D, T_A[D, D]], c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E, F](a: Byte, b: T_A[F, T_A[F, F]]) extends T_A[E, T_A[T_A[Char, Int], T_A[T_A[Char, Int], T_A[Char, Int]]]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A('x', _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 1 
  case CC_A('x', _, CC_A(_, _, CC_B(_, _, _))) => 2 
  case CC_A(_, _, CC_A(_, _, CC_B(_, _, _))) => 3 
  case CC_A('x', _, CC_B(_, _, _)) => 4 
  case CC_A(_, _, CC_B(_, _, _)) => 5 
  case CC_B(_, _, _) => 6 
}
}