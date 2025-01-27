package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_A[T_B]], c: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: T_A[T_A[CC_A]], b: CC_A, c: T_A[T_B]) extends T_A[T_A[T_B]]
case class CC_C() extends T_A[T_A[T_B]]
case class CC_D() extends T_B
case class CC_E(a: CC_B, b: T_A[T_A[T_B]]) extends T_B
case class CC_F(a: Char, b: CC_D, c: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(CC_B(_, _, _), CC_A(CC_D(), CC_A(_, _, _), _)) => 1 
  case CC_E(CC_B(_, _, _), CC_A(CC_D(), CC_B(_, _, _), _)) => 2 
  case CC_E(CC_B(_, _, _), CC_A(CC_D(), CC_C(), _)) => 3 
  case CC_E(CC_B(_, _, _), CC_A(CC_E(_, _), CC_A(_, _, _), _)) => 4 
  case CC_E(CC_B(_, _, _), CC_A(CC_E(_, _), CC_B(_, _, _), _)) => 5 
  case CC_E(CC_B(_, _, _), CC_A(CC_E(_, _), CC_C(), _)) => 6 
  case CC_E(CC_B(_, _, _), CC_A(CC_F(_, _, _), CC_A(_, _, _), _)) => 7 
  case CC_E(CC_B(_, _, _), CC_A(CC_F(_, _, _), CC_B(_, _, _), _)) => 8 
  case CC_E(CC_B(_, _, _), CC_A(CC_F(_, _, _), CC_C(), _)) => 9 
  case CC_E(CC_B(_, _, _), CC_B(_, CC_A(_, _, _), _)) => 10 
  case CC_E(CC_B(_, _, _), CC_C()) => 11 
  case CC_F(_, _, _) => 12 
}
}