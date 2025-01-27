package Program_21 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A[(T_A,Boolean)], b: T_A, c: CC_A[T_A]) extends T_A
case class CC_C() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), _)) => 0 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _, _), _)) => 1 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_C(), _)) => 2 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_B(_, _, _)) => 3 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_C()) => 4 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _, _)), CC_A(CC_A(_, _), _)) => 5 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), _)) => 6 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _, _)), CC_A(CC_C(), _)) => 7 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _, _)), CC_B(_, _, _)) => 8 
  case CC_A(CC_A(CC_A(_, _), CC_B(_, _, _)), CC_C()) => 9 
  case CC_A(CC_A(CC_A(_, _), CC_C()), CC_A(CC_A(_, _), _)) => 10 
  case CC_A(CC_A(CC_A(_, _), CC_C()), CC_A(CC_B(_, _, _), _)) => 11 
  case CC_A(CC_A(CC_A(_, _), CC_C()), CC_A(CC_C(), _)) => 12 
  case CC_A(CC_A(CC_A(_, _), CC_C()), CC_B(_, _, _)) => 13 
  case CC_A(CC_A(CC_A(_, _), CC_C()), CC_C()) => 14 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _)), CC_A(CC_A(_, _), _)) => 15 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _)), CC_A(CC_B(_, _, _), _)) => 16 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _)), CC_A(CC_C(), _)) => 17 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _)), CC_B(_, _, _)) => 18 
  case CC_A(CC_A(CC_B(_, _, _), CC_A(_, _)), CC_C()) => 19 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _)), CC_A(CC_A(_, _), _)) => 20 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), _)) => 21 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _)), CC_A(CC_C(), _)) => 22 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, _)) => 23 
  case CC_A(CC_A(CC_B(_, _, _), CC_B(_, _, _)), CC_C()) => 24 
  case CC_A(CC_A(CC_B(_, _, _), CC_C()), CC_A(CC_A(_, _), _)) => 25 
  case CC_A(CC_A(CC_B(_, _, _), CC_C()), CC_A(CC_B(_, _, _), _)) => 26 
  case CC_A(CC_A(CC_B(_, _, _), CC_C()), CC_A(CC_C(), _)) => 27 
  case CC_A(CC_A(CC_B(_, _, _), CC_C()), CC_B(_, _, _)) => 28 
  case CC_A(CC_A(CC_B(_, _, _), CC_C()), CC_C()) => 29 
  case CC_A(CC_A(CC_C(), CC_A(_, _)), CC_A(CC_A(_, _), _)) => 30 
  case CC_A(CC_A(CC_C(), CC_A(_, _)), CC_A(CC_B(_, _, _), _)) => 31 
  case CC_A(CC_A(CC_C(), CC_A(_, _)), CC_A(CC_C(), _)) => 32 
  case CC_A(CC_A(CC_C(), CC_A(_, _)), CC_B(_, _, _)) => 33 
  case CC_A(CC_A(CC_C(), CC_A(_, _)), CC_C()) => 34 
  case CC_A(CC_A(CC_C(), CC_B(_, _, _)), CC_A(CC_A(_, _), _)) => 35 
  case CC_A(CC_A(CC_C(), CC_B(_, _, _)), CC_A(CC_B(_, _, _), _)) => 36 
  case CC_A(CC_A(CC_C(), CC_B(_, _, _)), CC_A(CC_C(), _)) => 37 
  case CC_A(CC_A(CC_C(), CC_B(_, _, _)), CC_B(_, _, _)) => 38 
  case CC_A(CC_A(CC_C(), CC_B(_, _, _)), CC_C()) => 39 
  case CC_A(CC_A(CC_C(), CC_C()), CC_A(CC_A(_, _), _)) => 40 
  case CC_A(CC_A(CC_C(), CC_C()), CC_A(CC_B(_, _, _), _)) => 41 
  case CC_A(CC_A(CC_C(), CC_C()), CC_A(CC_C(), _)) => 42 
  case CC_A(CC_A(CC_C(), CC_C()), CC_B(_, _, _)) => 43 
  case CC_A(CC_A(CC_C(), CC_C()), CC_C()) => 44 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), _)) => 45 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _, _), _)) => 46 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_A(CC_C(), _)) => 47 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_B(_, _, _)) => 48 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _), CC_A(_, _)), CC_C()) => 49 
  case CC_A(CC_B(CC_A(_, _), CC_B(_, _, _), CC_A(_, _)), CC_A(CC_A(_, _), _)) => 50 
  case CC_A(CC_B(CC_A(_, _), CC_B(_, _, _), CC_A(_, _)), CC_A(CC_B(_, _, _), _)) => 51 
  case CC_A(CC_B(CC_A(_, _), CC_B(_, _, _), CC_A(_, _)), CC_A(CC_C(), _)) => 52 
  case CC_A(CC_B(CC_A(_, _), CC_B(_, _, _), CC_A(_, _)), CC_B(_, _, _)) => 53 
  case CC_A(CC_B(CC_A(_, _), CC_B(_, _, _), CC_A(_, _)), CC_C()) => 54 
  case CC_A(CC_B(CC_A(_, _), CC_C(), CC_A(_, _)), CC_A(CC_A(_, _), _)) => 55 
  case CC_A(CC_B(CC_A(_, _), CC_C(), CC_A(_, _)), CC_A(CC_B(_, _, _), _)) => 56 
  case CC_A(CC_B(CC_A(_, _), CC_C(), CC_A(_, _)), CC_A(CC_C(), _)) => 57 
  case CC_A(CC_B(CC_A(_, _), CC_C(), CC_A(_, _)), CC_B(_, _, _)) => 58 
  case CC_A(CC_B(CC_A(_, _), CC_C(), CC_A(_, _)), CC_C()) => 59 
  case CC_A(CC_C(), CC_A(CC_A(_, _), _)) => 60 
  case CC_A(CC_C(), CC_A(CC_B(_, _, _), _)) => 61 
  case CC_A(CC_C(), CC_A(CC_C(), _)) => 62 
  case CC_A(CC_C(), CC_B(_, _, _)) => 63 
  case CC_A(CC_C(), CC_C()) => 64 
  case CC_B(_, _, _) => 65 
  case CC_C() => 66 
}
}