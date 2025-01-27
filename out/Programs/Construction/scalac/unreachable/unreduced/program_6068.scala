package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B(a: T_B[(T_A,T_A), Boolean], b: T_A, c: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[T_A, CC_C]
case class CC_E[C]() extends T_B[T_A, CC_C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(CC_A(_, _, _), CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(CC_A(_, _, _), CC_B(_, _, _), _), _) => 1 
  case CC_A(_, CC_A(CC_B(_, _, _), CC_A(_, _, _), _), _) => 2 
  case CC_A(_, CC_A(CC_B(_, _, _), CC_B(_, _, _), _), _) => 3 
  case CC_A(_, CC_A(CC_B(_, _, _), CC_C(), _), _) => 4 
  case CC_A(_, CC_A(CC_C(), CC_A(_, _, _), _), _) => 5 
  case CC_A(_, CC_A(CC_C(), CC_B(_, _, _), _), _) => 6 
  case CC_A(_, CC_A(CC_C(), CC_C(), _), _) => 7 
  case CC_A(_, CC_B(_, CC_A(_, _, _), _), _) => 8 
  case CC_A(_, CC_B(_, CC_B(_, _, _), _), _) => 9 
  case CC_A(_, CC_B(_, CC_C(), _), _) => 10 
  case CC_A(_, CC_C(), _) => 11 
  case CC_B(_, _, _) => 12 
  case CC_C() => 13 
}
}
// This is not matched: CC_A(_, CC_A(CC_A(_, _, _), CC_C(), _), _)