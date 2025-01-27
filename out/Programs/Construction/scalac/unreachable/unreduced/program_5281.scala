package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: T_A[D, D], c: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _))) => 1 
  case CC_A(_, CC_A(_, CC_C(_))) => 2 
  case CC_A(_, CC_B(_, _, CC_A(_, _))) => 3 
  case CC_A(_, CC_B(_, _, CC_B(_, _, _))) => 4 
  case CC_A(_, CC_B(_, _, CC_C(_))) => 5 
  case CC_A(_, CC_C(CC_A(_, _))) => 6 
  case CC_A(_, CC_C(CC_B(_, _, _))) => 7 
  case CC_A(_, CC_C(CC_C(_))) => 8 
  case CC_B('x', _, CC_A(_, CC_A(_, _))) => 9 
  case CC_B(_, _, CC_A(_, CC_A(_, _))) => 10 
  case CC_B('x', _, CC_A(_, CC_B(_, _, _))) => 11 
  case CC_B(_, _, CC_A(_, CC_B(_, _, _))) => 12 
  case CC_B('x', _, CC_A(_, CC_C(_))) => 13 
  case CC_B(_, _, CC_A(_, CC_C(_))) => 14 
  case CC_B('x', _, CC_B(_, _, CC_A(_, _))) => 15 
  case CC_B(_, _, CC_B(_, _, CC_A(_, _))) => 16 
  case CC_B('x', _, CC_B(_, _, CC_B(_, _, _))) => 17 
  case CC_B(_, _, CC_B(_, _, CC_B(_, _, _))) => 18 
  case CC_B('x', _, CC_B(_, _, CC_C(_))) => 19 
  case CC_B(_, _, CC_B(_, _, CC_C(_))) => 20 
  case CC_B('x', _, CC_C(CC_A(_, _))) => 21 
  case CC_B(_, _, CC_C(CC_A(_, _))) => 22 
  case CC_B('x', _, CC_C(CC_B(_, _, _))) => 23 
  case CC_B(_, _, CC_C(CC_B(_, _, _))) => 24 
  case CC_B('x', _, CC_C(CC_C(_))) => 25 
  case CC_B(_, _, CC_C(CC_C(_))) => 26 
  case CC_C(_) => 27 
}
}