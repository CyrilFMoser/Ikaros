package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: F, b: F, c: (T_A[(Int,Boolean), Char],T_A[Byte, Boolean])) extends T_A[F, T_A[F, F]]
case class CC_C[G](a: T_A[G, T_A[G, G]], b: T_B[G, G]) extends T_A[G, T_A[G, G]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_A(_, CC_B(_, _, _)) => 2 
  case CC_A(_, CC_C(_, _)) => 3 
  case CC_B(_, 'x', (_,_)) => 4 
  case CC_B(_, _, (_,_)) => 5 
  case CC_C(_, _) => 6 
}
}
// This is not matched: CC_A(_, CC_A(_, CC_C(_, _)))