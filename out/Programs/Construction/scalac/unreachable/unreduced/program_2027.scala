package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Char], b: T_B[T_A, T_A], c: T_A) extends T_A
case class CC_B[C](a: T_A, b: T_B[C, C]) extends T_A
case class CC_C(a: Int, b: T_A) extends T_A
case class CC_D(a: T_A, b: T_B[T_B[CC_A, Char], CC_B[CC_C]], c: T_A) extends T_B[CC_A, CC_A]
case class CC_E() extends T_B[CC_A, CC_A]
case class CC_F() extends T_B[CC_A, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_A(_, _, _))) => 0 
  case CC_A(_, _, CC_A(_, _, CC_B(_, _))) => 1 
  case CC_A(_, _, CC_A(_, _, CC_C(_, _))) => 2 
  case CC_A(_, _, CC_B(CC_A(_, _, _), _)) => 3 
  case CC_A(_, _, CC_B(CC_B(_, _), _)) => 4 
  case CC_A(_, _, CC_B(CC_C(_, _), _)) => 5 
  case CC_A(_, _, CC_C(_, CC_A(_, _, _))) => 6 
  case CC_A(_, _, CC_C(_, CC_B(_, _))) => 7 
  case CC_A(_, _, CC_C(_, CC_C(_, _))) => 8 
  case CC_B(CC_A(_, _, CC_A(_, _, _)), _) => 9 
  case CC_B(CC_A(_, _, CC_B(_, _)), _) => 10 
  case CC_B(CC_A(_, _, CC_C(_, _)), _) => 11 
  case CC_B(CC_B(CC_A(_, _, _), _), _) => 12 
  case CC_B(CC_B(CC_B(_, _), _), _) => 13 
  case CC_B(CC_B(CC_C(_, _), _), _) => 14 
  case CC_B(CC_C(_, CC_A(_, _, _)), _) => 15 
  case CC_B(CC_C(_, CC_B(_, _)), _) => 16 
  case CC_B(CC_C(_, CC_C(_, _)), _) => 17 
  case CC_C(_, CC_A(_, _, _)) => 18 
  case CC_C(_, CC_B(CC_A(_, _, _), _)) => 19 
  case CC_C(_, CC_B(CC_B(_, _), _)) => 20 
  case CC_C(_, CC_B(CC_C(_, _), _)) => 21 
  case CC_C(_, CC_C(_, _)) => 22 
}
}