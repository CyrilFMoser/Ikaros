package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]], b: T_B[T_B[T_A]], c: Boolean) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A
case class CC_D() extends T_B[T_A]
case class CC_E() extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B() => 1 
  case CC_C(CC_A(_, _, true), CC_A(_, _, _)) => 2 
  case CC_C(CC_A(_, _, true), CC_B()) => 3 
  case CC_C(CC_A(_, _, true), CC_C(_, CC_A(_, _, _))) => 4 
  case CC_C(CC_A(_, _, true), CC_C(_, CC_B())) => 5 
  case CC_C(CC_A(_, _, true), CC_C(_, CC_C(_, _))) => 6 
  case CC_C(CC_A(_, _, false), CC_A(_, _, _)) => 7 
  case CC_C(CC_A(_, _, false), CC_B()) => 8 
  case CC_C(CC_A(_, _, false), CC_C(_, CC_A(_, _, _))) => 9 
  case CC_C(CC_A(_, _, false), CC_C(_, CC_B())) => 10 
  case CC_C(CC_A(_, _, false), CC_C(_, CC_C(_, _))) => 11 
  case CC_C(CC_B(), CC_A(_, _, _)) => 12 
  case CC_C(CC_B(), CC_B()) => 13 
  case CC_C(CC_B(), CC_C(_, CC_A(_, _, _))) => 14 
  case CC_C(CC_B(), CC_C(_, CC_B())) => 15 
  case CC_C(CC_B(), CC_C(_, CC_C(_, _))) => 16 
  case CC_C(CC_C(_, CC_A(_, _, _)), CC_A(_, _, _)) => 17 
  case CC_C(CC_C(_, CC_A(_, _, _)), CC_B()) => 18 
  case CC_C(CC_C(_, CC_A(_, _, _)), CC_C(_, CC_A(_, _, _))) => 19 
  case CC_C(CC_C(_, CC_A(_, _, _)), CC_C(_, CC_B())) => 20 
  case CC_C(CC_C(_, CC_A(_, _, _)), CC_C(_, CC_C(_, _))) => 21 
  case CC_C(CC_C(_, CC_B()), CC_A(_, _, _)) => 22 
  case CC_C(CC_C(_, CC_B()), CC_B()) => 23 
  case CC_C(CC_C(_, CC_B()), CC_C(_, CC_A(_, _, _))) => 24 
  case CC_C(CC_C(_, CC_B()), CC_C(_, CC_B())) => 25 
  case CC_C(CC_C(_, CC_B()), CC_C(_, CC_C(_, _))) => 26 
  case CC_C(CC_C(_, CC_C(_, _)), CC_A(_, _, _)) => 27 
  case CC_C(CC_C(_, CC_C(_, _)), CC_B()) => 28 
  case CC_C(CC_C(_, CC_C(_, _)), CC_C(_, CC_A(_, _, _))) => 29 
  case CC_C(CC_C(_, CC_C(_, _)), CC_C(_, CC_B())) => 30 
  case CC_C(CC_C(_, CC_C(_, _)), CC_C(_, CC_C(_, _))) => 31 
}
}