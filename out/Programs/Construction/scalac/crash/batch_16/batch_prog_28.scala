package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C]() extends T_A[C, D]
case class CC_B[E, F](a: F, b: T_B) extends T_A[E, F]
case class CC_C[H, G]() extends T_A[H, G]
case class CC_D(a: T_A[(T_B,T_B), T_B], b: T_A[T_A[Byte, T_B], CC_A[T_B, T_B]]) extends T_B
case class CC_E() extends T_B
case class CC_F(a: CC_A[CC_E, T_A[CC_E, (Byte,Byte)]], b: T_A[CC_C[(Byte,Boolean), CC_E], T_A[Byte, T_B]], c: Char) extends T_B

val v_a: T_A[T_B, Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_D(_, CC_A())) => 1 
  case CC_B(_, CC_D(_, CC_B(_, _))) => 2 
  case CC_B(_, CC_D(_, CC_C())) => 3 
  case CC_B(_, CC_E()) => 4 
  case CC_B(_, CC_F(CC_A(), CC_A(), _)) => 5 
  case CC_B(_, CC_F(CC_A(), CC_B(_, _), _)) => 6 
  case CC_B(_, CC_F(CC_A(), CC_C(), _)) => 7 
  case CC_C() => 8 
}
}