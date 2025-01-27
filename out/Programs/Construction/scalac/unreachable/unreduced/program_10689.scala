package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[Int, Char], b: T_B[T_B[T_A, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: T_B[CC_A, T_A]) extends T_A
case class CC_C[C](a: Char, b: T_B[C, C]) extends T_B[C, Boolean]
case class CC_D[D](a: CC_A, b: T_A, c: CC_B) extends T_B[D, Boolean]
case class CC_E[E](a: T_B[E, Boolean], b: T_B[E, Boolean]) extends T_B[E, Boolean]

val v_a: T_B[Boolean, Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
  case CC_C(_, CC_D(_, CC_A(_, _), CC_B(_, _, _))) => 1 
  case CC_C(_, CC_D(_, CC_B(_, _, _), CC_B(_, _, _))) => 2 
  case CC_C(_, CC_E(CC_C(_, _), CC_C(_, _))) => 3 
  case CC_C(_, CC_E(CC_D(_, _, _), CC_C(_, _))) => 4 
  case CC_C(_, CC_E(CC_E(_, _), CC_C(_, _))) => 5 
  case CC_C(_, CC_E(CC_C(_, _), CC_D(_, _, _))) => 6 
  case CC_C(_, CC_E(CC_D(_, _, _), CC_D(_, _, _))) => 7 
  case CC_C(_, CC_E(CC_E(_, _), CC_D(_, _, _))) => 8 
  case CC_C(_, CC_E(CC_C(_, _), CC_E(_, _))) => 9 
  case CC_C(_, CC_E(CC_D(_, _, _), CC_E(_, _))) => 10 
  case CC_C(_, CC_E(CC_E(_, _), CC_E(_, _))) => 11 
  case CC_D(CC_A(_, _), CC_A(_, _), CC_B(CC_A(_, _), _, _)) => 12 
  case CC_D(CC_A(_, _), CC_B(CC_A(_, _), _, _), CC_B(CC_A(_, _), _, _)) => 13 
  case CC_E(CC_C(_, _), CC_C(_, CC_C(_, _))) => 14 
  case CC_E(CC_D(_, CC_A(_, _), _), CC_C(_, CC_C(_, _))) => 15 
  case CC_E(CC_D(_, CC_B(_, _, _), _), CC_C(_, CC_C(_, _))) => 16 
  case CC_E(CC_E(_, _), CC_C(_, CC_C(_, _))) => 17 
  case CC_E(CC_C(_, _), CC_C(_, CC_D(_, _, _))) => 18 
  case CC_E(CC_D(_, CC_A(_, _), _), CC_C(_, CC_D(_, _, _))) => 19 
  case CC_E(CC_D(_, CC_B(_, _, _), _), CC_C(_, CC_D(_, _, _))) => 20 
  case CC_E(CC_E(_, _), CC_C(_, CC_D(_, _, _))) => 21 
  case CC_E(CC_C(_, _), CC_C(_, CC_E(_, _))) => 22 
  case CC_E(CC_D(_, CC_A(_, _), _), CC_C(_, CC_E(_, _))) => 23 
  case CC_E(CC_D(_, CC_B(_, _, _), _), CC_C(_, CC_E(_, _))) => 24 
  case CC_E(CC_E(_, _), CC_C(_, CC_E(_, _))) => 25 
  case CC_E(CC_C(_, _), CC_D(CC_A(_, _), _, _)) => 26 
  case CC_E(CC_D(_, CC_A(_, _), _), CC_D(CC_A(_, _), _, _)) => 27 
  case CC_E(CC_D(_, CC_B(_, _, _), _), CC_D(CC_A(_, _), _, _)) => 28 
  case CC_E(CC_E(_, _), CC_D(CC_A(_, _), _, _)) => 29 
  case CC_E(CC_C(_, _), CC_E(CC_C(_, _), _)) => 30 
  case CC_E(CC_D(_, CC_A(_, _), _), CC_E(CC_C(_, _), _)) => 31 
  case CC_E(CC_D(_, CC_B(_, _, _), _), CC_E(CC_C(_, _), _)) => 32 
  case CC_E(CC_E(_, _), CC_E(CC_C(_, _), _)) => 33 
  case CC_E(CC_C(_, _), CC_E(CC_D(_, _, _), _)) => 34 
  case CC_E(CC_D(_, CC_A(_, _), _), CC_E(CC_D(_, _, _), _)) => 35 
  case CC_E(CC_D(_, CC_B(_, _, _), _), CC_E(CC_D(_, _, _), _)) => 36 
  case CC_E(CC_E(_, _), CC_E(CC_D(_, _, _), _)) => 37 
  case CC_E(CC_C(_, _), CC_E(CC_E(_, _), _)) => 38 
  case CC_E(CC_D(_, CC_A(_, _), _), CC_E(CC_E(_, _), _)) => 39 
  case CC_E(CC_D(_, CC_B(_, _, _), _), CC_E(CC_E(_, _), _)) => 40 
  case CC_E(CC_E(_, _), CC_E(CC_E(_, _), _)) => 41 
}
}