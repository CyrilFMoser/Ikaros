package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte, b: T_A, c: Int) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_A, b: T_B[CC_A, CC_A]) extends T_A
case class CC_D() extends T_B[Boolean, CC_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, CC_A(_, _, _), 12)) => 1 
  case CC_B(CC_A(_, CC_A(_, _, _), _)) => 2 
  case CC_B(CC_A(_, CC_B(_), 12)) => 3 
  case CC_B(CC_A(_, CC_B(_), _)) => 4 
  case CC_B(CC_A(_, CC_C(_, _), 12)) => 5 
  case CC_B(CC_A(_, CC_C(_, _), _)) => 6 
  case CC_B(CC_B(_)) => 7 
  case CC_B(CC_C(_, _)) => 8 
  case CC_C(CC_A(_, _, _), _) => 9 
  case CC_C(CC_B(CC_A(_, _, _)), _) => 10 
  case CC_C(CC_B(CC_B(_)), _) => 11 
  case CC_C(CC_B(CC_C(_, _)), _) => 12 
  case CC_C(CC_C(CC_A(_, _, _), _), _) => 13 
  case CC_C(CC_C(CC_B(_), _), _) => 14 
  case CC_C(CC_C(CC_C(_, _), _), _) => 15 
}
}