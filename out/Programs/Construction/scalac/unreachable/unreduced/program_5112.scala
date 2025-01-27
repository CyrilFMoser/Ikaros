package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_B(a: CC_A, b: CC_A, c: T_B[T_A]) extends T_A
case class CC_C(a: T_A, b: T_A) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 0 
  case CC_C(CC_A(CC_A(_, _), CC_B(_, _, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 1 
  case CC_C(CC_A(CC_B(_, _, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 2 
  case CC_C(CC_A(CC_B(_, _, _), CC_B(_, _, _)), CC_A(CC_A(_, _), CC_A(_, _))) => 3 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), _), CC_A(CC_A(_, _), CC_A(_, _))) => 4 
  case CC_C(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 5 
  case CC_C(CC_A(CC_A(_, _), CC_B(_, _, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 6 
  case CC_C(CC_A(CC_B(_, _, _), CC_A(_, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 7 
  case CC_C(CC_A(CC_B(_, _, _), CC_B(_, _, _)), CC_A(CC_A(_, _), CC_B(_, _, _))) => 8 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), _), CC_A(CC_A(_, _), CC_B(_, _, _))) => 9 
  case CC_C(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 10 
  case CC_C(CC_A(CC_A(_, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 11 
  case CC_C(CC_A(CC_B(_, _, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 12 
  case CC_C(CC_A(CC_B(_, _, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_A(_, _))) => 13 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), _), CC_A(CC_B(_, _, _), CC_A(_, _))) => 14 
  case CC_C(CC_A(CC_A(_, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 15 
  case CC_C(CC_A(CC_A(_, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 16 
  case CC_C(CC_A(CC_B(_, _, _), CC_A(_, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 17 
  case CC_C(CC_A(CC_B(_, _, _), CC_B(_, _, _)), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 18 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), _), CC_A(CC_B(_, _, _), CC_B(_, _, _))) => 19 
  case CC_C(CC_A(CC_A(_, _), CC_A(_, _)), CC_B(_, CC_A(_, _), _)) => 20 
  case CC_C(CC_A(CC_A(_, _), CC_B(_, _, _)), CC_B(_, CC_A(_, _), _)) => 21 
  case CC_C(CC_A(CC_B(_, _, _), CC_A(_, _)), CC_B(_, CC_A(_, _), _)) => 22 
  case CC_C(CC_A(CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, CC_A(_, _), _)) => 23 
  case CC_C(CC_B(CC_A(_, _), CC_A(_, _), _), CC_B(_, CC_A(_, _), _)) => 24 
}
}