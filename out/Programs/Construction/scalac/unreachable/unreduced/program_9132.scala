package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, T_A], b: T_A, c: T_A) extends T_A
case class CC_B(a: Char) extends T_A
case class CC_C(a: CC_A, b: T_B[T_B[Int, T_A], (CC_A,CC_B)]) extends T_A
case class CC_D[C](a: T_B[C, C], b: CC_C, c: C) extends T_B[C, CC_A]
case class CC_E[D]() extends T_B[D, CC_A]
case class CC_F() extends T_B[T_B[CC_D[CC_C], CC_A], CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_), CC_A(_, _, _)), _) => 1 
  case CC_A(_, CC_A(_, CC_C(_, _), CC_A(_, _, _)), _) => 2 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_B(_)), _) => 3 
  case CC_A(_, CC_A(_, CC_B(_), CC_B(_)), _) => 4 
  case CC_A(_, CC_A(_, CC_C(_, _), CC_B(_)), _) => 5 
  case CC_A(_, CC_A(_, CC_A(_, _, _), CC_C(_, _)), _) => 6 
  case CC_A(_, CC_A(_, CC_B(_), CC_C(_, _)), _) => 7 
  case CC_A(_, CC_A(_, CC_C(_, _), CC_C(_, _)), _) => 8 
  case CC_A(_, CC_B(_), _) => 9 
  case CC_A(_, CC_C(CC_A(_, _, _), _), _) => 10 
  case CC_B(_) => 11 
  case CC_C(CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _) => 12 
  case CC_C(CC_A(_, CC_B(_), CC_A(_, _, _)), _) => 13 
  case CC_C(CC_A(_, CC_C(_, _), CC_A(_, _, _)), _) => 14 
  case CC_C(CC_A(_, CC_A(_, _, _), CC_B(_)), _) => 15 
  case CC_C(CC_A(_, CC_B(_), CC_B(_)), _) => 16 
  case CC_C(CC_A(_, CC_C(_, _), CC_B(_)), _) => 17 
  case CC_C(CC_A(_, CC_A(_, _, _), CC_C(_, _)), _) => 18 
  case CC_C(CC_A(_, CC_B(_), CC_C(_, _)), _) => 19 
  case CC_C(CC_A(_, CC_C(_, _), CC_C(_, _)), _) => 20 
}
}