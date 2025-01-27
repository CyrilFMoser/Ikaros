package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: T_A, c: T_A) extends T_A
case class CC_B(a: T_B[T_A], b: T_B[T_B[T_A]]) extends T_A
case class CC_C(a: CC_B, b: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A('x', CC_A(_, _, _), CC_A(_, _, _)) => 0 
  case CC_A('x', CC_A(_, _, _), CC_B(_, _)) => 1 
  case CC_A('x', CC_A(_, _, _), CC_C(_, _)) => 2 
  case CC_A('x', CC_B(_, _), CC_A(_, _, _)) => 3 
  case CC_A('x', CC_B(_, _), CC_B(_, _)) => 4 
  case CC_A('x', CC_B(_, _), CC_C(_, _)) => 5 
  case CC_A('x', CC_C(_, CC_A(_, _, _)), CC_A(_, _, _)) => 6 
  case CC_A('x', CC_C(_, CC_A(_, _, _)), CC_B(_, _)) => 7 
  case CC_A('x', CC_C(_, CC_A(_, _, _)), CC_C(_, _)) => 8 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 9 
  case CC_A(_, CC_A(_, _, _), CC_B(_, _)) => 10 
  case CC_A(_, CC_A(_, _, _), CC_C(_, _)) => 11 
  case CC_A(_, CC_B(_, _), CC_A(_, _, _)) => 12 
  case CC_A(_, CC_B(_, _), CC_B(_, _)) => 13 
  case CC_A(_, CC_B(_, _), CC_C(_, _)) => 14 
  case CC_A(_, CC_C(_, CC_A(_, _, _)), CC_A(_, _, _)) => 15 
  case CC_A(_, CC_C(_, CC_A(_, _, _)), CC_B(_, _)) => 16 
  case CC_A(_, CC_C(_, CC_A(_, _, _)), CC_C(_, _)) => 17 
  case CC_B(_, _) => 18 
  case CC_C(CC_B(_, _), _) => 19 
}
}