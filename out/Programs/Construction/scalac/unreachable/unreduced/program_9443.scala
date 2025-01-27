package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: Int) extends T_A
case class CC_B(a: T_B[Int, T_B[CC_A, Boolean]], b: CC_A, c: T_A) extends T_A
case class CC_C[C](a: T_A, b: C, c: C) extends T_B[C, CC_B]
case class CC_D[D](a: T_A, b: T_B[D, CC_B], c: T_B[D, CC_B]) extends T_B[D, CC_B]

val v_a: T_B[Boolean, CC_B] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _, _), _, _) => 0 
  case CC_D(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _, CC_C(_, true, true)) => 1 
  case CC_D(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _, CC_C(_, true, false)) => 2 
  case CC_D(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _, CC_C(_, false, true)) => 3 
  case CC_D(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _, CC_C(_, false, false)) => 4 
  case CC_D(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _, CC_D(_, _, _)) => 5 
  case CC_D(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _, CC_C(_, true, true)) => 6 
  case CC_D(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _, CC_C(_, true, false)) => 7 
  case CC_D(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _, CC_C(_, false, true)) => 8 
  case CC_D(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _, CC_C(_, false, false)) => 9 
  case CC_D(CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _, CC_D(_, _, _)) => 10 
  case CC_D(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _, CC_C(_, true, true)) => 11 
  case CC_D(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _, CC_C(_, true, false)) => 12 
  case CC_D(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _, CC_C(_, false, true)) => 13 
  case CC_D(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _, CC_C(_, false, false)) => 14 
  case CC_D(CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _, CC_D(_, _, _)) => 15 
  case CC_D(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _, CC_C(_, true, true)) => 16 
  case CC_D(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _, CC_C(_, true, false)) => 17 
  case CC_D(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _, CC_C(_, false, true)) => 18 
  case CC_D(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _, CC_C(_, false, false)) => 19 
  case CC_D(CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _, CC_D(_, _, _)) => 20 
  case CC_D(CC_B(_, CC_A(_, _, _), CC_A(_, _, _)), _, CC_C(_, true, true)) => 21 
  case CC_D(CC_B(_, CC_A(_, _, _), CC_A(_, _, _)), _, CC_C(_, true, false)) => 22 
  case CC_D(CC_B(_, CC_A(_, _, _), CC_A(_, _, _)), _, CC_C(_, false, true)) => 23 
  case CC_D(CC_B(_, CC_A(_, _, _), CC_A(_, _, _)), _, CC_C(_, false, false)) => 24 
  case CC_D(CC_B(_, CC_A(_, _, _), CC_A(_, _, _)), _, CC_D(_, _, _)) => 25 
  case CC_D(CC_B(_, CC_A(_, _, _), CC_B(_, _, _)), _, CC_C(_, true, true)) => 26 
  case CC_D(CC_B(_, CC_A(_, _, _), CC_B(_, _, _)), _, CC_C(_, true, false)) => 27 
  case CC_D(CC_B(_, CC_A(_, _, _), CC_B(_, _, _)), _, CC_C(_, false, true)) => 28 
  case CC_D(CC_B(_, CC_A(_, _, _), CC_B(_, _, _)), _, CC_C(_, false, false)) => 29 
  case CC_D(CC_B(_, CC_A(_, _, _), CC_B(_, _, _)), _, CC_D(_, _, _)) => 30 
}
}
// This is not matched: CC_C(CC_B(_, _, _), _, _)