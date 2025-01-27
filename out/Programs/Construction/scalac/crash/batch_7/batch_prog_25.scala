package Program_25 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C[D](a: (T_A[Char],(Int,Char)), b: Int, c: D) extends T_A[D]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_A(CC_A(_, CC_B()), CC_A(CC_A(_, _), CC_A(_, _))) => 1 
  case CC_A(CC_A(_, CC_C(_, _, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 2 
  case CC_A(CC_B(), CC_A(CC_A(_, _), CC_A(_, _))) => 3 
  case CC_A(CC_C(_, _, _), CC_A(CC_A(_, _), CC_A(_, _))) => 4 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_B(), CC_A(_, _))) => 5 
  case CC_A(CC_A(_, CC_B()), CC_A(CC_B(), CC_A(_, _))) => 6 
  case CC_A(CC_A(_, CC_C(_, _, _)), CC_A(CC_B(), CC_A(_, _))) => 7 
  case CC_A(CC_B(), CC_A(CC_B(), CC_A(_, _))) => 8 
  case CC_A(CC_C(_, _, _), CC_A(CC_B(), CC_A(_, _))) => 9 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_C(_, _, _), CC_A(_, _))) => 10 
  case CC_A(CC_A(_, CC_B()), CC_A(CC_C(_, _, _), CC_A(_, _))) => 11 
  case CC_A(CC_A(_, CC_C(_, _, _)), CC_A(CC_C(_, _, _), CC_A(_, _))) => 12 
  case CC_A(CC_B(), CC_A(CC_C(_, _, _), CC_A(_, _))) => 13 
  case CC_A(CC_C(_, _, _), CC_A(CC_C(_, _, _), CC_A(_, _))) => 14 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), CC_B())) => 15 
  case CC_A(CC_A(_, CC_B()), CC_A(CC_A(_, _), CC_B())) => 16 
  case CC_A(CC_A(_, CC_C(_, _, _)), CC_A(CC_A(_, _), CC_B())) => 17 
  case CC_A(CC_B(), CC_A(CC_A(_, _), CC_B())) => 18 
  case CC_A(CC_C(_, _, _), CC_A(CC_A(_, _), CC_B())) => 19 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_B(), CC_B())) => 20 
  case CC_A(CC_A(_, CC_B()), CC_A(CC_B(), CC_B())) => 21 
  case CC_A(CC_A(_, CC_C(_, _, _)), CC_A(CC_B(), CC_B())) => 22 
  case CC_A(CC_B(), CC_A(CC_B(), CC_B())) => 23 
  case CC_A(CC_C(_, _, _), CC_A(CC_B(), CC_B())) => 24 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_C(_, _, _), CC_B())) => 25 
  case CC_A(CC_A(_, CC_B()), CC_A(CC_C(_, _, _), CC_B())) => 26 
  case CC_A(CC_A(_, CC_C(_, _, _)), CC_A(CC_C(_, _, _), CC_B())) => 27 
  case CC_A(CC_B(), CC_A(CC_C(_, _, _), CC_B())) => 28 
  case CC_A(CC_C(_, _, _), CC_A(CC_C(_, _, _), CC_B())) => 29 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_A(_, _), CC_C(_, _, _))) => 30 
  case CC_A(CC_A(_, CC_B()), CC_A(CC_A(_, _), CC_C(_, _, _))) => 31 
  case CC_A(CC_A(_, CC_C(_, _, _)), CC_A(CC_A(_, _), CC_C(_, _, _))) => 32 
  case CC_A(CC_B(), CC_A(CC_A(_, _), CC_C(_, _, _))) => 33 
  case CC_A(CC_C(_, _, _), CC_A(CC_A(_, _), CC_C(_, _, _))) => 34 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_B(), CC_C(_, _, _))) => 35 
  case CC_A(CC_A(_, CC_B()), CC_A(CC_B(), CC_C(_, _, _))) => 36 
  case CC_A(CC_A(_, CC_C(_, _, _)), CC_A(CC_B(), CC_C(_, _, _))) => 37 
  case CC_A(CC_B(), CC_A(CC_B(), CC_C(_, _, _))) => 38 
  case CC_A(CC_C(_, _, _), CC_A(CC_B(), CC_C(_, _, _))) => 39 
  case CC_A(CC_A(_, CC_A(_, _)), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 40 
  case CC_A(CC_A(_, CC_B()), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 41 
  case CC_A(CC_A(_, CC_C(_, _, _)), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 42 
  case CC_A(CC_B(), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 43 
  case CC_A(CC_C(_, _, _), CC_A(CC_C(_, _, _), CC_C(_, _, _))) => 44 
  case CC_A(CC_A(_, CC_A(_, _)), CC_B()) => 45 
  case CC_A(CC_A(_, CC_B()), CC_B()) => 46 
  case CC_A(CC_A(_, CC_C(_, _, _)), CC_B()) => 47 
  case CC_A(CC_B(), CC_B()) => 48 
  case CC_A(CC_C(_, _, _), CC_B()) => 49 
  case CC_A(CC_A(_, CC_A(_, _)), CC_C((_,_), _, _)) => 50 
  case CC_A(CC_A(_, CC_B()), CC_C((_,_), _, _)) => 51 
  case CC_A(CC_A(_, CC_C(_, _, _)), CC_C((_,_), _, _)) => 52 
  case CC_A(CC_B(), CC_C((_,_), _, _)) => 53 
  case CC_A(CC_C(_, _, _), CC_C((_,_), _, _)) => 54 
  case CC_B() => 55 
  case CC_C(_, _, _) => 56 
}
}