package Program_24 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[(Char,Boolean)], b: Char) extends T_A[Int]
case class CC_B(a: Char, b: T_A[Int], c: T_A[Int]) extends T_A[Int]
case class CC_C() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _), CC_A(_, 'x')) => 1 
  case CC_B(_, CC_A(_, _), CC_A(_, _)) => 2 
  case CC_B(_, CC_A(_, _), CC_B(_, _, _)) => 3 
  case CC_B(_, CC_A(_, _), CC_C()) => 4 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_A(_, _)), CC_A(_, 'x')) => 5 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_A(_, _)), CC_A(_, _)) => 6 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_A(_, _)), CC_B(_, _, _)) => 7 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_A(_, _)), CC_C()) => 8 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_B(_, _, _)), CC_A(_, 'x')) => 9 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_B(_, _, _)), CC_A(_, _)) => 10 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_B(_, _, _)), CC_B(_, _, _)) => 11 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_B(_, _, _)), CC_C()) => 12 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_C()), CC_A(_, 'x')) => 13 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_C()), CC_A(_, _)) => 14 
  case CC_B(_, CC_B(_, CC_A(_, _), CC_C()), CC_C()) => 15 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_, _)), CC_A(_, 'x')) => 16 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_, _)), CC_A(_, _)) => 17 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_, _)), CC_B(_, _, _)) => 18 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_A(_, _)), CC_C()) => 19 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A(_, 'x')) => 20 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_A(_, _)) => 21 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, _)) => 22 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_B(_, _, _)), CC_C()) => 23 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_C()), CC_A(_, 'x')) => 24 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_C()), CC_A(_, _)) => 25 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_C()), CC_B(_, _, _)) => 26 
  case CC_B(_, CC_B(_, CC_B(_, _, _), CC_C()), CC_C()) => 27 
  case CC_B(_, CC_B(_, CC_C(), CC_A(_, _)), CC_A(_, 'x')) => 28 
  case CC_B(_, CC_B(_, CC_C(), CC_A(_, _)), CC_A(_, _)) => 29 
  case CC_B(_, CC_B(_, CC_C(), CC_A(_, _)), CC_B(_, _, _)) => 30 
  case CC_B(_, CC_B(_, CC_C(), CC_A(_, _)), CC_C()) => 31 
  case CC_B(_, CC_B(_, CC_C(), CC_B(_, _, _)), CC_A(_, 'x')) => 32 
  case CC_B(_, CC_B(_, CC_C(), CC_B(_, _, _)), CC_A(_, _)) => 33 
  case CC_B(_, CC_B(_, CC_C(), CC_B(_, _, _)), CC_B(_, _, _)) => 34 
  case CC_B(_, CC_B(_, CC_C(), CC_B(_, _, _)), CC_C()) => 35 
  case CC_B(_, CC_B(_, CC_C(), CC_C()), CC_A(_, 'x')) => 36 
  case CC_B(_, CC_B(_, CC_C(), CC_C()), CC_A(_, _)) => 37 
  case CC_B(_, CC_B(_, CC_C(), CC_C()), CC_B(_, _, _)) => 38 
  case CC_B(_, CC_B(_, CC_C(), CC_C()), CC_C()) => 39 
  case CC_B(_, CC_C(), CC_A(_, 'x')) => 40 
  case CC_B(_, CC_C(), CC_A(_, _)) => 41 
  case CC_B(_, CC_C(), CC_B(_, _, _)) => 42 
  case CC_B(_, CC_C(), CC_C()) => 43 
  case CC_C() => 44 
}
}
// This is not matched: CC_B(_, CC_B(_, CC_A(_, _), CC_C()), CC_B(_, _, _))