package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_A[Char], b: T_B[T_A[Char]], c: T_A[Byte]) extends T_A[Char]
case class CC_B() extends T_A[Char]
case class CC_C(a: Byte, b: T_A[Char], c: CC_B) extends T_A[Char]
case class CC_D[C](a: T_B[T_B[Byte]], b: C) extends T_B[C]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_D(_, _), _), CC_D(CC_D(_, _), CC_A(_, _, _)), _) => 0 
  case CC_A(CC_A(CC_C(_, _, _), CC_D(_, _), _), CC_D(CC_D(_, _), CC_A(_, _, _)), _) => 1 
  case CC_A(CC_B(), CC_D(CC_D(_, _), CC_A(_, _, _)), _) => 2 
  case CC_A(CC_C(_, CC_A(_, _, _), _), CC_D(CC_D(_, _), CC_A(_, _, _)), _) => 3 
  case CC_A(CC_C(_, CC_B(), _), CC_D(CC_D(_, _), CC_A(_, _, _)), _) => 4 
  case CC_A(CC_C(_, CC_C(_, _, _), _), CC_D(CC_D(_, _), CC_A(_, _, _)), _) => 5 
  case CC_A(CC_A(CC_A(_, _, _), CC_D(_, _), _), CC_D(CC_D(_, _), CC_B()), _) => 6 
  case CC_A(CC_A(CC_B(), CC_D(_, _), _), CC_D(CC_D(_, _), CC_B()), _) => 7 
  case CC_A(CC_A(CC_C(_, _, _), CC_D(_, _), _), CC_D(CC_D(_, _), CC_B()), _) => 8 
  case CC_A(CC_B(), CC_D(CC_D(_, _), CC_B()), _) => 9 
  case CC_A(CC_C(_, CC_A(_, _, _), _), CC_D(CC_D(_, _), CC_B()), _) => 10 
  case CC_A(CC_C(_, CC_B(), _), CC_D(CC_D(_, _), CC_B()), _) => 11 
  case CC_A(CC_C(_, CC_C(_, _, _), _), CC_D(CC_D(_, _), CC_B()), _) => 12 
  case CC_A(CC_A(CC_A(_, _, _), CC_D(_, _), _), CC_D(CC_D(_, _), CC_C(_, _, _)), _) => 13 
  case CC_A(CC_A(CC_B(), CC_D(_, _), _), CC_D(CC_D(_, _), CC_C(_, _, _)), _) => 14 
  case CC_A(CC_A(CC_C(_, _, _), CC_D(_, _), _), CC_D(CC_D(_, _), CC_C(_, _, _)), _) => 15 
  case CC_A(CC_B(), CC_D(CC_D(_, _), CC_C(_, _, _)), _) => 16 
  case CC_A(CC_C(_, CC_A(_, _, _), _), CC_D(CC_D(_, _), CC_C(_, _, _)), _) => 17 
  case CC_A(CC_C(_, CC_B(), _), CC_D(CC_D(_, _), CC_C(_, _, _)), _) => 18 
  case CC_A(CC_C(_, CC_C(_, _, _), _), CC_D(CC_D(_, _), CC_C(_, _, _)), _) => 19 
  case CC_B() => 20 
  case CC_C(_, _, _) => 21 
}
}
// This is not matched: CC_A(CC_A(CC_B(), CC_D(_, _), _), CC_D(CC_D(_, _), CC_A(_, _, _)), _)