package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[Boolean]) extends T_A[Boolean]
case class CC_B(a: (T_A[Boolean],(CC_A,(Int,Byte))), b: T_A[CC_A], c: T_A[Boolean]) extends T_A[Boolean]
case class CC_C() extends T_A[Boolean]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(CC_B((_,_), _, CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 1 
  case CC_A(CC_B((_,_), _, CC_B(_, _, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 2 
  case CC_A(CC_B((_,_), _, CC_C()), CC_A(CC_A(_, _), CC_A(_, _))) => 3 
  case CC_A(CC_C(), CC_A(CC_A(_, _), CC_A(_, _))) => 4 
  case CC_A(CC_A(_, _), CC_A(CC_B(_, _, _), CC_A(_, _))) => 5 
  case CC_A(CC_B((_,_), _, CC_A(_, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 6 
  case CC_A(CC_B((_,_), _, CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 7 
  case CC_A(CC_B((_,_), _, CC_C()), CC_A(CC_B(_, _, _), CC_A(_, _))) => 8 
  case CC_A(CC_C(), CC_A(CC_B(_, _, _), CC_A(_, _))) => 9 
  case CC_A(CC_A(_, _), CC_A(CC_C(), CC_A(_, _))) => 10 
  case CC_A(CC_B((_,_), _, CC_A(_, _)), CC_A(CC_C(), CC_A(_, _))) => 11 
  case CC_A(CC_B((_,_), _, CC_B(_, _, _)), CC_A(CC_C(), CC_A(_, _))) => 12 
  case CC_A(CC_B((_,_), _, CC_C()), CC_A(CC_C(), CC_A(_, _))) => 13 
  case CC_A(CC_C(), CC_A(CC_C(), CC_A(_, _))) => 14 
  case CC_A(CC_A(_, _), CC_A(CC_A(_, _), CC_B(_, _, _))) => 15 
  case CC_A(CC_B((_,_), _, CC_A(_, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 16 
  case CC_A(CC_B((_,_), _, CC_B(_, _, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 17 
  case CC_A(CC_B((_,_), _, CC_C()), CC_A(CC_A(_, _), CC_B(_, _, _))) => 18 
  case CC_A(CC_C(), CC_A(CC_A(_, _), CC_B(_, _, _))) => 19 
  case CC_A(CC_A(_, _), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 20 
  case CC_A(CC_B((_,_), _, CC_A(_, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 21 
  case CC_A(CC_B((_,_), _, CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 22 
  case CC_A(CC_B((_,_), _, CC_C()), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 23 
  case CC_A(CC_C(), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 24 
  case CC_A(CC_A(_, _), CC_A(CC_C(), CC_B(_, _, _))) => 25 
  case CC_A(CC_B((_,_), _, CC_A(_, _)), CC_A(CC_C(), CC_B(_, _, _))) => 26 
  case CC_A(CC_B((_,_), _, CC_B(_, _, _)), CC_A(CC_C(), CC_B(_, _, _))) => 27 
  case CC_A(CC_B((_,_), _, CC_C()), CC_A(CC_C(), CC_B(_, _, _))) => 28 
  case CC_A(CC_C(), CC_A(CC_C(), CC_B(_, _, _))) => 29 
  case CC_A(CC_A(_, _), CC_A(CC_A(_, _), CC_C())) => 30 
  case CC_A(CC_B((_,_), _, CC_A(_, _)), CC_A(CC_A(_, _), CC_C())) => 31 
  case CC_A(CC_B((_,_), _, CC_B(_, _, _)), CC_A(CC_A(_, _), CC_C())) => 32 
  case CC_A(CC_B((_,_), _, CC_C()), CC_A(CC_A(_, _), CC_C())) => 33 
  case CC_A(CC_C(), CC_A(CC_A(_, _), CC_C())) => 34 
  case CC_A(CC_A(_, _), CC_A(CC_B(_, _, _), CC_C())) => 35 
  case CC_A(CC_B((_,_), _, CC_A(_, _)), CC_A(CC_B(_, _, _), CC_C())) => 36 
  case CC_A(CC_B((_,_), _, CC_C()), CC_A(CC_B(_, _, _), CC_C())) => 37 
  case CC_A(CC_C(), CC_A(CC_B(_, _, _), CC_C())) => 38 
  case CC_A(CC_A(_, _), CC_A(CC_C(), CC_C())) => 39 
  case CC_A(CC_B((_,_), _, CC_A(_, _)), CC_A(CC_C(), CC_C())) => 40 
  case CC_A(CC_B((_,_), _, CC_B(_, _, _)), CC_A(CC_C(), CC_C())) => 41 
  case CC_A(CC_B((_,_), _, CC_C()), CC_A(CC_C(), CC_C())) => 42 
  case CC_A(CC_C(), CC_A(CC_C(), CC_C())) => 43 
  case CC_A(CC_A(_, _), CC_B(_, _, _)) => 44 
  case CC_A(CC_B((_,_), _, CC_A(_, _)), CC_B(_, _, _)) => 45 
  case CC_A(CC_B((_,_), _, CC_B(_, _, _)), CC_B(_, _, _)) => 46 
  case CC_A(CC_B((_,_), _, CC_C()), CC_B(_, _, _)) => 47 
  case CC_A(CC_C(), CC_B(_, _, _)) => 48 
  case CC_A(CC_A(_, _), CC_C()) => 49 
  case CC_A(CC_B((_,_), _, CC_A(_, _)), CC_C()) => 50 
  case CC_A(CC_B((_,_), _, CC_B(_, _, _)), CC_C()) => 51 
  case CC_A(CC_B((_,_), _, CC_C()), CC_C()) => 52 
  case CC_A(CC_C(), CC_C()) => 53 
  case CC_B(_, _, _) => 54 
  case CC_C() => 55 
}
}
// This is not matched: CC_A(CC_B((_,_), _, CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_C()))