package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, T_A[C, C]]
case class CC_B[D](a: T_A[D, T_A[D, D]], b: T_A[D, T_A[D, D]]) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: (T_A[Char, Byte],T_A[Char, Char]), b: T_A[E, T_A[E, E]], c: E) extends T_A[E, T_A[E, E]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A()) => 1 
  case CC_B(CC_B(CC_A(), _), CC_A()) => 2 
  case CC_B(CC_B(CC_B(_, _), _), CC_A()) => 3 
  case CC_B(CC_B(CC_C(_, _, _), _), CC_A()) => 4 
  case CC_B(CC_C(_, _, _), CC_A()) => 5 
  case CC_B(CC_A(), CC_B(_, _)) => 6 
  case CC_B(CC_B(CC_A(), _), CC_B(_, _)) => 7 
  case CC_B(CC_B(CC_B(_, _), _), CC_B(_, _)) => 8 
  case CC_B(CC_B(CC_C(_, _, _), _), CC_B(_, _)) => 9 
  case CC_B(CC_C(_, _, _), CC_B(_, _)) => 10 
  case CC_B(CC_A(), CC_C(_, _, 'x')) => 11 
  case CC_B(CC_B(CC_A(), _), CC_C(_, _, 'x')) => 12 
  case CC_B(CC_B(CC_B(_, _), _), CC_C(_, _, 'x')) => 13 
  case CC_B(CC_B(CC_C(_, _, _), _), CC_C(_, _, 'x')) => 14 
  case CC_B(CC_C(_, _, _), CC_C(_, _, 'x')) => 15 
  case CC_B(CC_A(), CC_C(_, _, _)) => 16 
  case CC_B(CC_B(CC_A(), _), CC_C(_, _, _)) => 17 
  case CC_B(CC_B(CC_B(_, _), _), CC_C(_, _, _)) => 18 
  case CC_B(CC_B(CC_C(_, _, _), _), CC_C(_, _, _)) => 19 
  case CC_B(CC_C(_, _, _), CC_C(_, _, _)) => 20 
  case CC_C((_,_), _, _) => 21 
}
}