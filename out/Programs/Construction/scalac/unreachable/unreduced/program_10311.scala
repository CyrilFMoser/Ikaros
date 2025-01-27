package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_A[T_A[T_B, T_B], C], c: T_A[T_A[T_B, T_B], C]) extends T_A[T_A[T_B, T_B], C]
case class CC_B[D]() extends T_A[T_A[T_B, T_B], D]
case class CC_C[E](a: (T_A[T_B, T_B],CC_B[T_B]), b: T_A[E, E], c: T_A[T_A[T_B, T_B], E]) extends T_A[T_A[T_B, T_B], E]

val v_a: T_A[T_A[T_B, T_B], T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, CC_A(_, _, _)), CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, _, CC_B()), CC_A(_, _, _)) => 1 
  case CC_A(_, CC_A(_, _, CC_C(_, _, _)), CC_A(_, _, _)) => 2 
  case CC_A(_, CC_B(), CC_A(_, _, _)) => 3 
  case CC_A(_, CC_C((_,_), _, _), CC_A(_, _, _)) => 4 
  case CC_A(_, CC_A(_, _, CC_A(_, _, _)), CC_B()) => 5 
  case CC_A(_, CC_A(_, _, CC_B()), CC_B()) => 6 
  case CC_A(_, CC_A(_, _, CC_C(_, _, _)), CC_B()) => 7 
  case CC_A(_, CC_B(), CC_B()) => 8 
  case CC_A(_, CC_C((_,_), _, _), CC_B()) => 9 
  case CC_A(_, CC_A(_, _, CC_A(_, _, _)), CC_C((_,_), _, _)) => 10 
  case CC_A(_, CC_A(_, _, CC_B()), CC_C((_,_), _, _)) => 11 
  case CC_A(_, CC_A(_, _, CC_C(_, _, _)), CC_C((_,_), _, _)) => 12 
  case CC_A(_, CC_B(), CC_C((_,_), _, _)) => 13 
  case CC_A(_, CC_C((_,_), _, _), CC_C((_,_), _, _)) => 14 
  case CC_B() => 15 
  case CC_C(_, _, CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 16 
  case CC_C(_, _, CC_A(_, CC_B(), CC_A(_, _, _))) => 17 
  case CC_C(_, _, CC_A(_, CC_C(_, _, _), CC_A(_, _, _))) => 18 
  case CC_C(_, _, CC_A(_, CC_A(_, _, _), CC_B())) => 19 
  case CC_C(_, _, CC_A(_, CC_B(), CC_B())) => 20 
  case CC_C(_, _, CC_A(_, CC_C(_, _, _), CC_B())) => 21 
  case CC_C(_, _, CC_A(_, CC_A(_, _, _), CC_C(_, _, _))) => 22 
  case CC_C(_, _, CC_A(_, CC_B(), CC_C(_, _, _))) => 23 
  case CC_C(_, _, CC_A(_, CC_C(_, _, _), CC_C(_, _, _))) => 24 
  case CC_C(_, _, CC_C(_, _, _)) => 25 
}
}
// This is not matched: CC_C(_, _, CC_B())