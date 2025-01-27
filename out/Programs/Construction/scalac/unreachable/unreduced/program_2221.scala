package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[Int, T_A], T_A], b: T_A, c: T_A) extends T_A
case class CC_B(a: Char, b: T_B[T_B[CC_A, Int], ((Char,Int),CC_A)]) extends T_A
case class CC_C(a: T_A, b: T_A) extends T_A
case class CC_D[C](a: C, b: CC_B) extends T_B[C, T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, _, CC_B(_, _)) => 1 
  case CC_A(_, _, CC_C(CC_A(_, _, _), CC_A(_, _, _))) => 2 
  case CC_A(_, _, CC_C(CC_B(_, _), CC_A(_, _, _))) => 3 
  case CC_A(_, _, CC_C(CC_A(_, _, _), CC_B(_, _))) => 4 
  case CC_A(_, _, CC_C(CC_B(_, _), CC_B(_, _))) => 5 
  case CC_A(_, _, CC_C(CC_C(_, _), CC_B(_, _))) => 6 
  case CC_A(_, _, CC_C(CC_A(_, _, _), CC_C(_, _))) => 7 
  case CC_A(_, _, CC_C(CC_B(_, _), CC_C(_, _))) => 8 
  case CC_A(_, _, CC_C(CC_C(_, _), CC_C(_, _))) => 9 
  case CC_B(_, _) => 10 
  case CC_C(_, CC_A(_, _, CC_A(_, _, _))) => 11 
  case CC_C(_, CC_A(_, _, CC_B(_, _))) => 12 
  case CC_C(_, CC_A(_, _, CC_C(_, _))) => 13 
  case CC_C(_, CC_B(_, _)) => 14 
  case CC_C(_, CC_C(CC_A(_, _, _), _)) => 15 
  case CC_C(_, CC_C(CC_B(_, _), _)) => 16 
  case CC_C(_, CC_C(CC_C(_, _), _)) => 17 
}
}
// This is not matched: CC_A(_, _, CC_C(CC_C(_, _), CC_A(_, _, _)))