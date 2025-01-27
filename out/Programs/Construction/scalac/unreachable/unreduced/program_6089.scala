package Program_26 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[T_B[CC_A, T_A], CC_A]) extends T_A
case class CC_D[C]() extends T_B[T_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 0 
  case CC_A(CC_A(CC_B(), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 1 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_A(_, CC_A(_, _))) => 2 
  case CC_A(CC_A(CC_A(_, _), CC_B()), CC_A(_, CC_A(_, _))) => 3 
  case CC_A(CC_A(CC_C(_), CC_B()), CC_A(_, CC_A(_, _))) => 4 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), CC_A(_, CC_A(_, _))) => 5 
  case CC_A(CC_A(CC_B(), CC_C(_)), CC_A(_, CC_A(_, _))) => 6 
  case CC_A(CC_A(CC_C(_), CC_C(_)), CC_A(_, CC_A(_, _))) => 7 
  case CC_A(CC_B(), CC_A(_, CC_A(_, _))) => 8 
  case CC_A(CC_C(_), CC_A(_, CC_A(_, _))) => 9 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, CC_B())) => 10 
  case CC_A(CC_A(CC_B(), CC_A(_, _)), CC_A(_, CC_B())) => 11 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_A(_, CC_B())) => 12 
  case CC_A(CC_A(CC_A(_, _), CC_B()), CC_A(_, CC_B())) => 13 
  case CC_A(CC_A(CC_B(), CC_B()), CC_A(_, CC_B())) => 14 
  case CC_A(CC_A(CC_C(_), CC_B()), CC_A(_, CC_B())) => 15 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), CC_A(_, CC_B())) => 16 
  case CC_A(CC_A(CC_B(), CC_C(_)), CC_A(_, CC_B())) => 17 
  case CC_A(CC_A(CC_C(_), CC_C(_)), CC_A(_, CC_B())) => 18 
  case CC_A(CC_B(), CC_A(_, CC_B())) => 19 
  case CC_A(CC_C(_), CC_A(_, CC_B())) => 20 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(_, CC_C(_))) => 21 
  case CC_A(CC_A(CC_B(), CC_A(_, _)), CC_A(_, CC_C(_))) => 22 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_A(_, CC_C(_))) => 23 
  case CC_A(CC_A(CC_A(_, _), CC_B()), CC_A(_, CC_C(_))) => 24 
  case CC_A(CC_A(CC_B(), CC_B()), CC_A(_, CC_C(_))) => 25 
  case CC_A(CC_A(CC_C(_), CC_B()), CC_A(_, CC_C(_))) => 26 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), CC_A(_, CC_C(_))) => 27 
  case CC_A(CC_A(CC_B(), CC_C(_)), CC_A(_, CC_C(_))) => 28 
  case CC_A(CC_A(CC_C(_), CC_C(_)), CC_A(_, CC_C(_))) => 29 
  case CC_A(CC_B(), CC_A(_, CC_C(_))) => 30 
  case CC_A(CC_C(_), CC_A(_, CC_C(_))) => 31 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_B()) => 32 
  case CC_A(CC_A(CC_B(), CC_A(_, _)), CC_B()) => 33 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_B()) => 34 
  case CC_A(CC_A(CC_A(_, _), CC_B()), CC_B()) => 35 
  case CC_A(CC_A(CC_B(), CC_B()), CC_B()) => 36 
  case CC_A(CC_A(CC_C(_), CC_B()), CC_B()) => 37 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), CC_B()) => 38 
  case CC_A(CC_A(CC_B(), CC_C(_)), CC_B()) => 39 
  case CC_A(CC_A(CC_C(_), CC_C(_)), CC_B()) => 40 
  case CC_A(CC_B(), CC_B()) => 41 
  case CC_A(CC_C(_), CC_B()) => 42 
  case CC_A(CC_A(CC_A(_, _), CC_A(_, _)), CC_C(_)) => 43 
  case CC_A(CC_A(CC_B(), CC_A(_, _)), CC_C(_)) => 44 
  case CC_A(CC_A(CC_C(_), CC_A(_, _)), CC_C(_)) => 45 
  case CC_A(CC_A(CC_A(_, _), CC_B()), CC_C(_)) => 46 
  case CC_A(CC_A(CC_B(), CC_B()), CC_C(_)) => 47 
  case CC_A(CC_A(CC_C(_), CC_B()), CC_C(_)) => 48 
  case CC_A(CC_A(CC_A(_, _), CC_C(_)), CC_C(_)) => 49 
  case CC_A(CC_A(CC_B(), CC_C(_)), CC_C(_)) => 50 
  case CC_A(CC_A(CC_C(_), CC_C(_)), CC_C(_)) => 51 
  case CC_A(CC_B(), CC_C(_)) => 52 
  case CC_A(CC_C(_), CC_C(_)) => 53 
  case CC_B() => 54 
  case CC_C(_) => 55 
}
}
// This is not matched: CC_A(CC_A(CC_B(), CC_B()), CC_A(_, CC_A(_, _)))