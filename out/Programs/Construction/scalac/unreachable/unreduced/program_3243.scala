package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[T_B, T_B]]
case class CC_B[D](a: D, b: T_A[D, T_A[T_B, T_B]], c: (T_A[T_B, T_B],Int)) extends T_A[D, T_A[T_B, T_B]]
case class CC_C[E]() extends T_A[E, T_A[T_B, T_B]]
case class CC_D(a: CC_A[Char], b: T_A[CC_B[T_B], T_A[T_B, T_B]]) extends T_B
case class CC_E(a: T_A[CC_C[Boolean], T_A[T_B, T_B]], b: T_A[T_B, T_A[T_B, T_B]]) extends T_B
case class CC_F(a: CC_E, b: CC_D, c: CC_A[CC_E]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A()) => 0 
  case CC_D(_, CC_B(CC_B(_, _, _), CC_A(), (_,_))) => 1 
  case CC_D(_, CC_B(CC_B(_, _, _), CC_B(_, _, _), (_,_))) => 2 
  case CC_D(_, CC_B(CC_B(_, _, _), CC_C(), (_,_))) => 3 
  case CC_D(_, CC_C()) => 4 
  case CC_E(CC_A(), CC_A()) => 5 
  case CC_E(CC_B(CC_C(), CC_A(), (_,_)), CC_A()) => 6 
  case CC_E(CC_B(CC_C(), CC_B(_, _, _), (_,_)), CC_A()) => 7 
  case CC_E(CC_B(CC_C(), CC_C(), (_,_)), CC_A()) => 8 
  case CC_E(CC_C(), CC_A()) => 9 
  case CC_E(CC_A(), CC_B(_, _, _)) => 10 
  case CC_E(CC_B(CC_C(), CC_A(), (_,_)), CC_B(_, _, _)) => 11 
  case CC_E(CC_B(CC_C(), CC_B(_, _, _), (_,_)), CC_B(_, _, _)) => 12 
  case CC_E(CC_B(CC_C(), CC_C(), (_,_)), CC_B(_, _, _)) => 13 
  case CC_E(CC_C(), CC_B(_, _, _)) => 14 
  case CC_E(CC_A(), CC_C()) => 15 
  case CC_E(CC_B(CC_C(), CC_A(), (_,_)), CC_C()) => 16 
  case CC_E(CC_B(CC_C(), CC_B(_, _, _), (_,_)), CC_C()) => 17 
  case CC_E(CC_B(CC_C(), CC_C(), (_,_)), CC_C()) => 18 
  case CC_E(CC_C(), CC_C()) => 19 
}
}
// This is not matched: CC_F(_, CC_D(_, _), _)