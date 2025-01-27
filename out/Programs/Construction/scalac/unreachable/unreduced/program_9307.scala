package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: T_A[T_B], c: T_A[T_B]) extends T_A[T_B]
case class CC_B(a: CC_A, b: CC_A, c: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_C() extends T_A[T_B]
case class CC_D() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, CC_A(_, _, _)), CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A(CC_A(_, _, CC_B(_, _, _)), CC_A(_, _, _), CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, CC_C()), CC_A(_, _, _), CC_A(_, _, _)) => 2 
  case CC_A(CC_B(_, CC_A(_, _, _), _), CC_A(_, _, _), CC_A(_, _, _)) => 3 
  case CC_A(CC_C(), CC_A(_, _, _), CC_A(_, _, _)) => 4 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), CC_B(CC_A(_, _, _), _, _), CC_A(_, _, _)) => 5 
  case CC_A(CC_A(_, _, CC_B(_, _, _)), CC_B(CC_A(_, _, _), _, _), CC_A(_, _, _)) => 6 
  case CC_A(CC_A(_, _, CC_C()), CC_B(CC_A(_, _, _), _, _), CC_A(_, _, _)) => 7 
  case CC_A(CC_B(_, CC_A(_, _, _), _), CC_B(CC_A(_, _, _), _, _), CC_A(_, _, _)) => 8 
  case CC_A(CC_C(), CC_B(CC_A(_, _, _), _, _), CC_A(_, _, _)) => 9 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), CC_C(), CC_A(_, _, _)) => 10 
  case CC_A(CC_A(_, _, CC_B(_, _, _)), CC_C(), CC_A(_, _, _)) => 11 
  case CC_A(CC_A(_, _, CC_C()), CC_C(), CC_A(_, _, _)) => 12 
  case CC_A(CC_B(_, CC_A(_, _, _), _), CC_C(), CC_A(_, _, _)) => 13 
  case CC_A(CC_C(), CC_C(), CC_A(_, _, _)) => 14 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), CC_A(_, _, _), CC_B(_, _, _)) => 15 
  case CC_A(CC_A(_, _, CC_B(_, _, _)), CC_A(_, _, _), CC_B(_, _, _)) => 16 
  case CC_A(CC_A(_, _, CC_C()), CC_A(_, _, _), CC_B(_, _, _)) => 17 
  case CC_A(CC_B(_, CC_A(_, _, _), _), CC_A(_, _, _), CC_B(_, _, _)) => 18 
  case CC_A(CC_C(), CC_A(_, _, _), CC_B(_, _, _)) => 19 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), CC_B(CC_A(_, _, _), _, _), CC_B(_, _, _)) => 20 
  case CC_A(CC_A(_, _, CC_B(_, _, _)), CC_B(CC_A(_, _, _), _, _), CC_B(_, _, _)) => 21 
  case CC_A(CC_A(_, _, CC_C()), CC_B(CC_A(_, _, _), _, _), CC_B(_, _, _)) => 22 
  case CC_A(CC_B(_, CC_A(_, _, _), _), CC_B(CC_A(_, _, _), _, _), CC_B(_, _, _)) => 23 
  case CC_A(CC_C(), CC_B(CC_A(_, _, _), _, _), CC_B(_, _, _)) => 24 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), CC_C(), CC_B(_, _, _)) => 25 
  case CC_A(CC_A(_, _, CC_B(_, _, _)), CC_C(), CC_B(_, _, _)) => 26 
  case CC_A(CC_A(_, _, CC_C()), CC_C(), CC_B(_, _, _)) => 27 
  case CC_A(CC_B(_, CC_A(_, _, _), _), CC_C(), CC_B(_, _, _)) => 28 
  case CC_A(CC_C(), CC_C(), CC_B(_, _, _)) => 29 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), CC_A(_, _, _), CC_C()) => 30 
  case CC_A(CC_A(_, _, CC_B(_, _, _)), CC_A(_, _, _), CC_C()) => 31 
  case CC_A(CC_A(_, _, CC_C()), CC_A(_, _, _), CC_C()) => 32 
  case CC_A(CC_B(_, CC_A(_, _, _), _), CC_A(_, _, _), CC_C()) => 33 
  case CC_A(CC_C(), CC_A(_, _, _), CC_C()) => 34 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), CC_B(CC_A(_, _, _), _, _), CC_C()) => 35 
  case CC_A(CC_A(_, _, CC_B(_, _, _)), CC_B(CC_A(_, _, _), _, _), CC_C()) => 36 
  case CC_A(CC_A(_, _, CC_C()), CC_B(CC_A(_, _, _), _, _), CC_C()) => 37 
  case CC_A(CC_B(_, CC_A(_, _, _), _), CC_B(CC_A(_, _, _), _, _), CC_C()) => 38 
  case CC_A(CC_C(), CC_B(CC_A(_, _, _), _, _), CC_C()) => 39 
  case CC_A(CC_A(_, _, CC_A(_, _, _)), CC_C(), CC_C()) => 40 
  case CC_A(CC_A(_, _, CC_B(_, _, _)), CC_C(), CC_C()) => 41 
  case CC_A(CC_A(_, _, CC_C()), CC_C(), CC_C()) => 42 
  case CC_A(CC_B(_, CC_A(_, _, _), _), CC_C(), CC_C()) => 43 
  case CC_A(CC_C(), CC_C(), CC_C()) => 44 
  case CC_B(_, _, _) => 45 
  case CC_C() => 46 
}
}