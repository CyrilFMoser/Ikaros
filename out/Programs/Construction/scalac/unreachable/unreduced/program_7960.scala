package Program_31 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_A, c: Byte) extends T_A
case class CC_B(a: T_B[T_A], b: T_A) extends T_A
case class CC_C(a: T_B[CC_B]) extends T_B[CC_B]
case class CC_D(a: T_A) extends T_B[CC_B]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, CC_A(_, _, _), _), CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(CC_A(_, CC_A(_, _, _), _), CC_A(_, CC_B(_, _), _), _) => 1 
  case CC_A(CC_A(_, CC_A(_, _, _), _), CC_B(_, CC_A(_, _, _)), _) => 2 
  case CC_A(CC_A(_, CC_A(_, _, _), _), CC_B(_, CC_B(_, _)), _) => 3 
  case CC_A(CC_A(_, CC_B(_, _), _), CC_A(_, CC_A(_, _, _), _), _) => 4 
  case CC_A(CC_A(_, CC_B(_, _), _), CC_A(_, CC_B(_, _), _), _) => 5 
  case CC_A(CC_A(_, CC_B(_, _), _), CC_B(_, CC_A(_, _, _)), _) => 6 
  case CC_A(CC_A(_, CC_B(_, _), _), CC_B(_, CC_B(_, _)), _) => 7 
  case CC_A(CC_B(_, _), CC_A(_, CC_A(_, _, _), _), _) => 8 
  case CC_A(CC_B(_, _), CC_A(_, CC_B(_, _), _), _) => 9 
  case CC_A(CC_B(_, _), CC_B(_, CC_A(_, _, _)), _) => 10 
  case CC_A(CC_B(_, _), CC_B(_, CC_B(_, _)), _) => 11 
  case CC_B(_, _) => 12 
}
}