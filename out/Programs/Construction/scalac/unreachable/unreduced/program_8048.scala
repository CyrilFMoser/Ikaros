package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_B[T_B[Byte, T_A], T_B[T_A, T_A]]) extends T_A
case class CC_B(a: Char, b: T_A) extends T_A
case class CC_C(a: CC_B, b: CC_B, c: Char) extends T_A
case class CC_D() extends T_B[CC_C, CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B('x', CC_A(_, _)) => 1 
  case CC_B(_, CC_A(_, _)) => 2 
  case CC_B('x', CC_B(_, CC_A(_, _))) => 3 
  case CC_B(_, CC_B(_, CC_A(_, _))) => 4 
  case CC_B('x', CC_B(_, CC_B(_, _))) => 5 
  case CC_B(_, CC_B(_, CC_B(_, _))) => 6 
  case CC_B('x', CC_B(_, CC_C(_, _, _))) => 7 
  case CC_B(_, CC_B(_, CC_C(_, _, _))) => 8 
  case CC_B('x', CC_C(_, _, _)) => 9 
  case CC_B(_, CC_C(_, _, _)) => 10 
  case CC_C(CC_B(_, _), CC_B(_, CC_A(_, _)), _) => 11 
  case CC_C(CC_B(_, _), CC_B(_, CC_B(_, _)), _) => 12 
  case CC_C(CC_B(_, _), CC_B(_, CC_C(_, _, _)), _) => 13 
}
}