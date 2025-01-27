package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Boolean, b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, D]) extends T_A[D, T_A[D, D]]
case class CC_C[E]() extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(true, CC_A(_, _))) => 0 
  case CC_A(_, CC_A(true, CC_B(_))) => 1 
  case CC_A(_, CC_A(true, CC_C())) => 2 
  case CC_A(_, CC_A(false, CC_A(_, _))) => 3 
  case CC_A(_, CC_A(false, CC_B(_))) => 4 
  case CC_A(_, CC_A(false, CC_C())) => 5 
  case CC_A(_, CC_B(_)) => 6 
  case CC_A(_, CC_C()) => 7 
  case CC_B(_) => 8 
  case CC_C() => 9 
}
}