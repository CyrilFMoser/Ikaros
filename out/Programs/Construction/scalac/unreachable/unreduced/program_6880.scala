package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[Boolean], c: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: T_A[CC_A], b: CC_A, c: CC_A) extends T_A[Boolean]
case class CC_C() extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_A(_, _, _)) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _, _), _, CC_A(_, _, _)) => 1 
  case CC_A(CC_A(CC_C(), _, _), _, CC_A(_, _, _)) => 2 
  case CC_A(CC_B(_, _, CC_A(_, _, _)), _, CC_A(_, _, _)) => 3 
  case CC_A(CC_C(), _, CC_A(_, _, _)) => 4 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_B(_, _, _)) => 5 
  case CC_A(CC_A(CC_B(_, _, _), _, _), _, CC_B(_, _, _)) => 6 
  case CC_A(CC_A(CC_C(), _, _), _, CC_B(_, _, _)) => 7 
  case CC_A(CC_B(_, _, CC_A(_, _, _)), _, CC_B(_, _, _)) => 8 
  case CC_A(CC_C(), _, CC_B(_, _, _)) => 9 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, CC_C()) => 10 
  case CC_A(CC_A(CC_B(_, _, _), _, _), _, CC_C()) => 11 
  case CC_A(CC_A(CC_C(), _, _), _, CC_C()) => 12 
  case CC_A(CC_B(_, _, CC_A(_, _, _)), _, CC_C()) => 13 
  case CC_A(CC_C(), _, CC_C()) => 14 
  case CC_B(_, CC_A(_, _, CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 15 
  case CC_B(_, CC_A(_, _, CC_B(_, _, _)), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 16 
  case CC_B(_, CC_A(_, _, CC_C()), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 17 
  case CC_B(_, CC_A(_, _, CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_B(_, _, _))) => 18 
  case CC_B(_, CC_A(_, _, CC_B(_, _, _)), CC_A(_, CC_A(_, _, _), CC_B(_, _, _))) => 19 
  case CC_B(_, CC_A(_, _, CC_C()), CC_A(_, CC_A(_, _, _), CC_B(_, _, _))) => 20 
  case CC_B(_, CC_A(_, _, CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), CC_C())) => 21 
  case CC_B(_, CC_A(_, _, CC_B(_, _, _)), CC_A(_, CC_A(_, _, _), CC_C())) => 22 
  case CC_B(_, CC_A(_, _, CC_C()), CC_A(_, CC_A(_, _, _), CC_C())) => 23 
  case CC_B(_, CC_A(_, _, CC_A(_, _, _)), CC_A(_, CC_B(_, _, _), CC_A(_, _, _))) => 24 
  case CC_B(_, CC_A(_, _, CC_B(_, _, _)), CC_A(_, CC_B(_, _, _), CC_A(_, _, _))) => 25 
  case CC_B(_, CC_A(_, _, CC_C()), CC_A(_, CC_B(_, _, _), CC_A(_, _, _))) => 26 
  case CC_B(_, CC_A(_, _, CC_A(_, _, _)), CC_A(_, CC_B(_, _, _), CC_B(_, _, _))) => 27 
  case CC_B(_, CC_A(_, _, CC_B(_, _, _)), CC_A(_, CC_B(_, _, _), CC_B(_, _, _))) => 28 
  case CC_B(_, CC_A(_, _, CC_C()), CC_A(_, CC_B(_, _, _), CC_B(_, _, _))) => 29 
  case CC_B(_, CC_A(_, _, CC_A(_, _, _)), CC_A(_, CC_B(_, _, _), CC_C())) => 30 
  case CC_B(_, CC_A(_, _, CC_B(_, _, _)), CC_A(_, CC_B(_, _, _), CC_C())) => 31 
  case CC_B(_, CC_A(_, _, CC_C()), CC_A(_, CC_B(_, _, _), CC_C())) => 32 
  case CC_B(_, CC_A(_, _, CC_A(_, _, _)), CC_A(_, CC_C(), CC_A(_, _, _))) => 33 
  case CC_B(_, CC_A(_, _, CC_B(_, _, _)), CC_A(_, CC_C(), CC_A(_, _, _))) => 34 
  case CC_B(_, CC_A(_, _, CC_C()), CC_A(_, CC_C(), CC_A(_, _, _))) => 35 
  case CC_B(_, CC_A(_, _, CC_A(_, _, _)), CC_A(_, CC_C(), CC_B(_, _, _))) => 36 
  case CC_B(_, CC_A(_, _, CC_B(_, _, _)), CC_A(_, CC_C(), CC_B(_, _, _))) => 37 
  case CC_B(_, CC_A(_, _, CC_C()), CC_A(_, CC_C(), CC_B(_, _, _))) => 38 
  case CC_B(_, CC_A(_, _, CC_A(_, _, _)), CC_A(_, CC_C(), CC_C())) => 39 
  case CC_B(_, CC_A(_, _, CC_B(_, _, _)), CC_A(_, CC_C(), CC_C())) => 40 
  case CC_B(_, CC_A(_, _, CC_C()), CC_A(_, CC_C(), CC_C())) => 41 
  case CC_C() => 42 
}
}