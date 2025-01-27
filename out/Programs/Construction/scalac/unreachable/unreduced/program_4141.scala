package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[T_A[C, C], C], c: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B(a: CC_A[CC_A[Char]], b: CC_A[(Byte,Byte)]) extends T_A[T_A[T_A[CC_A[Boolean], Int], T_A[CC_A[Boolean], Int]], T_A[CC_A[Boolean], Int]]
case class CC_C[D](a: T_A[D, D]) extends T_A[T_A[D, D], D]

val v_a: T_A[T_A[T_A[CC_A[Boolean], Int], T_A[CC_A[Boolean], Int]], T_A[CC_A[Boolean], Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 0 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_A(_, _, _), CC_B(_, _))) => 1 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_A(_, _, _), CC_C(_))) => 2 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_B(_, _), CC_A(_, _, _))) => 3 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_B(_, _), CC_B(_, _))) => 4 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_B(_, _), CC_C(_))) => 5 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_C(_), CC_A(_, _, _))) => 6 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_C(_), CC_B(_, _))) => 7 
  case CC_A(_, CC_A(_, _, _), CC_A(_, CC_C(_), CC_C(_))) => 8 
  case CC_A(_, CC_A(_, _, _), CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 9 
  case CC_A(_, CC_A(_, _, _), CC_C(_)) => 10 
  case CC_A(_, CC_B(CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 11 
  case CC_A(_, CC_B(CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), CC_B(_, _))) => 12 
  case CC_A(_, CC_B(CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), CC_C(_))) => 13 
  case CC_A(_, CC_B(CC_A(_, _, _), _), CC_A(_, CC_B(_, _), CC_A(_, _, _))) => 14 
  case CC_A(_, CC_B(CC_A(_, _, _), _), CC_A(_, CC_B(_, _), CC_B(_, _))) => 15 
  case CC_A(_, CC_B(CC_A(_, _, _), _), CC_A(_, CC_B(_, _), CC_C(_))) => 16 
  case CC_A(_, CC_B(CC_A(_, _, _), _), CC_A(_, CC_C(_), CC_A(_, _, _))) => 17 
  case CC_A(_, CC_B(CC_A(_, _, _), _), CC_A(_, CC_C(_), CC_B(_, _))) => 18 
  case CC_A(_, CC_B(CC_A(_, _, _), _), CC_A(_, CC_C(_), CC_C(_))) => 19 
  case CC_A(_, CC_B(CC_A(_, _, _), _), CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 20 
  case CC_A(_, CC_B(CC_A(_, _, _), _), CC_C(_)) => 21 
  case CC_A(_, CC_C(_), CC_A(_, CC_A(_, _, _), CC_A(_, _, _))) => 22 
  case CC_A(_, CC_C(_), CC_A(_, CC_A(_, _, _), CC_B(_, _))) => 23 
  case CC_A(_, CC_C(_), CC_A(_, CC_A(_, _, _), CC_C(_))) => 24 
  case CC_A(_, CC_C(_), CC_A(_, CC_B(_, _), CC_A(_, _, _))) => 25 
  case CC_A(_, CC_C(_), CC_A(_, CC_B(_, _), CC_B(_, _))) => 26 
  case CC_A(_, CC_C(_), CC_A(_, CC_B(_, _), CC_C(_))) => 27 
  case CC_A(_, CC_C(_), CC_A(_, CC_C(_), CC_A(_, _, _))) => 28 
  case CC_A(_, CC_C(_), CC_A(_, CC_C(_), CC_B(_, _))) => 29 
  case CC_A(_, CC_C(_), CC_A(_, CC_C(_), CC_C(_))) => 30 
  case CC_A(_, CC_C(_), CC_B(CC_A(_, _, _), CC_A(_, _, _))) => 31 
  case CC_A(_, CC_C(_), CC_C(_)) => 32 
  case CC_B(_, _) => 33 
  case CC_C(_) => 34 
}
}