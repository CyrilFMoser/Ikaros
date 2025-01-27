package Program_5 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C[E](a: Boolean, b: T_A[E, T_A[E, E]]) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
  case CC_A(_, CC_C(_, _)) => 1 
  case CC_B() => 2 
  case CC_C(_, CC_A(_, CC_A(_, _))) => 3 
  case CC_C(_, CC_A(_, CC_B())) => 4 
  case CC_C(_, CC_A(_, CC_C(_, _))) => 5 
  case CC_C(_, CC_B()) => 6 
  case CC_C(_, CC_C(_, CC_A(_, _))) => 7 
  case CC_C(_, CC_C(_, CC_B())) => 8 
  case CC_C(_, CC_C(_, CC_C(_, _))) => 9 
}
}
// This is not matched: CC_A(_, CC_A(_, _))