package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Byte], b: T_A[T_B], c: T_B) extends T_A[T_B]
case class CC_B() extends T_A[T_B]
case class CC_C(a: Char, b: Int, c: T_A[T_B]) extends T_A[T_B]
case class CC_D() extends T_B
case class CC_E(a: CC_D, b: (T_B,CC_B), c: T_A[(CC_A,CC_C)]) extends T_B
case class CC_F(a: T_A[CC_E], b: CC_B, c: CC_A) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), CC_D()) => 0 
  case CC_A(_, CC_A(_, _, _), CC_E(_, _, _)) => 1 
  case CC_A(_, CC_A(_, _, _), CC_F(_, _, _)) => 2 
  case CC_A(_, CC_B(), CC_D()) => 3 
  case CC_A(_, CC_B(), CC_E(_, _, _)) => 4 
  case CC_A(_, CC_B(), CC_F(_, _, _)) => 5 
  case CC_A(_, CC_C(_, _, _), CC_D()) => 6 
  case CC_A(_, CC_C(_, _, _), CC_E(_, _, _)) => 7 
  case CC_A(_, CC_C(_, _, _), CC_F(_, _, _)) => 8 
  case CC_C(_, _, CC_A(_, _, _)) => 9 
  case CC_C(_, _, CC_B()) => 10 
  case CC_C(_, _, CC_C(_, _, _)) => 11 
}
}
// This is not matched: CC_B()