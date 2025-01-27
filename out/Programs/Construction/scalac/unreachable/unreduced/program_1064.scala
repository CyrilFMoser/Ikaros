package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: (T_A[Int, Int],Int), b: T_A[T_A[C, C], C], c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D], b: CC_A[D]) extends T_A[T_A[D, D], D]
case class CC_C[E](a: T_A[T_A[E, E], E], b: T_A[T_A[E, E], E], c: CC_B[E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_A((_,_), CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A((_,_), CC_B(_, _), CC_A(_, _, _)) => 1 
  case CC_A((_,_), CC_C(_, _, _), CC_A(_, _, _)) => 2 
  case CC_A((_,_), CC_A(_, _, _), CC_B(_, _)) => 3 
  case CC_A((_,_), CC_B(_, _), CC_B(_, _)) => 4 
  case CC_A((_,_), CC_C(_, _, _), CC_B(_, _)) => 5 
  case CC_A((_,_), CC_A(_, _, _), CC_C(_, _, _)) => 6 
  case CC_A((_,_), CC_B(_, _), CC_C(_, _, _)) => 7 
  case CC_A((_,_), CC_C(_, _, _), CC_C(_, _, _)) => 8 
  case CC_B(CC_A(_, _, _), _) => 9 
  case CC_B(CC_B(_, _), _) => 10 
  case CC_B(CC_C(_, _, _), _) => 11 
  case CC_C(_, CC_A(_, _, _), CC_B(_, _)) => 12 
  case CC_C(_, CC_B(_, _), CC_B(_, _)) => 13 
  case CC_C(_, CC_C(_, _, _), CC_B(_, _)) => 14 
}
}