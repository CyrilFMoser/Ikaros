package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_C[E](a: E, b: T_A[E, Int], c: T_A[T_A[T_A[E, E], T_A[E, E]], T_A[E, E]]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_B(_, CC_C(_, _, _)) => 3 
  case CC_C(0, _, CC_A()) => 4 
  case CC_C(0, _, CC_B(_, _)) => 5 
  case CC_C(0, _, CC_C(_, _, CC_A())) => 6 
  case CC_C(0, _, CC_C(_, _, CC_B(_, _))) => 7 
  case CC_C(0, _, CC_C(_, _, CC_C(_, _, _))) => 8 
  case CC_C(_, _, CC_A()) => 9 
  case CC_C(_, _, CC_B(_, _)) => 10 
  case CC_C(_, _, CC_C(_, _, CC_A())) => 11 
  case CC_C(_, _, CC_C(_, _, CC_B(_, _))) => 12 
  case CC_C(_, _, CC_C(_, _, CC_C(_, _, _))) => 13 
}
}