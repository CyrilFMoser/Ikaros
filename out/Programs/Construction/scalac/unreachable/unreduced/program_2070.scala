package Program_18 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[T_A[Int]], b: T_A[Byte], c: T_A[T_A[Char]]) extends T_A[T_A[Char]]
case class CC_B() extends T_A[T_A[Char]]
case class CC_C(a: T_A[T_A[Char]], b: T_A[T_A[Char]], c: T_A[T_A[Char]]) extends T_A[T_A[Char]]

val v_a: T_A[T_A[Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B()) => 1 
  case CC_A(_, _, CC_C(_, _, _)) => 2 
  case CC_B() => 3 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _)), _) => 4 
  case CC_C(_, CC_A(_, _, CC_B()), _) => 5 
  case CC_C(_, CC_A(_, _, CC_C(_, _, _)), _) => 6 
  case CC_C(_, CC_B(), _) => 7 
  case CC_C(_, CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), _) => 8 
  case CC_C(_, CC_C(CC_B(), CC_A(_, _, _), CC_A(_, _, _)), _) => 9 
  case CC_C(_, CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_A(_, _, _)), _) => 10 
  case CC_C(_, CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_B()), _) => 11 
  case CC_C(_, CC_C(CC_B(), CC_A(_, _, _), CC_B()), _) => 12 
  case CC_C(_, CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_B()), _) => 13 
  case CC_C(_, CC_C(CC_A(_, _, _), CC_A(_, _, _), CC_C(_, _, _)), _) => 14 
  case CC_C(_, CC_C(CC_B(), CC_A(_, _, _), CC_C(_, _, _)), _) => 15 
  case CC_C(_, CC_C(CC_C(_, _, _), CC_A(_, _, _), CC_C(_, _, _)), _) => 16 
  case CC_C(_, CC_C(CC_A(_, _, _), CC_B(), CC_A(_, _, _)), _) => 17 
  case CC_C(_, CC_C(CC_B(), CC_B(), CC_A(_, _, _)), _) => 18 
  case CC_C(_, CC_C(CC_C(_, _, _), CC_B(), CC_A(_, _, _)), _) => 19 
  case CC_C(_, CC_C(CC_A(_, _, _), CC_B(), CC_B()), _) => 20 
  case CC_C(_, CC_C(CC_B(), CC_B(), CC_B()), _) => 21 
  case CC_C(_, CC_C(CC_C(_, _, _), CC_B(), CC_B()), _) => 22 
  case CC_C(_, CC_C(CC_A(_, _, _), CC_B(), CC_C(_, _, _)), _) => 23 
  case CC_C(_, CC_C(CC_B(), CC_B(), CC_C(_, _, _)), _) => 24 
  case CC_C(_, CC_C(CC_C(_, _, _), CC_B(), CC_C(_, _, _)), _) => 25 
  case CC_C(_, CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_A(_, _, _)), _) => 26 
  case CC_C(_, CC_C(CC_B(), CC_C(_, _, _), CC_A(_, _, _)), _) => 27 
  case CC_C(_, CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_A(_, _, _)), _) => 28 
  case CC_C(_, CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_B()), _) => 29 
  case CC_C(_, CC_C(CC_B(), CC_C(_, _, _), CC_B()), _) => 30 
  case CC_C(_, CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_B()), _) => 31 
  case CC_C(_, CC_C(CC_A(_, _, _), CC_C(_, _, _), CC_C(_, _, _)), _) => 32 
  case CC_C(_, CC_C(CC_B(), CC_C(_, _, _), CC_C(_, _, _)), _) => 33 
  case CC_C(_, CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_C(_, _, _)), _) => 34 
}
}