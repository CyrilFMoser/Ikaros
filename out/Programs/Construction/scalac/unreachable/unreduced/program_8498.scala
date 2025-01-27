package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Char]], b: T_A[T_A[Boolean]], c: T_A[T_A[Byte]]) extends T_A[T_A[Char]]
case class CC_B(a: T_A[T_A[Char]], b: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_C() extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_B(CC_B(CC_A(_, _, _), CC_A(_, _, _)), CC_A(_, _, _)) => 2 
  case CC_B(CC_B(CC_B(_, _), CC_A(_, _, _)), CC_A(_, _, _)) => 3 
  case CC_B(CC_B(CC_C(), CC_A(_, _, _)), CC_A(_, _, _)) => 4 
  case CC_B(CC_B(CC_A(_, _, _), CC_B(_, _)), CC_A(_, _, _)) => 5 
  case CC_B(CC_B(CC_B(_, _), CC_B(_, _)), CC_A(_, _, _)) => 6 
  case CC_B(CC_B(CC_C(), CC_B(_, _)), CC_A(_, _, _)) => 7 
  case CC_B(CC_B(CC_A(_, _, _), CC_C()), CC_A(_, _, _)) => 8 
  case CC_B(CC_B(CC_B(_, _), CC_C()), CC_A(_, _, _)) => 9 
  case CC_B(CC_B(CC_C(), CC_C()), CC_A(_, _, _)) => 10 
  case CC_B(CC_C(), CC_A(_, _, _)) => 11 
  case CC_B(CC_A(_, _, _), CC_B(_, _)) => 12 
  case CC_B(CC_B(CC_A(_, _, _), CC_A(_, _, _)), CC_B(_, _)) => 13 
  case CC_B(CC_B(CC_B(_, _), CC_A(_, _, _)), CC_B(_, _)) => 14 
  case CC_B(CC_B(CC_C(), CC_A(_, _, _)), CC_B(_, _)) => 15 
  case CC_B(CC_B(CC_A(_, _, _), CC_B(_, _)), CC_B(_, _)) => 16 
  case CC_B(CC_B(CC_B(_, _), CC_B(_, _)), CC_B(_, _)) => 17 
  case CC_B(CC_B(CC_C(), CC_B(_, _)), CC_B(_, _)) => 18 
  case CC_B(CC_B(CC_A(_, _, _), CC_C()), CC_B(_, _)) => 19 
  case CC_B(CC_B(CC_B(_, _), CC_C()), CC_B(_, _)) => 20 
  case CC_B(CC_B(CC_C(), CC_C()), CC_B(_, _)) => 21 
  case CC_B(CC_A(_, _, _), CC_C()) => 22 
  case CC_B(CC_B(CC_A(_, _, _), CC_A(_, _, _)), CC_C()) => 23 
  case CC_B(CC_B(CC_B(_, _), CC_A(_, _, _)), CC_C()) => 24 
  case CC_B(CC_B(CC_C(), CC_A(_, _, _)), CC_C()) => 25 
  case CC_B(CC_B(CC_A(_, _, _), CC_B(_, _)), CC_C()) => 26 
  case CC_B(CC_B(CC_B(_, _), CC_B(_, _)), CC_C()) => 27 
  case CC_B(CC_B(CC_C(), CC_B(_, _)), CC_C()) => 28 
  case CC_B(CC_B(CC_A(_, _, _), CC_C()), CC_C()) => 29 
  case CC_B(CC_B(CC_B(_, _), CC_C()), CC_C()) => 30 
  case CC_B(CC_B(CC_C(), CC_C()), CC_C()) => 31 
  case CC_B(CC_C(), CC_C()) => 32 
  case CC_C() => 33 
}
}
// This is not matched: CC_B(CC_C(), CC_B(_, _))